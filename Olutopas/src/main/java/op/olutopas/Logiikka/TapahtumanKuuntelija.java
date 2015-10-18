package op.olutopas.Logiikka;

/**
 * Luokka kuuntelee komponentteja
 */

import op.olutopas.Kayttoliittyma.LaskukaavaIkkuna;
import op.olutopas.Kayttoliittyma.GraafinenLaskin;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;

public class TapahtumanKuuntelija implements ActionListener {


    private final JButton C;
    private final JButton CE; 
    public JTextField naytto1;
    public JTextField naytto2;
    public Laskutoimitukset laskut;
    public JButton uusiikkuna;
    public GraafinenLaskin glaskin;
    public LaskukaavaIkkuna laskukaavaikkuna;
    public Tiedostoontallentaminen tiedostoontallentaminen;
    public JButton tallenna;


    public TapahtumanKuuntelija(
            JTextField naytto2, JTextField naytto1, JButton C,
            Laskutoimitukset laskutoimitukset,
            JButton CE,
             LaskukaavaIkkuna laskukaavaikkuna,Tiedostoontallentaminen tiedostoontallentaminen) {

        
        this.naytto1 = naytto1;
        this.naytto2 = naytto2;
        this.laskut = laskutoimitukset;
        this.C = C;
        this.CE = CE;
        this.laskukaavaikkuna=laskukaavaikkuna;
        this.tiedostoontallentaminen=tiedostoontallentaminen;

        

    }



    /**
     * Luokka kuuntelee näppäimiä ja välittää laskut laskutoimitukset luokalle
     * joka välittää ne takaisin ja tämä tulostaa samalla tulokset
     */

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            JButton jbutton = (JButton) e.getSource();
            String nappula = jbutton.getText();
            
            switch (nappula) {
                case "1":
                    naytto2.setText(naytto2.getText() + "1");
                    NappiElavaksi();
                    break;
                case "2":
                    naytto2.setText(naytto2.getText() + "2");
                    NappiElavaksi();
                    break;
                case "3":
                    naytto2.setText(naytto2.getText() + "3");
                    NappiElavaksi();
                    break;
                case "4":
                    naytto2.setText(naytto2.getText() + "4");
                    NappiElavaksi();
                    break;
                case "5":
                    naytto2.setText(naytto2.getText() + "5");
                    NappiElavaksi();
                    break;
                case "6":
                    naytto2.setText(naytto2.getText() + "6");
                    NappiElavaksi();
                    break;
                case "7":
                    naytto2.setText(naytto2.getText() + "7");
                    NappiElavaksi();
                    break;
                case "8":
                    naytto2.setText(naytto2.getText() + "8");
                    NappiElavaksi();
                    break;
                case "9":
                    naytto2.setText(naytto2.getText() + "9");
                    NappiElavaksi();
                    break;
                case "0":
                    naytto2.setText(naytto2.getText() + "0");
                    NappiElavaksi();
                    break;
                case "C":
                    naytto1.setText("0.0");
                case "lukitus":
                    C.setEnabled(false);
                    break;
                case "CE":
                    naytto1.setText("0.0");
                    naytto2.setText("");
                case "lukitus2":
                    CE.setEnabled(false);
                    break;
                case "round":
                    naytto1.setText(laskut.pyorista(Double.parseDouble(naytto1.getText())) + "");
                    break;
                case "=":
                    naytto1.setText(laskut.yhtakuin(Double.parseDouble(naytto2.getText())) + "");
                    naytto2.setText("");
                    break;
                case "π":
                    naytto1.setText(laskut.pii(Double.parseDouble(naytto2.getText())) + "");
                    naytto2.setText("");
                    break;
                case "Sin":
                    naytto1.setText(laskut.sin(Double.parseDouble(naytto2.getText())) + "");
                    naytto2.setText("");
                    break;
                case "Cos":
                    naytto1.setText(laskut.cos(Double.parseDouble(naytto2.getText())) + "");
                    naytto2.setText("");
                    break;
                case "Tan":
                    naytto1.setText(laskut.tan(Double.parseDouble(naytto2.getText())) + "");
                    naytto2.setText("");
                    break;
                case "+":
                    naytto1.setText(laskut.plussaa(Double.parseDouble(naytto1.getText()), Double.parseDouble(naytto2.getText())) + "");
                    naytto2.setText("");
                    break;
                case "-":
                    naytto1.setText(laskut.miinusta(Double.parseDouble(naytto1.getText()), Double.parseDouble(naytto2.getText())) + "");
                    naytto2.setText("");
                    break;
                case "*":
                    naytto1.setText(laskut.tulo(Double.parseDouble(naytto1.getText()), Double.parseDouble(naytto2.getText())) + "");
                    naytto2.setText("");
                    break;
                case "/":
                    naytto1.setText(laskut.jakoLasku(Double.parseDouble(naytto2.getText()), Double.parseDouble(naytto1.getText())) + "");
                    naytto2.setText("");
                    break;
                case "New": laskukaavaikkuna.uusiIkkuna();
                break;
                case "Save": this.tiedostoontallentaminen.talleta(naytto2.getText(),naytto1.getText());
                naytto2.setText("Tallennus onnistui!");               
                break;
            }
        } catch (NumberFormatException ex) {
            naytto1.setText("Syötäthän numeroita.");

        } catch (Exception ex) {

            naytto1.setText("Tallennus epäonnistui");
            naytto1.setText(ex.getMessage());
            
        }
    }

    /**
     * Luokka hoitaa napin "eläväksi" eli nappi muuttuu toiminnalliseksi kun
     * laskukentissä on poistettavaa
     */
    public void NappiElavaksi() {

        CE.setEnabled(true);

        C.setEnabled(true);
    }

}