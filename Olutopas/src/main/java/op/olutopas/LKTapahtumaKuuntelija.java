

package op.olutopas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
    public JButton button;
    public JTextArea textArea;
    public JTextField input;
    
   
    public LKTapahtumaKuuntelija(JButton button, JTextArea textArea, JTextField input, LaskuJarjestys laskujarjestys) {
        this.button=button;
        this.textArea=textArea;
        this.input=input;
        this.laskujarjestys=laskujarjestys;
    }
    
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand()=="Laske") {
//            this.textArea.setText(input.getText());

            this.laskujarjestys.laske(input.getText());

//            this.laskujarjestys.laske(input.getText());
//            this.laskujarjestys.laske("" + input.getText()); // tänne laskujärjestys ja tämä välittää laskennan laskutoimitusluokalle 
            // ja täällä tulostetaan tulos
            
            
        }
        
    }
     
}
