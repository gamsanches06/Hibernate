package view;

import model.ClienteTableModel;
import controller.ClienteController;
import controller.EnderecoClienteController;
import controller.EnderecoController;
import controller.EstadoController;
import java.awt.Dimension;
import java.text.ParseException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.text.MaskFormatter;
import model.ClienteModel;
import model.EnderecoClienteModel;
import model.EnderecoModel;
import model.EstadoModel;

public class ClienteView extends javax.swing.JFrame {

    private String operacao;
    private String colunas[] = {"ID", "Nome", "CPF", "Email", "DDD", "Telefone", "Cidade", "Logradouro"};
    // esse objeto será vinculado com a tabela
    // selecione o objeto tabela, clique em PROPRIEDADES e encontre MODEL
    // no combo "Definir Propriedades" escolha "Código Personalizado"
    // digite o objeto DefaultTableModel, neste exemplo é tabela(criado logo abaixo)
    private ArrayList<ClienteModel> lista;
    private ArrayList<EstadoModel> listaEstado;
    private ClienteTableModel tabela;
    MaskFormatter mascaraCpf;

    private String getOperacao() {
        return operacao;
    }

    private void setOperacao(String operacao) {
        Boolean ativar = (operacao.equals("") ? false : true);
        // operacao=""(consulta), operacao="incluir"(inclusão), operacao="alterar"(alteração)
        this.operacao = operacao;
        btnGRAVAR.setEnabled(ativar);
    }

