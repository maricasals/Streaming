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
import streaming.entity.Saison;

/**
 *
 * @author admin
 */
@Repository
public class SaisonDAO {
    
    public void ajouter(Saison s){
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        em.getTransaction().begin();
        em.persist(s);
        em.getTransaction().commit();
    }
    
    public void modifier(Saison s){
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        em.getTransaction().begin();
        em.merge(s);
        em.getTransaction().commit();
    }
    
    public void supprimer(Saison s){
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        em.getTransaction().begin();
        em.createQuery("DELETE FROM Saison s WHERE s.id="+s.getId()).executeUpdate();
        em.getTransaction().commit();
    }
    
    public List<Saison> listerSaisons(){
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        
        return em.createQuery("SELECT s FROM Saison s").getResultList();
    }
    
    public Saison rechercherSaisonParId(long id){
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        
        return em.find(Saison.class, id);
    }
    
}
