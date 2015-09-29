package op.olutopas;

/**
 * Luokka kuuntelee komponentteja
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;

public class TapahtumanKuuntelija implements ActionListener {

    private JButton plus;
    private JButton miinus;
    private JButton kerto;
    private JButton yhtakuin;
    private JButton jako;
    private JButton C;
    private JButton pii;
    private JButton potenssiinkaksi;
    private JButton sin;
    private JButton cos;
    private JButton tan;
    private JButton yksi;
    private JButton kaksi;
    private JButton kolme;
    private JButton neljä;
    private JButton viisi;
    private JButton kuusi;
    private JButton seitsemän;
    private JButton kahdeksan;
    private JButton yhdeksän;
    private JButton nolla;
    private JButton CE;
    private JButton round;
    public JTextField naytto1;
    public JTextField naytto2;
    public Laskutoimitukset laskut;
    public JButton uusiikkuna;
    public GraafinenLaskin glaskin;
    public LaskukaavaIkkuna laskukaavaikkuna;

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
    public TapahtumanKuuntelija(JButton plus, JButton miinus,
            JButton jako, JButton kerto, JButton yhtakuin,
            JTextField naytto2, JTextField naytto1, JButton C,
            JButton pii, Laskutoimitukset laskutoimitukset, JButton potenssiinkaksi,
            JButton yksi, JButton kaksi, JButton kolme, JButton neljä, JButton viisi,
            JButton kuusi, JButton seitsemän, JButton kahdeksan, JButton yhdeksän,
            JButton nolla, JButton CE, JButton sin, JButton cos, JButton tan, JButton round,
             LaskukaavaIkkuna laskukaavaikkuna) {

        this.plus = plus;
        this.miinus = miinus;
        this.kerto = kerto;
        this.yhtakuin = yhtakuin;
        this.jako = jako;
        this.C = C;
        this.pii = pii;
        this.naytto1 = naytto1;
        this.naytto2 = naytto2;
        this.laskut = laskutoimitukset;
        this.potenssiinkaksi = potenssiinkaksi;
        this.yksi = yksi;
        this.kaksi = kaksi;
        this.kolme = kolme;
        this.neljä = neljä;
        this.viisi = viisi;
        this.kuusi = kuusi;
        this.seitsemän = seitsemän;
        this.kahdeksan = kahdeksan;
        this.yhdeksän = yhdeksän;
        this.nolla = nolla;
        this.CE = CE;
        this.cos = cos;
        this.tan = tan;
        this.sin = sin;
        this.round = round;
        this.uusiikkuna=uusiikkuna;
        this.glaskin=glaskin;
        this.laskukaavaikkuna=laskukaavaikkuna;
        

    }



    /**
     * Luokka kuuntelee näppäimiä ja välittää laskut laskutoimitukset luokalle
     * joka välittää ne takaisin ja tämä tulostaa samalla tulokset
     */

    @Override
    public void actionPerformed(ActionEvent e) {
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
                break;
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
