
package op.olutopas.Kayttoliittyma;

/**
 *Main laittaa projektin käyntiin
 * @author ollivaan
 */

import op.olutopas.Kayttoliittyma.GraafinenLaskin;
import javax.swing.SwingUtilities;
 
    public class Main {
    public static void main(String[] args) {
//    SwingUtilities.invokeLater(new GraafinenLaskin());
        Kaynnista();

    
   }
    public static void Kaynnista() {
        SwingUtilities.invokeLater(new GraafinenLaskin());
    }
}
