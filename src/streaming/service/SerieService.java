/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import java.util.List;
import streaming.dao.SerieDAO;
import streaming.entity.Serie;
import streaming.exeptions.SynopsisVideException;

/**
 *
 * @author admin
 */
public class SerieService {

    private SerieDAO dao = new SerieDAO();
    Serie l = new Serie();

    public void ajouter(Serie l) {
        dao.ajouter(l);
    }

    public void modifier(Serie l) {
        dao.modifier(l);
    }

    public void supprimer(Serie l) {
        dao.supprimer(l);
    }

    public Serie rechSerie(long id) {
        return dao.rechercherSerieParId(id);
    }

    public List<Serie>
            listsSeries() {
        return dao.listerSeries();
    }

    public void moderationSynopsis(Serie s) throws SynopsisVideException {
        if (s.getSynopsis() == null || s.getSynopsis().length()==0) {
            throw new SynopsisVideException();
        }
        

        if (s.getTitre_serie().contains("ZUT") || s.getSynopsis().contains("ZUT")){
            s.setTitre_serie(s.getTitre_serie().replaceAll("zut", "flute"));
            s.setSynopsis(s.getSynopsis().replaceAll("zut", "flute"));
            System.out.println(toString());
        }
    }
}
