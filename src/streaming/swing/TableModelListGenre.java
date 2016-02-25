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
import org.springframework.stereotype.Component;
/**
 *
 * @author admin
 */
@Component
public class TableModelListGenre extends DefaultTableModel{
    @Autowired
    private GenreService genreService;
    
    private List<Genre> genres = null;
    private int nbGenre = 0;
    
    
    public TableModelListGenre() {
        
        String[] titres = new String[]{"ID","Genre"};
        setColumnIdentifiers(titres);        
    
//        genres = genreService.listGenres();
//        nbGenre = genres.size();
        
    }
    @Override
    public int getRowCount() {
        return nbGenre;
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

}
