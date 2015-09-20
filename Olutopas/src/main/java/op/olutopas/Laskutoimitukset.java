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
    public int plussaa(int tulostettuLuku, int syotettyLuku) {
                int summa = tulostettuLuku + syotettyLuku;
                return summa;

    }
    public int miinusta(int tulostettuLuku, int syotettyLuku) {
        int erotus = tulostettuLuku - syotettyLuku;
        return erotus;
    }
    public int tulo(int tulostettuLuku, int syotettyLuku) {
    int tulo = tulostettuLuku * syotettyLuku;
    return tulo;
    }
    public double pii(int syotettyLuku) {
      double piintulos = (syotettyLuku) * Math.PI;
        return piintulos;
        
    }
    public double jakoLasku(int tulostettuLuku, int syotettyLuku) {
      double tulos = (syotettyLuku) / tulostettuLuku;
        return tulos;
        
    }
    public int yhtakuin(int syotettyLuku) {
        int tulos = syotettyLuku;
        return tulos;
    }
//    private void nollaa() {
//        int tyhja = 0;
//    String tyhja2 = "";
//    tuloste.setText("" + tyhja);
//    syote.setText("" + tyhja2);
//    }
    
}
