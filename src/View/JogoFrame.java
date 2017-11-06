
package View;

import Model.Carta;
import Model.Jogador;
import Model.JogoControl;
import java.util.List;
import java.util.Random;
import javax.swing.table.DefaultTableModel;
import View.CadastroFrame;
import java.awt.Color;
import java.awt.ScrollPane;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.JTableHeader;

public class JogoFrame extends javax.swing.JFrame{

    JogoControl jogo;
    private List<String> vis;
    private DefaultTableModel dtm;
    private DefaultListModel<String> dlmRegra = new DefaultListModel();
    List<String> auxRegras;
    static int Index;
    static int totalCartas; 
    static int embaralhando; 
    static int reutilizado;
    private int maximoPenalidade;
    private int totalPenalidadeDada;
    
    public JogoFrame(JogoControl jogo) {
        initComponents();
        carta.setIcon(new javax.swing.ImageIcon("C:\\Users\\aluno\\Documents\\NetBeansProjects\\Sueca\\src\\Imagens\\0_0.png"));
        tabelaJogo.getTableHeader().setForeground(Color.white);
        tabelaJogo.getTableHeader().setBackground(Color.black);
        dtm = (DefaultTableModel) tabelaJogo.getModel();
        dlmRegra = (DefaultListModel) listaRegras.getModel();
        auxRegras = new ArrayList<>();
        //dlmRegra.addElement("Nenhuma regra criada!");
        vis = new ArrayList<>();
        this.jogo = jogo;
        Index = -1;
        totalCartas = jogo.getCartas().size();
        embaralhando = 0;
        maximoPenalidade = 0;
        totalPenalidadeDada = 0;
        carregaJogadores();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        next = new javax.swing.JButton();
        penalidade = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaRegras = new javax.swing.JList();
        carta = new javax.swing.JLabel();
        addRegraButtom = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaJogo = new javax.swing.JTable();
        removeRegraButtom = new javax.swing.JButton();
        desobedeceuButtom = new javax.swing.JButton();
        nomeProximo = new javax.swing.JLabel();
        significado = new javax.swing.JLabel();
        mandarBeber = new javax.swing.JButton();
        volta = new javax.swing.JButton();
        fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setSize(new java.awt.Dimension(900, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        next.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        next.setText("Próximo");
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });
        getContentPane().add(next, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 410, 110, 30));

