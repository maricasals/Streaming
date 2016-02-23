/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming;

import org.junit.Test;
import streaming.entity.Film;
import streaming.exception.ExceptionSynopsisNullOuVide;
import streaming.service.FilmService;

/**
 *
 * @author admin
 */


public class TestExceptionSurAjouterFilm {
    private FilmService servicefilm = new FilmService();
    
//    @Test
    public void TestExceptionSurAjouterFilm() throws ExceptionSynopsisNullOuVide{
       
        Film f = new Film();
        f.setSinopsis("yo");
        f.setTitre("aieieieiZUTbdbjdbjZUT");
        servicefilm.ajouter(f);
        
    }
    @Test
    public void testlisterParGenre(){
        
//        servicefilm.listerParGenre(1L);
//        servicefilm.listerParPays(1L);
        servicefilm.listerParTitreOuRealisateur("sin");

    }

}
