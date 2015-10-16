package op.olutopas.Logiikka;

/**
 * Luokka kuuntelee komponentteja
 */

import op.olutopas.Logiikka.Laskutoimitukset;
import op.olutopas.Kayttoliittyma.LaskukaavaIkkuna;
import op.olutopas.Kayttoliittyma.GraafinenLaskin;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JTextField;

public class TapahtumanKuuntelija implements ActionListener {

    public JButton plus;
    public JButton miinus;
    public JButton kerto;
    public JButton yhtakuin;
    public JButton jako;
    public JButton C;
    public JButton pii;
    public JButton potenssiinkaksi;
    public JButton sin;
    public JButton cos;
    public JButton tan;
    public JButton yksi;
    public JButton kaksi;
    public JButton kolme;
    public JButton neljä;
    public JButton viisi;
    public JButton kuusi;
    public JButton seitsemän;
    public JButton kahdeksan;
    public JButton yhdeksän;
    public JButton nolla;
    public JButton CE;
    public JButton round;
    public JButton uusiikkuna;
    public JButton tallenna;
    
    public JTextField naytto1;
    public JTextField naytto2;
    public Laskutoimitukset laskut;
    public GraafinenLaskin glaskin;
    public LaskukaavaIkkuna laskukaavaikkuna;
    public Tiedostoontallentaminen tiedostoontallentaminen;
//    public NappaimenInfo nappaimeninfo;
    

    /**
     *
     * @param plus
     * @param miinus
     * @param jako
     * @param kerto
     * @param yhtakuin
     * @param naytto2
     * @param naytto1
     * @param C
     * @param pii
     * @param laskutoimitukset
     * @param potenssiinkaksi
     * @param yksi
     * @param kaksi
     * @param kolme
     * @param neljä
     * @param viisi
     * @param kuusi
     * @param seitsemän
     * @param kahdeksan
     * @param yhdeksän
     * @param nolla
     * @param CE
     * @param sin
     * @param cos
     * @param tan luokassa määritellään kyseiset komponentit
     */
    public TapahtumanKuuntelija(
            JTextField naytto2, JTextField naytto1,
            Laskutoimitukset laskutoimitukset,
             LaskukaavaIkkuna laskukaavaikkuna,Tiedostoontallentaminen tiedostoontallentaminen) {

        this.naytto1 = naytto1;
        this.naytto2 = naytto2;
        this.laskut = laskutoimitukset;
        this.laskukaavaikkuna=laskukaavaikkuna;
//        this.uusiikkuna.setToolTipText("Open new window"); //info luokkatee joka välittää tiedon!
        this.tiedostoontallentaminen=tiedostoontallentaminen;
//        this.tallenna.setToolTipText("Save your calculations");
        
        

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
//        double syotettyLuku = Double.parseDouble(naytto2.getText());
//        double tulostettuLuku = Double.parseDouble(naytto1.getText());
            
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
                    this.yhdeksän.getToolTipText();
                    NappiElavaksi();
                    break;
                case "0":
                    naytto2.setText(naytto2.getText() + "0");
                    this.nolla.getToolTipText();
                    NappiElavaksi();
                    break;
                case "C":
                    naytto1.setText("0.0"); //tässä jotain mätää vinossa
                case "lukitus":
                    C.setEnabled(false);
                    break;
                case "CE":
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
                    naytto1.setText(laskut.jakoLasku(Double.parseDouble(naytto1.getText()), Double.parseDouble(naytto2.getText())) + "");
                    naytto2.setText("");
                    break;
                case "^":
                    naytto1.setText(laskut.potenssiinKaksi(Double.parseDouble(naytto2.getText()), Double.parseDouble(naytto2.getText())) + "");
                    naytto2.setText("");
                    break;
                case "New": laskukaavaikkuna.uusiIkkuna();
                uusiikkuna.getToolTipText();
                break;
                case "Save": this.tiedostoontallentaminen.talleta(naytto2.getText(),naytto1.getText());
                naytto2.setText("Tallennus onnistui!");
                this.tallenna.getToolTipText();                
                break;
            }
        } catch (NumberFormatException ex) {
            naytto1.setText("Syötäthän numeroita.");
//            naytto2.setText(ex.getMessage());
        } catch (Exception ex) {
//            Logger.getLogger(TapahtumanKuuntelija.class.getName()).log(Level.SEVERE, null, ex);
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
