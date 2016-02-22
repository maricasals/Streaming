/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.interfaces;

/**
 *
 * @author admin
 */
public class List implements Collection, Affichable{
    
    int nbElement = 0;
    Object[] tabObjets =  new Object[10];

    @Override
    public void ajouter(Object o) {
        tabObjets[nbElement]=o;
        nbElement++;
    }

    @Override
    public int taille() {
        return nbElement;
    }

    @Override
    public Object getObjet(int i) {
        return tabObjets[i];
    }

    @Override
    public void afficher() {
        
        for(int i=0;i<taille();i++){
            
            System.out.println( tabObjets[i] );
        }
    }
    
    
    
    
}
