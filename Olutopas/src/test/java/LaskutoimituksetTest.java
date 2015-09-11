/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import op.olutopas.Laskutoimitukset;
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
public class LaskutoimituksetTest {
    
    Laskutoimitukset laskut;
    public LaskutoimituksetTest() {
        
    }
    

    
    @Before
    public void setUp() {
        laskut = new Laskutoimitukset();
    }
        @Test
    public void plussaaOikein() {
        int tulos = this.laskut.plussaa(5, 6);
        assertEquals(11, tulos);
    }
    @Test
    public void vahennaOikein() {
        int tulos = this.laskut.miinusta(5, 6);
        assertEquals(-1, tulos);
    }
    @Test
    public void kerroOikein() {
        int tulos = this.laskut.tulo(5, 6);
        assertEquals(30, tulos);
    }
//    @Test
//    public void pii() {
//        double tulos = this.laskut.pii(5, 6);
//        assertEquals(30, tulos);
//    }
    


    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
