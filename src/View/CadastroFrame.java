/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Carta;
import Model.Jogador;
import Model.JogoControl;
import java.awt.Dimension;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class CadastroFrame extends javax.swing.JFrame {

    private JogoControl jogo;
    private List<Carta> cartasAuxiliar;
    private DefaultListModel<String> dlm = new DefaultListModel();
    private DefaultListModel<String> dlm2 = new DefaultListModel();
    boolean habilitado;

    public CadastroFrame(JogoControl jogo) {
        initComponents();
        this.habilitado = true;
        this.jogo = jogo;
    }

    public CadastroFrame(JogoControl jogo, boolean existe) {
        initComponents();
        this.jogo = jogo;
        this.habilitado = false;
        inicializaCartas();
        desabilitaBotoes();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        volta = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nomeJogador = new javax.swing.JTextField();
        adicionarButton = new javax.swing.JButton();
        removerButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaJogadores = new javax.swing.JList();
        editarButtom = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        menosPenalidade = new javax.swing.JToggleButton();
        cartaSelecionada = new javax.swing.JComboBox();
        perguntaPenalidade = new javax.swing.JLabel();
        penalidadeCarta = new javax.swing.JLabel();
        perguntaCarta = new javax.swing.JLabel();
        maisPenalidade = new javax.swing.JToggleButton();
        adicionarCarta = new javax.swing.JButton();
        DeletarCarta = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        listaCarta = new javax.swing.JList();
        regraCarta = new javax.swing.JTextField();
        regraCheckBox = new javax.swing.JCheckBox();
        Start = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        nomeJogo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        volta.setText("Voltar");
        volta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltaActionPerformed(evt);
            }
        });
        getContentPane().add(volta, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 650, -1, -1));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastro dos jogadores", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nome do jogador: ");

        nomeJogador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeJogadorActionPerformed(evt);
            }
        });

        adicionarButton.setText("Adicionar");
        adicionarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarButtonActionPerformed(evt);
            }
        });
        adicionarButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                adicionarButtonKeyTyped(evt);
            }
        });

        removerButton.setText("Remover");
        removerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerButtonActionPerformed(evt);
            }
        });

        listaJogadores.setModel(dlm);
        listaJogadores.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listaJogadores.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaJogadoresValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(listaJogadores);

        editarButtom.setText("Editar");
        editarButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarButtomActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(nomeJogador)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 523, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(removerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(adicionarButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(editarButtom, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(adicionarButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(editarButtom)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(removerButton)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(nomeJogador, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7))))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 122, 890, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastro das regras", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.setToolTipText("Criar regra do jogo");
        jPanel2.setOpaque(false);

        menosPenalidade.setText("-");
        menosPenalidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menosPenalidadeActionPerformed(evt);
            }
        });

        cartaSelecionada.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cartaSelecionada.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" }));
        cartaSelecionada.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cartaSelecionada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cartaSelecionadaActionPerformed(evt);
            }
        });

        perguntaPenalidade.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        perguntaPenalidade.setForeground(new java.awt.Color(255, 255, 255));
        perguntaPenalidade.setText("Quantos shots de penalidade?");

        penalidadeCarta.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        penalidadeCarta.setForeground(new java.awt.Color(255, 255, 255));
        penalidadeCarta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        penalidadeCarta.setText("0");

        perguntaCarta.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        perguntaCarta.setForeground(new java.awt.Color(255, 255, 255));
        perguntaCarta.setText("Qual a significado dessa carta?");

        maisPenalidade.setText("+");
        maisPenalidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maisPenalidadeActionPerformed(evt);
            }
        });

        adicionarCarta.setText("Adicionar");
        adicionarCarta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarCartaActionPerformed(evt);
            }
        });

        DeletarCarta.setText("Remover");
        DeletarCarta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeletarCartaActionPerformed(evt);
            }
        });

        listaCarta.setModel(dlm2);
        listaCarta.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listaCarta.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaCartaValueChanged(evt);
            }
        });
        jScrollPane4.setViewportView(listaCarta);

        regraCarta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regraCartaActionPerformed(evt);
            }
        });

        regraCheckBox.setText("Regra");
        regraCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regraCheckBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(cartaSelecionada, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(perguntaCarta)
                                .addGap(321, 321, 321)
                                .addComponent(regraCheckBox))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(perguntaPenalidade)
                                    .addGap(18, 18, 18)
                                    .addComponent(menosPenalidade, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(penalidadeCarta, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(maisPenalidade, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(regraCarta, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(adicionarCarta, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DeletarCarta, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane4))
                .addGap(60, 60, 60))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(perguntaCarta)
                            .addComponent(regraCheckBox))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cartaSelecionada, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(regraCarta, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(menosPenalidade, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(maisPenalidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(penalidadeCarta)))
                            .addComponent(perguntaPenalidade)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(adicionarCarta)
                        .addGap(18, 18, 18)
                        .addComponent(DeletarCarta)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 308, 890, 319));

        Start.setText("Começar jogo");
        Start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartActionPerformed(evt);
            }
        });
        getContentPane().add(Start, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 650, -1, -1));

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel3.setOpaque(false);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nome do Jogo:");

        nomeJogo.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nomeJogo, javax.swing.GroupLayout.PREFERRED_SIZE, 669, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeJogo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 11, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/jogo2_fundo.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nomeJogadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeJogadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeJogadorActionPerformed

    private void adicionarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarButtonActionPerformed

        listaJogadores.setSelectedIndex(-1);
        if (!nomeJogador.getText().isEmpty()) {

            dlm.clear();

            Jogador jogador = new Jogador();
            jogador.setNome(nomeJogador.getText());
            jogador.setQuantidadeBebida(0);

            jogo.getJogadores().add(jogador);

            for (int i = 0; i < jogo.getJogadores().size(); i++) {
                dlm.add(i, jogo.getJogadores().get(i).getNome());
            }
            nomeJogador.setText(null);
        } else {
            JOptionPane.showMessageDialog(rootPane, "Entre com o nome do jogador!", "Erro", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_adicionarButtonActionPerformed

    private void listaJogadoresValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaJogadoresValueChanged

    }//GEN-LAST:event_listaJogadoresValueChanged

    private void StartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartActionPerformed

        try {
            finalizaPagina();
        } catch (IOException ex) {
            Logger.getLogger(CadastroFrame.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_StartActionPerformed

    private void maisPenalidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maisPenalidadeActionPerformed

        int valor = Integer.parseInt(penalidadeCarta.getText());
        valor++;
        penalidadeCarta.setText(valor + "");

    }//GEN-LAST:event_maisPenalidadeActionPerformed

    private void menosPenalidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menosPenalidadeActionPerformed

        int valor = Integer.parseInt(penalidadeCarta.getText());
        valor--;
        if (valor < 0) {
            valor = 0;
        }
        penalidadeCarta.setText(valor + "");

    }//GEN-LAST:event_menosPenalidadeActionPerformed

    private void adicionarCartaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarCartaActionPerformed

        regraCarta.setEditable(true);
        String carta = cartaSelecionada.getSelectedItem().toString();
        String significado = regraCarta.getText();
        int penalidade = Integer.parseInt(penalidadeCarta.getText());
        String dados = null;
        boolean jaTem = false;
        for (int i = 0; i < jogo.getCartas().size(); i++) {
            if (carta.equals(jogo.getCartas().get(i).getValor())) {
                jaTem = true;
                jogo.getCartas().get(i).setSignificado(significado);
                jogo.getCartas().get(i).setPenalidade(penalidade);
                break;
            }
        }

        dlm2.clear();
        
        if (!jaTem) {
            Carta c = new Carta();
            c.setValor(carta);
            c.setSignificado(significado);
            c.setPenalidade(penalidade);
            jogo.getCartas().add(c);
        }

        for (int i = 0; i < jogo.getCartas().size(); i++) {
            dlm2.add(i, jogo.getCartas().get(i).getValor() + " - " + jogo.getCartas().get(i).getSignificado() + ", " + jogo.getCartas().get(i).getPenalidade() + " dose(s) de penalidade");
        }

        regraCarta.setText(null);
        penalidadeCarta.setText("0");
        regraCheckBox.setSelected(false);

    }//GEN-LAST:event_adicionarCartaActionPerformed

    private void cartaSelecionadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cartaSelecionadaActionPerformed

        String carta = cartaSelecionada.getSelectedItem().toString();

        boolean jaTem = false;
        for (int i = 0; i < jogo.getCartas().size(); i++) {
            if (carta.equals(jogo.getCartas().get(i).getValor())) {
                jaTem = true;
                regraCarta.setText(jogo.getCartas().get(i).getSignificado());
                String valor = jogo.getCartas().get(i).getPenalidade() + "";
                penalidadeCarta.setText(valor);
                break;
            }
        }
    }//GEN-LAST:event_cartaSelecionadaActionPerformed

    private void listaCartaValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaCartaValueChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_listaCartaValueChanged

    private void regraCartaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regraCartaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regraCartaActionPerformed

    private void removerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerButtonActionPerformed

        if (!listaJogadores.isSelectionEmpty()) {
            
            String nome = listaJogadores.getSelectedValue().toString();
            for (int i = 0; i < jogo.getJogadores().size(); i++) {
                if (nome.equals(jogo.getJogadores().get(i).getNome())) {
                    jogo.getJogadores().remove(i);
                    dlm.remove(i);
                }
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Selecione, na lista, o jogador que deseja remover!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_removerButtonActionPerformed

    private void voltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltaActionPerformed

        InicioFrame inif = new InicioFrame(jogo);
        inif.setVisible(true);
        inif.setLocationRelativeTo(null);
        this.setVisible(false);

    }//GEN-LAST:event_voltaActionPerformed

    private void editarButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarButtomActionPerformed
        
        String nome = nomeJogador.getText();
        
        if(!nome.isEmpty()){
            if(!listaJogadores.isSelectionEmpty()){
                int index = listaJogadores.getSelectedIndex();
                dlm.set(index, nome);
            }
            else{
                JOptionPane.showMessageDialog(rootPane, "Selecione um jogador para editar!", "Erro", JOptionPane.ERROR_MESSAGE);
            }
            nomeJogador.setText("");
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "Escreva o novo nome do jogador!", "Erro", JOptionPane.ERROR_MESSAGE);  
        }
        
    }//GEN-LAST:event_editarButtomActionPerformed

    private void regraCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regraCheckBoxActionPerformed
        
        if(regraCheckBox.isSelected()){ 
            regraCarta.setText("Crie uma regra! (ou exclua uma)");
            regraCarta.setEditable(false);
        }
        else{
           regraCarta.setEditable(true);
        }
        
    }//GEN-LAST:event_regraCheckBoxActionPerformed

    private void DeletarCartaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeletarCartaActionPerformed
        
        int index = listaCarta.getSelectedIndex();
        
        dlm2.remove(index);
    }//GEN-LAST:event_DeletarCartaActionPerformed

    private void adicionarButtonKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_adicionarButtonKeyTyped
        
        adicionarButtonActionPerformed(null);
        
    }//GEN-LAST:event_adicionarButtonKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastroFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

    }

    public void finalizaPagina() throws FileNotFoundException, IOException {

        boolean temJogador = false, temNome = true,temCarta = false;

        if (nomeJogo.getText().isEmpty()){
            temNome = false;
            JOptionPane.showMessageDialog(rootPane, "Adicione um nome para este jogo!", "Erro", JOptionPane.ERROR_MESSAGE);            
        } 
        else{

            if (jogo.getJogadores().size() > 0){
                temJogador = true;
                
                if(jogo.getCartas().size()>0)
                    temCarta = true;
                else{
                    JOptionPane.showMessageDialog(rootPane, "Sem cartas cadastradas", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            } 
            else{
                JOptionPane.showMessageDialog(rootPane, "Sem jogadores cadastrados", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
        
        if (temCarta && temNome && temJogador) {
                if(habilitado){
                    OutputStream os = new FileOutputStream("cartas.txt", true);
                    OutputStreamWriter osw = new OutputStreamWriter(os);
                    BufferedWriter bw = new BufferedWriter(osw);

                    InputStream is = new FileInputStream("cartas.txt");
                    InputStreamReader isr = new InputStreamReader(is);
                    BufferedReader br = new BufferedReader(isr);

                    if(br.readLine() != null) bw.newLine();
                    bw.write(nomeJogo.getText());
                    bw.newLine();
                    bw.write(jogo.getCartas().size() + "");
                    bw.newLine();
                    for (int i = 0; i < jogo.getCartas().size(); i++) {
                        bw.write(jogo.getCartas().get(i).getValor() + "&&" + jogo.getCartas().get(i).getSignificado() + "&&" + jogo.getCartas().get(i).getPenalidade());
                        if(i!=jogo.getCartas().size() - 1) bw.newLine();
                    }
                    bw.close();
                }
                JogoFrame jf = new JogoFrame(jogo);
                jf.setVisible(true);
                jf.setLocationRelativeTo(null);
                this.setVisible(false);
            } 
        
    }

    private void inicializaCartas() {
            
        nomeJogo.setText(jogo.getNomeDoJogo() + "");

        dlm2.clear();
        
        for (int i = 0; i < jogo.getCartas().size(); i++) {
            dlm2.add(i, jogo.getCartas().get(i).getValor() + " - " + jogo.getCartas().get(i).getSignificado() + ", " + jogo.getCartas().get(i).getPenalidade() + " dose(s) de penalidade");
        } 
    }
    
    private void desabilitaBotoes(){
        
        adicionarCarta.setVisible(false);
        DeletarCarta.setVisible(false);
        cartaSelecionada.setVisible(false);
        maisPenalidade.setVisible(false);
        menosPenalidade.setVisible(false);
        penalidadeCarta.setVisible(false);
        perguntaCarta.setVisible(false);
        perguntaPenalidade.setVisible(false);
        regraCarta.setVisible(false);
        nomeJogo.setEditable(false);
        regraCheckBox.setVisible(false);
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DeletarCarta;
    private javax.swing.JButton Start;
    private javax.swing.JButton adicionarButton;
    private javax.swing.JButton adicionarCarta;
    private javax.swing.JComboBox cartaSelecionada;
    private javax.swing.JButton editarButtom;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JList listaCarta;
    private javax.swing.JList listaJogadores;
    private javax.swing.JToggleButton maisPenalidade;
    private javax.swing.JToggleButton menosPenalidade;
    private javax.swing.JTextField nomeJogador;
    private javax.swing.JTextField nomeJogo;
    private javax.swing.JLabel penalidadeCarta;
    private javax.swing.JLabel perguntaCarta;
    private javax.swing.JLabel perguntaPenalidade;
    private javax.swing.JTextField regraCarta;
    private javax.swing.JCheckBox regraCheckBox;
    private javax.swing.JButton removerButton;
    private javax.swing.JButton volta;
    // End of variables declaration//GEN-END:variables
}
