/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import org.springframework.stereotype.Repository;
import streaming.entity.Genre;

/**
 *
 * @author admin
 */
@Repository
public class GenreDAO {
    
    public void ajouter(Genre g){
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        em.getTransaction().begin();
        em.persist(g);
        em.getTransaction().commit();
    }
    
    public void modifier(Genre g){
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        em.getTransaction().begin();
        em.merge(g);
        em.getTransaction().commit();
    }
    
    public void supprimer(Genre g){
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        em.getTransaction().begin();
        em.createQuery("DELETE FROM Genre s WHERE s.id="+g.getId()).executeUpdate();
        em.getTransaction().commit();
    }
    
    public List<Genre> listerGenres(){
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        
        return em.createQuery("SELECT g FROM Genre g").getResultList();
    }
    
    public Genre rechercherGenreParId(long id){
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        
        return em.find(Genre.class, id);
    }
    
}
