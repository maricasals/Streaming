/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import streaming.service.SerieService;

/**
 *
 * @author admin
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "file:/C:\\Users\\admin\\Documents\\NetBeansProjects\\Streaming\\newSpringXMLConfig.xml")
public class SerieTest {
    
    @Test
    public void springSerieTest(){
        System.out.println("Test okey");
    }
    
//    @Test
    public void ListerSerieParPaysTest() {
        SerieService ss = new SerieService();
        ss.ListerSeriesParPays(2L);
    }
    
//    @Test
    public void ListerSerieParTitreTest() {
        SerieService ss = new SerieService();
        ss.ListerSeriesParTitre("Dexter");
    }
    

}
