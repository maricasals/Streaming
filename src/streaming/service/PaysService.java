/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import java.util.List;
import streaming.dao.PaysDAO;
import streaming.entity.Pays;


/**
 *
 * @author admin
 */
public class PaysService {
    
    private PaysDAO dao= new PaysDAO();
    Pays l = new Pays();

    
    
    
    public void ajouter(Pays l){
        dao.ajouter(l);
    }
    
    public void modifier(Pays l){
        dao.modifier(l);
    }
    
    public void supprimer(Pays l){
        dao.supprimer(l);
    }
    
    public Pays recherchePays(long id){
        return dao.rechercherPaysParId(id);
    }
    
    public List<Pays> listPays(){
        return dao.listerPays();
    }
    
}
