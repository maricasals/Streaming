/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.animaux;

/**
 *
 * @author admin
 */
abstract public class Animal {
    
    private static int nbInstances;
    protected int x=0, y=0, z=0;
    private int i=0;

    public Animal() {
        nbInstances++; // nbInstances = nbInstances +1
    }
    
    public static int getNbInstances(){
        return(nbInstances);
    }
        
   abstract public void avance();
   
   public void avance(int pas){
       for (int i=0; i<pas; i++){
           this.avance();
       }
   }

    
//    abstract public void avance(int nbPasX, int nbPasY, int nbPasZ){
//        this.x=this.x+nbPasX;
//        this.y=this.y+nbPasY;
//        this.z=this.z+nbPasZ;
//        System.out.println("Avance:");
//       }  
    
    
//    public void recule(){
//        this.x=this.x-1;
//        this.y=this.y-1;
//        this.z=this.z-1;
//       } 
//    
//    public void recule(int nbPasX, int nbPasY){
//        this.x=this.x-nbPasX;
//        this.y=this.y-nbPasY;
//       } 
    
    public String position(){
        
        return (Integer.toString(x)+" "+Integer.toString(y)+" "+Integer.toString(z));
    }
    
    @Override
    public String toString(){
        return this.getClass()+" "+position();
    }
    
    // Constructeur
//    public Animal(){   
//        System.out.println("Animal()");
//    }

    
//    public Animal (int p){
//        System.out.println("Animal(int p)");
//    }
//    
//    public Animal(String nom){
//        this(); // Requette pour appeler le constructeur presedent
//        System.out.println("Animal(String nom)");
   
}
