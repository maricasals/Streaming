/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import streaming.dao.SaisonDAO;
import streaming.entity.Saison;


/**
 *
 * @author admin
 */
@Service
public class SaisonService {
    
    @Autowired
    private SaisonDAO dao;
    
    Saison l = new Saison();

    
    
    
    public void ajouter(Saison l){
        dao.ajouter(l);
    }
    
    public void modifier(Saison l){
        dao.modifier(l);
    }
    
    public void supprimer(Saison l){
        dao.supprimer(l);
    }
    
    public Saison recheSaison(long id){
        return dao.rechercherSaisonParId(id);
    }
    
    public List<Saison> listSaisons(){
        return dao.listerSaisons();
    }
    
}
