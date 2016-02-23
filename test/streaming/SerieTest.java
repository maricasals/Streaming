/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming;

import org.junit.Test;
import streaming.service.SerieService;

/**
 *
 * @author admin
 */
public class SerieTest {
    
//    @Test
    public void ListerSerieParPaysTest() {
        SerieService ss = new SerieService();
        ss.ListerSeriesParPays(2L);
    }
    
    @Test
    public void ListerSerieParTitreTest() {
        SerieService ss = new SerieService();
        ss.ListerSeriesParTitre("Dexter");
    }
    

}
