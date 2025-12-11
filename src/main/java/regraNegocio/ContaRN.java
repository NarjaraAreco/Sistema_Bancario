/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package regraNegocio;

import VO.CepVO;
import VO.ContaVO;
import VO.TransacaoVO;
import com.google.gson.Gson;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import persistencia.ContaPers;
import persistencia.OperacoesPers;

/**
 *
 * @author narja
 */
public class ContaRN{
    //historico de contas
    private static Map<String, ContaVO> guardaContas = new HashMap<>();

    public ContaVO autenticarRN(String cpf, String senha) throws Exception {     
        ContaVO conta = null;
        String cpfSemMascara = cpf.replaceAll("[^0-9]", ""); //tira os traços do cpf
        if (cpfSemMascara.isEmpty() || senha.isEmpty()) { 
            return conta;
        } 
        
        if (guardaContas.containsKey(cpf)) {
            System.out.println("Recuperado do da memória!");
            return guardaContas.get(cpf); // Devolve direto, sem ir no banco
        }
        
        ContaPers pers = new ContaPers();
        conta = pers.autenticarPers(cpf, senha);
        if (conta != null) {
            guardaContas.put(cpf, conta);
        }
    return conta;        
    }

    public CepVO buscarCep(String cep) throws Exception {
        
        String cepLimpo = cep.replaceAll("[^0-9]", "");
        if (cepLimpo.length() != 8) {
            return null;
        }
        
        try {
            // 1. Conecta
            URL url = new URL("https://viacep.com.br/ws/" + cepLimpo + "/json/");
            HttpURLConnection conexao = (HttpURLConnection) url.openConnection();
            
            if (conexao.getResponseCode() != 200) return null;

            // Ele lê a internet (InputStream) e transforma na classe EnderecoDTO com o GSON(biblioteca)
            Gson gson = new Gson();
            CepVO viaCep = gson.fromJson(new InputStreamReader(conexao.getInputStream(), "UTF-8"), CepVO.class);

            // Verifica se o ViaCEP retornou erro lógico (CEP inexistente)
            if (viaCep.isErro()) return null;

            return viaCep; // Retorna o objeto prontinho!      
        }
       finally{
           ////////////////////////// 
        }
    }

    public String validarDadosCadastro(ContaVO conta, int opc) throws SQLException{
        ContaPers contaExiste = new ContaPers();
        if (opc == 1){
            if ((conta.getTitular() == null || conta.getTitular().trim().isEmpty()) || 
                (conta.getEmail() == null || conta.getEmail().trim().isEmpty()) ||
                (conta.getCpf() == null || conta.getCpf().trim().isEmpty()) ||
                (conta.getTipoConta() == null || conta.getTipoConta().trim().isEmpty())){
                    return "Por favor, preencha todos os campos!";}

            if (contaExiste.existeCPF(conta.getCpf())) {
                    return "CPF Já utilizado!";}
            
            return null;
        }
        
        if (opc == 2){
            if ((conta.getRua() == null || conta.getRua().trim().isEmpty()) || 
                (conta.getBairro() == null || conta.getBairro().trim().isEmpty()) || 
                (conta.getNumeroCasa() == null || conta.getNumeroCasa().trim().isEmpty()) || 
                (conta.getCidade() == null || conta.getCidade().trim().isEmpty()) ||
                (conta.getEstado() == null || conta.getEstado().trim().isEmpty() || conta.getEstado().equals("Escolha...")) ||
                (conta.getCep() == null || conta.getCep().trim().isEmpty())){
                return "Por favor, preencha todos os campos!";} 
            
            return null;
        }
        

    if (conta.getSenha() == null || conta.getSenha().trim().isEmpty()) {
        return null;
    }

//    return !(conta.getTipoConta() == null || conta.getTipoConta().trim().isEmpty());
        return null;
    }
    
    public ContaVO cadastrar(ContaVO conta) throws SQLException{
        ContaPers novaConta = new ContaPers();
     
        Random gerador = new Random();
        int numero = 100000 + gerador.nextInt(900000); 
        conta.setNumeroConta(numero + "-" + gerador.nextInt(9));
        
        boolean contaOK = novaConta.cadastrarConta(conta);
        if (contaOK) {
            OperacoesPers oper = new OperacoesPers();
            TransacaoVO abertura = new TransacaoVO("ABERTURA", conta.getSaldo(), "Saldo Inicial");
            oper.historicoTransacoes(abertura, conta.getId()); 
            return conta;
        }else{
            return null;  
        }
    }
}
