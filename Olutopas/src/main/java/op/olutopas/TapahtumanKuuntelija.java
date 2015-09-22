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
    public JTextField naytto1;
    public JTextField naytto2;
    public Laskutoimitukset laskut;

    public TapahtumanKuuntelija(JButton plus, JButton miinus, JButton jako, JButton kerto, JButton yhtakuin, JTextField naytto2, JTextField naytto1, JButton C,
            JButton pii, Laskutoimitukset laskutoimitukset) {
        this.plus = plus;
        this.miinus = miinus;
        this.kerto = kerto;
        this.yhtakuin = yhtakuin;
        this.naytto1 = naytto1;
        this.naytto2 = naytto2;
        this.C = C;
        this.pii = pii;
        this.laskut=laskutoimitukset;
        this.jako=jako;
        
    }





    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == plus) {
            try {
                double syotettyLuku = Integer.parseInt(naytto2.getText());
                double tulostettuLuku = Integer.parseInt(naytto1.getText());
                double summa = laskut.plussaa(tulostettuLuku, syotettyLuku);

                naytto1.setText("" + summa);
                naytto2.setText("");
                
                tyhjennaNappain(summa);

            } catch (NumberFormatException ea) {
                this.naytto2.setText("");
                return;
            }

        } else if (e.getSource() == miinus) {
            try {
                double syotettyLuku = Integer.parseInt(naytto2.getText());
                double tulostettuLuku = Integer.parseInt(naytto1.getText());
                double erotus = laskut.miinusta(syotettyLuku, tulostettuLuku);
                
                naytto1.setText("" + erotus);
                naytto2.setText("");
                
                tyhjennaNappain(erotus);
                
            } catch (NumberFormatException ea) {
                this.naytto2.setText("");
                return;
            }
        } else if (e.getSource() == kerto) {
            try {
                double syotettyLuku = Integer.parseInt(naytto2.getText());
                double tulostettuLuku = Integer.parseInt(naytto1.getText());
                double kertolasku = laskut.tulo(syotettyLuku, tulostettuLuku);
                
                naytto1.setText("" + kertolasku);
                naytto2.setText("");
                tyhjennaNappain(kertolasku);

            } catch (NumberFormatException ea) {
                this.naytto2.setText("");
                return;
            }
        } else if (e.getSource() == yhtakuin) {
            try {
                double syotettyLuku = Integer.parseInt(naytto2.getText());
                double tulostettuLuku = Integer.parseInt(naytto1.getText());
                double lukusyotetty = laskut.yhtakuin(syotettyLuku);
                
                naytto1.setText("" + lukusyotetty);
                naytto2.setText("");

                tyhjennaNappain(lukusyotetty);
                
            } catch (NumberFormatException ea) {
                this.naytto2.setText("");
                return;
            }
        } else if (e.getSource() == pii) {
            try {
                double syotettyLuku = Integer.parseInt(naytto2.getText());
                double tulostettuLuku = Integer.parseInt(naytto1.getText());
                double piintulos = this.laskut.pii(syotettyLuku);
                naytto1.setText("" + piintulos);
                naytto2.setText("");
                tyhjennaNappain(piintulos);
                
            } catch (NumberFormatException ea) {
                this.naytto2.setText("");
                return;
            }
                } else if (e.getSource() == jako) {
            try {
                double syotettyLuku = Integer.parseInt(naytto1.getText());
                double tulostettuLuku = Integer.parseInt(naytto2.getText());
                double jakolasku = this.laskut.jakoLasku(tulostettuLuku, syotettyLuku);
                naytto1.setText("" + jakolasku);
                naytto2.setText("");
                tyhjennaNappain(jakolasku);
//                if (jakolasku == 0) {
//                    C.setEnabled(false);
//                } else {
//                    C.setEnabled(true);
//                }
            } catch (NumberFormatException ea) {
                this.naytto2.setText("");
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
        naytto1.setText("" + tyhja);
        naytto2.setText("" + tyhja2);
    }

}
