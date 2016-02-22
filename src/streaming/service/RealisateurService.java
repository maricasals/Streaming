/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import java.util.List;
import streaming.dao.RealisateurDAO;
import streaming.entity.Realisateur;


/**
 *
 * @author admin
 */
public class RealisateurService {
    
    private RealisateurDAO dao= new RealisateurDAO();
    Realisateur l = new Realisateur();

    
    
    
    public void ajouter(Realisateur l){
        dao.ajouter(l);
    }
    
    public void modifier(Realisateur l){
        dao.modifier(l);
    }
    
    public void supprimer(Realisateur l){
        dao.supprimer(l);
    }
    
    public Realisateur rechercheRealisateur(long id){
        return dao.rechercherRealisateurParId(id);
    }
    
    public List<Realisateur> listRealisateur(){
        return dao.listerRealisateurs();
    }
    
}
