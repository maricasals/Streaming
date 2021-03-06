/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import streaming.dao.GenreDAO;
import streaming.entity.Genre;


/**
 *
 * @author admin
 */
@Service
public class GenreService {
    
    @Autowired
    private GenreDAO dao;
    
    Genre l = new Genre();

    
    
    
    public void ajouter(Genre l){
        dao.ajouter(l);
    }
    
    public void modifier(Genre l){
        dao.modifier(l);
    }
    
    public void supprimer(Genre l){
        dao.supprimer(l);
    }
    
    public Genre rechercheGenre(long id){
        return dao.rechercherGenreParId(id);
    }
    
    public List<Genre> listGenres(){
        return dao.listerGenres();
    }
    
}
