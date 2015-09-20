

package op.olutopas;


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
    public JTextField tuloste;
    public JTextField syote;
    public Laskutoimitukset laskut;

    public TapahtumanKuuntelija(JButton plus, JButton miinus, JButton kerto, JButton jako, JButton yhtakuin, JTextField tuloste, JTextField syote, JButton C,
            JButton pii, Laskutoimitukset laskutoimitukset) {
        this.plus = plus;
        this.miinus = miinus;
        this.kerto = kerto;
        this.yhtakuin = yhtakuin;
        this.tuloste = tuloste;
        this.syote = syote;
        this.C = C;
        this.pii = pii;
        this.laskut=laskutoimitukset;
        this.jako=jako;
        
    }



    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == plus) {
            try {
                double syotettyLuku = Integer.parseInt(syote.getText());
                double tulostettuLuku = Integer.parseInt(tuloste.getText());
                double summa = laskut.plussaa(tulostettuLuku, syotettyLuku);

                tuloste.setText("" + summa);
                syote.setText("");
                
                tyhjennaNappain(summa);

            } catch (NumberFormatException ea) {
                this.syote.setText("");
                return;
            }

        } else if (e.getSource() == miinus) {
            try {
                double syotettyLuku = Integer.parseInt(syote.getText());
                double tulostettuLuku = Integer.parseInt(tuloste.getText());
                double erotus = laskut.miinusta(syotettyLuku, tulostettuLuku);
                
                tuloste.setText("" + erotus);
                syote.setText("");
                
                tyhjennaNappain(erotus);
                
            } catch (NumberFormatException ea) {
                this.syote.setText("");
                return;
            }
        } else if (e.getSource() == kerto) {
            try {
                double syotettyLuku = Integer.parseInt(syote.getText());
                double tulostettuLuku = Integer.parseInt(tuloste.getText());
                double kertolasku = laskut.tulo(syotettyLuku, tulostettuLuku);
                
                tuloste.setText("" + kertolasku);
                syote.setText("");
                tyhjennaNappain(kertolasku);

            } catch (NumberFormatException ea) {
                this.syote.setText("");
                return;
            }
        } else if (e.getSource() == yhtakuin) {
            try {
                double syotettyLuku = Integer.parseInt(syote.getText());
                double tulostettuLuku = Integer.parseInt(tuloste.getText());
                double lukusyotetty = laskut.yhtakuin(syotettyLuku);
                
                tuloste.setText("" + lukusyotetty);
                syote.setText("");

                tyhjennaNappain(lukusyotetty);
                
            } catch (NumberFormatException ea) {
                this.syote.setText("");
                return;
            }
        } else if (e.getSource() == pii) {
            try {
                double syotettyLuku = Integer.parseInt(syote.getText());
                double tulostettuLuku = Integer.parseInt(tuloste.getText());
                double piintulos = this.laskut.pii(syotettyLuku);
                tuloste.setText("" + piintulos);
                syote.setText("");
                tyhjennaNappain(piintulos);
                
            } catch (NumberFormatException ea) {
                this.syote.setText("");
                return;
            }
                } else if (e.getSource() == jako) {
            try {
                double syotettyLuku = Integer.parseInt(syote.getText());
                double tulostettuLuku = Integer.parseInt(tuloste.getText());
                double jakolasku = this.laskut.jakoLasku(tulostettuLuku, syotettyLuku);
                tuloste.setText("" + jakolasku);
                syote.setText("");
                tyhjennaNappain(jakolasku);
//                if (jakolasku == 0) {
//                    C.setEnabled(false);
//                } else {
//                    C.setEnabled(true);
//                }
            } catch (NumberFormatException ea) {
                this.syote.setText("");
                return;
            }


        } else if (e.getSource() == C) {
            C.setEnabled(false);
            nollaa();

        }
        
    }
    public void tyhjennaNappain(double lasku) {
                if (lasku == 0) {
                    C.setEnabled(false);
                } else {
                    C.setEnabled(true);
                }
        
    }



    private void nollaa() {
        int tyhja = 0;
        String tyhja2 = "";
        tuloste.setText("" + tyhja);
        syote.setText("" + tyhja2);
    }

}

