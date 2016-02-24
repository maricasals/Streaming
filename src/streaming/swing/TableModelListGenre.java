/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.swing;

import java.util.List;
import streaming.entity.Genre;
import streaming.service.GenreService;
import javax.swing.table.DefaultTableModel;
import org.springframework.beans.factory.annotation.Autowired;
/**
 *
 * @author admin
 */
public class TableModelListGenre extends DefaultTableModel{
    
    private List<Genre> genres = null;
    private int nbReal = 0;
    
    @Autowired
    private GenreService gs;
    
    public TableModelListGenre() {
        
        String[] titres = new String[]{"ID","Genre"};
        setColumnIdentifiers(titres);        
    
        genres = gs.listGenres();
        nbReal = genres.size();
        
    }
    

    @Override
    public Object getValueAt(int row, int column) {
        Genre g = genres.get(row);
        
        if(column==0)
            return g.getId();
        if(column==1)
            return g.getNom();
    
        return "******Erreur*********";
    }

    @Override
    public String getColumnName(int column) {
        
        if(column==0)
            return "ID";
        if(column==1)
            return "Genre";
    
        return "******Erreur*********";
        
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public int getRowCount() {
        return nbReal;
    }
}
