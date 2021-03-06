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
import streaming.entity.Pays;


/**
 *
 * @author admin
 */
@Repository
public class PaysDAO {
    
    public void ajouter(Pays p){
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        em.getTransaction().begin();
        em.persist(p);
        em.getTransaction().commit();
    }
    
    public void modifier(Pays p){
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        em.getTransaction().begin();
        em.merge(p);
        em.getTransaction().commit();
    }
    
    public void supprimer(Pays p){
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        em.getTransaction().begin();
        em.createQuery("DELETE FROM Pays p WHERE p.id="+p.getId()).executeUpdate();
        em.getTransaction().commit();
    }
    
    public List<Pays> listerPays(){
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        
        return em.createQuery("SELECT p FROM Pays p").getResultList();
    }
    
    public Pays rechercherPaysParId(long id){
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        
        return em.find(Pays.class, id);
    }
    
}
