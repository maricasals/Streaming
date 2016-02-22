/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import java.util.List;
import streaming.dao.FilmDAO;
import streaming.entity.Film;


/**
 *
 * @author admin
 */
public class FilmService {
    
    private FilmDAO dao= new FilmDAO();
    Film l = new Film();

    
    
    
    public void ajouter(Film l){
        dao.ajouter(l);
    }
    
    public void modifier(Film l){
        dao.modifier(l);
    }
    
    public void supprimer(Film l){
        dao.supprimer(l);
    }
    
    public Film rechercheFilm(long id){
        return dao.rechercherFilmParId(id);
    }
    
    public List<Film> listFilm(){
        return dao.listerFilms();
    }
    
}
