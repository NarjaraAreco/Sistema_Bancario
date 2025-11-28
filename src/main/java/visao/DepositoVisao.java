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
public final class DepositoVisao extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(DepositoVisao.class.getName());
    private ContaVO conta;

    public void preencherDados(){
        
        Double valor = conta.getSaldo();
        Locale brasil = new Locale("pt", "BR");
        NumberFormat formatador = NumberFormat.getCurrencyInstance(brasil);
            
        lbUsuario.setText("Olá, " + conta.getTitular());        
        lbSaldo.setText("Saldo atual: " + formatador.format(valor));
        
    }
    
    /**
     * Creates new form DepositoVisao
     * @param contaRecebida
     */
    public DepositoVisao(ContaVO contaRecebida) {
        initComponents();        
        this.conta = contaRecebida;
        preencherDados();
        propriedades();
    }

    private void propriedades(){
        this.setSize(400, 400);
        this.setLocationRelativeTo(null);
        btDepositar.putClientProperty("FlatLaf.style", "shadowWidth: 4; shadowColor: #00000040");
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
        lbUsuario = new javax.swing.JLabel();
        lbSaldo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ftValorDeposito = new javax.swing.JFormattedTextField();
        btDepositar = new javax.swing.JButton();
        btVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("DEPÓSITO");
        setUndecorated(true);

        painelCentral.setBackground(new java.awt.Color(9, 102, 102));

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

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("INFORME O VALOR DO DEPÓSITO:");
        jLabel2.setPreferredSize(new java.awt.Dimension(200, 40));

        ftValorDeposito.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        ftValorDeposito.setPreferredSize(new java.awt.Dimension(200, 40));
        ftValorDeposito.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ftValorDepositoFocusGained(evt);
            }
        });
        ftValorDeposito.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ftValorDepositoKeyTyped(evt);
            }
        });

        btDepositar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btDepositar.setText("DEPOSITAR");
        btDepositar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDepositarActionPerformed(evt);
            }
        });

        btVoltar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btVoltar.setText("VOLTAR");
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelCentralLayout = new javax.swing.GroupLayout(painelCentral);
        painelCentral.setLayout(painelCentralLayout);
        painelCentralLayout.setHorizontalGroup(
            painelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCentralLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(painelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(painelCentralLayout.createSequentialGroup()
                        .addComponent(btDepositar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btVoltar))
                    .addComponent(lbSaldo, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                    .addComponent(lbUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                    .addComponent(ftValorDeposito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        painelCentralLayout.setVerticalGroup(
            painelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCentralLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lbUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(lbSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ftValorDeposito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(painelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btDepositar)
                    .addComponent(btVoltar))
                .addGap(96, 96, 96))
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
            JOptionPane.showMessageDialog(this,
                "Erro ao voltar para o menu principal: " + ex.getMessage(),
                "Erro de Navegação", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btVoltarActionPerformed

    private void btDepositarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDepositarActionPerformed
        String saldo = ftValorDeposito.getText();

        OperacoesRN oper = new OperacoesRN();

        try {
            boolean deposito = oper.depositar(conta, saldo);

            if (deposito){
                JOptionPane.showMessageDialog(null, "DEPOSITO REALIZADO COM SUCESSO!", "DEPOSITO", JOptionPane.INFORMATION_MESSAGE);
                ftValorDeposito.setText("");
                preencherDados();
            }else{
                JOptionPane.showMessageDialog(null, "NÃO FOI POSSÍVEL REALIZAR O DEPOSITO, TENTE NOVAMENTE!" , "Não realizado", JOptionPane.ERROR_MESSAGE);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO!" + ex.getMessage() , "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "APENAS NUMEROS! Erro:" + ex.getMessage() , "Erro", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btDepositarActionPerformed

    private void ftValorDepositoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ftValorDepositoFocusGained
        ftValorDeposito.setText("");
    }//GEN-LAST:event_ftValorDepositoFocusGained

    private void ftValorDepositoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ftValorDepositoKeyTyped
        char letra = evt.getKeyChar();
        
        if (!Character.isDigit(letra)) {
            evt.consume();
            java.awt.Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_ftValorDepositoKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btDepositar;
    private javax.swing.JButton btVoltar;
    private javax.swing.JFormattedTextField ftValorDeposito;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lbSaldo;
    private javax.swing.JLabel lbUsuario;
    private javax.swing.JPanel painelCentral;
    // End of variables declaration//GEN-END:variables
}
