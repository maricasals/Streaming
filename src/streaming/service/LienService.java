/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import java.util.List;
import streaming.dao.LienDAO;
import streaming.entity.Lien;

/**
 *
 * @author admin
 */
public class LienService {
    
    private LienDAO dao= new LienDAO();
    Lien l = new Lien();

    
    
    
    public void ajouter(Lien l){
        dao.ajouter(l);
    }
    
    public void modifier(Lien l){
        dao.modifier(l);
    }
    
    public void supprimer(Lien l){
        dao.supprimer(l);
    }
    
    public Lien rechercLien(long id){
        return dao.rechercherLienParId(id);
    }
    
    public List<Lien> listerLiens(){
        return dao.listerLiens();
    }
    
}
