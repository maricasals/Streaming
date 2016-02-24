/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import streaming.entity.Film;
import streaming.service.FilmService;
import streaming.service.RealisateurService;

/**
 *
 * @author admin
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "file:/C:\\Users\\admin\\Documents\\NetBeansProjects\\Streaming\\newSpringXMLConfig.xml")
public class RealisateurTest {
    
    
    @Autowired
    private FilmService filmService;
    
    @Test
    public void FilmTestOk(){
        System.out.println(filmService.listFilm());
    }

    
}
