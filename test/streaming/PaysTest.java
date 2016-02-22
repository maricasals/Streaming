/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.BeforeClass;
import streaming.entity.Genre;
import streaming.entity.Pays;
import streaming.entity.Realisateur;

/**
 *
 * @author admin
 */
public class PaysTest {
    
    @Test
    public void testTab(){
        int[] monTab = new int [10];       
        
        for (int i = 0; i<monTab.length; i++){
            monTab[i] = i*2;
            System.out.println(monTab[i]);
        }
        
        
            
    }
    
    @BeforeClass
    public static void avantTout(){
        
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        
        // Démarrer trqnsaction
        em.getTransaction().begin();
        
        // Vider toutes les tables
        em.createQuery("DELETE FROM Genre g").executeUpdate();
        em.createQuery("DELETE FROM Pays p").executeUpdate();
        em.createQuery("DELETE FROM Realisateur r").executeUpdate();
        
        // Ajouter des nouveaux gendres
        Genre g1 = new Genre();
        g1.setNom("Animé");
        g1.setId(1L);
        em.persist(g1); // Genère un INSERT en base
        
        Genre g2 = new Genre();
        g2.setNom("Action");
        g2.setId(2L);
        em.persist(g2);
        
        Genre g3 = new Genre();
        g3.setNom("SienceFiction");
        g3.setId(3L);
        em.persist(g3);
        
        // Ajouter des nouveaux pays
        Pays p1 = new Pays();
        p1.setId(1L);
        p1.setNom("France");
        em.persist(p1);
        
        Pays p2 = new Pays();
        p2.setId(2L);
        p2.setNom("USA");
        em.persist(p2);
        
        Pays p3 = new Pays();
        p3.setId(3L);
        p3.setNom("Espagne");
        em.persist(p3);
       
        // Ajouter des realisateurs
        
        Realisateur r1 = new Realisateur();
        r1.setId(1L);
        r1.setNom("Tarantino");
        r1.setPrenom("Quentin");
        em.persist(r1);
        
        Realisateur r2 = new Realisateur();
        r2.setId(2L);
        r2.setNom("Lucas");
        r2.setPrenom("George");
        em.persist(r2);
        
        Realisateur r3 = new Realisateur();
        r3.setId(3L);
        r3.setNom("Almodovar");
        r3.setPrenom("Pedro");
        em.persist(r3);
        
        
        em.getTransaction().commit();
        
    }
    
    @Before
    public void avantChaqueTest(){
                
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        
        // Démarrer trqnsaction
        em.getTransaction().begin();
        
        // Vider toutes les tables
        em.createQuery("DELETE FROM Genre g").executeUpdate();
        em.createQuery("DELETE FROM Pays p").executeUpdate();
        em.createQuery("DELETE FROM Realisateur r").executeUpdate();
        
        // Ajouter des nouveaux gendres
        Genre g1 = new Genre();
        g1.setNom("Animé");
        g1.setId(1L);
        em.persist(g1); // Genère un INSERT en base
        
        Genre g2 = new Genre();
        g2.setNom("Action");
        g2.setId(2L);
        em.persist(g2);
        
        Genre g3 = new Genre();
        g3.setNom("SienceFiction");
        g3.setId(3L);
        em.persist(g3);
        
        // Ajouter des nouveaux pays
        Pays p1 = new Pays();
        p1.setId(1L);
        p1.setNom("France");
        em.persist(p1);
        
        Pays p2 = new Pays();
        p2.setId(2L);
        p2.setNom("USA");
        em.persist(p2);
        
        Pays p3 = new Pays();
        p3.setId(3L);
        p3.setNom("Espagne");
        em.persist(p3);
       
        // Ajouter des realisateurs
        
        Realisateur r1 = new Realisateur();
        r1.setId(1L);
        r1.setNom("Tarantino");
        r1.setPrenom("Quentin");
        em.persist(r1);
        
        Realisateur r2 = new Realisateur();
        r2.setId(2L);
        r2.setNom("Lucas");
        r2.setPrenom("George");
        em.persist(r2);
        
        Realisateur r3 = new Realisateur();
        r3.setId(3L);
        r3.setNom("Almodovar");
        r3.setPrenom("Pedro");
        em.persist(r3);
        
        
        em.getTransaction().commit();
        
    }
    
    @Test
    public void testNull(){
//        Long l1 = null; // ça veut dire PAS de valeur et PAS 0
//        Long l2 = new Long(123); // éaquivalent à écrire 123L. L car on doit caster pour lui faire comprendre que c'est un Long et pas un integer
//        
//        Long l3 = l1 + l2;
        
//        byte b1 = 100;
//        byte b2 = 100;
//        byte b = b1 + b2; // Exercice pour prouver la capacite d'un byte (<127b)

       Integer i = 123;
       String s = Integer.toString(i);
       

//        
        
    }  
    
    
    @Test
    public void checNbTotalPaysEgale3 (){
        
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
             
//        Query query = em.createQuery("SELECT p FROM Pays p");
//        List<Pays> l = query.getResultList();
//        
//        int i = 0;
//        from (int i=0 ; i<l.size; i++){
//        If (i=3){
//        System.out.println("OK");
//    }
       
       int n = em.createQuery("SELECT p FROM Pays p").getResultList().size();
//       Assert.assertEquals(3, n);
        
    
    }
    @Test
    public void test2 (){
        
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        
        Realisateur r = (Realisateur) em.createQuery("SELECT r FROM Realisateur r WHERE r.nom= 'Tarantino'").getSingleResult();
        Assert.assertEquals( 1L, (long)r.getId() );
    }


 
}
