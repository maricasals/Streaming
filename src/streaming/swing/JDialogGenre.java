/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.swing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import streaming.entity.Genre;
import streaming.service.GenreService;

/**
 *
 * @author admin
 */
@Component
public class JDialogGenre extends javax.swing.JDialog {
    
    @Autowired
    private GenreService genreService;
    @Autowired
    private JPannelListeGenre jpGenre;

    
    public JPannelListeGenre getJpGenre() {
        return jpGenre;
    }

    /**
     * Creates new form JDialogGenre
     */
    public void setJpGenre(JPannelListeGenre jpGenre) {    
        this.jpGenre = jpGenre;
    }

    public JDialogGenre() {
        setModal(true);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_ID = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jTextField_ID = new javax.swing.JTextField();
        jLabel_Genre = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jTextField_Genre = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jButton_Ajouter = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(3, 3));

        jLabel_ID.setText("ID");
        getContentPane().add(jLabel_ID);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 133, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);

        jTextField_ID.setEditable(false);
        getContentPane().add(jTextField_ID);

        jLabel_Genre.setText("Genre");
        getContentPane().add(jLabel_Genre);
        jLabel_Genre.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 133, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2);
        getContentPane().add(jTextField_Genre);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 133, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 133, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel4);

        jButton_Ajouter.setText("Ajouter");
        jButton_Ajouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_AjouterActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Ajouter);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_AjouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AjouterActionPerformed
        Genre g = new Genre();
        
        g.setNom(jTextField_Genre.getText());
        genreService.ajouter(g);
        
        jpGenre.rafraichirJTableGenre();
        
        this.setVisible(false);
    }//GEN-LAST:event_jButton_AjouterActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Ajouter;
    private javax.swing.JLabel jLabel_Genre;
    private javax.swing.JLabel jLabel_ID;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextField_Genre;
    private javax.swing.JTextField jTextField_ID;
    // End of variables declaration//GEN-END:variables
}
