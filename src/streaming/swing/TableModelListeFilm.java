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
import streaming.entity.Film;
import streaming.service.FilmService;

/**
 *
 * @author admin
 */
public class TableModelListeFilm extends DefaultTableModel{

    @Autowired
    FilmService filmService;
    
    private List<Film> film = null;
    private int nbReal = 0;
    
    public TableModelListeFilm() {
        
        String[] titres = new String[]{"ID","Annee","Titre","Genre","Pays","Realisateur","Lien"};
        setColumnIdentifiers(titres);        
        
        film = filmService.listFilm();
        this.nbReal= film.size();
        

    }

    @Override
    public int getRowCount() {
        return nbReal;
    }

    
    @Override
    public Object getValueAt(int row, int column) {
        
        Film f = film.get(row);
        
        if(column==0)
            return f.getId();
        if(column==1)
            return f.getAnneeProd();
        if(column==2)
            return f.getTitre();
        if(column==3)
            return f.getGenre().toString();
        if(column==4)
            return f.getPays();
        if(column==5)
            return f.getCreateurs();
        if(column==6)
            return f.getLiens();
        
        return "*****Erreur****";
    }
    
    
    
}
