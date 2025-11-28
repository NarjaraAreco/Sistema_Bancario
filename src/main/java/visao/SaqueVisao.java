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
public final class SaqueVisao extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(SaqueVisao.class.getName());
        private ContaVO conta;

   public void preencherDados(){
        
        Double valor = conta.getSaldo();
        Locale brasil = new Locale("pt", "BR");
        NumberFormat formatador = NumberFormat.getCurrencyInstance(brasil);
            
        lbUsuario.setText("Olá, " + conta.getTitular());        
        lbSaldo.setText("Saldo atual: " + formatador.format(valor));       
    }
    /**
     * Creates new form SaqueVisao
     * @param contaRecebida
     */
    public SaqueVisao(ContaVO contaRecebida) {
        initComponents();
        this.conta = contaRecebida;
        propriedades();
        preencherDados();
    }

    private void propriedades(){
        this.setSize(400, 400);
        this.setLocationRelativeTo(null);
        btSacar.putClientProperty("FlatLaf.style", "shadowWidth: 4; shadowColor: #00000040");
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
        jLabel3 = new javax.swing.JLabel();
        ftValorSaque = new javax.swing.JFormattedTextField();
        btSacar = new javax.swing.JButton();
        btVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("SAQUES");
        setUndecorated(true);

        painelCentral.setBackground(new java.awt.Color(9, 102, 102));
        painelCentral.setPreferredSize(new java.awt.Dimension(400, 300));

        lbUsuario.setBackground(new java.awt.Color(255, 255, 255));
        lbUsuario.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lbUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lbUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbUsuario.setText("Ola Usuario");
        lbUsuario.setPreferredSize(new java.awt.Dimension(200, 40));

        lbSaldo.setBackground(new java.awt.Color(255, 255, 255));
        lbSaldo.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lbSaldo.setForeground(new java.awt.Color(255, 255, 255));
        lbSaldo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbSaldo.setText("Saldo atual");
        lbSaldo.setPreferredSize(new java.awt.Dimension(200, 40));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("INFORME O VALOR DO SAQUE:");
        jLabel3.setPreferredSize(new java.awt.Dimension(200, 40));

        ftValorSaque.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        ftValorSaque.setPreferredSize(new java.awt.Dimension(200, 40));
        ftValorSaque.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ftValorSaqueFocusGained(evt);
            }
        });
        ftValorSaque.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ftValorSaqueKeyTyped(evt);
            }
        });

        btSacar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btSacar.setText("SAQUE");
        btSacar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSacarActionPerformed(evt);
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
            .addComponent(lbUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lbSaldo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(painelCentralLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(painelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(painelCentralLayout.createSequentialGroup()
                        .addComponent(btSacar)
                        .addGap(112, 112, 112)
                        .addComponent(btVoltar))
                    .addComponent(ftValorSaque, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        painelCentralLayout.setVerticalGroup(
            painelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCentralLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lbUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(lbSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ftValorSaque, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(painelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btVoltar)
                    .addComponent(btSacar))
                .addContainerGap(74, Short.MAX_VALUE))
        );

        getContentPane().add(painelCentral, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btSacarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSacarActionPerformed
        String saldo = ftValorSaque.getText();       
        OperacoesRN oper = new OperacoesRN();    
        try {
            boolean saque = oper.sacar(conta, saldo);
            
            if (saque){
                JOptionPane.showMessageDialog(null, "SAQUE REALIZADO COM SUCESSO!", "SAQUE", JOptionPane.INFORMATION_MESSAGE);
                ftValorSaque.setText("");
                preencherDados();
            } else{
                JOptionPane.showMessageDialog(null, "NÃO FOI POSSÍVEL REALIZAR O SAQUE, TENTE NOVAMENTE!" , "Não realizado", JOptionPane.ERROR_MESSAGE);
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO!" + ex.getMessage() , "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "APENAS NUMEROS! Erro:" + ex.getMessage() , "Erro", JOptionPane.ERROR_MESSAGE);
        }
                
    }//GEN-LAST:event_btSacarActionPerformed

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

    private void ftValorSaqueFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ftValorSaqueFocusGained
        ftValorSaque.setText("");
    }//GEN-LAST:event_ftValorSaqueFocusGained

    private void ftValorSaqueKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ftValorSaqueKeyTyped
        char letra = evt.getKeyChar();
        
        if (!Character.isDigit(letra)) {
            evt.consume();
        // Opcional: Faz um 'beep' para avisar o usuário que ele fez algo errado
            java.awt.Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_ftValorSaqueKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btSacar;
    private javax.swing.JButton btVoltar;
    private javax.swing.JFormattedTextField ftValorSaque;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lbSaldo;
    private javax.swing.JLabel lbUsuario;
    private javax.swing.JPanel painelCentral;
    // End of variables declaration//GEN-END:variables
}
