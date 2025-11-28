/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package regraNegocio;

import VO.ContaVO;
import VO.TransacaoVO;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLException;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import persistencia.ContaPers;
import persistencia.OperacoesPers;

/**
 *
 * @author narja
 */
public class OperacoesRN {

    public boolean depositar(ContaVO conta, String saldo) throws SQLException {

        saldo = saldo.replace(".", "");
        saldo = saldo.replace(",", ".");
        double saldoDepositado = Double.parseDouble(saldo);
        if (0 >= saldoDepositado) { //se saldo for maior que zero é falso
            return false;
        }
        SimpleDateFormat formataDataHora = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        String dataAgora = formataDataHora.format(new Date());

        TransacaoVO novaTransacao = new TransacaoVO("DEPOSITO", saldoDepositado, dataAgora, "Depósito via App");
        conta.adicionarTransacao(novaTransacao);

        double novoSaldo = conta.getSaldo() + saldoDepositado;
        conta.setSaldo(novoSaldo);

        OperacoesPers oper = new OperacoesPers();
        boolean depositou = oper.transacoes(conta);

        if (depositou) {
            boolean historicoSalvo = oper.historicoTransacoes(novaTransacao, conta.getId());
            return historicoSalvo;
        }
        return false;
    }

    public boolean sacar(ContaVO conta, String saldo) throws SQLException {
        try {
            saldo = saldo.replace(".", "");
            saldo = saldo.replace(",", ".");
            double saldoSaque = Double.parseDouble(saldo);

            if (saldoSaque <= 0) {
                return false;
            }
            double saldoFuturo = conta.getSaldo() - saldoSaque;

            if ("POUPANÇA".equals(conta.getTipoConta())) {
                if (saldoFuturo < 0) {
                    return false;
                }

            } else {

                if (saldoFuturo < -500) {
                    return false;
                }

                if (saldoSaque < -500) {
                    return false;
                }
                SimpleDateFormat formataDataHora = new SimpleDateFormat("dd/MM/yyyy HH:mm");
                String dataAgora = formataDataHora.format(new Date());

                TransacaoVO novaTransacao = new TransacaoVO("SAQUE", saldoSaque, dataAgora, "Saque via App");
                conta.adicionarTransacao(novaTransacao);

                double novoSaldo = conta.getSaldo() - saldoSaque;
                conta.setSaldo(novoSaldo);

                OperacoesPers oper = new OperacoesPers();
                boolean sacou = oper.transacoes(conta);

                if (sacou) {
                    boolean historicoSalvo = oper.historicoTransacoes(novaTransacao, conta.getId());
                    return historicoSalvo;
                }
            }
        } finally {

        }
        return false;

    }

