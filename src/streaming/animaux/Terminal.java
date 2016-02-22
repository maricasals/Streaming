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
public class Terminal {
    
    private static Terminal instancesUnique = null;
    
    private Terminal(){
        
    }
    
    public static Terminal creationTerminal(){
        
              
        if (instancesUnique==null){
            
            instancesUnique = new Terminal();
            return instancesUnique;    
        }
        else {
            return instancesUnique;  
        }
        
    }
    
}
