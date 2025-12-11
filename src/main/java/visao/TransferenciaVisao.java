/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package visao;

import VO.ContaVO;
import java.sql.SQLException;
import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.JOptionPane;
import regraNegocio.OperacoesRN;

/**
 *
 * @author narja
 */
public class TransferenciaVisao extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(TransferenciaVisao.class.getName());
    private ContaVO conta;

    public TransferenciaVisao(ContaVO contaRecebida) {
        initComponents();
        
        this.conta = contaRecebida;
        propriedades();
        preencherDados();
    }
    
    private void preencherDados(){
        
        Double valor = conta.getSaldo();
        Locale brasil = new Locale("pt", "BR");
        NumberFormat formatador = NumberFormat.getCurrencyInstance(brasil);
            
        lbUsuario.setText("Olá, " + conta.getTitular());        
        lbSaldo.setText("Saldo atual: " + formatador.format(valor));
        
    }
    
    private void propriedades(){
        this.setSize(400, 400);
        this.setLocationRelativeTo(null);
        btTransferir.putClientProperty("FlatLaf.style", "shadowWidth: 4; shadowColor: #00000040");
        btVoltar.putClientProperty("JPasswordField.showRevealButton", true);
        
        
        painelCentral.putClientProperty("FlatLaf.style", 
            "arc: 30; " +
            "border: null"
        ); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelCentral = new javax.swing.JPanel();
        ftConta = new javax.swing.JFormattedTextField();
        ftValor = new javax.swing.JFormattedTextField();
        btVoltar = new javax.swing.JButton();
        btTransferir = new javax.swing.JButton();
        lbUsuario = new javax.swing.JLabel();
        lbSaldo = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setUndecorated(true);

        painelCentral.setBackground(new java.awt.Color(9, 102, 102));

        try {
            ftConta.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("######-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftConta.setPreferredSize(new java.awt.Dimension(200, 40));

        ftValor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        ftValor.setPreferredSize(new java.awt.Dimension(200, 40));
        ftValor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ftValorKeyTyped(evt);
            }
        });

        btVoltar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btVoltar.setText("VOLTAR");
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });

        btTransferir.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btTransferir.setText("TRANSFERIR");
        btTransferir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTransferirActionPerformed(evt);
            }
        });

        lbUsuario.setBackground(new java.awt.Color(255, 255, 255));
        lbUsuario.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lbUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lbUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbUsuario.setText("Olá, usuario");
        lbUsuario.setPreferredSize(new java.awt.Dimension(200, 40));

        lbSaldo.setBackground(new java.awt.Color(255, 255, 255));
        lbSaldo.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lbSaldo.setForeground(new java.awt.Color(255, 255, 255));
        lbSaldo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbSaldo.setText("Saldo atual:");
        lbSaldo.setPreferredSize(new java.awt.Dimension(200, 40));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("INFORME O VALOR DA TRANSFERENCIA:");
        jLabel4.setPreferredSize(new java.awt.Dimension(200, 40));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("INFORME A CONTA DESTINO:");
        jLabel5.setPreferredSize(new java.awt.Dimension(200, 40));

        javax.swing.GroupLayout painelCentralLayout = new javax.swing.GroupLayout(painelCentral);
        painelCentral.setLayout(painelCentralLayout);
        painelCentralLayout.setHorizontalGroup(
            painelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCentralLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(painelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelCentralLayout.createSequentialGroup()
                        .addComponent(btTransferir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btVoltar))
                    .addComponent(ftValor, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
                    .addComponent(lbUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbSaldo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ftConta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(65, 65, 65))
        );
        painelCentralLayout.setVerticalGroup(
            painelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCentralLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lbUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ftConta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ftValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(painelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btTransferir)
                    .addComponent(btVoltar))
                .addGap(44, 44, 44))
        );

        getContentPane().add(painelCentral, java.awt.BorderLayout.PAGE_END);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        try {
            InicioLoginVisao inicio = new InicioLoginVisao(this.conta);

            dispose();
            inicio.setVisible(true);
        
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, 
                "Erro ao voltar para o menu principal: " + ex.getMessage(), 
                "Erro de Navegação", JOptionPane.ERROR_MESSAGE);
        }   
    }//GEN-LAST:event_btVoltarActionPerformed

    private void btTransferirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTransferirActionPerformed
        String contaDestino = ftConta.getText();
        String valorTransferido = ftValor.getText();
    
        OperacoesRN oper = new OperacoesRN();       
        String resultado;
        int confirm = 0;
        if ("CORRENTE".equals(conta.getTipoConta())) {
            confirm = JOptionPane.showConfirmDialog(null, "Será cobrada uma taxa de R$2,60. Deseja mesmo transferir " + valorTransferido + "?", "CONFIRMAÇÃO", JOptionPane.YES_NO_OPTION);
        }
        if (confirm == 0) {
            try {
                resultado = oper.transferencia(this.conta, contaDestino, valorTransferido);      

                if (resultado.equals("Sucesso")) {
                    JOptionPane.showMessageDialog(null, "TRANSFERENCIA REALIZADA COM SUCESSO!", "TRANSFERENCIA", JOptionPane.INFORMATION_MESSAGE);
                    preencherDados();
                } else {
                    JOptionPane.showMessageDialog(null, "NÃO FOI POSSÍVEL REALIZAR A TRANSFERENCIA, TENTE NOVAMENTE!" , "Não realizado", JOptionPane.ERROR_MESSAGE);
                }
            } catch (SQLException ex) {
                System.getLogger(TransferenciaVisao.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
            } catch (NumberFormatException ex){
                JOptionPane.showMessageDialog(null, "APENAS NUMEROS! Erro:" + ex.getMessage() , "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
        ftValor.setText("");
        ftConta.setText("");
    }//GEN-LAST:event_btTransferirActionPerformed

    private void ftValorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ftValorKeyTyped
        char letra = evt.getKeyChar();
        
        if (!Character.isDigit(letra)) {
            evt.consume();
            java.awt.Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_ftValorKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btTransferir;
    private javax.swing.JButton btVoltar;
    private javax.swing.JFormattedTextField ftConta;
    private javax.swing.JFormattedTextField ftValor;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lbSaldo;
    private javax.swing.JLabel lbUsuario;
    private javax.swing.JPanel painelCentral;
    // End of variables declaration//GEN-END:variables
}
