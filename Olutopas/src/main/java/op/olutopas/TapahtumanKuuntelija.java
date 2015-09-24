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
    public JTextField naytto1;
    public JTextField naytto2;
    public Laskutoimitukset laskut;
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
 * @param tan 
 * luokassa määritellään kyseiset komponentit xD
 */
    public TapahtumanKuuntelija(JButton plus, JButton miinus, 
            JButton jako, JButton kerto, JButton yhtakuin, 
            JTextField naytto2, JTextField naytto1, JButton C,
            JButton pii, Laskutoimitukset laskutoimitukset, JButton potenssiinkaksi,
            JButton yksi, JButton kaksi, JButton kolme, JButton neljä, JButton viisi,
            JButton kuusi, JButton seitsemän, JButton kahdeksan, JButton yhdeksän, JButton nolla, JButton CE, JButton sin, JButton cos, JButton tan) {

        this.plus = plus;
        this.miinus = miinus;
        this.kerto = kerto;
        this.yhtakuin = yhtakuin;
        this.jako=jako;
        this.C = C;
        this.pii = pii;
        this.naytto1 = naytto1;
        this.naytto2 = naytto2;
        this.laskut=laskutoimitukset;
        this.potenssiinkaksi=potenssiinkaksi;
        this.yksi=yksi;
        this.kaksi=kaksi;
        this.kolme=kolme;
        this.neljä=neljä;
        this.viisi=viisi;
        this.kuusi=kuusi;
        this.seitsemän=seitsemän;
        this.kahdeksan=kahdeksan;
        this.yhdeksän=yhdeksän;
        this.nolla=nolla;
        this.CE=CE;
        this.cos=cos;
        this.tan=tan;
        this.sin=sin;


    }
/**
 * Luokka kuuntelee näppäimiä
 */

    public void nappaintenTunnistus(ActionEvent e) {
        JButton jbutton = (JButton)e.getSource();
        String nappula = jbutton.getText();

        switch (nappula) {
            case "1": naytto2.setText(naytto2.getText() + "1");  NappiElavaksi();
                break;
            case "2": naytto2.setText(naytto2.getText() + "2");  NappiElavaksi();
                break;
            case "3": naytto2.setText(naytto2.getText() + "3");  NappiElavaksi();
                break;
            case "4": naytto2.setText(naytto2.getText() + "4");  NappiElavaksi();
                break;
            case "5": naytto2.setText(naytto2.getText() + "5");  NappiElavaksi();
                break;
            case "6": naytto2.setText(naytto2.getText() + "6");  NappiElavaksi();
                break;
            case "7": naytto2.setText(naytto2.getText() + "7");  NappiElavaksi();
                break;
            case "8": naytto2.setText(naytto2.getText() + "8");  NappiElavaksi();
                break;
            case "9": naytto2.setText(naytto2.getText() + "9");  NappiElavaksi();
                break;
            case "0": naytto2.setText(naytto2.getText() + "0");  NappiElavaksi();
                break;
            case "C": naytto1.setText("0");
            case "lukitus": C.setEnabled(false);
                break;
            case "CE": naytto2.setText("");
            case "lukitus2": CE.setEnabled(false);
                break;

        }
    }


