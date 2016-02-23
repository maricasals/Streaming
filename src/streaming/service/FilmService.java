/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import java.util.ArrayList;
import streaming.exception.ExceptionSynopsisNullOuVide;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
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
    
    public List listerParGenre(Long id){
        List<Film> listeFilm = new ArrayList<>();
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        listeFilm=em.createQuery("SELECT f FROM Film f JOIN f.genre g WHERE g.id='"+id+"'").getResultList();
        for (Film f : listeFilm)
                System.out.println(f.getTitre());
        return listeFilm;
    }
    
    public List listerParPays(Long id){
        List<Film> listeFilm = new ArrayList<>();
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        listeFilm=em.createQuery("SELECT f FROM Film f JOIN f.pays p WHERE p.id='"+id+"'").getResultList();
        for (Film f : listeFilm)
            System.out.println(f.getTitre());
        return listeFilm;
    }
        public List listerParTitreOuRealisateur(String s){
            List<Film> listeFilm = new ArrayList<>();
            EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
            listeFilm=em.createQuery("SELECT f FROM Film f JOIN f.createurs r WHERE UPPER(r.nom) LIKE UPPER('%"+s+"%') OR UPPER(r.prenom) LIKE UPPER('%"+s+"%')").getResultList();
            if (listeFilm.size()==0){
                listeFilm=em.createQuery("SELECT f FROM Film f WHERE UPPER(f.titre) LIKE UPPER('%"+s+"%')").getResultList();
            }
            for (Film f : listeFilm)
                System.out.println(f.getTitre());
            return listeFilm;
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
