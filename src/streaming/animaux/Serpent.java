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
public class Serpent extends Animal{
    
    @Override
    public void avance() {
       
        if(x%2==0){
            z++;
            x=x-1;      
            
        }
        else{
            z++;
            x++;
        }
    }
        
    @Override
    public String toString(){
       return "Serpent"+" "+super.toString();
    
    }
}
