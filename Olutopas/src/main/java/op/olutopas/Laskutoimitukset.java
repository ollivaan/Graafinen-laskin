/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package op.olutopas;

/**
 *
 * @author ollivaan
 */
public class Laskutoimitukset {
    TapahtumanKuuntelija tkuuntelija;
    public Laskutoimitukset() {
        
    }
    public double plussaa(double tulostettuLuku, double syotettyLuku) {
                double summa = tulostettuLuku + syotettyLuku;
                return summa;

    }
    public double miinusta(double tulostettuLuku, double syotettyLuku) {
        double erotus = tulostettuLuku - syotettyLuku;
        return erotus;
    }
    public double tulo(double tulostettuLuku, double syotettyLuku) {
    double tulo = tulostettuLuku * syotettyLuku;
    return tulo;
    }
    public double pii(double syotettyLuku) {
      double piintulos = (syotettyLuku) * Math.PI;
        return piintulos;
        
    }
    public double jakoLasku(double tulostettuLuku, double syotettyLuku) {
      double tulos = (syotettyLuku) / tulostettuLuku;
        return tulos;
        
    }
    public double yhtakuin(double syotettyLuku) {
        double tulos = syotettyLuku;
        return tulos;
    }
//    private void nollaa() {
//        int tyhja = 0;
//    String tyhja2 = "";
//    tuloste.setText("" + tyhja);
//    syote.setText("" + tyhja2);
//    }
    
}
