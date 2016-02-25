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
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import streaming.entity.Realisateur;
import streaming.service.RealisateurService;

/**
 *
 * @author admin
 */
@Component
public class TableModelListeRealisateur extends DefaultTableModel{

    
    private List<Realisateur> realisateur = null;
    private int nbReal = 0;
    
    @Autowired
    private RealisateurService realisateurService;
    
    public TableModelListeRealisateur() {
        
        String[] titres = new String[]{"ID","Nom","Prenom"};
        setColumnIdentifiers(titres);        
        
//        realisateur = realisateurService.listRealisateur();
//        this.nbReal= realisateur.size();

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
