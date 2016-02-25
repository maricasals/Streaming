/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.swing;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.stereotype.Component;

/**
 *
 * @author admin
 */
@Component
public class JFramePrincipal extends javax.swing.JFrame {
    @Autowired
    JPannelListePays jPannelListePays;
    
    @Autowired
    JPannelListeRealisateur jPannelListeRealisateur;
    
    @Autowired
    JPannelListeGenre jPannelListeGenre;
    /**
     * Creates new form JFramePrincipal
     */
    public JFramePrincipal() {
        initComponents();
    }
    JPanel jpCentral = null;

    private void supprimerJPCentral() {
        if (jpCentral == null) {
            return;
        }
        this.remove(this.jpCentral);
    }

    /**
     *
     */
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        jBFilm = new javax.swing.JButton();
        jBRealisateur = new javax.swing.JButton();
        jBPays = new javax.swing.JButton();
        jBGenre = new javax.swing.JButton();
        jBSerie = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToolBar1.setRollover(true);

        jBFilm.setText("Films");
        jBFilm.setFocusable(false);
        jBFilm.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBFilm.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBFilm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBFilmActionPerformed(evt);
            }
        });
        jToolBar1.add(jBFilm);

        jBRealisateur.setText("Réalisateurs");
        jBRealisateur.setFocusable(false);
        jBRealisateur.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBRealisateur.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBRealisateur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRealisateurActionPerformed(evt);
            }
        });
        jToolBar1.add(jBRealisateur);

        jBPays.setText("Pays");
        jBPays.setFocusable(false);
        jBPays.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBPays.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBPays.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPaysActionPerformed(evt);
            }
        });
        jToolBar1.add(jBPays);

        jBGenre.setText("Genres");
        jBGenre.setFocusable(false);
        jBGenre.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBGenre.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBGenre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGenreActionPerformed(evt);
            }
        });
        jToolBar1.add(jBGenre);

        jBSerie.setText("Séries");
        jBSerie.setFocusable(false);
        jBSerie.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBSerie.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBSerie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSerieActionPerformed(evt);
            }
        });
        jToolBar1.add(jBSerie);

        getContentPane().add(jToolBar1, java.awt.BorderLayout.PAGE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBFilmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBFilmActionPerformed
//        supprimerJPCentral();
//        jpCentral = new JPannelListeFilm();
//        add(jpCentral, BorderLayout.CENTER);
//        repaint();
    }//GEN-LAST:event_jBFilmActionPerformed

    private void jBRealisateurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRealisateurActionPerformed
        supprimerJPCentral();
        jpCentral = jPannelListeRealisateur;
        add(jpCentral, BorderLayout.CENTER);
        repaint();
    }//GEN-LAST:event_jBRealisateurActionPerformed

    private void jBGenreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGenreActionPerformed
        supprimerJPCentral();
        jpCentral = jPannelListeGenre;
        add(jpCentral, BorderLayout.CENTER);
        repaint();
    }//GEN-LAST:event_jBGenreActionPerformed

    private void jBPaysActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPaysActionPerformed
        supprimerJPCentral();
        jpCentral = jPannelListePays;
        add(jpCentral, BorderLayout.CENTER);
        repaint();
    }//GEN-LAST:event_jBPaysActionPerformed

    private void jBSerieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSerieActionPerformed
//        supprimerJPCentral();
//        jpCentral = new JPannelListeSerie();
//        add(jpCentral, BorderLayout.CENTER);
//        repaint();
    }//GEN-LAST:event_jBSerieActionPerformed

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
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFramePrincipal jf = new FileSystemXmlApplicationContext("file:/C:\\Users\\admin\\Documents\\NetBeansProjects\\Streaming\\newSpringXMLConfig.xml").getBean(JFramePrincipal.class);
                jf.setSize(800, 600);
                jf.setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBFilm;
    private javax.swing.JButton jBGenre;
    private javax.swing.JButton jBPays;
    private javax.swing.JButton jBRealisateur;
    private javax.swing.JButton jBSerie;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}
