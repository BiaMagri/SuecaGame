/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Carta;
import Model.JogoControl;
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
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class MostraJogosFrame extends javax.swing.JFrame {

    private DefaultListModel<String> dlm = new DefaultListModel();
    JogoControl jogo;
    
    private String nomeDoJogoSelecionado;
    
    public MostraJogosFrame(JogoControl jogo){
        initComponents();
        this.jogo = jogo; 
        try {
            inicializaTabela();
        } catch (IOException ex) {
            Logger.getLogger(MostraJogosFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        volta = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        pesquisarButtum = new javax.swing.JButton();
        pesquisaField = new javax.swing.JTextField();
        opcaoRegra = new javax.swing.JTextField();
        avancar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jList1.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jList1.setModel(dlm);
        jScrollPane1.setViewportView(jList1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 75, 785, 400));

        volta.setText("Voltar");
        volta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltaActionPerformed(evt);
            }
        });
        getContentPane().add(volta, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 550, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Entre com o número da jogo que deseja reabrir:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 510, -1, -1));

        pesquisarButtum.setText("Pesquisar");
        pesquisarButtum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisarButtumActionPerformed(evt);
            }
        });
        pesquisarButtum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pesquisarButtumKeyTyped(evt);
            }
        });
        getContentPane().add(pesquisarButtum, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 30, -1, -1));

        pesquisaField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisaFieldActionPerformed(evt);
            }
        });
        getContentPane().add(pesquisaField, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 30, 250, -1));

        opcaoRegra.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        opcaoRegra.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        opcaoRegra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcaoRegraActionPerformed(evt);
            }
        });
        getContentPane().add(opcaoRegra, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 500, 53, 38));

        avancar.setText("Selecionar jogo");
        avancar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avancarActionPerformed(evt);
            }
        });
        avancar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                avancarKeyTyped(evt);
            }
        });
        getContentPane().add(avancar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 510, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/jogo3_fundo.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void opcaoRegraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcaoRegraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opcaoRegraActionPerformed

    private void avancarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avancarActionPerformed
        
        
        String op = opcaoRegra.getText() + "";
        boolean existe = false;
        
        try {
            existe = pegaCartas(Integer.parseInt(op));
            if(!existe){
                JOptionPane.showMessageDialog(rootPane, "Selecione um jogo válido!", "Erro", JOptionPane.ERROR_MESSAGE);
                opcaoRegra.setText("");
            }
        } catch (IOException ex) {
            Logger.getLogger(MostraJogosFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if(existe){
            CadastroFrame cjf = new CadastroFrame(jogo, true);
            cjf.setVisible(true);
            cjf.setLocationRelativeTo(null);
            this.setVisible(false);
        }
    }//GEN-LAST:event_avancarActionPerformed

    private void voltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltaActionPerformed

        InicioFrame inif = new InicioFrame(jogo);
        inif.setVisible(true);
        inif.setLocationRelativeTo(null);
        this.setVisible(false);

    }//GEN-LAST:event_voltaActionPerformed

    private void pesquisarButtumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisarButtumActionPerformed

        if(!pesquisaField.getText().isEmpty()){
            try {
                pesquisaTabela();
            } catch (IOException ex) {
                Logger.getLogger(MostraJogosFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else{
            try {
                inicializaTabela();
            } catch (IOException ex) {
                Logger.getLogger(MostraJogosFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_pesquisarButtumActionPerformed

    private void pesquisaFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisaFieldActionPerformed
        
    }//GEN-LAST:event_pesquisaFieldActionPerformed

    private void pesquisarButtumKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pesquisarButtumKeyTyped
        pesquisarButtumActionPerformed(null);
    }//GEN-LAST:event_pesquisarButtumKeyTyped

    private void avancarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_avancarKeyTyped
        avancarActionPerformed(null);
    }//GEN-LAST:event_avancarKeyTyped

    
    public void inicializaTabela() throws FileNotFoundException, IOException {
    
        dlm.clear();
        int index = 0;
        
        InputStream is = new FileInputStream("cartas.txt");
        InputStreamReader  isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        
        String linha = br.readLine();
        String[] aux;
        int numeroCartas, contador = 1;
        while(linha != null){
            dlm.add(index++, "Jogo " + contador + ": " + linha);
            linha = br.readLine() + "";
            dlm.add(index++, " ");
            numeroCartas = Integer.parseInt(linha);
            for(int i=0; i<numeroCartas; i++){
                
                linha = br.readLine();
                aux = linha.split("&&");
                linha =  "     " + aux[0] + " - " + aux[1] + ", penalidade de " + aux[2] + " shot(s)";
                dlm.add(index++, linha);
            }
            
            dlm.add(index++, "----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            dlm.add(index++, " ");
            contador++;
            linha = br.readLine();
        }           
    }
    
    public boolean pegaCartas(int index) throws FileNotFoundException, IOException{
        List<Carta> c = new ArrayList<>();
        boolean esse = false;
        boolean achou = false;
        
        InputStream is = new FileInputStream("cartas.txt");
        InputStreamReader  isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        
        String linha = br.readLine();
        String[] aux;
        int numeroCartas, contador = 1;
        while(linha != null){
            
            if(contador == index){
                jogo.setNomeDoJogo(linha);
                esse = true;
            }
            
            linha = br.readLine() + ""; 
            numeroCartas = Integer.parseInt(linha);
            for(int i=0; i<numeroCartas; i++){
                
                linha = br.readLine();

                if(esse){
                    achou = true;
                    aux = linha.split("&&");
                    Carta ca = new Carta();
                    ca.setValor(aux[0]);
                    ca.setSignificado(aux[1]);
                    ca.setPenalidade(Integer.parseInt(aux[2] + ""));
                    
                    c.add(ca);
                } 
            }
            esse = false;
            
            linha = br.readLine();
            
            contador++;
        }
        
        jogo.setCartas(c);
        return achou;
    }
    
    public void pesquisaTabela() throws FileNotFoundException, IOException {
    
        dlm.clear();
        int index = 0;
        boolean achouAlgum = false;
        
        String pesquisa = pesquisaField.getText();
        
        InputStream is = new FileInputStream("cartas.txt");
        InputStreamReader  isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        
        String linha = br.readLine();
        String[] aux;
        int numeroCartas, contador = 1;
        while(linha != null){
            if(linha.toLowerCase().contains(pesquisa.toLowerCase())){
                achouAlgum = true;
                dlm.add(index++, "Jogo " + contador + ": " + linha);
                linha = br.readLine() + "";
                dlm.add(index++, " ");
                numeroCartas = Integer.parseInt(linha);
                for(int i=0; i<numeroCartas; i++){

                    linha = br.readLine();
                    aux = linha.split("&&");
                    linha =  "     " + aux[0] + " - " + aux[1] + ", penalidade de " + aux[2] + " shot(s)";
                    dlm.add(index++, linha);
                }

                dlm.add(index++, "----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                dlm.add(index++, " ");
            }
            else{
                linha = br.readLine() + "";
                numeroCartas = Integer.parseInt(linha);
                for(int i=0; i<numeroCartas; i++){

                    linha = br.readLine();
                }

            }
            contador++;
            linha = br.readLine();
        }
        
        if(!achouAlgum){
            dlm.add(0, "Nada encontrado!");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton avancar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField opcaoRegra;
    private javax.swing.JTextField pesquisaField;
    private javax.swing.JButton pesquisarButtum;
    private javax.swing.JButton volta;
    // End of variables declaration//GEN-END:variables
}
