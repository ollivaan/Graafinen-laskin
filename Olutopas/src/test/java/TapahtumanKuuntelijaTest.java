/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import op.olutopas.GraafinenLaskin;
import op.olutopas.TapahtumanKuuntelija;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author ollivaan
 */

public class TapahtumanKuuntelijaTest {
    
    TapahtumanKuuntelija tapahtumankuuntelija;
    
    public TapahtumanKuuntelijaTest() {
    }
    
    @Before
    public void setUp() {

    }
    

    
    @After
    public void tearDown() {
    }
    
    @Test
    public double tyhjennaNappainOikein() {
        double arvo = 3.0;
        assertEquals(3.0,tapahtumankuuntelija.tyhjennaNappain(arvo));
        return 0;
    }


}
