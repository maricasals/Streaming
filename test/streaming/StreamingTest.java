/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming;

import java.util.Collection;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;
import streaming.entity.Episode;
import streaming.entity.Film;
import streaming.entity.Genre;
import streaming.entity.Lien;
import streaming.entity.Realisateur;
import streaming.entity.Pays;
import streaming.entity.Saison;
import streaming.entity.Serie;
import streaming.exception.ExceptionSynopsisNullOuVide;
import streaming.exeptions.SynopsisVideException;
import streaming.service.DBService;
import streaming.service.EpisodeService;
import streaming.service.FilmService;
import streaming.service.GenreService;
import streaming.service.LienService;
import streaming.service.PaysService;
import streaming.service.RealisateurService;
import streaming.service.SaisonService;
import streaming.service.SerieService;

/**
 *
 * @author admin
 */
public class StreamingTest {

    private GenreService genreService = new GenreService();
    private PaysService paysService = new PaysService();
    private RealisateurService realisateurService = new RealisateurService();
    private FilmService filmService = new FilmService();
    private SerieService serieService = new SerieService();
    private SaisonService saisonService = new SaisonService();
    private LienService lienService = new LienService();
    private EpisodeService episodeService = new EpisodeService();
    
//    @Before
    public void beforeTest() throws ExceptionSynopsisNullOuVide, SynopsisVideException {
        new DBService().supprimerTout();

        //Creation des Genres
        {
            Genre g = new Genre(1L, "Action");
            genreService.ajouter(g);
        }
        {
            Genre g = new Genre(2L, "Fantastique");
            genreService.ajouter(g);
        }
        {
            Genre g = new Genre(3L, "Policier");
            genreService.ajouter(g);
        }
        {
            Genre g = new Genre(4L, "Romance");
            genreService.ajouter(g);
        }
        {
            Genre g = new Genre(5L, "Animation");
            genreService.ajouter(g);
        }
        {
            Genre g = new Genre(6L, "Comedie");
            genreService.ajouter(g);
        }

        //Creation des Pays
        {
            Pays p = new Pays(1L, "France");
            paysService.ajouter(p);
        }
        
        {
            Pays p = new Pays(2L, "USA");
            paysService.ajouter(p);
        }
        
        {
            Pays p = new Pays(3L, "UK");
            paysService.ajouter(p);
        }
        
        {
            Pays p = new Pays(4L, "Espagne");
            paysService.ajouter(p);
        }
        
        {
            Pays p = new Pays(5L, "Nouvelle-Zélande");
            paysService.ajouter(p);
        }
        
        //Creation des Realisateurs
        {
            Realisateur r = new Realisateur(1L, "COHEN", "Joel");
            realisateurService.ajouter(r);
        }
        
        {
            Realisateur r = new Realisateur(2L, "COHEN", "Ethan");
            realisateurService.ajouter(r);
        }
        
        {
            Realisateur r = new Realisateur(3L, "JACKSON", "Peter");
            realisateurService.ajouter(r);
        }
        
        {
            Realisateur r = new Realisateur(4L, "TARANTINO", "Quentin");
            realisateurService.ajouter(r);
        }
        
        {
            Realisateur r = new Realisateur(5L, "Maïwen", "Nuse");
            realisateurService.ajouter(r);
        }
        
        //Creation des Films
        {
            Genre g = genreService.rechercheGenre(1L);
            Pays p = paysService.recherchePays(2L);
            Film f = new Film(g, p, "Django Unchained", "Bla bla", 2012L);
            
            Realisateur r = realisateurService.rechercheRealisateur(4L);
            f.getCreateurs().add(r);
            
            p.getMes_films().add(f);
            g.getFilms().add(f);
            r.getMes_films().add(f);
                    
            filmService.ajouter(f);
        }
        
        {
            Genre g = genreService.rechercheGenre(1L);
            Pays p = paysService.recherchePays(2L);
            Film f = new Film(g, p, "Kill Bill", "Bla bla", 2003L);
            
            Realisateur r = realisateurService.rechercheRealisateur(4L);
            f.getCreateurs().add(r);
            
            p.getMes_films().add(f);
            g.getFilms().add(f);
            r.getMes_films().add(f);
                    
            filmService.ajouter(f);
        }
        
        {
            Genre g = genreService.rechercheGenre(1L);
            Pays p = paysService.recherchePays(2L);
            Film f = new Film(g, p, "Kill Bill 2", "Bla bla", 2004L);
            
            Realisateur r = realisateurService.rechercheRealisateur(4L);
            f.getCreateurs().add(r);
            
            p.getMes_films().add(f);
            g.getFilms().add(f);
            r.getMes_films().add(f);
                    
            filmService.ajouter(f);
        }
        
        {
            Genre g = genreService.rechercheGenre(1L);
            Pays p = paysService.recherchePays(2L);
            Film f = new Film(g, p, "Jackie Brown", "Bla bla", 1997L);
            
            Realisateur r = realisateurService.rechercheRealisateur(4L);
            f.getCreateurs().add(r);
            
            p.getMes_films().add(f);
            g.getFilms().add(f);
            r.getMes_films().add(f);
                    
            filmService.ajouter(f);
        }
        
        {
            Genre g = genreService.rechercheGenre(2L);
            Pays p = paysService.recherchePays(2L);
            Film f = new Film(g, p, "Sin City", "Bla bla", 2005L);
            
            Realisateur r = realisateurService.rechercheRealisateur(4L);
            f.getCreateurs().add(r);
            
            p.getMes_films().add(f);
            g.getFilms().add(f);
            r.getMes_films().add(f);
                    
            filmService.ajouter(f);
        }
        
        {
            Genre g = genreService.rechercheGenre(2L);
            Pays p = paysService.recherchePays(5L);
            Film f = new Film(g, p, "Bad Taste", "Bla bla", 1987L);
            
            Realisateur r = realisateurService.rechercheRealisateur(3L);
            f.getCreateurs().add(r);
            
            p.getMes_films().add(f);
            g.getFilms().add(f);
            r.getMes_films().add(f);
                    
            filmService.ajouter(f);
        }
        
        {
            Genre g = genreService.rechercheGenre(2L);
            Pays p = paysService.recherchePays(5L);
            Film f = new Film(g, p, "Braindead", "Bla bla", 1992L);
            
            Realisateur r = realisateurService.rechercheRealisateur(3L);
            f.getCreateurs().add(r);
            
            p.getMes_films().add(f);
            g.getFilms().add(f);
            r.getMes_films().add(f);
                    
            filmService.ajouter(f);
        }
        
        {
            Genre g = genreService.rechercheGenre(2L);
            Pays p = paysService.recherchePays(5L);
            Film f = new Film(g, p, "Le Hobbit", "Bla bla", 2015L);
            
            Realisateur r = realisateurService.rechercheRealisateur(3L);
            f.getCreateurs().add(r);
            
            p.getMes_films().add(f);
            g.getFilms().add(f);
            r.getMes_films().add(f);
                    
            filmService.ajouter(f);
        }
        
        {
            Genre g = genreService.rechercheGenre(3L);
            Pays p = paysService.recherchePays(1L);
            Film f = new Film(g, p, "Polisse", "Bla bla", 2011L);
            
            Realisateur r = realisateurService.rechercheRealisateur(5L);
            f.getCreateurs().add(r);
            
            p.getMes_films().add(f);
            g.getFilms().add(f);
            r.getMes_films().add(f);
                    
            filmService.ajouter(f);
        }
        
        {
            Genre g = genreService.rechercheGenre(6L);
            Pays p = paysService.recherchePays(2L);
            Film f = new Film(g, p, "Big Lebowski", "Bla bla", 1998L);
            
            Realisateur r = realisateurService.rechercheRealisateur(1L);
            f.getCreateurs().add(r);
            Realisateur r2 = realisateurService.rechercheRealisateur(2L);
            f.getCreateurs().add(r2);
            
            p.getMes_films().add(f);
            g.getFilms().add(f);
            r.getMes_films().add(f);
            r2.getMes_films().add(f);
                    
            filmService.ajouter(f);
        }
        
        {
            Genre g = genreService.rechercheGenre(6L);
            Pays p = paysService.recherchePays(2L);
            Film f = new Film(g, p, "Avec Cesar", "Bla bla", 2016L);
            
            Realisateur r = realisateurService.rechercheRealisateur(1L);
            f.getCreateurs().add(r);
            Realisateur r2 = realisateurService.rechercheRealisateur(2L);
            f.getCreateurs().add(r2);
            
            p.getMes_films().add(f);
            g.getFilms().add(f);
            r.getMes_films().add(f);
            r2.getMes_films().add(f);
                    
            filmService.ajouter(f);
        }
    {
            Pays p = paysService.recherchePays(2L);
            Serie serie = new Serie(1L,"Dexter","blablab",p);
            serieService.ajouter(serie);
            for(Long i=1L;i<9;i++){ //9 ou %9L
                Saison s = new Saison(i,i,serie);
                saisonService.ajouter(s);
                serie.getSaisons().add(s);
                for(Long j=1L;j<i+1;j++){
                    Episode e = new Episode(null,j,"titre",s);
                    s.getEpisodes().add(e);
                    episodeService.ajouter(e);
                    for(Long k=1L; k<i+1; k++){
                        Lien l = new Lien(null,"url",e);
                        lienService.ajouter(l);
                        e.getEpisodeLien().add(l);
                    }
                }
            }
    }
}
          


