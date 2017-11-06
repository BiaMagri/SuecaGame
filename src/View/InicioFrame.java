
package View;

import Model.JogoControl;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class InicioFrame extends javax.swing.JFrame {

    private JogoControl jogo;
    
    public InicioFrame(JogoControl jogo) {
        initComponents();
        this.jogo = jogo;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        iniciar = new javax.swing.JButton();
        reutilizar = new javax.swing.JButton();
        fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iniciar.setBackground(new java.awt.Color(0, 0, 0));
        iniciar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        iniciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/criar_jogo.png"))); // NOI18N
        iniciar.setBorderPainted(false);
        iniciar.setOpaque(false);
        iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarActionPerformed(evt);
            }
        });
        getContentPane().add(iniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 360, 130, 130));

        reutilizar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        reutilizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/reabrir_jojo.png"))); // NOI18N
        reutilizar.setBorderPainted(false);
        reutilizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reutilizarActionPerformed(evt);
            }
        });
        getContentPane().add(reutilizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 360, 130, 130));

        fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/fundo_inicio.png"))); // NOI18N
        getContentPane().add(fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void iniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarActionPerformed
        
        CadastroFrame cf = new CadastroFrame(jogo);
        cf.setVisible(true);
        cf.setLocationRelativeTo(null);
        this.setVisible(false);
        
    }//GEN-LAST:event_iniciarActionPerformed

    private void reutilizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reutilizarActionPerformed
       
        MostraJogosFrame mjf = new MostraJogosFrame(jogo);
        mjf.setVisible(true);
        mjf.setLocationRelativeTo(null);
        this.setVisible(false);
        
    }//GEN-LAST:event_reutilizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fundo;
    private javax.swing.JButton iniciar;
    private javax.swing.JButton reutilizar;
    // End of variables declaration//GEN-END:variables
}
