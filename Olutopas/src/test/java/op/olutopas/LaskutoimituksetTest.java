
package op.olutopas;
import op.olutopas.Laskutoimitukset;
import op.olutopas.Laskutoimitukset;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class LaskutoimituksetTest {
    
    Laskutoimitukset laskut;
    private final double epsilon;
    public LaskutoimituksetTest() {
        this.epsilon=0.0000001;
    }
    
    
    @Before
    public void setUp() {
        laskut = new Laskutoimitukset();
    }
        @Test
    public void plussaaOikein() {
        double tulos = this.laskut.plussaa(6.0, 6.0);
        double erotus = Math.abs(tulos-12.0);
        assertTrue(erotus<epsilon);
    }
    @Test
    public void vahennaOikein() {
        double tulos = this.laskut.miinusta(6, 6);
        double erotus = Math.abs(tulos-0);
        assertTrue(erotus<epsilon);

    }
    @Test
    public void kerroOikein() {
        double tulos = this.laskut.tulo(6, 6);
        double erotus = Math.abs(tulos-36);
        assertTrue(erotus<epsilon);
    }
    @Test
    public void jaaOikein() {
        double tulos = this.laskut.jakoLasku(6, 6);
        double erotus = Math.abs(tulos-1);
        assertTrue(erotus<epsilon);
    }
    @Test
    public void potenssiKaksiOikein() {
        double tulos = this.laskut.potenssiinKaksi(2,2);
        double erotus = Math.abs(tulos-4);
        assertTrue(erotus<epsilon);
    }
    @Test
    public void piiOikein() {
        double tulos = this.laskut.pii(1);
        double erotus = Math.abs(tulos-3.141592653589793);
//        double oikeatulos = 3.141592653589793;
        assertTrue(erotus<epsilon);

        
    }
    @Test
    public void nelioJuuri() {
        double tulos = this.laskut.nelioJuuri(1);
        double erotus = Math.abs(tulos-1);
        assertTrue(erotus<epsilon);
    }
    @Test
    public void pyoristys() {
        double tulos = this.laskut.pyorista(1.7);
        double erotus = Math.abs(tulos-2);
        assertTrue(erotus<epsilon);
    }

}
