/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming;

import org.junit.Test;
import streaming.entity.Serie;
import streaming.exeptions.SynopsisVideException;
import streaming.service.SerieService;

/**
 *
 * @author admin
 */


public class TestExceptionSurAjouterSerie {
    private SerieService serieService = new SerieService();
    
    @Test
    public void TestExceptionSurAjouterSerie() throws SynopsisVideException{
        
        Serie s = new Serie("FriendsZUT", "Bla bla blaZUT");
        Serie s2 = new Serie("BigBangTheory", "Bla bla blaZUT");
        Serie s3 = new Serie("Game of ZUT", "Bla bla");
        serieService.ajouter(s);
        serieService.ajouter(s2);
        serieService.ajouter(s3);
        
    }

}
