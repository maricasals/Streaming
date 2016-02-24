/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import java.util.Collection;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import streaming.dao.SerieDAO;
import streaming.entity.Serie;
import streaming.exeptions.SynopsisVideException;

/**
 *
 * @author admin
 */
@Service
public class SerieService {

    @Autowired
    private SerieDAO dao;
    
    Serie l = new Serie();

    public void ajouter(Serie l) throws SynopsisVideException {
        moderationSynopsis(l);
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
        if (s.getSynopsis() == null || s.getSynopsis().length() == 0) {
            throw new SynopsisVideException();
        }

        if (s.getTitre_serie().contains("ZUT") || s.getSynopsis().contains("ZUT")) {
            s.setTitre_serie(s.getTitre_serie().replaceAll("ZUT", "flute"));
            s.setSynopsis(s.getSynopsis().replaceAll("ZUT", "flute"));
            System.out.println(toString());
        }
    }

    public void ListerSeriesParPays(Long idPays) {
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        Collection<Serie> listSeriesDuPays = em.createQuery("SELECT s FROM Serie s WHERE s.pays.id='" + idPays + "'").getResultList();
        System.out.println(listSeriesDuPays);
    }

    public void ListerSeriesParTitre(String Titre) {
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        Collection<Serie> seriesContenantTitre =  em.createQuery("SELECT s FROM Serie s WHERE UPPER(s.titre_serie) LIKE UPPER('%"+Titre+"%')").getResultList();
//        Collection<Serie> seriesContenantTitre = em.createQuery("SELECT s FROM Serie s WHERE s.titre_serie='"+Titre+"'").getResultList();
        System.out.println(seriesContenantTitre);
    }
}
