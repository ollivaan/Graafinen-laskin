package op.olutopas;

import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
*
* @author ollivaan
*/
public class LaskuJarjestys {
/**
 * Luokka lukee laskun ja määrittää laskujärjestyksen
 * ja välittää laskut laskitoimitukset luokalle
 *
 */

public LaskukaavaIkkuna laskukaavaikkuna;
public JButton button;
public JTextArea textArea;
public JTextField input;
public Laskutoimitukset laskutoimitukset;

/**
 * Metodi LaskuJarjestys luo laskujärjestyksen
 *
 */
public LaskuJarjestys(JTextArea textArea) {
    this.textArea=textArea;
}
// LUON BINAARIPUULLA TÄMÄN LUOKAN TÄMÄ LUOKKA ON KESKEN!
public void laske(String lauseke) {
    String merkit [] = {"*","/"}; 
    char kirjain;
//        this.textArea.setText(lauseke);
    char[] lausekechar = lauseke.toCharArray(); 
//        System.out.println(lausekechar.length);
   for(int pituus = lausekechar.length; pituus >= 0; pituus--) {

       for(int merkki = merkit.length-1; merkki>=0; merkki--) {
           if(lauseke.startsWith(merkit[merkki]) || lauseke.endsWith(merkit[merkki])) {              
               this.textArea.setText("Lasku ei voi alkaa/loppua kerto tai jako merkillä");
               return;
           }              
       }
       if(lausekechar[pituus]=='+') {
//             double arvo = Double.parseDouble(lausekechar[pituus-1]);
           this.laskutoimitukset.plussaa(lausekechar[pituus-1], lausekechar[pituus+1]);

       }
         this.textArea.setText(lauseke);     

  }

            }

}
