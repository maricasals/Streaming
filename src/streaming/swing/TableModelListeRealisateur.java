/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.swing;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.swing.table.DefaultTableModel;
import streaming.entity.Realisateur;
import streaming.service.RealisateurService;

/**
 *
 * @author admin
 */
public class TableModelListeRealisateur extends DefaultTableModel{

    
    private List<Realisateur> realisateur = null;
    private int nbReal = 0;
    
    public TableModelListeRealisateur() {
        
        String[] titres = new String[]{"ID","Nom","Prenom"};
        setColumnIdentifiers(titres);        
        
        RealisateurService realisateurService = new RealisateurService();
        realisateur = realisateurService.listRealisateur();
        this.nbReal= realisateur.size();
        

    }

    @Override
    public int getRowCount() {
        return nbReal;
    }

    
    @Override
    public Object getValueAt(int row, int column) {
        
        Realisateur r = realisateur.get(row);
        
        if(column==0)
            return r.getId();
        if(column==1)
            return r.getNom();
        if(column==2)
            return r.getPrenom();
        
        return "*****Erreur****";
    }
    
    
    
}