        penalidade.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        penalidade.setForeground(new java.awt.Color(255, 153, 153));
        penalidade.setText("Penalidade");
        penalidade.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        getContentPane().add(penalidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 320, 336, 52));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Regras:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 500, -1, -1));

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setToolTipText("");

        listaRegras.setBackground(new java.awt.Color(0, 0, 0));
        listaRegras.setForeground(new java.awt.Color(255, 255, 255));
        listaRegras.setModel(dlmRegra);
        jScrollPane2.setViewportView(listaRegras);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 520, 470, 150));
        getContentPane().add(carta, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 216, 279));

        addRegraButtom.setText("Adicionar regra");
        addRegraButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addRegraButtomActionPerformed(evt);
            }
        });
        getContentPane().add(addRegraButtom, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 560, 140, -1));

        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));

        tabelaJogo.setBackground(new java.awt.Color(0, 0, 0));
        tabelaJogo.setForeground(new java.awt.Color(255, 255, 255));
        tabelaJogo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Jogador", "Bebidas"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaJogo.setGridColor(new java.awt.Color(0, 0, 0));
        tabelaJogo.setOpaque(false);
        jScrollPane1.setViewportView(tabelaJogo);
        if (tabelaJogo.getColumnModel().getColumnCount() > 0) {
            tabelaJogo.getColumnModel().getColumn(0).setMinWidth(100);
            tabelaJogo.getColumnModel().getColumn(0).setMaxWidth(300);
            tabelaJogo.getColumnModel().getColumn(1).setMinWidth(20);
            tabelaJogo.getColumnModel().getColumn(1).setMaxWidth(100);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 80, 230, 260));

        removeRegraButtom.setText("Excluir regra");
        removeRegraButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeRegraButtomActionPerformed(evt);
            }
        });
        getContentPane().add(removeRegraButtom, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 600, 140, -1));

        desobedeceuButtom.setText("Desobedeceu regra");
        desobedeceuButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desobedeceuButtomActionPerformed(evt);
            }
        });
        getContentPane().add(desobedeceuButtom, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 520, 200, -1));

        nomeProximo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        nomeProximo.setForeground(new java.awt.Color(255, 255, 255));
        nomeProximo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nomeProximo.setText("Jogador");
        getContentPane().add(nomeProximo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 370, 48));

        significado.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        significado.setForeground(new java.awt.Color(255, 255, 255));
        significado.setText("Significado");
        significado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        getContentPane().add(significado, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, 340, 47));

        mandarBeber.setText("Bebeu");
        mandarBeber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mandarBeberActionPerformed(evt);
            }
        });
        getContentPane().add(mandarBeber, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 360, -1, -1));

        volta.setText("Finalizar jogo");
        volta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltaActionPerformed(evt);
            }
        });
        getContentPane().add(volta, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 650, -1, -1));

        fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/jogo_fundo.png"))); // NOI18N
        getContentPane().add(fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
        
        carregaRegras();
        addRegraButtom.setVisible(false);
        removeRegraButtom.setVisible(false);
        significado.setEnabled(true);
        
        if(totalPenalidadeDada != maximoPenalidade){
            JOptionPane.showMessageDialog(rootPane, "Você ainda não seleicinou a quantidade de jogadores para beber!\n" +
                    "Faltam " + (maximoPenalidade - totalPenalidadeDada) + " jogador(es).",  "Erro", JOptionPane.ERROR_MESSAGE);
        }
        else{
            if(embaralhando == 1){
                next.setText("Próximo");
                vis.clear();
                embaralhando = 0;
            }
            Random rand =  new Random();
            int valor = 0, naipe;
            String str = null;
            if(vis.size() == 4*totalCartas){
                carta.setIcon(new javax.swing.ImageIcon("C:\\Users\\aluno\\Documents\\NetBeansProjects\\Sueca\\src\\Imagens\\0_0.png"));
                nomeProximo.setText("Acabou as cartas.");
                next.setText("Embaralhar");
                embaralhando = 1;
            }
            else{

                do {
                   valor = rand.nextInt(jogo.getCartas().size()); 
                   naipe = rand.nextInt(4) + 1;
                   String proximo = jogo.getCartas().get(valor).getValor();
                   
                   if(proximo.equals("A")) proximo = "1";
                   else if(proximo.equals("J")) proximo = "11";
                   else if(proximo.equals("Q")) proximo = "12";
                   else if(proximo.equals("K")) proximo = "13";
                   
                   str = (proximo+"") + "_" + (naipe+"");
 
                } while (vis.contains(str));

                Index++;
                if(Index == jogo.getJogadores().size()) Index=0;
                nomeProximo.setText(jogo.getJogadores().get(Index).getNome());

                String val = jogo.getCartas().get(valor).getValor() + "";
                for(int i=0; i<jogo.getCartas().size(); i++){
                    if(val.equals(jogo.getCartas().get(i).getValor())){
                        significado.setText(jogo.getCartas().get(i).getSignificado());
                        penalidade.setText(jogo.getCartas().get(i).getPenalidade() + "" + " dose(s)");
                        if(!significado.getText().equals("Crie uma regra! (ou exclua uma)")){
                            maximoPenalidade = jogo.getCartas().get(i).getPenalidade();
                        }
                        else{
                            maximoPenalidade = 0;
                        }
                        totalPenalidadeDada = 0;
                        vis.add(str);
                        break;
                    }
                }
                String link = "C:\\Users\\aluno\\Documents\\NetBeansProjects\\Sueca\\src\\Imagens\\" + str + ".png";

                carta.setIcon(new javax.swing.ImageIcon(link));
                
                if(significado.getText().equals("Crie uma regra! (ou exclua uma)")){
                    addRegraButtom.setVisible(true);
                    removeRegraButtom.setVisible(true);
                }
            }
        }
    }//GEN-LAST:event_nextActionPerformed

    private void mandarBeberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mandarBeberActionPerformed
        
        carregaRegras();
        int[] selecionados = tabelaJogo.getSelectedRows();
        int bebidas;
        
        if(selecionados.length + totalPenalidadeDada> maximoPenalidade){
            JOptionPane.showMessageDialog(rootPane, "Você selecionou mas pessoas do que podia.\n É no máximo " + 
                    maximoPenalidade + " jogador(es)", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        else if(totalPenalidadeDada == maximoPenalidade){
            JOptionPane.showMessageDialog(rootPane, "Você já selecionou a quantidade de jogadores que podia!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        else{
            totalPenalidadeDada += selecionados.length;
            for(int i=0; i<selecionados.length; i++){
                bebidas = jogo.getJogadores().get(selecionados[i]).getQuantidadeBebida();
                jogo.getJogadores().get(selecionados[i]).setQuantidadeBebida(bebidas + 1);
                carregaJogadores();
            }
        }
        carregaRegras();
    }//GEN-LAST:event_mandarBeberActionPerformed

    private void voltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltaActionPerformed
        
        jogo.getJogadores().clear();
        InicioFrame inif = new InicioFrame(jogo);
        inif.setVisible(true);
        inif.setLocationRelativeTo(null);
        this.setVisible(false);
        
    }//GEN-LAST:event_voltaActionPerformed

    private void addRegraButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addRegraButtomActionPerformed
        
        String novaRegra = JOptionPane.showInputDialog("Qual a nova regra?");
        novaRegra += ", " + penalidade.getText();
        auxRegras.add(novaRegra);
        carregaRegras();
        listaRegras.setSelectedIndex(-1);
        
        addRegraButtom.setVisible(false);
        removeRegraButtom.setVisible(false);
    }//GEN-LAST:event_addRegraButtomActionPerformed

    private void removeRegraButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeRegraButtomActionPerformed
        
        if(!listaRegras.isSelectionEmpty()){
            int index = listaRegras.getSelectedIndex();
            auxRegras.remove(index);
            carregaRegras();
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "Selecione uma regra!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_removeRegraButtomActionPerformed

    private void desobedeceuButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desobedeceuButtomActionPerformed
        
        String[] valores;
        if(!listaRegras.isSelectionEmpty()){
            int index = listaRegras.getSelectedIndex();
            String regra = dlmRegra.get(index);
            valores = regra.split(", ");
            String penalidade = valores[1].toString();
            valores = penalidade.split(" ");
            penalidade = valores[0];
            System.out.println(penalidade);
            int shot = Integer.parseInt(penalidade);
            maximoPenalidade += shot;
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "Selecione uma regra!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        listaRegras.setSelectedIndex(-1);
    }//GEN-LAST:event_desobedeceuButtomActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
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
            java.util.logging.Logger.getLogger(JogoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JogoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JogoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JogoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

    }
    
    public void carregaJogadores() {
        
        dlmRegra.clear();
        
        while(dtm.getRowCount() > 0){
            dtm.removeRow(0);
        }
        
        for(int i=0; i<jogo.getJogadores().size(); i++){
            dtm.insertRow(dtm.getRowCount(), 
                            new Object[]{
                                jogo.getJogadores().get(i).getNome(),
                                jogo.getJogadores().get(i).getQuantidadeBebida(),
                            });
        }

        addRegraButtom.setVisible(false);
        removeRegraButtom.setVisible(false);
    }
    
    public void carregaRegras(){
        
        dlmRegra.clear();
        
        for(int i=0; i<auxRegras.size(); i++){
            dlmRegra.add(i, auxRegras.get(i));
        }
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addRegraButtom;
    private javax.swing.JLabel carta;
    private javax.swing.JButton desobedeceuButtom;
    private javax.swing.JLabel fundo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList listaRegras;
    private javax.swing.JButton mandarBeber;
    private javax.swing.JButton next;
    private javax.swing.JLabel nomeProximo;
    private javax.swing.JLabel penalidade;
    private javax.swing.JButton removeRegraButtom;
    private javax.swing.JLabel significado;
    private javax.swing.JTable tabelaJogo;
    private javax.swing.JButton volta;
    // End of variables declaration//GEN-END:variables
}
