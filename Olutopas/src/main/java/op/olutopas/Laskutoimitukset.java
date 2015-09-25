

package op.olutopas;

/**
 * Luokka hoitaa Laskutoimitukset
 */
public class Laskutoimitukset {
    TapahtumanKuuntelija tkuuntelija;
    public Laskutoimitukset() {
        
    }
    /**
 * Metodi laskee pluslaskun
 * @param   syote   Käyttäjän antama syöte
 * 
 * @return Summa
 */
    public double plussaa(double tulostettuLuku, double syotettyLuku) {
                double summa = tulostettuLuku + syotettyLuku;
                return summa;
    /**
 * Metodi laskee miinuslaskun
 * @param   syote   Käyttäjän antama syöte
 * 
 * @return Erotus
 */
    }
    public double miinusta(double tulostettuLuku, double syotettyLuku) {
        double erotus = tulostettuLuku - syotettyLuku;
        return erotus;
    }
        /**
 * Metodi laskee kertolaskun
 * @param   syotettyLuku   Käyttäjän antama syöte
 * @param   tulostettuLuku 
 * @return Tulo
 */
    public double tulo(double tulostettuLuku, double syotettyLuku) {
    double tulo = tulostettuLuku * syotettyLuku;
    return tulo;
    }
    
    /**
     * Laskke jakolaskun
     * @param tulostettuLuku
     * @param syotettyLuku
     * @return tulos
     */

    public double jakoLasku(double tulostettuLuku, double syotettyLuku) {
    double tulos = (syotettyLuku) / tulostettuLuku;
    return tulos;
        
    }
    public double yhtakuin(double syotettyLuku) {
    double tulos = syotettyLuku;
    return tulos;
        
    }
    public double potenssiinKaksi(double syotettyLuku, double syotettyLuku2) {
    double tulos = Math.pow(syotettyLuku, syotettyLuku2);
        // tämä on potenssiin kaksi
      //moneen tarvitaan kolmas muuttuja ja se tehdään sen jälkeen for lausellaa
    return tulos;
        
    }
    
    public double sin(double syotettyLuku) {
    double tulos = Math.sin(syotettyLuku);
    return tulos;    
    }
    
    public double cos(double syotettyLuku) {
    double tulos = Math.cos(syotettyLuku);
    return tulos;    
    }
    
    public double tan(double syotettyLuku) {
    double tulos = Math.tan(syotettyLuku);
    return tulos;   
    }
    
    public double nelioJuuri(double syotettyLuku) {
    double tulos = Math.sqrt(syotettyLuku);
    return tulos;
        // TEE TÄMÄ!
    }

    double pii(double syotettyLuku) {
    double piintulos = (syotettyLuku) * Math.PI;
    return piintulos;
    }
    double pyorista(double tulostettuLuku) {
    double pyoristys = Math.round(tulostettuLuku);
    return pyoristys;
    }



}