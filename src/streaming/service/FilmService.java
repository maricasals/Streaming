/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import streaming.exception.ExceptionSynopsisNullOuVide;
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

    
    
    public void ajouter(Film l) throws ExceptionSynopsisNullOuVide{
        if (l.getSinopsis().equals(null) || l.getSinopsis().equals("")){
            throw new ExceptionSynopsisNullOuVide();
        }
        String s1 ="ZUT";
        String s2 = "***FLUTE***";
        if (l.getTitre().contains(s1) || l.getSinopsis().contains(s1)){
            l.setTitre(l.getTitre().replaceAll(s1, s2));
            System.out.println(l.getTitre());
            
        }
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
