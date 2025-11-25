/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package visao.menus;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.formdev.flatlaf.FlatLightLaf;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;


/**
 *
 * @author narja
 */
public class MenuInicial extends FormTemplateMenus implements ActionListener {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(MenuInicial.class.getName());
//
//    private final DecimalFormat df = new DecimalFormat("##0.###", DecimalFormatSymbols.getInstance(Locale.US));
//    private MigLayout layout;
//    private PanelCover cover;
//    private PanelLoginAndRegister loginAndRegister;
//    private boolean isLogin = true;
//    private final double addSize = 30;
//    private final double coverSize = 40;
//    private final double loginSize = 60;
    
    public MenuInicial() {
        FlatLightLaf.setup();
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(MenuLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MenuInicial().setVisible(true);
            }
        });
    }

    @Override
    public void btLoginActionPerformed(ActionEvent e) {
        MenuLogin login = new MenuLogin();
        login.MenuInicial = this;
        login.setVisible(true);
        this.setVisible(false);
    }

    @Override
    public void btCadastroActionPerformed(ActionEvent e) {
        MenuCadastro cadastro = new MenuCadastro();
        cadastro.MenuInicial = this;
        cadastro.setVisible(true);
        this.setVisible(false);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object escolha = e.getSource();
        
        if (escolha == btLogin) {
            btLoginActionPerformed(e);
        } else {
            btCadastroActionPerformed(e);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}
