

package op.olutopas.Logiikka;


import op.olutopas.Kayttoliittyma.LaskukaavaIkkuna;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;


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
    
    
 /**
 * Määritellään tarvittavat välineet.
     * @param textArea käyttäjän syötte tulostettu
     * @param input käyttäjän syöte
     * @param laskujarjestys parametrina luokka joka on vastuussa laskujarjestyksestä
     * @param talleta parametrina luokka joka hoitaa laskun talletuksen*/
    public LKTapahtumaKuuntelija(JTextArea textArea, 
            JTextField input, LaskuJarjestys laskujarjestys,Tiedostoontallentaminen talleta) {
        
        this.textArea=textArea;
        this.input=input;
        this.laskujarjestys=laskujarjestys;
        this.talleta=talleta;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if("Laske".equals(e.getActionCommand())) {
            try {
                this.laskujarjestys.laske(input.getText());
            } catch (Exception ex) {
                Logger.getLogger(LKTapahtumaKuuntelija.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if("Save".equals(e.getActionCommand())) {
            try {
                this.talleta.talleta(input.getText(),textArea.getText());
            } catch (Exception ex) {
                input.setText(ex.getMessage());
            }
        }
        
    }
     
}
