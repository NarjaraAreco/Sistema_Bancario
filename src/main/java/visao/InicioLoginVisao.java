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
import visao.menus.LoginVisao;

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
        btDesver.setVisible(false);
        btVer.setVisible(true);
        
        if ("POUPANÇA".equals(contaLog.getTipoConta())) {
            javax.swing.ImageIcon icone = new javax.swing.ImageIcon(getClass().getResource("/taxa-de-juro (1).png"));
            lbCoringa.setText("RENDER JUROS");
            btCoringa.setIcon(icone);
        
    } else {
            javax.swing.ImageIcon icone = new javax.swing.ImageIcon(getClass().getResource("/cheque-bancario (1).png"));
            lbCoringa.setText("CHEQUE ");
            btCoringa.setIcon(icone);
    }
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
        btCoringa = new javax.swing.JButton();
        btExtrato = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        lbCoringa = new javax.swing.JLabel();
        btSair = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        painelGrid.setBackground(new java.awt.Color(9, 102, 102));
        painelGrid.setLayout(new java.awt.GridBagLayout());

        conta.setBackground(new java.awt.Color(255, 255, 255));
        conta.setForeground(new java.awt.Color(255, 255, 255));
        conta.setMinimumSize(new java.awt.Dimension(500, 500));
        conta.setPreferredSize(new java.awt.Dimension(500, 600));

        lbUsuario.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lbUsuario.setForeground(new java.awt.Color(9, 102, 102));
        lbUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbUsuario.setText("USUARIO");
        lbUsuario.setPreferredSize(new java.awt.Dimension(200, 40));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(9, 102, 102));
        jLabel2.setText("SALDO:");
        jLabel2.setPreferredSize(new java.awt.Dimension(200, 40));

        lbSaldo.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
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

        btDeposito.setForeground(new java.awt.Color(9, 102, 102));
        btDeposito.setIcon(new javax.swing.ImageIcon("C:\\Users\\narja\\Downloads\\deposito (1) (2).png")); // NOI18N
        btDeposito.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btDeposito.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btDeposito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDepositoActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 10)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("DEPÓSITO");

        jSeparator1.setForeground(new java.awt.Color(9, 102, 102));

        lbConta.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lbConta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbConta.setPreferredSize(new java.awt.Dimension(200, 40));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(9, 102, 102));
        jLabel7.setText("TIPO:");
        jLabel7.setPreferredSize(new java.awt.Dimension(200, 40));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(9, 102, 102));
        jLabel8.setText("Nº CONTA:");
        jLabel8.setPreferredSize(new java.awt.Dimension(200, 40));

        lbTipoConta.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lbTipoConta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTipoConta.setPreferredSize(new java.awt.Dimension(200, 40));

        jSeparator2.setForeground(new java.awt.Color(9, 102, 102));

        btTransferencia.setForeground(new java.awt.Color(9, 102, 102));
        btTransferencia.setIcon(new javax.swing.ImageIcon("C:\\Users\\narja\\Downloads\\transferencia-de-dinheiro (1).png")); // NOI18N
        btTransferencia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btTransferencia.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btTransferencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTransferenciaActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 10)); // NOI18N
        jLabel5.setText("TRANSFERENCIA");

        btSaque.setForeground(new java.awt.Color(9, 102, 102));
        btSaque.setIcon(new javax.swing.ImageIcon("C:\\Users\\narja\\Downloads\\saque.png")); // NOI18N
        btSaque.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btSaque.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btSaque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSaqueActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 10)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("SAQUE");

        btCoringa.setForeground(new java.awt.Color(9, 102, 102));
        btCoringa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cheque-bancario (1).png"))); // NOI18N
        btCoringa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btCoringa.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btCoringa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCoringaActionPerformed(evt);
            }
        });

        btExtrato.setForeground(new java.awt.Color(9, 102, 102));
        btExtrato.setIcon(new javax.swing.ImageIcon("C:\\Users\\narja\\Downloads\\extrato-bancario (1).png")); // NOI18N
        btExtrato.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btExtrato.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btExtrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExtratoActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 10)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("EXTRATO");

        lbCoringa.setFont(new java.awt.Font("Century Gothic", 1, 10)); // NOI18N
        lbCoringa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbCoringa.setText("CORINGA");

        btSair.setForeground(new java.awt.Color(9, 102, 102));
        btSair.setIcon(new javax.swing.ImageIcon("C:\\Users\\narja\\Downloads\\opcao-de-sair (1).png")); // NOI18N
        btSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btSair.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 10)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("SAIR");

        javax.swing.GroupLayout contaLayout = new javax.swing.GroupLayout(conta);
        conta.setLayout(contaLayout);
        contaLayout.setHorizontalGroup(
            contaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(contaLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(contaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, contaLayout.createSequentialGroup()
                        .addGroup(contaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(contaLayout.createSequentialGroup()
                                .addGroup(contaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
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
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, contaLayout.createSequentialGroup()
                        .addGroup(contaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(contaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btDeposito, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btExtrato, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(contaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(contaLayout.createSequentialGroup()
                                .addGap(86, 86, 86)
                                .addGroup(contaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btSaque, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btCoringa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbCoringa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(contaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btTransferencia, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btSair, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(contaLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))))
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
                .addGroup(contaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btDeposito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btSaque, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btTransferencia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel4))
                .addGap(40, 40, 40)
                .addGroup(contaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btCoringa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btExtrato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(lbCoringa)
                    .addComponent(jLabel11))
                .addGap(71, 71, 71))
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
        DepositoVisao deposito = new DepositoVisao(this.contaLog);
        dispose();
        deposito.setVisible(true);
    }//GEN-LAST:event_btDepositoActionPerformed

    private void btCoringaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCoringaActionPerformed
        if ("POUPANÇA".equals(contaLog.getTipoConta())) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                OperacoesRN oper = new OperacoesRN();
                try {
                    boolean sucesso = oper.renderJuros(contaLog);
                    javax.swing.SwingUtilities.invokeLater(() -> {
                        if (sucesso) {
                            JOptionPane.showMessageDialog(InicioLoginVisao.this, "Rendimento aplicado com sucesso!");
                            preencherDados();
                        } else {
                            JOptionPane.showMessageDialog(InicioLoginVisao.this, "Erro ao render juros.");
                        }
                    });
                }catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Erro de Banco: " + ex.getMessage());
                }
            }
        }).start();
        
    } else {
            double limiteMaximo = 500.00;
            double saldoAtual = contaLog.getSaldo();
            double disponivel;

            if (saldoAtual < 0) {
                disponivel = limiteMaximo + saldoAtual;
            } else {
                disponivel = limiteMaximo;
            }

            java.text.NumberFormat nf = java.text.NumberFormat.getCurrencyInstance(new java.util.Locale("pt", "BR"));
            String mensagemCheque = "Resumo do Cheque Especial:\n\n" +
                      "Limite Total: " + nf.format(limiteMaximo) + "\n" +
                      "Saldo em Conta: " + nf.format(saldoAtual) + "\n" +
                      "--------------------------------\n" +
                      "DISPONÍVEL PARA USO: " + nf.format(disponivel);
                 
            JOptionPane.showMessageDialog(this, mensagemCheque, "Cheque Especial", JOptionPane.INFORMATION_MESSAGE);
    }
    }//GEN-LAST:event_btCoringaActionPerformed

    private void btExtratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExtratoActionPerformed
        ExtratoVisao extrato = new ExtratoVisao(this.contaLog);
        dispose();
        extrato.setVisible(true);
    }//GEN-LAST:event_btExtratoActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        int confirm;
            confirm = JOptionPane.showConfirmDialog(null, "Deseja realmente sair da sua conta?", "Sair", JOptionPane.OK_CANCEL_OPTION);
            if (confirm == 0){
                LoginVisao login = new LoginVisao();
                login.setVisible(true);
                dispose();
            }
    }//GEN-LAST:event_btSairActionPerformed

    private void btSaqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSaqueActionPerformed
        SaqueVisao saque = new SaqueVisao(this.contaLog);
        dispose();
        saque.setVisible(true);
    }//GEN-LAST:event_btSaqueActionPerformed

    private void btTransferenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTransferenciaActionPerformed
        TransferenciaVisao transferencia = new TransferenciaVisao(this.contaLog);
        dispose();
        transferencia.setVisible(true);
    }//GEN-LAST:event_btTransferenciaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCoringa;
    private javax.swing.JButton btDeposito;
    private javax.swing.JButton btDesver;
    private javax.swing.JButton btExtrato;
    private javax.swing.JButton btSair;
    private javax.swing.JButton btSaque;
    private javax.swing.JButton btTransferencia;
    private javax.swing.JButton btVer;
    private javax.swing.JPanel conta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lbConta;
    private javax.swing.JLabel lbCoringa;
    private javax.swing.JLabel lbSaldo;
    private javax.swing.JLabel lbTipoConta;
    private javax.swing.JLabel lbUsuario;
    private javax.swing.JPanel painelGrid;
    // End of variables declaration//GEN-END:variables
}
