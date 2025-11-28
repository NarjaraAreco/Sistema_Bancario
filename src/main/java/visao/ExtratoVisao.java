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
        propriedades();
    }
    
    private void propriedades(){
        this.setSize(700, 500);
        this.setLocationRelativeTo(null);
        btExportar.putClientProperty("FlatLaf.style", "shadowWidth: 4; shadowColor: #00000040");
        btVoltar.putClientProperty("JPasswordField.showRevealButton", true);
        
        
        painelCentral.putClientProperty("FlatLaf.style", 
            "arc: 30; " +
            "border: null"
        ); 
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
                        OperacoesRN rn = new OperacoesRN();
                        rn.exportarExtrato(conta, arquivoFinal);
                        
                        javax.swing.SwingUtilities.invokeLater(() -> {//AGUARDA O INVOKE
                            JOptionPane.showMessageDialog(null, "EXTRATO SALVO COM SUCESSO!", "EXTRATO", JOptionPane.INFORMATION_MESSAGE);
                        });
                        
                    } catch (IOException ex) {
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
    pbProgresso.setIndeterminate(true);
    Double valor = conta.getSaldo();
    lbUsuario.setText("Olá, " + conta.getTitular());        
        lbSaldo.setText("Saldo atual: " + formatador.format(valor));
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
                                    }); pbProgresso.setIndeterminate(false);
                                }
                            }
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
        painelCentral = new javax.swing.JPanel();
        btVoltar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbExtrato = new javax.swing.JTable();
        lbUsuario = new javax.swing.JLabel();
        lbSaldo = new javax.swing.JLabel();
        pbProgresso = new javax.swing.JProgressBar();
        btExportar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("EXTRATO BANCÁRIO");
        setUndecorated(true);

        painelCentral.setBackground(new java.awt.Color(9, 102, 102));

        btVoltar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btVoltar.setText("VOLTAR");
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });

        tbExtrato.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
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

        lbUsuario.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lbUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lbUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbUsuario.setText("Usuário: ");
        lbUsuario.setPreferredSize(new java.awt.Dimension(200, 40));

        lbSaldo.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lbSaldo.setForeground(new java.awt.Color(255, 255, 255));
        lbSaldo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbSaldo.setText("Saldo:");
        lbSaldo.setPreferredSize(new java.awt.Dimension(200, 40));

        btExportar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btExportar.setText("EXPORTAR");
        btExportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExportarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelCentralLayout = new javax.swing.GroupLayout(painelCentral);
        painelCentral.setLayout(painelCentralLayout);
        painelCentralLayout.setHorizontalGroup(
            painelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCentralLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(painelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(painelCentralLayout.createSequentialGroup()
                        .addComponent(btExportar)
                        .addGap(27, 27, 27)
                        .addComponent(btVoltar)
                        .addGap(28, 28, 28)
                        .addComponent(pbProgresso, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbUsuario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbSaldo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        painelCentralLayout.setVerticalGroup(
            painelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCentralLayout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(lbUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btVoltar)
                        .addComponent(btExportar))
                    .addComponent(pbProgresso, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getContentPane().add(painelCentral, java.awt.BorderLayout.CENTER);

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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbSaldo;
    private javax.swing.JLabel lbUsuario;
    private javax.swing.JPanel painelCentral;
    private javax.swing.JProgressBar pbProgresso;
    private javax.swing.JTable tbExtrato;
    // End of variables declaration//GEN-END:variables
}