    @Test
    public void dbsTest() {
//        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
//        Genre g = new Genre();
//        System.out.println(em.createQuery("SELECT g FROM Genre g").getResultList());
    }
    
//    @Test
    public void recupererFilmTest() {
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        
        Genre g = em.find(Genre.class, 1L);
        for(Film monFilm : g.getFilms()){
            System.out.println(monFilm);
        }
    }
    
//    @Test
    public void orderByTest() {
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
//        System.out.println(em.createQuery("SELECT g FROM Genre g ORDER BY f ASC").getResultList());
        Collection<Film> mesFilmsOrdonees = em.createQuery("SELECT f FROM Film f ORDER BY f ASC").getResultList();
    }
    
//    @Test
    public void genreTest() {
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        Collection<Genre> genres = em.createQuery("SELECT g FROM Genre g").getResultList();
        
        Assert.assertEquals(6, genres.size());
        
        //Contar cuantos de un genero
        Long nbGenres = (Long) em.createQuery("SELECT COUNT(g) FROM Genre g").getSingleResult();
        Assert.assertTrue(nbGenres==6L);
    }
    
//    @Test
    public void listerTousLesFilmsFrancais(){
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        Collection<Film> filmsFrancais = em.createQuery("SELECT f FROM Film f JOIN f.pays p WHERE p.nom='France'").getResultList();
        System.out.println(filmsFrancais);
    }
    
//    @Test
    public void listerFilmsFantasticsParOrdreAlfabetiaue(){
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        Collection<Film> filmsFrancais = em.createQuery("SELECT f FROM Film f JOIN f.genre g WHERE g.nom='Fantastique' ORDER BY f.titre ASC").getResultList();
        System.out.println(filmsFrancais);
    }
    
//    @Test
    public void listerFilmsFantasticsParOrdreAlfabetiaueSansJoin(){
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        Collection<Film> filmsFrancais = em.createQuery("SELECT f FROM Film f WHERE f.genre.nom='Fantastique' ORDER BY f.titre ASC").getResultList();
        System.out.println(filmsFrancais);
    }
    
//    @Test
    public void req6 (){
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        Collection<Film> filmsCohen = em.createQuery("SELECT f FROM Film f JOIN f.createurs c WHERE c.nom='COHEN' AND c.prenom='Ethan'AND f.genre.nom = 'Action' ORDER BY f.anneeProd DESC").getResultList();
        System.out.println(filmsCohen);
    }
    
//    @Test
    public void req7 (){
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        Collection<Film> filmsAutresQueAction = em.createQuery("SELECT f FROM Film f WHERE f.genre.nom != 'Action'").getResultList();
        System.out.println(filmsAutresQueAction);
    }
    
//    @Test
    public void req8 (){
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        Collection<Film> filmsAutresQueAction = em.createQuery("SELECT f FROM Film f WHERE f.genre.nom != 'Fantastiques' AND f.pays.nom='Nouvelle-Zélande'").getResultList();
        System.out.println(filmsAutresQueAction);
    }
    
//    @Test
    public void req9 (){
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        Object numFilms = em.createQuery("SELECT COUNT(f) FROM Film f JOIN f.createurs c WHERE c.nom = 'JACKSON' AND f.genre.nom = 'Fantastique' AND f.pays.nom='Nouvelle-Zélande'").getSingleResult();
        System.out.println(numFilms);
    }
    
//    @Test
    public void req10 (){
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        Collection<Film> filmsAutresQueActionCohen = em.createQuery("SELECT f FROM Film f JOIN f.createurs c WHERE  c.id=1L INTERSECT SELECT f FROM Film f JOIN f.createurs c WHERE  c.id=2L").getResultList();
        System.out.println(filmsAutresQueActionCohen);
    }
    
//    @Test
    public void req10_2 (){
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        Collection<Film> filmsAutresQueActionCohen = em.createQuery("SELECT f FROM Film f JOIN f.createurs c WHERE  c.nom='COHEN' AND c.prenom='Joel' INTERSECT SELECT f FROM Film f JOIN f.createurs c WHERE  c.nom='COHEN' AND c.prenom='Ethan'").getResultList();
        System.out.println(filmsAutresQueActionCohen);
    }
    
//    @Test
    public void req10bis (){
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        Collection<Film> filmsAutresQueActionCohen = em.createQuery("SELECT f FROM Film f WHERE f.id IN"
                +"(SELECT f1.id FROM Film f1 JOIN f1.createurs c WHERE c.nom='COHEN' AND c.prenom='Ethan') AND f.id IN "
                + "(SELECT f2.id FROM Film f2 JOIN f2.createurs c WHERE c.nom='COHEN' AND c.prenom='Joel')").getResultList();
        System.out.println(filmsAutresQueActionCohen);
    }
    
//    @Test
    public void req11(){
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        Object filmsPlusAncien = em.createQuery("SELECT MIN(f.anneeProd) FROM Film f JOIN f.createurs c WHERE c.nom='JACKSON' AND c.prenom='Peter'").getSingleResult();
        System.out.println(filmsPlusAncien);
    }
    
//    @Test
    public void req12(){
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        Double moyen = (Double) em.createQuery("SELECT AVG(f.anneeProd) FROM Film f").getSingleResult();
        System.out.println(moyen);
    }
    
//    @Test
    public void req13(){
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        Collection<Film> filmsAutresQueActionCohen = em.createQuery("SELECT, c COUNT(f) AS total FROM  ").getResultList();
        System.out.println(filmsAutresQueActionCohen);
    }
//yoooo

}
