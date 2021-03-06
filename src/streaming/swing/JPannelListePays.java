/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.swing;

import javax.swing.JDialog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import streaming.entity.Pays;
import streaming.service.PaysService;

/**
 *
 * @author admin
 */
@Component
public class JPannelListePays extends javax.swing.JPanel {
    @Autowired
    JDialogPays jDialogPays;
    @Autowired
    PaysService paysService;
    @Autowired
    TableModelListePays tableModelListePays;
    
    /**
     * Creates new form JPannelListeFilm
     */
    public JPannelListePays() {
        initComponents();
//        rafraichirJTable();
    }
    
    public void rafraichirJTable(){
        jtPays.setModel(tableModelListePays);
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
        jBNouveauPays = new javax.swing.JButton();
        jBSupprimer = new javax.swing.JButton();
        jtPayss = new javax.swing.JScrollPane();
        jtPays = new javax.swing.JTable();

        setLayout(new java.awt.BorderLayout());

        jToolBar1.setRollover(true);

        jBNouveauPays.setText("Nouveau Pays");
        jBNouveauPays.setFocusable(false);
        jBNouveauPays.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBNouveauPays.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBNouveauPays.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNouveauPaysActionPerformed(evt);
            }
        });
        jToolBar1.add(jBNouveauPays);

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

    private void jBNouveauPaysActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNouveauPaysActionPerformed
        jDialogPays.setModal(true);
        jDialogPays.setJpPays(this);
        jDialogPays.setVisible(true);
    }//GEN-LAST:event_jBNouveauPaysActionPerformed

    private void jBSupprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSupprimerActionPerformed
        int i=jtPays.getSelectedRow();
        if(i==-1)
            return;
        
        Long l = (Long) jtPays.getModel().getValueAt(i, 0);
        
        Pays r = paysService.recherchePays(l);
        paysService.supprimer(r);
        this.rafraichirJTable();
        
        
//        EntityManager em  = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
//        em.getTransaction().begin();
//        em.createQuery("DELETE FROM Realisateur r WHERE r.id=" + l).executeUpdate();
//        em.getTransaction().commit();

    }//GEN-LAST:event_jBSupprimerActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBNouveauPays;
    private javax.swing.JButton jBSupprimer;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTable jtPays;
    private javax.swing.JScrollPane jtPayss;
    // End of variables declaration//GEN-END:variables
}