/**
 * Luokka kuuntelee näppäimiä
 */
    @Override
    public void actionPerformed(ActionEvent e) {
        nappaintenTunnistus(e);
    //        break;
        if (e.getSource() == plus) {
            try {
                double syotettyLuku = Double.parseDouble(naytto2.getText());
                double tulostettuLuku = Double.parseDouble(naytto1.getText());
                double summa = laskut.plussaa(tulostettuLuku, syotettyLuku);

                naytto1.setText(summa + "");

                naytto2.setText("");

    //                tyhjennaNappain(summa);

            } catch (NumberFormatException ea) {
                this.naytto2.setText("");
                return;
            }


        } else if (e.getSource() == miinus) {
            try {
                double syotettyLuku = Double.parseDouble(naytto2.getText());
                double tulostettuLuku = Double.parseDouble(naytto1.getText());
                double erotus = laskut.miinusta(tulostettuLuku, syotettyLuku);

                    naytto1.setText("" + erotus);


                naytto2.setText("");

    //                tyhjennaNappain(erotus);

            } catch (NumberFormatException ea) {
                this.naytto2.setText("");
                return;
            }
        } else if (e.getSource() == kerto) {
            try {
                double syotettyLuku = Double.parseDouble(naytto2.getText());
                double tulostettuLuku = Double.parseDouble(naytto1.getText());
                double kertolasku = laskut.tulo(syotettyLuku, tulostettuLuku);

                naytto1.setText("" + kertolasku);
                naytto2.setText("");
    //                tyhjennaNappain(kertolasku);

            } catch (NumberFormatException ea) {
                this.naytto2.setText("");
                return;
            }
        } else if (e.getSource() == yhtakuin) {
            try {
                double syotettyLuku = Double.parseDouble(naytto2.getText());
                double tulostettuLuku = Double.parseDouble(naytto1.getText());
                double lukusyotetty = laskut.yhtakuin(syotettyLuku);

                naytto1.setText("" + lukusyotetty);
                naytto2.setText("");

    //                tyhjennaNappain(lukusyotetty);

            } catch (NumberFormatException ea) {
                this.naytto2.setText("");
                return;
            }
        } else if (e.getSource() == pii) {
            try {
                double syotettyLuku = Double.parseDouble(naytto2.getText());
                double tulostettuLuku = Double.parseDouble(naytto1.getText());
                double piintulos = this.laskut.pii(syotettyLuku);
                
                naytto1.setText("" + piintulos);
                naytto2.setText("");
    //                tyhjennaNappain(piintulos);

            } catch (NumberFormatException ea) {
                this.naytto2.setText("");
                return;
            }
                } else if (e.getSource() == jako) {
            try {
                double syotettyLuku = Double.parseDouble(naytto1.getText());
                double tulostettuLuku = Double.parseDouble(naytto2.getText());
                double jakolasku = this.laskut.jakoLasku(tulostettuLuku, syotettyLuku);
                naytto1.setText("" + jakolasku);
                naytto2.setText("");
    //                tyhjennaNappain(jakolasku);

            } catch (NumberFormatException ea) {
                this.naytto2.setText("");
                return;
            }
                } else if (e.getSource() == potenssiinkaksi) {
            try {
  
                double syotettyLuku = Double.parseDouble(naytto2.getText());
                double syotettyLuku2 = Double.parseDouble(naytto2.getText());
                double tulostettuLuku = Double.parseDouble(naytto1.getText());
                double potenssiin = this.laskut.potenssiinKaksi(syotettyLuku, syotettyLuku2);

                naytto1.setText(potenssiin + "");

                naytto2.setText("");

    //                tyhjennaNappain(potenssiin);

            } catch (NumberFormatException ea) {
                this.naytto2.setText("");
                return;
              }
                }else if (e.getSource() == sin) {
            try {
                double syotettyLuku = Double.parseDouble(naytto2.getText());
                double tulostettuLuku = Double.parseDouble(naytto1.getText());
                double potenssiin = this.laskut.sin(syotettyLuku);

                naytto1.setText(potenssiin + "");

                naytto2.setText("");

    //                tyhjennaNappain(potenssiin);

            } catch (NumberFormatException ea) {
                this.naytto2.setText("");
                return;
              }
                }
        else if (e.getSource() == cos) {
            try {
                double syotettyLuku = Double.parseDouble(naytto2.getText());
                double tulostettuLuku = Double.parseDouble(naytto1.getText());
                double potenssiin = this.laskut.cos(syotettyLuku);

                naytto1.setText(potenssiin + "");

                naytto2.setText("");

    //                tyhjennaNappain(potenssiin);

            } catch (NumberFormatException ea) {
                this.naytto2.setText("");
                return;
              }
                }
                else if (e.getSource() == tan) {
            try {
                double syotettyLuku = Double.parseDouble(naytto2.getText());
                double tulostettuLuku = Double.parseDouble(naytto1.getText());
                double potenssiin = this.laskut.tan(syotettyLuku);

                naytto1.setText(potenssiin + "");

                naytto2.setText("");

    //                tyhjennaNappain(potenssiin);

            } catch (NumberFormatException ea) {
                this.naytto2.setText("");
                return;
              }
                }
    } 
    /**
 * Luokka hoitaa napin "eläväksi"
 */
    public void NappiElavaksi() {

                    CE.setEnabled(true);

                    C.setEnabled(true);

    }




    }
