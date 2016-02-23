/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import streaming.entity.Realisateur;

/**
 *
 * @author admin
 */
public class RealisateurDAO {
    
    public void ajouter(Realisateur g){
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        em.getTransaction().begin();
        em.persist(g);
        em.getTransaction().commit();
    }
    
    public void modifier(Realisateur g){
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        em.getTransaction().begin();
        em.merge(g);
        em.getTransaction().commit();
    }
    
    public void supprimer(Realisateur g){
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        em.getTransaction().begin();
        em.createQuery("DELETE FROM Realisateur s WHERE s.id="+g.getId()).executeUpdate();
        em.getTransaction().commit();
    }
    
    public List<Realisateur> listerRealisateurs(){
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        
        return em.createQuery("SELECT g FROM Realisateur g").getResultList();
    }
    
    public Realisateur rechercherRealisateurParId(long id){
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        
        return em.find(Realisateur.class, id);
    }
    
}
