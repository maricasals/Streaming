/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.swing;

/**
 *
 * @author admin
 */
public class JPannelListeEpisode extends javax.swing.JPanel {

    /**
     * Creates new form JPannelListeFilm
     */
    public JPannelListeEpisode() {
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

        jToolBar1 = new javax.swing.JToolBar();
        jBNouveauFilm = new javax.swing.JButton();
        jBSupprimer = new javax.swing.JButton();
        jtFilms = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setLayout(new java.awt.BorderLayout());

        jToolBar1.setRollover(true);

        jBNouveauFilm.setText(" Nouveau Film");
        jBNouveauFilm.setFocusable(false);
        jBNouveauFilm.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBNouveauFilm.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jBNouveauFilm);

        jBSupprimer.setText("Supprimer");
        jBSupprimer.setFocusable(false);
        jBSupprimer.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBSupprimer.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jBSupprimer);

        add(jToolBar1, java.awt.BorderLayout.NORTH);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jtFilms.setViewportView(jTable1);

        add(jtFilms, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBNouveauFilm;
    private javax.swing.JButton jBSupprimer;
    private javax.swing.JTable jTable1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JScrollPane jtFilms;
    // End of variables declaration//GEN-END:variables
}
