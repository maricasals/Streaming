/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import streaming.entity.Film;

/**
 *
 * @author admin
 */
public class FilmDAO {
    
    public void ajouter(Film l){
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        em.getTransaction().begin();
        em.persist(l);
        em.getTransaction().commit();
    }
    
    public void modifier(Film l){
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        em.getTransaction().begin();
        em.merge(l);
        em.getTransaction().commit();
    }
    
    public void supprimer(Film l){
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        em.getTransaction().begin();
        em.createQuery("DELETE FROM Film l WHERE l.id="+l.getId()).executeUpdate();
        em.getTransaction().commit();
    }
    
    public List<Film> listerFilms(){
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        
        return em.createQuery("SELECT l FROM Film l").getResultList();
    }
    
    public Film rechercherFilmParId(long id){
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        
        return em.find(Film.class, id);
    }
}
