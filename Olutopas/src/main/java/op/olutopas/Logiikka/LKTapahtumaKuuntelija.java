

package op.olutopas.Logiikka;

import op.olutopas.Logiikka.LaskuJarjestys;
import op.olutopas.Kayttoliittyma.LaskukaavaIkkuna;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author ollivaan
 */
/**
 * Luokka kuuntelee laskukaavaikkunan komentoja
 * ja välittää tiedon laskuJarjestys luokalle
 *
 */
public class LKTapahtumaKuuntelija implements ActionListener {
    
    public LaskukaavaIkkuna laskukaavaikkuna;
    public LaskuJarjestys laskujarjestys;
    public Tiedostoontallentaminen talleta;
    public JButton button;
    public JTextArea textArea;
    public JTextField input;
    
    
   
    public LKTapahtumaKuuntelija(JButton button, JTextArea textArea, 
            JTextField input, LaskuJarjestys laskujarjestys,Tiedostoontallentaminen talleta) {
        this.button=button;
        this.textArea=textArea;
        this.input=input;
        this.laskujarjestys=laskujarjestys;
        this.talleta=talleta;
    }
    
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand()=="Laske") {
            this.laskujarjestys.laske(input.getText());
        } else if(e.getActionCommand()=="Save") {
            try {
                this.talleta.talleta(input.getText(),textArea.getText());
            } catch (Exception ex) {
                input.setText(ex.getMessage());
//                Logger.getLogger(LKTapahtumaKuuntelija.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
     
}
