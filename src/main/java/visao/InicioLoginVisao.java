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
        //lbConta.setText("Conta bancária: " + contaLog.getNumeroConta());
        //lbTipoConta.setText("CONTA " + contaLog.getTipoConta());
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
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
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

        jButton1.setText("jButton1");

        jLabel4.setText("DEPÓSITO");

        jLabel5.setText("Conta bancária:");
        jLabel5.setPreferredSize(new java.awt.Dimension(82, 16));

        jLabel6.setText("jLabel6");
        jLabel6.setPreferredSize(new java.awt.Dimension(200, 40));

        jLabel7.setText("Tipo :");

        jLabel8.setText("jLabel8");
        jLabel8.setPreferredSize(new java.awt.Dimension(200, 40));

        javax.swing.GroupLayout contaLayout = new javax.swing.GroupLayout(conta);
        conta.setLayout(contaLayout);
        contaLayout.setHorizontalGroup(
            contaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contaLayout.createSequentialGroup()
                .addGroup(contaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contaLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(contaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(contaLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel4))
                            .addGroup(contaLayout.createSequentialGroup()
                                .addGroup(contaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(contaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(contaLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(contaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(contaLayout.createSequentialGroup()
                                                .addComponent(lbSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btVer, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btDesver))
                                            .addGroup(contaLayout.createSequentialGroup()
                                                .addGap(17, 17, 17)
                                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(contaLayout.createSequentialGroup()
                                        .addGap(60, 60, 60)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(contaLayout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(jButton1)))
                .addContainerGap(34, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(149, 149, 149))
        );
        contaLayout.setVerticalGroup(
            contaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contaLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lbUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(contaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btDesver, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(contaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btVer, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(contaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(31, 31, 31)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 87, Short.MAX_VALUE))
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btDesver;
    private javax.swing.JButton btVer;
    private javax.swing.JPanel conta;
    private javax.swing.JButton jButton1;
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
    private javax.swing.JLabel lbSaldo;
    private javax.swing.JLabel lbUsuario;
    private javax.swing.JPanel painelGrid;
    // End of variables declaration//GEN-END:variables
}
