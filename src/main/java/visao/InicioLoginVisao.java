/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package visao;

import VO.ContaVO;
import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author narja
 */
public class InicioLoginVisao extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(InicioLoginVisao.class.getName());
    private ContaVO contaLog;
    /**
     * Creates new form InicioLoginVisao
     * @param conta
     */
    public InicioLoginVisao(ContaVO conta) {
        initComponents();
        
        this.contaLog = conta;
        btDesver.setVisible(false);
        propriedades();
        preencherDados();
    }

    private void propriedades(){
        this.setSize(1000, 800);
        this.setLocationRelativeTo(null);
        //btLogin.putClientProperty("FlatLaf.style", "shadowWidth: 4; shadowColor: #00000040");
        //pfSenha.putClientProperty("JPasswordField.showRevealButton", true);
        
        conta.setSize(600, 500);
        conta.setOpaque(false);
        conta.putClientProperty("FlatLaf.style", 
            "background: rgba(255, 255, 255, 150); " + 
            "arc: 30; " +
            "border: null"
        ); 
    }
    
    private void preencherDados(){
              
        lbUsuario.setText("Olá, " + contaLog.getTitular() + "!");
        lbSaldo.setText(" --- ");
        lbConta.setText(contaLog.getNumeroConta());
        lbTipoConta.setText(contaLog.getTipoConta());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        painelGrid = new javax.swing.JPanel();
        conta = new javax.swing.JPanel();
        lbUsuario = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbSaldo = new javax.swing.JLabel();
        btVer = new javax.swing.JButton();
        btDesver = new javax.swing.JButton();
        btDeposito = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lbConta = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lbTipoConta = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        btTransferencia = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btSaque = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btDeposito1 = new javax.swing.JButton();
        btExtrato = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        painelGrid.setBackground(new java.awt.Color(9, 102, 102));
        painelGrid.setLayout(new java.awt.GridBagLayout());

        conta.setBackground(new java.awt.Color(255, 255, 255));
        conta.setForeground(new java.awt.Color(255, 255, 255));
        conta.setMinimumSize(new java.awt.Dimension(500, 500));
        conta.setPreferredSize(new java.awt.Dimension(500, 600));

        lbUsuario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbUsuario.setText("USUARIO");
        lbUsuario.setPreferredSize(new java.awt.Dimension(200, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Saldo atual:");
        jLabel2.setPreferredSize(new java.awt.Dimension(200, 40));

        lbSaldo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbSaldo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbSaldo.setPreferredSize(new java.awt.Dimension(200, 40));

        btVer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aberto-removebg-preview.png"))); // NOI18N
        btVer.setContentAreaFilled(false);
        btVer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btVer.setPreferredSize(new java.awt.Dimension(200, 40));
        btVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVerActionPerformed(evt);
            }
        });

        btDesver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fechado-removebg-preview.png"))); // NOI18N
        btDesver.setContentAreaFilled(false);
        btDesver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btDesver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDesverActionPerformed(evt);
            }
        });

        btDeposito.setIcon(new javax.swing.ImageIcon("C:\\Users\\narja\\Downloads\\deposito (1) (2).png")); // NOI18N
        btDeposito.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btDeposito.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btDeposito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDepositoActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jLabel4.setText("DEPÓSITO");

        lbConta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbConta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbConta.setText("lbConta");
        lbConta.setPreferredSize(new java.awt.Dimension(200, 40));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Tipo :");
        jLabel7.setPreferredSize(new java.awt.Dimension(200, 40));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Conta:");
        jLabel8.setPreferredSize(new java.awt.Dimension(200, 40));

        lbTipoConta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbTipoConta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTipoConta.setText("jLabel6");
        lbTipoConta.setPreferredSize(new java.awt.Dimension(200, 40));

        btTransferencia.setIcon(new javax.swing.ImageIcon("C:\\Users\\narja\\Downloads\\transferencia-de-dinheiro (1).png")); // NOI18N
        btTransferencia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btTransferencia.setMargin(new java.awt.Insets(0, 0, 0, 0));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jLabel5.setText("TRANSFERENCIA");

        btSaque.setIcon(new javax.swing.ImageIcon("C:\\Users\\narja\\Downloads\\saque.png")); // NOI18N
        btSaque.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btSaque.setMargin(new java.awt.Insets(0, 0, 0, 0));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jLabel6.setText("SAQUE");

        btDeposito1.setIcon(new javax.swing.ImageIcon("C:\\Users\\narja\\Downloads\\deposito (1) (2).png")); // NOI18N
        btDeposito1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btDeposito1.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btDeposito1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeposito1ActionPerformed(evt);
            }
        });

        btExtrato.setIcon(new javax.swing.ImageIcon("C:\\Users\\narja\\Downloads\\deposito (1) (2).png")); // NOI18N
        btExtrato.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btExtrato.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btExtrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExtratoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contaLayout = new javax.swing.GroupLayout(conta);
        conta.setLayout(contaLayout);
        contaLayout.setHorizontalGroup(
            contaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(contaLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(contaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(contaLayout.createSequentialGroup()
                        .addGroup(contaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(contaLayout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6)
                                .addGap(108, 108, 108))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contaLayout.createSequentialGroup()
                                .addGroup(contaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btDeposito)
                                    .addComponent(btExtrato))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(contaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btDeposito1)
                                    .addComponent(btSaque))
                                .addGap(84, 84, 84)))
                        .addGroup(contaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btTransferencia)
                            .addComponent(jLabel5))
                        .addGap(4, 4, 4))
                    .addGroup(contaLayout.createSequentialGroup()
                        .addGroup(contaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(contaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbSaldo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbConta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbTipoConta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btVer, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btDesver))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        contaLayout.setVerticalGroup(
            contaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contaLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lbUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(contaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btDesver, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(contaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btVer, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25)
                .addGroup(contaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbConta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(contaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTipoConta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(contaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btTransferencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btDeposito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btSaque, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(40, 40, 40)
                .addGroup(contaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btDeposito1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btExtrato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(92, 92, 92))
        );

        painelGrid.add(conta, new java.awt.GridBagConstraints());

        getContentPane().add(painelGrid, java.awt.BorderLayout.CENTER);

        jPanel1.setBackground(new java.awt.Color(9, 102, 102));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("MENU INICIAL");
        jPanel1.add(jLabel3);

        getContentPane().add(jPanel1, java.awt.BorderLayout.NORTH);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVerActionPerformed
        Double valor = contaLog.getSaldo();
        Locale brasil = new Locale("pt", "BR");
        NumberFormat formatador = NumberFormat.getCurrencyInstance(brasil);

        lbSaldo.setText(formatador.format(valor));
        btVer.setVisible(false);
        btDesver.setVisible(true);
    }//GEN-LAST:event_btVerActionPerformed

    private void btDesverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDesverActionPerformed
        lbSaldo.setText(" --- ");
        btDesver.setVisible(false);
        btVer.setVisible(true);
    }//GEN-LAST:event_btDesverActionPerformed

    private void btDepositoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDepositoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btDepositoActionPerformed

    private void btDeposito1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeposito1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btDeposito1ActionPerformed

    private void btExtratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExtratoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btExtratoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btDeposito;
    private javax.swing.JButton btDeposito1;
    private javax.swing.JButton btDesver;
    private javax.swing.JButton btExtrato;
    private javax.swing.JButton btSaque;
    private javax.swing.JButton btTransferencia;
    private javax.swing.JButton btVer;
    private javax.swing.JPanel conta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lbConta;
    private javax.swing.JLabel lbSaldo;
    private javax.swing.JLabel lbTipoConta;
    private javax.swing.JLabel lbUsuario;
    private javax.swing.JPanel painelGrid;
    // End of variables declaration//GEN-END:variables
}
