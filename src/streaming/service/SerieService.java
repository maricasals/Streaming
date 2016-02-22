/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import java.util.List;
import streaming.dao.SerieDAO;
import streaming.entity.Serie;


/**
 *
 * @author admin
 */
public class SerieService {
    
    private SerieDAO dao= new SerieDAO();
    Serie l = new Serie();

    
    
    
    public void ajouter(Serie l){
        dao.ajouter(l);
    }
    
    public void modifier(Serie l){
        dao.modifier(l);
    }
    
    public void supprimer(Serie l){
        dao.supprimer(l);
    }
    
    public Serie rechSerie(long id){
        return dao.rechercherSerieParId(id);
    }
    
    public List<Serie> listsSeries(){
        return dao.listerSeries();
    }
    
}