    public ClienteView() throws ParseException {
        this.setPreferredSize(new Dimension(760, 850));
        initComponents();

        setOperacao(""); // inicializa o form no modo CONSULTA
        setLocationRelativeTo(null);
        // adiciona evento para qdo navegar no JTable, atualizar os dados nos JTextField´s
        //consultar();
        tblConsulta.getSelectionModel().addListSelectionListener(new ListSelectionListener() {

            @Override
            public void valueChanged(ListSelectionEvent evt) {
                if (evt.getValueIsAdjusting()) {
                    return;
                }
                int selecionado = tblConsulta.getSelectedRow();
                if (selecionado >= 0) {
                    mostrar(lista.get(selecionado));
                }
            }
        });

        setVisible(true);
        pack();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        btnPRIMEIRO = new javax.swing.JButton();
        btnANTERIOR = new javax.swing.JButton();
        btnPROXIMO = new javax.swing.JButton();
        btnULTIMO = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        btnINCLUIR = new javax.swing.JButton();
        btnALTERAR = new javax.swing.JButton();
        btnEXCLUIR = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        btnGRAVAR = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        btnSAIR = new javax.swing.JButton();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        painelCONSULTA = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lblCONS_ID = new javax.swing.JLabel();
        edtCONS_ID1 = new javax.swing.JTextField();
        lblCodigo2 = new javax.swing.JLabel();
        edtCONS_ID2 = new javax.swing.JTextField();
        btnConsulta = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        lblCONS_NOME = new javax.swing.JLabel();
        edtCONS_NOME = new javax.swing.JTextField();
        lblCONS_CPF = new javax.swing.JLabel();
        edtCONS_CPF = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblConsulta = new javax.swing.JTable();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        painelDADOS = new javax.swing.JPanel();
        lblCLIE_ID = new javax.swing.JLabel();
        lblCLIE_NOME = new javax.swing.JLabel();
        lblCLIE_CPF = new javax.swing.JLabel();
        edtCLIE_ID = new javax.swing.JTextField();
        edtCLIE_NOME = new javax.swing.JTextField();
        lblCLIE_Email = new javax.swing.JLabel();
        edtCLIE_DDD = new javax.swing.JTextField();
        lblCLIE_DDD = new javax.swing.JLabel();
        edtCLIE_EMAIL = new javax.swing.JTextField();
        lblCLIE_TELEFONE = new javax.swing.JLabel();
        edtCLIE_TELEFONE = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JToolBar.Separator();
        edtCLIE_END_CIDADE = new javax.swing.JTextField();
        lblCLIE_END_CIDADE = new javax.swing.JLabel();
        edtCLIE_END_LOGRADOURO = new javax.swing.JTextField();
        lblCLIE_END_LOGRADOURO = new javax.swing.JLabel();
        edtCLIE_END_TIPO = new javax.swing.JTextField();
        lblCLIE_END_TIPO = new javax.swing.JLabel();
        boxCLIE_END_ESTADO = new javax.swing.JComboBox<>();
        lblCLIE_END_ESTADO = new javax.swing.JLabel();
        edtCLIE_CPF = new javax.swing.JTextField();
        lblTitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("MVC - Cadastro de Usuários");
        setPreferredSize(new java.awt.Dimension(770, 795));
        getContentPane().setLayout(null);

        jToolBar1.setRollover(true);

        btnPRIMEIRO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/primeiro.png"))); // NOI18N
        btnPRIMEIRO.setText("Primeiro");
        btnPRIMEIRO.setFocusable(false);
        btnPRIMEIRO.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPRIMEIRO.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnPRIMEIRO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPRIMEIROActionPerformed(evt);
            }
        });
        jToolBar1.add(btnPRIMEIRO);

        btnANTERIOR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/anterior.png"))); // NOI18N
        btnANTERIOR.setText("Anterior");
        btnANTERIOR.setFocusable(false);
        btnANTERIOR.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnANTERIOR.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnANTERIOR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnANTERIORActionPerformed(evt);
            }
        });
        jToolBar1.add(btnANTERIOR);

        btnPROXIMO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/proximo.png"))); // NOI18N
        btnPROXIMO.setText("Próximo");
        btnPROXIMO.setFocusable(false);
        btnPROXIMO.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPROXIMO.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnPROXIMO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPROXIMOActionPerformed(evt);
            }
        });
        jToolBar1.add(btnPROXIMO);

        btnULTIMO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ultimo.png"))); // NOI18N
        btnULTIMO.setText("Último");
        btnULTIMO.setFocusable(false);
        btnULTIMO.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnULTIMO.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnULTIMO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnULTIMOActionPerformed(evt);
            }
        });
        jToolBar1.add(btnULTIMO);

        jSeparator1.setSeparatorSize(new java.awt.Dimension(30, 30));
        jToolBar1.add(jSeparator1);

        btnINCLUIR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/novo.png"))); // NOI18N
        btnINCLUIR.setText("Novo");
        btnINCLUIR.setFocusable(false);
        btnINCLUIR.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnINCLUIR.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnINCLUIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnINCLUIRActionPerformed(evt);
            }
        });
        jToolBar1.add(btnINCLUIR);

        btnALTERAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/alterar.png"))); // NOI18N
        btnALTERAR.setText("Alterar");
        btnALTERAR.setFocusable(false);
        btnALTERAR.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnALTERAR.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnALTERAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnALTERARActionPerformed(evt);
            }
        });
        jToolBar1.add(btnALTERAR);

        btnEXCLUIR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/excluir.png"))); // NOI18N
        btnEXCLUIR.setText("Excluir");
        btnEXCLUIR.setFocusable(false);
        btnEXCLUIR.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEXCLUIR.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEXCLUIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEXCLUIRActionPerformed(evt);
            }
        });
        jToolBar1.add(btnEXCLUIR);

        jSeparator2.setSeparatorSize(new java.awt.Dimension(30, 30));
        jToolBar1.add(jSeparator2);

        btnGRAVAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/gravar.png"))); // NOI18N
        btnGRAVAR.setText("Gravar");
        btnGRAVAR.setFocusable(false);
        btnGRAVAR.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGRAVAR.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGRAVAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGRAVARActionPerformed(evt);
            }
        });
        jToolBar1.add(btnGRAVAR);

        jSeparator3.setSeparatorSize(new java.awt.Dimension(30, 30));
        jToolBar1.add(jSeparator3);

        btnSAIR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sair.png"))); // NOI18N
        btnSAIR.setText("Sair");
        btnSAIR.setFocusable(false);
        btnSAIR.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSAIR.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSAIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSAIRActionPerformed(evt);
            }
        });
        jToolBar1.add(btnSAIR);

        getContentPane().add(jToolBar1);
        jToolBar1.setBounds(0, 0, 649, 84);

        jTabbedPane2.setPreferredSize(new java.awt.Dimension(775, 300));

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblCONS_ID.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblCONS_ID.setText("ID");

        edtCONS_ID1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lblCodigo2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblCodigo2.setText("à");

        edtCONS_ID2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        btnConsulta.setText("Consulta");
        btnConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaActionPerformed(evt);
            }
        });

        btnLimpar.setText("Limpa");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        lblCONS_NOME.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblCONS_NOME.setText("Nome");

        edtCONS_NOME.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lblCONS_CPF.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblCONS_CPF.setText("CPF");

        edtCONS_CPF.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(lblCONS_NOME)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edtCONS_NOME))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(lblCONS_ID)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edtCONS_ID1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblCodigo2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edtCONS_ID2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblCONS_CPF)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edtCONS_CPF, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)))
                .addGap(77, 77, 77)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(45, 45, 45))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCONS_ID)
                    .addComponent(edtCONS_ID1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCodigo2)
                    .addComponent(edtCONS_ID2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsulta)
                    .addComponent(edtCONS_CPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCONS_CPF))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edtCONS_NOME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCONS_NOME)
                    .addComponent(btnLimpar))
                .addContainerGap())
        );

        jScrollPane2.setViewportView(tblConsulta);

        javax.swing.GroupLayout painelCONSULTALayout = new javax.swing.GroupLayout(painelCONSULTA);
        painelCONSULTA.setLayout(painelCONSULTALayout);
        painelCONSULTALayout.setHorizontalGroup(
            painelCONSULTALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane2)
        );
        painelCONSULTALayout.setVerticalGroup(
            painelCONSULTALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCONSULTALayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 81, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(202, 202, 202))
        );

        jTabbedPane2.addTab("Consulta", painelCONSULTA);

        getContentPane().add(jTabbedPane2);
        jTabbedPane2.setBounds(0, 380, 750, 370);

        lblCLIE_ID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCLIE_ID.setText("ID");

        lblCLIE_NOME.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCLIE_NOME.setText("Nome");

        lblCLIE_CPF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCLIE_CPF.setText("CPF");

        edtCLIE_ID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        edtCLIE_NOME.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edtCLIE_NOME.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtCLIE_NOMEActionPerformed(evt);
            }
        });

        lblCLIE_Email.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCLIE_Email.setText("E-mail");

        edtCLIE_DDD.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblCLIE_DDD.setText("DDD");

        edtCLIE_EMAIL.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblCLIE_TELEFONE.setText("Telefone");

        edtCLIE_TELEFONE.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jSeparator6.setSeparatorSize(new java.awt.Dimension(30, 30));

        edtCLIE_END_CIDADE.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edtCLIE_END_CIDADE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtCLIE_END_CIDADEActionPerformed(evt);
            }
        });

        lblCLIE_END_CIDADE.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCLIE_END_CIDADE.setText("Cidade");

        edtCLIE_END_LOGRADOURO.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edtCLIE_END_LOGRADOURO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtCLIE_END_LOGRADOUROActionPerformed(evt);
            }
        });

        lblCLIE_END_LOGRADOURO.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCLIE_END_LOGRADOURO.setText("Logradouro");

        edtCLIE_END_TIPO.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edtCLIE_END_TIPO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtCLIE_END_TIPOActionPerformed(evt);
            }
        });

        lblCLIE_END_TIPO.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCLIE_END_TIPO.setText("Tipo");

        lblCLIE_END_ESTADO.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCLIE_END_ESTADO.setText("Estado");

        edtCLIE_CPF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edtCLIE_CPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtCLIE_CPFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelDADOSLayout = new javax.swing.GroupLayout(painelDADOS);
        painelDADOS.setLayout(painelDADOSLayout);
        painelDADOSLayout.setHorizontalGroup(
            painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDADOSLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCLIE_DDD)
                    .addComponent(lblCLIE_ID)
                    .addComponent(lblCLIE_NOME)
                    .addComponent(lblCLIE_CPF)
                    .addComponent(lblCLIE_Email))
                .addGap(18, 18, 18)
                .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(edtCLIE_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(painelDADOSLayout.createSequentialGroup()
                        .addComponent(edtCLIE_DDD, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblCLIE_TELEFONE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edtCLIE_TELEFONE, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(edtCLIE_EMAIL, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(edtCLIE_NOME, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(edtCLIE_CPF, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator6, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCLIE_END_CIDADE, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCLIE_END_LOGRADOURO, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCLIE_END_TIPO, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCLIE_END_ESTADO, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(edtCLIE_END_CIDADE)
                    .addComponent(edtCLIE_END_LOGRADOURO)
                    .addComponent(edtCLIE_END_TIPO)
                    .addComponent(boxCLIE_END_ESTADO, 0, 150, Short.MAX_VALUE))
                .addGap(102, 102, 102))
        );
        painelDADOSLayout.setVerticalGroup(
            painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDADOSLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(painelDADOSLayout.createSequentialGroup()
                        .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelDADOSLayout.createSequentialGroup()
                                .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(edtCLIE_END_CIDADE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblCLIE_END_CIDADE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(edtCLIE_END_LOGRADOURO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblCLIE_END_LOGRADOURO))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(edtCLIE_END_TIPO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblCLIE_END_TIPO))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(boxCLIE_END_ESTADO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblCLIE_END_ESTADO)))
                            .addGroup(painelDADOSLayout.createSequentialGroup()
                                .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(edtCLIE_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblCLIE_ID))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(edtCLIE_NOME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblCLIE_NOME))
                                .addGap(13, 13, 13)
                                .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblCLIE_CPF)
                                    .addComponent(edtCLIE_CPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(11, 11, 11)
                                .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(edtCLIE_EMAIL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblCLIE_Email))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(edtCLIE_DDD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblCLIE_DDD)
                                    .addComponent(edtCLIE_TELEFONE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblCLIE_TELEFONE))))
                        .addGap(0, 16, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Dados do Usuário", painelDADOS);

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(0, 120, 750, 250);

        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTitulo.setText("Cadastro e Consulta de Clientes");
        getContentPane().add(lblTitulo);
        lblTitulo.setBounds(140, 90, 376, 29);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void limparAgenda() {
        edtCLIE_ID.setText("0");
        edtCLIE_NOME.setText("");
        edtCLIE_TELEFONE.setText("");
        edtCLIE_CPF.setText("");
        edtCLIE_DDD.setText("");
        edtCLIE_EMAIL.setText("");
        edtCLIE_END_CIDADE.setText("");
        edtCLIE_END_LOGRADOURO.setText("");
        edtCLIE_END_TIPO.setText("");
    }

    private void mostrar(ClienteModel cliente) {
        edtCLIE_ID.setText(String.valueOf(cliente.getCLIE_ID()));
        edtCLIE_NOME.setText(cliente.getCLIE_NOME());
        edtCLIE_CPF.setText(cliente.getCLIE_CPF());
        edtCLIE_EMAIL.setText(cliente.getCLIE_EMAIL());
        edtCLIE_DDD.setText(String.valueOf(cliente.getCLIE_DDD()));
        edtCLIE_TELEFONE.setText(String.valueOf(cliente.getCLIE_TELEFONE()));
    }

    private String filtroConsulta() {
        String condicao = "";
        if (!edtCONS_ID1.getText().trim().equals("")) {
            condicao += "(CLIE_ID >= " + edtCONS_ID1.getText() + ")";
        }
        if (!edtCONS_ID2.getText().trim().equals("")) {
            if (!condicao.isEmpty()) {
                condicao += " AND ";
            }
            condicao += "(CLIE_ID <= " + edtCONS_ID2.getText() + ")";
        }
        if (!edtCONS_NOME.getText().trim().equals("")) {
            if (!condicao.isEmpty()) {
                condicao += " AND ";
            }
            condicao += "( upper(CLIE_NOME) LIKE ('%" + edtCONS_NOME.getText().toUpperCase() + "%'))";
        }
        if (!edtCONS_CPF.getText().trim().equals("")) {
            if (!condicao.isEmpty()) {
                condicao += " AND ";
            }
            condicao += "( upper(CLIE_CPF) LIKE ('%" + edtCONS_CPF.getText().toUpperCase() + "%'))";
        }
        return condicao;
    }

    private void mostrar2() {
        int selecionado = tblConsulta.getSelectedRow();
        if (selecionado >= 0) {
            mostrar(lista.get(selecionado));
        }
    }

    private void consultar() {
        String condicao = filtroConsulta();
        ClienteController clientecontroller = new ClienteController();
        lista = null;
        lista = clientecontroller.consultar(condicao);
        if (lista.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Não Existem Clientes Cadastrados !");
        } else {
            tabela = new ClienteTableModel(lista, colunas);
            tblConsulta.setModel(tabela);
            tblConsulta.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            tblConsulta.changeSelection(0, 0, false, false);
            mostrar2();
        }
    }

    private void consultaEstado() {
        EstadoController estadocontroller = new EstadoController();
        String condicaoestado = "";
        listaEstado = null;
        listaEstado = estadocontroller.consultar(condicaoestado);
        for (int i = 0; i < listaEstado.size(); i++) {
            boxCLIE_END_ESTADO.addItem(listaEstado.get(i).getEST_NOME());
        }
        ;

    }

    private void btnPRIMEIROActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPRIMEIROActionPerformed
        if (lista.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Não Existem Usuários Cadastrados !");
        }
        int primeiro = 0;
        mostrarRegistro(primeiro);
    }//GEN-LAST:event_btnPRIMEIROActionPerformed

    private void btnINCLUIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnINCLUIRActionPerformed
        limparAgenda();
        consultaEstado();
        setOperacao("incluir");
        edtCLIE_NOME.setFocusable(true);
    }//GEN-LAST:event_btnINCLUIRActionPerformed

    private void btnGRAVARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGRAVARActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Confirma Gravação deste Usuário ?",
                "Confirmação", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            try {
                ClienteModel objcliente = new ClienteModel();
                EnderecoModel objendcliente = new EnderecoModel();
                EnderecoController enderecocliente = new EnderecoController();
                ClienteController clienteController = new ClienteController();

//---------------------------------------------------------------------------------------------------------------
                objcliente.setCLIE_ID(Integer.parseInt(edtCLIE_ID.getText()));
                objcliente.setCLIE_NOME(edtCLIE_NOME.getText());
                objcliente.setCLIE_CPF(edtCLIE_CPF.getText());
                objcliente.setCLIE_EMAIL(edtCLIE_EMAIL.getText());
                objcliente.setCLIE_DDD(Integer.parseInt(edtCLIE_DDD.getText()));
                objcliente.setCLIE_TELEFONE(Integer.parseInt(edtCLIE_TELEFONE.getText()));

//---------------------------------------------------------------------------------------------------------------
                objendcliente.setEND_ID(Integer.parseInt(edtCLIE_ID.getText()));
                objendcliente.setEND_CIDADE(edtCLIE_END_CIDADE.getText().trim());
                objendcliente.setEND_LOGRADOURO(edtCLIE_END_LOGRADOURO.getText().trim());
                objendcliente.setEND_TIPO(edtCLIE_END_TIPO.getText().trim());
                objendcliente.setEND_ESTADOFK(boxCLIE_END_ESTADO.getSelectedIndex());

                clienteController.gravar(objcliente, getOperacao());
                enderecocliente.gravar(objendcliente, getOperacao());
                
                
                

//---------------------------------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------------------------------
                JOptionPane.showMessageDialog(null, "Dados Gravados com Sucesso");
                consultar();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Erro na Gravação \n" + ex.getMessage());
            }
        }
    }//GEN-LAST:event_btnGRAVARActionPerformed


    private void btnALTERARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnALTERARActionPerformed
        setOperacao("alterar");
    }//GEN-LAST:event_btnALTERARActionPerformed

    private void btnConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaActionPerformed
        consultar();
    }//GEN-LAST:event_btnConsultaActionPerformed

    private void btnSAIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSAIRActionPerformed
        dispose();
    }//GEN-LAST:event_btnSAIRActionPerformed

    private void btnANTERIORActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnANTERIORActionPerformed
        int selecionado = tblConsulta.getSelectedRow() - 1;
        mostrarRegistro(selecionado);
    }//GEN-LAST:event_btnANTERIORActionPerformed

    private void mostrarRegistro(int registro) {
        if (registro >= 0 && registro < lista.size()) {
            // exibe os dados do registro na aba Dados
            mostrar(lista.get(registro));

            // posicionar o registro selecionado na tabela (JTable)
            tblConsulta.changeSelection(registro, 0, false, false);
        }
    }

    private void btnPROXIMOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPROXIMOActionPerformed
        int selecionado = tblConsulta.getSelectedRow() + 1;
        mostrarRegistro(selecionado);
    }//GEN-LAST:event_btnPROXIMOActionPerformed

    private void btnULTIMOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnULTIMOActionPerformed
        int ultimo = lista.size() - 1;
        mostrarRegistro(ultimo);
    }//GEN-LAST:event_btnULTIMOActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        edtCONS_ID1.setText("");
        edtCONS_ID2.setText("");
        edtCONS_NOME.setText("");
        edtCONS_CPF.setText("");

    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnEXCLUIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEXCLUIRActionPerformed
        setOperacao("");
        if (JOptionPane.showConfirmDialog(null, "Confirma Exclusão deste Registro ?",
                "Confirmação", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            try {
                ClienteModel objcliente = new ClienteModel();
                objcliente.setCLIE_ID(Integer.parseInt(edtCLIE_ID.getText()));
                objcliente.setCLIE_NOME(edtCLIE_NOME.getText());
                objcliente.setCLIE_CPF(edtCLIE_CPF.getText());
                objcliente.setCLIE_EMAIL(edtCLIE_EMAIL.getText());
                objcliente.setCLIE_DDD(Integer.parseInt(edtCLIE_DDD.getText()));
                objcliente.setCLIE_TELEFONE(Integer.parseInt(edtCLIE_TELEFONE.getText()));
                ClienteController clientecontroller = new ClienteController();
                clientecontroller.excluir(objcliente);

                JOptionPane.showMessageDialog(null, "Registro Excluído com Sucesso");
                consultar();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Erro na Exclusão de Registro \n" + ex.getMessage());
            }
        }
    }//GEN-LAST:event_btnEXCLUIRActionPerformed


    private void edtCLIE_NOMEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtCLIE_NOMEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtCLIE_NOMEActionPerformed

    private void edtCLIE_END_CIDADEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtCLIE_END_CIDADEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtCLIE_END_CIDADEActionPerformed

    private void edtCLIE_END_LOGRADOUROActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtCLIE_END_LOGRADOUROActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtCLIE_END_LOGRADOUROActionPerformed

    private void edtCLIE_END_TIPOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtCLIE_END_TIPOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtCLIE_END_TIPOActionPerformed

    private void edtCLIE_CPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtCLIE_CPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtCLIE_CPFActionPerformed
    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxCLIE_END_ESTADO;
    private javax.swing.JButton btnALTERAR;
    private javax.swing.JButton btnANTERIOR;
    private javax.swing.JButton btnConsulta;
    private javax.swing.JButton btnEXCLUIR;
    private javax.swing.JButton btnGRAVAR;
    private javax.swing.JButton btnINCLUIR;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnPRIMEIRO;
    private javax.swing.JButton btnPROXIMO;
    private javax.swing.JButton btnSAIR;
    private javax.swing.JButton btnULTIMO;
    private javax.swing.JTextField edtCLIE_CPF;
    private javax.swing.JTextField edtCLIE_DDD;
    private javax.swing.JTextField edtCLIE_EMAIL;
    private javax.swing.JTextField edtCLIE_END_CIDADE;
    private javax.swing.JTextField edtCLIE_END_LOGRADOURO;
    private javax.swing.JTextField edtCLIE_END_TIPO;
    private javax.swing.JTextField edtCLIE_ID;
    private javax.swing.JTextField edtCLIE_NOME;
    private javax.swing.JTextField edtCLIE_TELEFONE;
    private javax.swing.JTextField edtCONS_CPF;
    private javax.swing.JTextField edtCONS_ID1;
    private javax.swing.JTextField edtCONS_ID2;
    private javax.swing.JTextField edtCONS_NOME;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lblCLIE_CPF;
    private javax.swing.JLabel lblCLIE_DDD;
    private javax.swing.JLabel lblCLIE_END_CIDADE;
    private javax.swing.JLabel lblCLIE_END_ESTADO;
    private javax.swing.JLabel lblCLIE_END_LOGRADOURO;
    private javax.swing.JLabel lblCLIE_END_TIPO;
    private javax.swing.JLabel lblCLIE_Email;
    private javax.swing.JLabel lblCLIE_ID;
    private javax.swing.JLabel lblCLIE_NOME;
    private javax.swing.JLabel lblCLIE_TELEFONE;
    private javax.swing.JLabel lblCONS_CPF;
    private javax.swing.JLabel lblCONS_ID;
    private javax.swing.JLabel lblCONS_NOME;
    private javax.swing.JLabel lblCodigo2;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel painelCONSULTA;
    private javax.swing.JPanel painelDADOS;
    private javax.swing.JTable tblConsulta;
    // End of variables declaration//GEN-END:variables
}
