/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package visao;

import VO.ContaVO;
import VO.TransacaoVO;
import java.io.File;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import regraNegocio.OperacoesRN;

/**
 *
 * @author narja
 */
public class ExtratoVisao extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(ExtratoVisao.class.getName());
    //private DefaultListModel<String> usarLista = new DefaultListModel<>();
    private ContaVO conta;

    /**
     * Creates new form ExtratoVisao
     * @param contaRecebida
     */
    public ExtratoVisao(ContaVO contaRecebida) {
        initComponents();
        
        this.conta = contaRecebida;
        preencherDados();
    }
 
    private void localExtrato() throws IOException {

        fcEscolherPasta.setDialogTitle("Salvar Extrato Bancário");
        //somente txt
        fcEscolherPasta.setFileFilter(new FileNameExtensionFilter("Arquivo de Texto (.txt)", "txt"));
        //sugestao do nome do arquivo
        String nomeSugestao = "extrato_" + conta.getNumeroConta() + ".txt";
        fcEscolherPasta.setSelectedFile(new File(nomeSugestao));
        int resultado = fcEscolherPasta.showSaveDialog(this);
        if (resultado == JFileChooser.APPROVE_OPTION) {
            
            File arquivoEscolhido = fcEscolherPasta.getSelectedFile();
            
            if (!arquivoEscolhido.getName().endsWith(".txt")) {
                arquivoEscolhido = new File(arquivoEscolhido.getAbsolutePath() + ".txt");
                
            }
            
            final File arquivoFinal = arquivoEscolhido;
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        // A LÓGICA DE SALVAR O ARQUIVO EM SEGUNDO PLANO
                        OperacoesRN rn = new OperacoesRN();
                        rn.exportarExtrato(conta, arquivoFinal);
                        
                        // AVISO DE SUCESSO DEVE VOLTAR PARA A THREAD PRINCIPAL (invokeLater)
                        javax.swing.SwingUtilities.invokeLater(() -> {
                            JOptionPane.showMessageDialog(null, "EXTRATO SALVO COM SUCESSO!", "EXTRATO", JOptionPane.INFORMATION_MESSAGE);
                        });
                        
                    } catch (IOException ex) {
                        // Tratar erro no disco ou na escrita, voltando para a tela
                        javax.swing.SwingUtilities.invokeLater(() -> {
                            JOptionPane.showMessageDialog(null, "ERRO ao salvar arquivo: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
                        });
                    }
                }
            }).start();
        } 

    }
    
    private void preencherDados() {
    Locale brasil = new Locale("pt", "BR");
    NumberFormat formatador = NumberFormat.getCurrencyInstance(brasil);
    DefaultTableModel modelo = (DefaultTableModel) tbExtrato.getModel();
    modelo.setNumRows(0); 
    
    Double valor = conta.getSaldo();
    lbUsuario.setText("Usuario: " + this.conta.getTitular());
    lbSaldo.setText("Saldo: " + formatador.format(valor));
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    //pega o historico da lista
                    Thread.sleep(1500);//TIMEEEEEEEEEEEEEEEEEEEEEEEEEEE
                    List<TransacaoVO> historico = conta.getHistorico();
                    
                    javax.swing.SwingUtilities.invokeLater(new Runnable(){
                        @Override
                        public void run() {
                            
                            // se o historico da lista n for nulo
                            if (historico != null) {
                                for (TransacaoVO t : historico) {
                                    double valor = t.getValor();
                             
                                    modelo.addRow(new Object[]{
                                        t.getTipo(),             
                                        formatador.format(valor),
                                        t.getDataHora(),
                                        t.getDetalhes()
                                    });
                                }
                            } pbProgresso.setVisible(false);
                        }
                    });
                } catch (InterruptedException ex){
                    JOptionPane.showMessageDialog(null, "ERRO: " + ex.getMessage() , "Erro", JOptionPane.ERROR_MESSAGE);
                }   
            }
        });
        thread.start();//INICIA A THREAD////////////////
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fcEscolherPasta = new javax.swing.JFileChooser();
        jPanel1 = new javax.swing.JPanel();
        btVoltar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbExtrato = new javax.swing.JTable();
        lbUsuario = new javax.swing.JLabel();
        lbSaldo = new javax.swing.JLabel();
        pbProgresso = new javax.swing.JProgressBar();
        btExportar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("EXTRATO BANCÁRIO");

        btVoltar.setText("Voltar");
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });

        tbExtrato.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tipo", "Valor", "Data e hora", "Detalhes"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tbExtrato);

        lbUsuario.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        lbUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbUsuario.setText("Usuário: ");

        lbSaldo.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        lbSaldo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbSaldo.setText("Saldo:");

        pbProgresso.setIndeterminate(true);

        btExportar.setText("Exportar");
        btExportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExportarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(107, 107, 107)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 576, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(btVoltar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btExportar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pbProgresso, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lbUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbSaldo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btVoltar)
                        .addComponent(btExportar))
                    .addComponent(pbProgresso, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        try {
            InicioLoginVisao inicio = new InicioLoginVisao(this.conta);

            dispose();
            inicio.setVisible(true);
        } catch (Exception ex) {
            // C. Se deu erro (falha no banco, por exemplo), avisa o usuário.
            JOptionPane.showMessageDialog(this, 
                "Erro ao voltar para o menu principal: " + ex.getMessage(), 
                "Erro de Navegação", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btVoltarActionPerformed

    private void btExportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExportarActionPerformed
        try {
            localExtrato();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "ERRO!" + ex.getMessage() , "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btExportarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btExportar;
    private javax.swing.JButton btVoltar;
    private javax.swing.JFileChooser fcEscolherPasta;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbSaldo;
    private javax.swing.JLabel lbUsuario;
    private javax.swing.JProgressBar pbProgresso;
    private javax.swing.JTable tbExtrato;
    // End of variables declaration//GEN-END:variables
}
