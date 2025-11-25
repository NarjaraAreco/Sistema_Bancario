/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package visao.menus;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author narja
 */
public abstract class FormTemplateMenus extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FormTemplateMenus.class.getName());

    /**
     * Creates new form FormTemplate
     */
    public FormTemplateMenus() {
        initComponents();
        btLogin.addActionListener((ActionListener)this);
        btCadastro.addActionListener((ActionListener) this);
        //btFechar.addActionListener((ActionListener) this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnCima = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pnBaixo = new javax.swing.JPanel();
        btLogin = new javax.swing.JButton();
        btCadastro = new javax.swing.JButton();
        btFechar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("LOGOTIPO");
        pnCima.add(jLabel1);

        getContentPane().add(pnCima, java.awt.BorderLayout.NORTH);

        btLogin.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        btLogin.setText("LOGIN");
        pnBaixo.add(btLogin);

        btCadastro.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        btCadastro.setText("CADASTRAR");
        pnBaixo.add(btCadastro);

        btFechar.setText("FECHAR");
        btFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFecharActionPerformed(evt);
            }
        });
        pnBaixo.add(btFechar);

        getContentPane().add(pnBaixo, java.awt.BorderLayout.SOUTH);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFecharActionPerformed
        int confirm;
        confirm = JOptionPane.showConfirmDialog(null, "Deseja mesmo Sair?", "SAIR", JOptionPane.OK_CANCEL_OPTION);
        if (confirm == 0){
            System.exit(0);
        }
    }//GEN-LAST:event_btFecharActionPerformed
        
public abstract void btLoginActionPerformed (ActionEvent e);
public abstract void btCadastroActionPerformed (ActionEvent e);

    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JButton btCadastro;
    private javax.swing.JButton btFechar;
    protected javax.swing.JButton btLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel pnBaixo;
    private javax.swing.JPanel pnCima;
    // End of variables declaration//GEN-END:variables
}
