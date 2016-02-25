/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.swing;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import streaming.entity.Serie;
import streaming.service.SerieService;

/**
 *
 * @author admin
 */
@Component
public class TableModelListeSerie extends DefaultTableModel{

    
    private List<Serie> serie = null;
    private int nbSerie = 0;
    
    @Autowired
    SerieService serieService;
    
    public TableModelListeSerie() {
        
        String[] titres = new String[]{"ID","Titre","Pays","Synopsis","Saisons"};
        setColumnIdentifiers(titres);        
        
//        serie = serieService.listsSeries();
//        this.nbSerie= serie.size();
        

    }

    @Override
    public int getRowCount() {
        return nbSerie;
    }

    
    @Override
    public Object getValueAt(int row, int column) {
        
        Serie r = serie.get(row);
        
        if(column==0)
            return r.getId();
        if(column==1)
            return r.getTitre_serie();
        if(column==2)
            return r.getPays();
        if(column==3)   
            return r.getSynopsis();
        if(column==3)   
            return r.getSaisons();
        
        return "*****Erreur****";
    }
    
    
    
}
