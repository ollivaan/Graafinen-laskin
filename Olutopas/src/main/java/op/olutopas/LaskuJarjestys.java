package op.olutopas;

import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author ollivaan
 */
public class LaskuJarjestys {

    public LaskukaavaIkkuna laskukaavaikkuna;
    public JButton button;
    public JTextArea textArea;
    public JTextField input;

    public LaskuJarjestys(JTextArea textArea) {
        this.textArea=textArea;
    }

    public void laske(String lauseke) {
        String merkit [] = {"+","-","*","/"}; 
        char kirjain;
//        this.textArea.setText(lauseke);
        char[] lausekechar = lauseke.toCharArray(); 
//        System.out.println(lausekechar.length);
       for(int pituus = lausekechar.length; pituus >= 0; pituus--) {
           
            if(lauseke.contains("(") || lauseke.contains(")")) {
               

             this.textArea.setText(lauseke);          
        }
      }

                }
}
