/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package visao;

import VO.ContaVO;
import java.sql.SQLException;
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
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ftConta = new javax.swing.JFormattedTextField();
        ftValor = new javax.swing.JFormattedTextField();
        btVoltar = new javax.swing.JButton();
        btTransferir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel1.setText("Qual conta deseja transferir? ");

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel2.setText("Valor a ser transferido?");

        try {
            ftConta.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("######-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        ftValor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));

        btVoltar.setText("Voltar");
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });

        btTransferir.setText("Transferir");
        btTransferir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTransferirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 355, Short.MAX_VALUE)
                    .addComponent(ftConta)
                    .addComponent(ftValor, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(91, Short.MAX_VALUE)
                .addComponent(btTransferir)
                .addGap(52, 52, 52)
                .addComponent(btVoltar)
                .addGap(105, 105, 105))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ftConta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(ftValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btVoltar)
                    .addComponent(btTransferir))
                .addGap(18, 18, 18))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_END);

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btTransferir;
    private javax.swing.JButton btVoltar;
    private javax.swing.JFormattedTextField ftConta;
    private javax.swing.JFormattedTextField ftValor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
