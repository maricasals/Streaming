/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.swing;

import javax.swing.JDialog;
import streaming.entity.Pays;
import streaming.service.PaysService;

/**
 *
 * @author admin
 */
public class JPannelListePays extends javax.swing.JPanel {

    /**
     * Creates new form JPannelListeFilm
     */
    public JPannelListePays() {
        initComponents();
        rafraichirJTable();
    }
    
    public void rafraichirJTable(){
        jtPays.setModel(new TableModelListePays());
        jtPays.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        jBNouveauRealisateur = new javax.swing.JButton();
        jBSupprimer = new javax.swing.JButton();
        jtPayss = new javax.swing.JScrollPane();
        jtPays = new javax.swing.JTable();

        setLayout(new java.awt.BorderLayout());

        jToolBar1.setRollover(true);

        jBNouveauRealisateur.setText("Nouveau Pays");
        jBNouveauRealisateur.setFocusable(false);
        jBNouveauRealisateur.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBNouveauRealisateur.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBNouveauRealisateur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNouveauRealisateurActionPerformed(evt);
            }
        });
        jToolBar1.add(jBNouveauRealisateur);

        jBSupprimer.setText("Supprimer");
        jBSupprimer.setFocusable(false);
        jBSupprimer.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBSupprimer.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBSupprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSupprimerActionPerformed(evt);
            }
        });
        jToolBar1.add(jBSupprimer);

        add(jToolBar1, java.awt.BorderLayout.NORTH);

        jtPays.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jtPayss.setViewportView(jtPays);

        add(jtPayss, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jBNouveauRealisateurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNouveauRealisateurActionPerformed
        JDialog dial = new JDialogPays(null, true, this);
        dial.setVisible(true);
    }//GEN-LAST:event_jBNouveauRealisateurActionPerformed

    private void jBSupprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSupprimerActionPerformed
        int i=jtPays.getSelectedRow();
        if(i==-1)
            return;
        
        Long l = (Long) jtPays.getModel().getValueAt(i, 0);
        PaysService paysService = new PaysService();
        Pays r = paysService.recherchePays(l);
        paysService.supprimer(r);
        this.rafraichirJTable();
        
        
//        EntityManager em  = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
//        em.getTransaction().begin();
//        em.createQuery("DELETE FROM Realisateur r WHERE r.id=" + l).executeUpdate();
//        em.getTransaction().commit();

    }//GEN-LAST:event_jBSupprimerActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBNouveauRealisateur;
    private javax.swing.JButton jBSupprimer;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTable jtPays;
    private javax.swing.JScrollPane jtPayss;
    // End of variables declaration//GEN-END:variables
}
