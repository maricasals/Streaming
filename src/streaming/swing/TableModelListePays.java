/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.swing;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import org.springframework.beans.factory.annotation.Autowired;
import streaming.entity.Pays;
import streaming.service.PaysService;

/**
 *
 * @author admin
 */
public class TableModelListePays extends DefaultTableModel{

    @Autowired
    private PaysService paysService;
    private List<Pays> pays = null;
    private int nbPays = 0;
    
    public TableModelListePays() {
        
        String[] titres = new String[]{"ID","Nom"};
        setColumnIdentifiers(titres);        
        pays = paysService.listPays();
        this.nbPays= pays.size();
        

    }

    @Override
    public int getRowCount() {
        return nbPays;
    }

    
    @Override
    public Object getValueAt(int row, int column) {
        
        Pays r = pays.get(row);
        
        if(column==0)
            return r.getId();
        if(column==1)
            return r.getNom();
        return "*****Erreur****";
    }
    
    
    
}
