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
public final class TelaPrincipalVisao extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(TelaPrincipalVisao.class.getName());
    private ContaVO contaLog;

    public void preencherDados() throws Exception{
              
        lbBemVindo.setText("Olá, " + contaLog.getTitular() + "!");
        lbSaldo.setText("Salto atual: --- ");
        lbConta.setText("Conta bancária: " + contaLog.getNumeroConta());
        lbTipoConta.setText("CONTA " + contaLog.getTipoConta());
    }
    
    public TelaPrincipalVisao(ContaVO conta) throws Exception {
        initComponents();      
        this.contaLog = conta;
        
        btNaover.setVisible(false);
        
        preencherDados();
      
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnCima = new javax.swing.JPanel();
        lbBemVindo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lbSaldo = new javax.swing.JLabel();
        btVer = new javax.swing.JButton();
        btNaover = new javax.swing.JButton();
        lbConta = new javax.swing.JLabel();
        lbTipoConta = new javax.swing.JLabel();
        pnCorpo = new javax.swing.JPanel();
        btDeposito = new javax.swing.JButton();
        btSaque = new javax.swing.JButton();
        btTransferir = new javax.swing.JButton();
        btExtrato = new javax.swing.JButton();
        btFechar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Conta Bancária");
        setPreferredSize(new java.awt.Dimension(500, 400));

        pnCima.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        pnCima.setLayout(new java.awt.GridLayout(4, 1));

        lbBemVindo.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        lbBemVindo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbBemVindo.setText("Bem vindo");
        pnCima.add(lbBemVindo);

        jPanel2.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        lbSaldo.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        lbSaldo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbSaldo.setText("Saldo atual:");
        jPanel2.add(lbSaldo);

        btVer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aberto-removebg-preview.png"))); // NOI18N
        btVer.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btVer.setBorderPainted(false);
        btVer.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        btVer.setMargin(new java.awt.Insets(2, 5, 3, 14));
        btVer.setMaximumSize(new java.awt.Dimension(48, 48));
        btVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVerActionPerformed(evt);
            }
        });
        jPanel2.add(btVer);

        btNaover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fechado-removebg-preview.png"))); // NOI18N
        btNaover.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btNaover.setBorderPainted(false);
        btNaover.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        btNaover.setMargin(new java.awt.Insets(2, 5, 3, 14));
        btNaover.setMaximumSize(new java.awt.Dimension(48, 48));
        btNaover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNaoverActionPerformed(evt);
            }
        });
        jPanel2.add(btNaover);

        pnCima.add(jPanel2);

        lbConta.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        lbConta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbConta.setText("Conta Bancária:");
        pnCima.add(lbConta);

        lbTipoConta.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        lbTipoConta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTipoConta.setText("Tipo de Conta:");
        pnCima.add(lbTipoConta);

        getContentPane().add(pnCima, java.awt.BorderLayout.NORTH);

        pnCorpo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));
        pnCorpo.setToolTipText("Conta");
        pnCorpo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pnCorpo.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        pnCorpo.setLayout(new java.awt.GridLayout(3, 2, 20, 20));

        btDeposito.setText("Deposito");
        btDeposito.setToolTipText("");
        btDeposito.setCursor(new java.awt.Cursor(java.awt.Cursor.E_RESIZE_CURSOR));
        btDeposito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDepositoActionPerformed(evt);
            }
        });
        pnCorpo.add(btDeposito);

        btSaque.setText("Saque");
        btSaque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSaqueActionPerformed(evt);
            }
        });
        pnCorpo.add(btSaque);

        btTransferir.setText("Transferir");
        btTransferir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTransferirActionPerformed(evt);
            }
        });
        pnCorpo.add(btTransferir);

        btExtrato.setText("Extrato");
        btExtrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExtratoActionPerformed(evt);
            }
        });
        pnCorpo.add(btExtrato);

        btFechar.setText("Fechar");
        pnCorpo.add(btFechar);

        getContentPane().add(pnCorpo, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVerActionPerformed
        
            Double valor = contaLog.getSaldo();
            Locale brasil = new Locale("pt", "BR");
            NumberFormat formatador = NumberFormat.getCurrencyInstance(brasil);

            lbSaldo.setText("Salto atual: " + formatador.format(valor));
            btVer.setVisible(false);
            btNaover.setVisible(true);
    }//GEN-LAST:event_btVerActionPerformed

    private void btNaoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNaoverActionPerformed
            lbSaldo.setText("Salto atual");
            btNaover.setVisible(false);
            btVer.setVisible(true);
    }//GEN-LAST:event_btNaoverActionPerformed

    private void btDepositoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDepositoActionPerformed
        DepositoVisao deposito = new DepositoVisao(this.contaLog);
        dispose();
        deposito.setVisible(true);
    }//GEN-LAST:event_btDepositoActionPerformed

    private void btSaqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSaqueActionPerformed
        SaqueVisao saque = new SaqueVisao(this.contaLog);
        dispose();
        saque.setVisible(true);
    }//GEN-LAST:event_btSaqueActionPerformed

    private void btExtratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExtratoActionPerformed
        ExtratoVisao extrato = new ExtratoVisao(this.contaLog);
        dispose();
        extrato.setVisible(true);
    }//GEN-LAST:event_btExtratoActionPerformed

    private void btTransferirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTransferirActionPerformed
        TransferenciaVisao transferencia = new TransferenciaVisao(this.contaLog);
        dispose();
        transferencia.setVisible(true);
    }//GEN-LAST:event_btTransferirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btDeposito;
    private javax.swing.JButton btExtrato;
    private javax.swing.JButton btFechar;
    private javax.swing.JButton btNaover;
    private javax.swing.JButton btSaque;
    private javax.swing.JButton btTransferir;
    private javax.swing.JButton btVer;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbBemVindo;
    private javax.swing.JLabel lbConta;
    private javax.swing.JLabel lbSaldo;
    private javax.swing.JLabel lbTipoConta;
    private javax.swing.JPanel pnCima;
    private javax.swing.JPanel pnCorpo;
    // End of variables declaration//GEN-END:variables
}
