/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import java.util.List;
import streaming.dao.EpisodeDAO;
import streaming.entity.Episode;


/**
 *
 * @author admin
 */
public class EpisodeService {
    
    private EpisodeDAO dao= new EpisodeDAO();
    Episode l = new Episode();

    
    
    
    public void ajouter(Episode l){
        dao.ajouter(l);
    }
    
    public void modifier(Episode l){
        dao.modifier(l);
    }
    
    public void supprimer(Episode l){
        dao.supprimer(l);
    }
    
    public Episode recheEpisode(long id){
        return dao.rechercherEpisodeParId(id);
    }
    
    public List<Episode> listeEpisodes(){
        return dao.listerEpisodes();
    }
    
}
