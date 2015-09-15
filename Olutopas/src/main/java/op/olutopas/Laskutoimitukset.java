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
    public int tulo(int syotettyLuku, int tulostettuLuku) {
    int tulo = tulostettuLuku * syotettyLuku;
    return tulo;
    }
    public double pii(int tulostettuLuku, int syotettyLuku) {
      double piintulos = (syotettyLuku) * Math.PI;
        return piintulos;
        
    }
    public int yhtakuin(int syotettyLuku) {
        int yhtakuin = syotettyLuku;
        return yhtakuin;
    }
//        public void nollaa() {
//        int tyhja = 0;
//        String tyhja2 = "";
//        tkuuntelija.tuloste.setText("" + tyhja);
//        tkuuntelija.setText("" + tyhja2);
//    }

    
}
