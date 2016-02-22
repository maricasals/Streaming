/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming;

import javax.persistence.Persistence;
import org.junit.Test;

/**
 *
 * @author admin
 */
public class ObjetTest {

    @Test
    public void testRelations() {

        Persistence.createEntityManagerFactory("StreamingPU");
    }
//   @Test
//   public void test1(){
//       
//       Animal a = new Animal();
//       
//       System.out.println(Animal.getNbInstances());
//       
//       System.out.println(a.toString()); // Si la funtintion n'est pas implemanter alors affiche la Classe et le type de l'objet
//       System.out.println(a.position());
//       System.out.println(a);
//       a.avance();
//       System.out.println(a);
//       a.avance(1,7);
//       System.out.println(a);
//       a.recule();
//       System.out.println(a);
//       a.recule(1,5);
//       System.out.println(a);

//    @Test
//    public void testPoisson(){
//    
//    Poisson p = new Poisson();
//    
//    p.avance();
//    System.out.println(p); 
//    }
//    
//    @Test
//    public void testOiseau(){
//    
//    Oiseau o = new Oiseau();
//    
//    o.avance();
//    System.out.println(o); 
//    }
//    
//    @Test
//    public void testSerpent(){
//    
//    Serpent s = new Serpent();
//    
//    s.avance();
//    System.out.println(s);
//    }
//    
//    @Test
//    public void testTableauxAnimal(){
//    
//    Animal[] tab = new Animal[5];
//    
//    tab[0] = new Poisson();
//    tab[1] = new Poisson();
//    tab[2] = new Oiseau();
//    tab[3] = new Serpent();
//    tab[4] = new Serpent();
//    
//    tab[0].avance();
//    tab[4].avance();
//    
//    for (int i=0; i<tab.length; i++ ){
//        tab[i].avance();
//        System.out.println(tab[i]);
//    }
//    
//    for (Animal a : tab){
//        a.avance();        
////    @Test
//    public void testListEnsemble() {
//        
//        TypeUtil tu = TypeUtil.MODERATEUR;
//        
//        if(tu==TypeUtil.MODERATEUR){
//            
//            System.err.println("Moderateur");
//            
//        }
//        
//    }
//    @Test
//    public void testListEnsemble() {
//
//        List l = new List();
//        l.ajouter("123");
//        l.ajouter("123");
//        l.ajouter("123");
//        l.ajouter("123");
//        l.ajouter("123");
//        System.out.println("Liste:"+" "+l.getObjet(0));
//        System.out.println("Liste:"+" "+l.getObjet(1));
//        System.out.println("Liste:"+" "+l.getObjet(2));
//        System.out.println("Liste:"+" "+l.getObjet(3));
//        System.out.println("Liste:"+" "+l.getObjet(4));
//        
//        l.afficher();
//        
//        Ensemble e = new Ensemble();
//        e.ajouter("321");
//        e.ajouter("321");
//        e.ajouter("321");
//        e.ajouter("321");
//        e.ajouter("321");
//        System.out.println("Ensemble:"+" "+e.getObjet(0));
//        System.out.println("Ensemble:"+" "+e.getObjet(1));
//        System.out.println("Ensemble:"+" "+e.getObjet(2));
//        System.out.println("Ensemble:"+" "+e.getObjet(3));
//        System.out.println("Ensemble:"+" "+e.getObjet(4));
//        
//        e.afficher();
//  
//
//    }
}
