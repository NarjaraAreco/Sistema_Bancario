/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package visao.menus;

import VO.ContaVO;
import VO.CepVO;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import regraNegocio.ContaRN;

/**
 *
 * @author narja
 */
public class CadastroVisao extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(CadastroVisao.class.getName());
    private int etapaAtual = 1;
    private ContaVO novaConta = new ContaVO();

    public CadastroVisao() {
        initComponents();
        propriedades();
        inicializaCEP();
        btVoltar.setEnabled(false);
        btCadastro.setVisible(false);
    }

    private void propriedades(){
        this.setSize(1000, 800);
        this.setLocationRelativeTo(null);
       
        btCadastro.putClientProperty("FlatLaf.style", "shadowWidth: 4; shadowColor: #00000040");
        btVoltar.putClientProperty("FlatLaf.style", "shadowWidth: 4; shadowColor: #00000040");
        btAvancar.putClientProperty("FlatLaf.style", "shadowWidth: 4; shadowColor: #00000040");
        //pfSenha.putClientProperty("JPasswordField.showRevealButton", true);
        
        
        painelCentral.setOpaque(false);
        painelCentral.putClientProperty("FlatLaf.style", 
              "background: rgba(255, 255, 255, 50); " + 
            "arc: 30; " +
            "border: null"
        ); 
        painelDados.setOpaque(false);
        painelDados.putClientProperty("FlatLaf.style", 
              "background: rgba(255, 255, 255, 150); " + 
            "arc: 30; " +
            "border: null"
        );
        painelEndereco.setOpaque(false);
        painelEndereco.putClientProperty("FlatLaf.style", 
              "background: rgba(255, 255, 255, 150); " + 
            "arc: 30; " +
            "border: null"
        );
        painelSenha.setOpaque(false);
        painelSenha.putClientProperty("FlatLaf.style", 
              "background: rgba(255, 255, 255, 150); " + 
            "arc: 30; " +
            "border: null"
        );
    }
    
    private void inicializaCEP(){
        cbUF.setEnabled(false);
        tfCidade.setEnabled(false);
        tfRua.setEnabled(false);
        tfBairro.setEnabled(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        grid = new javax.swing.JPanel();
        painelCentral = new javax.swing.JPanel();
        painelDados = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        tfTitular = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        ftCPF = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        tfEmail = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        rbCorrente = new javax.swing.JRadioButton();
        rbPoupanca = new javax.swing.JRadioButton();
        jLabel14 = new javax.swing.JLabel();
        btLogin = new javax.swing.JButton();
        painelEndereco = new javax.swing.JPanel();
        lbCEP = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ftCEP = new javax.swing.JFormattedTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        cbUF = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        tfCidade = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        tfRua = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        tfBairro = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        tfNumero = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        tfComplemento = new javax.swing.JTextField();
        pbCEP = new javax.swing.JProgressBar();
        painelSenha = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        pfSenha = new javax.swing.JPasswordField();
        pfConfirmSenha = new javax.swing.JPasswordField();
        ftSaldo = new javax.swing.JFormattedTextField();
        lbStatusSenhas = new javax.swing.JLabel();
        painelBotoes = new javax.swing.JPanel();
        btVoltar = new javax.swing.JButton();
        btAvancar = new javax.swing.JButton();
        btCadastro = new javax.swing.JButton();

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        grid.setBackground(new java.awt.Color(9, 102, 102));
        grid.setPreferredSize(new java.awt.Dimension(500, 500));
        grid.setLayout(new java.awt.GridBagLayout());

        painelCentral.setPreferredSize(new java.awt.Dimension(500, 600));
        painelCentral.setLayout(new java.awt.CardLayout());

        painelDados.setBackground(new java.awt.Color(255, 255, 255));
        painelDados.setPreferredSize(new java.awt.Dimension(350, 400));

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(9, 102, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CADASTRO");
        jLabel1.setPreferredSize(new java.awt.Dimension(500, 45));

        jSeparator1.setForeground(new java.awt.Color(9, 102, 102));
        jSeparator1.setPreferredSize(new java.awt.Dimension(400, 20));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel2.setText("TITULAR * :");
        jLabel2.setPreferredSize(new java.awt.Dimension(200, 40));

        tfTitular.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        tfTitular.setPreferredSize(new java.awt.Dimension(200, 40));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel3.setText("CPF * :");
        jLabel3.setPreferredSize(new java.awt.Dimension(200, 40));

        try {
            ftCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftCPF.setPreferredSize(new java.awt.Dimension(200, 40));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel4.setText("EMAIL * :");
        jLabel4.setPreferredSize(new java.awt.Dimension(200, 40));

        tfEmail.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        tfEmail.setPreferredSize(new java.awt.Dimension(200, 40));

        jSeparator2.setForeground(new java.awt.Color(9, 102, 102));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel8.setText("CONTA * :");
        jLabel8.setPreferredSize(new java.awt.Dimension(200, 40));

        buttonGroup1.add(rbCorrente);
        rbCorrente.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        rbCorrente.setText("CORRENTE");

        buttonGroup1.add(rbPoupanca);
        rbPoupanca.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        rbPoupanca.setText("POUPANÇA");

        jLabel14.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel14.setText("Já tem conta?");

        btLogin.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btLogin.setForeground(new java.awt.Color(51, 0, 255));
        btLogin.setText("Faça login.");
        btLogin.setContentAreaFilled(false);
        btLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btLogin.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelDadosLayout = new javax.swing.GroupLayout(painelDados);
        painelDados.setLayout(painelDadosLayout);
        painelDadosLayout.setHorizontalGroup(
            painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(painelDadosLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelDadosLayout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(rbCorrente, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(rbPoupanca, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(painelDadosLayout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(tfTitular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(painelDadosLayout.createSequentialGroup()
                            .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(31, 31, 31)
                            .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(ftCPF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tfEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(painelDadosLayout.createSequentialGroup()
                                    .addGap(50, 50, 50)
                                    .addComponent(jLabel14)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btLogin)
                                    .addGap(0, 0, Short.MAX_VALUE))))
                        .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 456, Short.MAX_VALUE)
                        .addComponent(jSeparator2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelDadosLayout.setVerticalGroup(
            painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDadosLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfTitular, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(80, 80, 80)
                .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ftCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(80, 80, 80)
                .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbCorrente)
                    .addComponent(rbPoupanca))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(btLogin))
                .addContainerGap())
        );

        painelCentral.add(painelDados, "cardDados");

        painelEndereco.setBackground(new java.awt.Color(255, 255, 255));
        painelEndereco.setPreferredSize(new java.awt.Dimension(500, 500));

        lbCEP.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lbCEP.setText("CEP * :");
        lbCEP.setPreferredSize(new java.awt.Dimension(200, 40));

        jLabel7.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(9, 102, 102));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("CADASTRO");
        jLabel7.setPreferredSize(new java.awt.Dimension(500, 45));

        try {
            ftCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftCEP.setPreferredSize(new java.awt.Dimension(200, 40));
        ftCEP.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                ftCEPFocusLost(evt);
            }
        });

        jSeparator3.setForeground(new java.awt.Color(9, 102, 102));
        jSeparator3.setPreferredSize(new java.awt.Dimension(400, 20));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel6.setText("UF :");
        jLabel6.setPreferredSize(new java.awt.Dimension(200, 40));

        cbUF.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        cbUF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escolha...", "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MS", "MT", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
        cbUF.setPreferredSize(new java.awt.Dimension(200, 40));
        cbUF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbUFActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel9.setText("CIDADE:");
        jLabel9.setPreferredSize(new java.awt.Dimension(200, 40));
        jLabel9.setRequestFocusEnabled(false);

        tfCidade.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        tfCidade.setPreferredSize(new java.awt.Dimension(200, 40));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel10.setText("RUA:");
        jLabel10.setPreferredSize(new java.awt.Dimension(200, 40));

        tfRua.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        tfRua.setPreferredSize(new java.awt.Dimension(200, 40));

        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel11.setText("BAIRRO:");
        jLabel11.setPreferredSize(new java.awt.Dimension(200, 40));

        tfBairro.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        tfBairro.setPreferredSize(new java.awt.Dimension(200, 40));

        jLabel12.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel12.setText("NÚMERO*:");
        jLabel12.setPreferredSize(new java.awt.Dimension(200, 40));

        tfNumero.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        tfNumero.setPreferredSize(new java.awt.Dimension(200, 40));

        jLabel13.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel13.setText("COMPLEMENTO:");
        jLabel13.setPreferredSize(new java.awt.Dimension(200, 40));

        tfComplemento.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        tfComplemento.setPreferredSize(new java.awt.Dimension(200, 40));

        javax.swing.GroupLayout painelEnderecoLayout = new javax.swing.GroupLayout(painelEndereco);
        painelEndereco.setLayout(painelEnderecoLayout);
        painelEnderecoLayout.setHorizontalGroup(
            painelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(painelEnderecoLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(painelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pbCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(painelEnderecoLayout.createSequentialGroup()
                        .addGroup(painelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelEnderecoLayout.createSequentialGroup()
                                .addGroup(painelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20))
                            .addGroup(painelEnderecoLayout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(9, 9, 9)))
                        .addGroup(painelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelEnderecoLayout.createSequentialGroup()
                                    .addGap(12, 12, 12)
                                    .addComponent(cbUF, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tfCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(painelEnderecoLayout.createSequentialGroup()
                                    .addGap(11, 11, 11)
                                    .addGroup(painelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(tfRua, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tfBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(painelEnderecoLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(ftCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(painelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(painelEnderecoLayout.createSequentialGroup()
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfComplemento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(painelEnderecoLayout.createSequentialGroup()
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelEnderecoLayout.setVerticalGroup(
            painelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelEnderecoLayout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(painelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ftCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(painelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(painelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(painelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(painelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(painelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(pbCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        painelCentral.add(painelEndereco, "cardEndereco");

        painelSenha.setBackground(new java.awt.Color(255, 255, 255));

        jLabel15.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 36)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(9, 102, 102));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("CADASTRO");
        jLabel15.setPreferredSize(new java.awt.Dimension(500, 45));

        jSeparator4.setForeground(new java.awt.Color(9, 102, 102));
        jSeparator4.setPreferredSize(new java.awt.Dimension(400, 20));

        jLabel16.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel16.setText("SALDO INICIAL:");
        jLabel16.setPreferredSize(new java.awt.Dimension(200, 40));

        jLabel17.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel17.setText("SENHA:");
        jLabel17.setPreferredSize(new java.awt.Dimension(200, 40));

        jLabel18.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel18.setText("CONFIRME SUA SENHA:");
        jLabel18.setPreferredSize(new java.awt.Dimension(200, 40));

        pfSenha.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        pfSenha.setPreferredSize(new java.awt.Dimension(200, 40));

        pfConfirmSenha.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        pfConfirmSenha.setPreferredSize(new java.awt.Dimension(200, 40));
        pfConfirmSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pfConfirmSenhaKeyReleased(evt);
            }
        });

        ftSaldo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        ftSaldo.setPreferredSize(new java.awt.Dimension(200, 40));
        ftSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ftSaldoActionPerformed(evt);
            }
        });
        ftSaldo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ftSaldoKeyTyped(evt);
            }
        });

        lbStatusSenhas.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbStatusSenhas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout painelSenhaLayout = new javax.swing.GroupLayout(painelSenha);
        painelSenha.setLayout(painelSenhaLayout);
        painelSenhaLayout.setHorizontalGroup(
            painelSenhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelSenhaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelSenhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelSenhaLayout.createSequentialGroup()
                        .addGroup(painelSenhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(70, 70, 70)
                        .addGroup(painelSenhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pfSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                            .addComponent(ftSaldo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelSenhaLayout.createSequentialGroup()
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(painelSenhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbStatusSenhas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pfConfirmSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE))))
                .addGap(22, 22, 22))
        );
        painelSenhaLayout.setVerticalGroup(
            painelSenhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelSenhaLayout.createSequentialGroup()
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addGroup(painelSenhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ftSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(80, 80, 80)
                .addGroup(painelSenhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(80, 80, 80)
                .addGroup(painelSenhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pfConfirmSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(80, 80, 80)
                .addComponent(lbStatusSenhas)
                .addGap(0, 150, Short.MAX_VALUE))
        );

        painelCentral.add(painelSenha, "cardSenha");

        grid.add(painelCentral, new java.awt.GridBagConstraints());

        getContentPane().add(grid, java.awt.BorderLayout.CENTER);

        painelBotoes.setBackground(new java.awt.Color(9, 102, 102));

        btVoltar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btVoltar.setText("ANTERIOR");
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });
        painelBotoes.add(btVoltar);

        btAvancar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btAvancar.setText("AVANÇAR");
        btAvancar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAvancarActionPerformed(evt);
            }
        });
        painelBotoes.add(btAvancar);

        btCadastro.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btCadastro.setText("FINALIZAR");
        btCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastroActionPerformed(evt);
            }
        });
        painelBotoes.add(btCadastro);

        getContentPane().add(painelBotoes, java.awt.BorderLayout.SOUTH);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        java.awt.CardLayout opc = (java.awt.CardLayout) painelCentral.getLayout();

        if (etapaAtual == 2) {
            opc.show(painelCentral, "cardDados");
            etapaAtual = 1;
            btVoltar.setEnabled(false);

        } else if (etapaAtual == 3) {
            opc.show(painelCentral, "cardEndereco");
            etapaAtual = 2;
            btAvancar.setVisible(true);
            btCadastro.setVisible(false);
        }
    }//GEN-LAST:event_btVoltarActionPerformed

    private void btAvancarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAvancarActionPerformed
        java.awt.CardLayout opc = (java.awt.CardLayout) painelCentral.getLayout();

        if (etapaAtual == 1) {           
            novaConta.setTitular(tfTitular.getText());
            novaConta.setCpf(ftCPF.getText());
            novaConta.setEmail(tfEmail.getText());
            if (rbCorrente.isSelected()) novaConta.setTipoConta("CORRENTE");
            else if (rbPoupanca.isSelected()) novaConta.setTipoConta("POUPANÇA");
            
            ContaRN rn = new ContaRN();
            try {
                String retorno = rn.validarDadosCadastro(novaConta, etapaAtual);
                if (retorno != null){
                    JOptionPane.showMessageDialog(this, retorno, "Erro no cadastro", JOptionPane.WARNING_MESSAGE);
                } else{
                    opc.show(painelCentral, "cardEndereco");
                    etapaAtual = 2;
                    btVoltar.setEnabled(true);   
                }               
            } catch (SQLException ex) {
               JOptionPane.showMessageDialog(this, ex, "Erro", JOptionPane.WARNING_MESSAGE);
            }
        } else if (etapaAtual == 2) {
            novaConta.setCep(ftCEP.getText());
            novaConta.setRua(tfRua.getText());
            novaConta.setBairro(tfBairro.getText());
            novaConta.setCidade(tfCidade.getText());
            novaConta.setEstado(cbUF.getSelectedItem().toString());
            novaConta.setNumeroCasa(tfNumero.getText());
            novaConta.setComplemento(tfComplemento.getText());
            
            ContaRN rn = new ContaRN();
            try {
                String retorno = rn.validarDadosCadastro(novaConta, etapaAtual);
                if (retorno != null){
                    JOptionPane.showMessageDialog(this, retorno, "Erro no cadastro", JOptionPane.WARNING_MESSAGE);
                } else{
                    opc.show(painelCentral, "cardSenha");
                    etapaAtual = 3;
                    btAvancar.setVisible(false);
                    btCadastro.setVisible(true);
                    btCadastro.setEnabled(false);   
                }               
            } catch (SQLException ex) {
               JOptionPane.showMessageDialog(this, ex, "Erro", JOptionPane.WARNING_MESSAGE);
            }    
        }
    }//GEN-LAST:event_btAvancarActionPerformed

    private void cbUFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbUFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbUFActionPerformed

    private void btLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLoginActionPerformed
        int confirm;
            confirm = JOptionPane.showConfirmDialog(null, "Deseja continuar para a tela de Login?", "Tela Login", JOptionPane.OK_CANCEL_OPTION);
            if (confirm == 0){
                LoginVisao login = new LoginVisao();
                login.setVisible(true);
                dispose();
            }
    }//GEN-LAST:event_btLoginActionPerformed

    private void ftCEPFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ftCEPFocusLost
        String cep = ftCEP.getText();
        String cepLimpo = cep.replaceAll("[^0-9]", "");
        
        if (cepLimpo != null && !cep.trim().isEmpty()){
                Thread thread;
                thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    try {        
                        ContaRN rn = new ContaRN();
                        ftCEP.setEnabled(false);                      
                        pbCEP.setIndeterminate(true);
                        
                        CepVO cepEncontrado = rn.buscarCep(cepLimpo);
                        
                        //segunda thread para ele não travar caso alguem mexa na primeira
                        java.awt.EventQueue.invokeLater(new Runnable() {//uma fila, esta pedindo para ele realizar no fim
                            @Override
                            public void run() {    
                                if (cepEncontrado != null) {
                                    tfRua.setText(cepEncontrado.getLogradouro());
                                    tfBairro.setText(cepEncontrado.getBairro());
                                    tfCidade.setText(cepEncontrado.getCidade());
                                    cbUF.setSelectedItem(cepEncontrado.getUf());
                                    pbCEP.setIndeterminate(false);  
                                    ftCEP.setEnabled(true);
                                } else {
                                    JOptionPane.showMessageDialog(null, "CEP: Não encontramos seu CEP", "Erro", JOptionPane.WARNING_MESSAGE);
                                    pbCEP.setIndeterminate(false);
                                    ftCEP.setEnabled(true);
                                }
                            }
                        });
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, "ERRO!" + ex.getMessage() , "Erro", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }); thread.start();
        }
    }//GEN-LAST:event_ftCEPFocusLost

    private void pfConfirmSenhaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pfConfirmSenhaKeyReleased
        String s1 = new String(pfSenha.getPassword());
        String s2 = new String(pfConfirmSenha.getPassword());

        if (s1.equals(s2)) {
            lbStatusSenhas.setText("Senhas conferem!️");
            lbStatusSenhas.setForeground(java.awt.Color.GREEN); // Texto Verde
            btCadastro.setEnabled(true);

        } else {
            lbStatusSenhas.setText("Senhas não conferem!");
            lbStatusSenhas.setForeground(java.awt.Color.RED); // Texto Vermelho
            btCadastro.setEnabled(false);
        }
    }//GEN-LAST:event_pfConfirmSenhaKeyReleased

    private void btCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastroActionPerformed
        String s1 = new String(pfSenha.getPassword());     
        double saldoInicial = 0.0;
        try { 
            String valorTexto = ftSaldo.getText(); 
            if (!valorTexto.trim().isEmpty()) {
                valorTexto = valorTexto.replace(".", "").replace(",", ".");
                saldoInicial = Double.parseDouble(valorTexto);
            } 
            novaConta.setSenha(s1);
            novaConta.setSaldo(saldoInicial);
            ContaRN rn = new ContaRN();
      
            ContaVO sucesso = rn.cadastrar(novaConta);
            
            if (sucesso != null) {
                JOptionPane.showMessageDialog(this, "Conta " + novaConta.getNumeroConta() + " criada com sucesso!");
                JOptionPane.showMessageDialog(this, "Faça seu login!");
                    LoginVisao login = new LoginVisao();
                    login.setVisible(true);
                    dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Erro ao salvar no banco.");
            }
        } catch (SQLException ex) {
            System.getLogger(CadastroVisao.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
                
    }//GEN-LAST:event_btCadastroActionPerformed

    private void ftSaldoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ftSaldoKeyTyped
        char letra = evt.getKeyChar();
        
        if (!Character.isDigit(letra)) {
            evt.consume();
        // Opcional: Faz um 'beep' para avisar o usuário que ele fez algo errado
            java.awt.Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_ftSaldoKeyTyped

    private void ftSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ftSaldoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ftSaldoActionPerformed
                  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAvancar;
    private javax.swing.JButton btCadastro;
    private javax.swing.JButton btLogin;
    private javax.swing.JButton btVoltar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbUF;
    private javax.swing.JFormattedTextField ftCEP;
    private javax.swing.JFormattedTextField ftCPF;
    private javax.swing.JFormattedTextField ftSaldo;
    private javax.swing.JPanel grid;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel lbCEP;
    private javax.swing.JLabel lbStatusSenhas;
    private javax.swing.JPanel painelBotoes;
    private javax.swing.JPanel painelCentral;
    private javax.swing.JPanel painelDados;
    private javax.swing.JPanel painelEndereco;
    private javax.swing.JPanel painelSenha;
    private javax.swing.JProgressBar pbCEP;
    private javax.swing.JPasswordField pfConfirmSenha;
    private javax.swing.JPasswordField pfSenha;
    private javax.swing.JRadioButton rbCorrente;
    private javax.swing.JRadioButton rbPoupanca;
    private javax.swing.JTextField tfBairro;
    private javax.swing.JTextField tfCidade;
    private javax.swing.JTextField tfComplemento;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfNumero;
    private javax.swing.JTextField tfRua;
    private javax.swing.JTextField tfTitular;
    // End of variables declaration//GEN-END:variables
}
