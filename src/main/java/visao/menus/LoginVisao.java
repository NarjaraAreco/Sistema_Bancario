/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package visao.menus;

import VO.ContaVO;
import javax.swing.JOptionPane;
import regraNegocio.ContaRN;
import visao.InicioLoginVisao;
import visao.TelaPrincipalVisao;

/**
 *
 * @author narja
 */
public class LoginVisao extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(LoginVisao.class.getName());

    public LoginVisao() {
        initComponents();
        propriedades();
        
    }

    
    
    private void propriedades(){
        this.setSize(1000, 800);
        this.setLocationRelativeTo(null);
        btLogin.putClientProperty("FlatLaf.style", "shadowWidth: 4; shadowColor: #00000040");
        pfSenha.putClientProperty("JPasswordField.showRevealButton", true);
        
        
        painelCentral.setOpaque(false);
        painelCentral.putClientProperty("FlatLaf.style", 
            "background: rgba(255, 255, 255, 150); " + 
            "arc: 30; " +
            "border: null"
        ); 
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        painelCentral = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ftCPF = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        pfSenha = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        btLogin = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btCadastro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(9, 100, 100));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        painelCentral.setBackground(new java.awt.Color(255, 255, 255));
        painelCentral.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        painelCentral.setPreferredSize(new java.awt.Dimension(350, 400));

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(9, 102, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LOGIN");
        jLabel1.setPreferredSize(new java.awt.Dimension(400, 45));

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel2.setText("Digite seu CPF:");
        jLabel2.setPreferredSize(new java.awt.Dimension(200, 40));

        try {
            ftCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftCPF.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ftCPF.setPreferredSize(new java.awt.Dimension(200, 40));

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel3.setText("Digite sua senha:");
        jLabel3.setPreferredSize(new java.awt.Dimension(200, 40));

        jSeparator1.setForeground(new java.awt.Color(9, 102, 102));
        jSeparator1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        pfSenha.setPreferredSize(new java.awt.Dimension(200, 40));

        jSeparator2.setForeground(new java.awt.Color(9, 102, 102));

        btLogin.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        btLogin.setText("Entrar");
        btLogin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLoginActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Não tem conta?");

        btCadastro.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btCadastro.setForeground(new java.awt.Color(51, 0, 255));
        btCadastro.setText("Cadastre-se.");
        btCadastro.setContentAreaFilled(false);
        btCadastro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btCadastro.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelCentralLayout = new javax.swing.GroupLayout(painelCentral);
        painelCentral.setLayout(painelCentralLayout);
        painelCentralLayout.setHorizontalGroup(
            painelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelCentralLayout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addGroup(painelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelCentralLayout.createSequentialGroup()
                        .addGroup(painelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jSeparator2)
                            .addComponent(jSeparator1)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
                            .addComponent(ftCPF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pfSenha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelCentralLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btCadastro)
                        .addGap(85, 85, 85))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelCentralLayout.createSequentialGroup()
                        .addComponent(btLogin)
                        .addGap(129, 129, 129))))
        );
        painelCentralLayout.setVerticalGroup(
            painelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCentralLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ftCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(painelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(btCadastro))
                .addContainerGap())
        );

        jPanel1.add(painelCentral, new java.awt.GridBagConstraints());

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastroActionPerformed
        int confirm;
        confirm = JOptionPane.showConfirmDialog(null, "Deseja continuar para o cadastro?", "Tela cadastro", JOptionPane.OK_CANCEL_OPTION);
        if (confirm == 0){
            CadastroVisao cadastro = new CadastroVisao();
            dispose();
            cadastro.setVisible(true);
        }
    }//GEN-LAST:event_btCadastroActionPerformed

    private void btLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLoginActionPerformed
        ContaVO conta = null;
        try {
            String cpf = ftCPF.getText();
            String senha = new String(pfSenha.getPassword());

            ContaRN contaRN = new ContaRN();
            conta = contaRN.autenticarRN(cpf, senha);
            if (conta != null) {
                JOptionPane.showMessageDialog(null, "LOGIN REALIZADO COM SUCESSO!", "LOGIN", JOptionPane.INFORMATION_MESSAGE);
                //TelaPrincipalVisao logado = new TelaPrincipalVisao(conta);      
                InicioLoginVisao logado = new InicioLoginVisao(conta);  
                dispose();
                logado.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "USUARIO OU SENHA INCORRETOS!", "LOGIN INCORRETO", JOptionPane.INFORMATION_MESSAGE);
                }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro no Login" + ex.getMessage() , "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btLoginActionPerformed

    
    public static void main(String args[]) {
       try {
            
        javax.swing.UIManager.put("Component.accentColor", java.awt.Color.decode("#0f62fe"));
        // 1. Diz para o FlatLaf que queremos bordas bem redondas (Estilo Raven)
        javax.swing.UIManager.put("Button.arc", 20);       // Botões redondos
        javax.swing.UIManager.put("Component.arc", 15);    // Campos de texto redondos
        javax.swing.UIManager.put("TextComponent.arc", 15);
        javax.swing.UIManager.put("ProgressBar.arc", 999);
        
        javax.swing.UIManager.put("ScrollBar.width", 10);
        javax.swing.UIManager.put("ScrollBar.thumbArc", 999);
        
        // Define o estilo da setinha dos ComboBox (chevron é aquele V moderno)
        javax.swing.UIManager.put("Component.arrowType", "chevron");
        
        java.awt.Font fonteModerna = new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 14);
        javax.swing.UIManager.put("defaultFont", fonteModerna);   
        
        com.formdev.flatlaf.FlatIntelliJLaf.setup(); // Ou FlatDarkLaf.setup();
        
        } catch (NumberFormatException ex) {
            java.util.logging.Logger.getLogger(LoginVisao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LoginVisao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadastro;
    private javax.swing.JButton btLogin;
    private javax.swing.JFormattedTextField ftCPF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel painelCentral;
    private javax.swing.JPasswordField pfSenha;
    // End of variables declaration//GEN-END:variables
}