    public String transferencia(ContaVO contaOrigem, String contaDestino, String saldo) throws SQLException {

        saldo = saldo.replace(".", "");
        saldo = saldo.replace(",", ".");
        double saldoTransfer = Double.parseDouble(saldo);

        if (saldoTransfer <= 0) {
            return "Valor inválido.";
        }

        if (contaOrigem.getNumeroConta().equals(contaDestino)) {
            return "Não pode transferir para si mesmo.";
        }

        ContaPers contaPers = new ContaPers();
        ContaVO contaDestinoFinal = contaPers.buscarConta(contaDestino);

        if (contaDestinoFinal == null) {
            return "Conta de destino inexistente.";
        }

        double taxa = 0.0;
        double limiteExtra = 0.0;

        if ("POUPANCA".equals(contaOrigem.getTipoConta())) {
            taxa = 0.0;
            limiteExtra = 0.0;
        } else {
            taxa = 2.60;
            limiteExtra = 500.00;
        }

        double custoTotal = saldoTransfer + taxa;

        if ((contaOrigem.getSaldo() + limiteExtra) < custoTotal) {
            return "Saldo insuficiente (incluindo taxas e limite).";
        }
        
        // Tira de quem envia
        contaOrigem.setSaldo(contaOrigem.getSaldo() - saldoTransfer - taxa);
        // Coloca em quem recebe
        contaDestinoFinal.setSaldo(contaDestinoFinal.getSaldo() + saldoTransfer);

        // atualizza os bancos
        OperacoesPers oper = new OperacoesPers();
        boolean atualizouOrigem = oper.transacoes(contaOrigem);
        boolean atualizouDestino = oper.transacoes(contaDestinoFinal);

        if (atualizouOrigem && atualizouDestino) {

            //grava no historico
            SimpleDateFormat formataDataHora = new SimpleDateFormat("dd/MM/yyyy HH:mm");
            String dataAgora = formataDataHora.format(new Date());
            // Histórico de quem ENVIOU
            TransacaoVO tOrigem = new TransacaoVO("TRANSFERENCIA", saldoTransfer, dataAgora, "Enviado para " + contaDestinoFinal.getTitular());
            contaOrigem.adicionarTransacao(tOrigem); // Atualiza lista memória
            oper.historicoTransacoes(tOrigem, contaOrigem.getId()); // Salva no banco

            // Histórico de quem RECEBEU
            TransacaoVO tDestino = new TransacaoVO("TRANSFERENCIA", saldoTransfer, dataAgora, "Recebido de " + contaOrigem.getTitular());
            oper.historicoTransacoes(tDestino, contaDestinoFinal.getId());

            return "Sucesso";
        } else {
            return "Erro no sistema ao processar transferência.";
        }
    }

    public void exportarExtrato(ContaVO conta, File arquivoDestino) throws IOException {

        FileWriter fw = new FileWriter(arquivoDestino);

        try (BufferedWriter writer = new BufferedWriter(fw)) {

            writer.write("========================================");
            writer.newLine();
            writer.write("           BANCO - EXTRATO         ");
            writer.newLine();
            writer.write("========================================");
            writer.newLine();
            writer.newLine();

            writer.write("Titular: " + conta.getTitular());
            writer.newLine();
            writer.write("Conta:   " + conta.getNumeroConta());
            writer.newLine();
            writer.write("Data:    " + new SimpleDateFormat("dd/MM/yyyy HH:mm").format(new Date()));
            writer.newLine();
            writer.write("----------------------------------------");
            writer.newLine();

            Locale brasil = new Locale("pt", "BR");
            NumberFormat formatador = NumberFormat.getCurrencyInstance(brasil);

            for (VO.TransacaoVO t : conta.getHistorico()) {

                double valor = t.getValor();

                String linha = String.format("%s | %s | %s",
                        t.getTipo(),
                        formatador.format(valor),
                        t.getDetalhes());

                writer.write(linha);
                writer.newLine();
                writer.write("----------------------------------------");
                writer.newLine();
            }

            // 3. Rodapé (Saldo Final)
            writer.write("----------------------------------------");
            writer.newLine();
            writer.write(String.format("SALDO ATUAL: R$ %.2f", conta.getSaldo()));
            writer.newLine();
            writer.write("========================================");

        }
    }

    public boolean renderJuros(ContaVO conta) throws SQLException {
        if ("POUPANÇA".equals(conta.getTipoConta())) {
            double taxaRendimento = 0.005; // 0.5% ao mês
            double ganho = conta.getSaldo() * taxaRendimento;

            conta.setSaldo(conta.getSaldo() + ganho);

            SimpleDateFormat formataDataHora = new SimpleDateFormat("dd/MM/yyyy HH:mm");
            String dataAgora = formataDataHora.format(new Date());

            TransacaoVO novaTransacao = new TransacaoVO("RENDIMENTO", ganho, dataAgora, "Rendimento de Juros");
            conta.adicionarTransacao(novaTransacao);

            OperacoesPers oper = new OperacoesPers();
            boolean juros = oper.transacoes(conta);
            if (juros) {
                boolean historicoSalvo = oper.historicoTransacoes(novaTransacao, conta.getId());
                return historicoSalvo;
            }
        }
        return false;
    }

    public double chequeEspecial(ContaVO conta) {

        double cheque = -500;

        return 0;
    }
}
