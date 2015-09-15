/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package op.olutopas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;

public class TapahtumanKuuntelija implements ActionListener {

    private JButton nolla;
    private JButton yksi;
    private JButton kaksi;
    private JButton kolme;
    private JButton neljä;
    private JButton viisi;
    private JButton kuusi;
    private JButton seitsemän;
    private JButton kahdeksan;
    private JButton yhdeksän;
    private JButton plus;
    private JButton miinus;
    private JButton kerto;
    private JButton yhtakuin;
    private JButton C;
    private JButton pii;
    public JTextField tuloste;
    public JTextField syote;
    public Laskutoimitukset laskut;

    public TapahtumanKuuntelija(JButton plus, JButton miinus, JButton kerto, JButton yhtakuin, JTextField tuloste, JTextField syote, JButton C,
            JButton pii, Laskutoimitukset laskutoimitukset) {
//        JButton yksi,JButton kaksi, JButton kolme, JButton neljä, JButton viisi, 
//            JButton kuusi, JButton seitsemän, JButton kahdeksan, JButton yhdeksän
        this.plus = plus;
        this.miinus = miinus;
        this.kerto = kerto;
        this.yhtakuin = yhtakuin;
        this.tuloste = tuloste;
        this.syote = syote;
        this.C = C;
        this.pii = pii;
        this.laskut = laskutoimitukset;
        this.yksi=yksi;

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == plus) {
            try {
                int syotettyLuku = Integer.parseInt(syote.getText());
                int tulostettuLuku = Integer.parseInt(tuloste.getText());
                int summa = laskut.plussaa(tulostettuLuku, syotettyLuku);

                tuloste.setText("" + summa);
                syote.setText("");
                if (summa == 0) {
                    C.setEnabled(false);
                } else {
                    C.setEnabled(true);
                }

            } catch (NumberFormatException ea) {
                this.syote.setText("");
                return;
            }

        } else if (e.getSource() == miinus) {
            try {
                int syotettyLuku = Integer.parseInt(syote.getText());
                int tulostettuLuku = Integer.parseInt(tuloste.getText());
                int erotus = laskut.miinusta(syotettyLuku, tulostettuLuku);

                tuloste.setText("" + erotus);
                syote.setText("");
                if (erotus == 0) {
                    C.setEnabled(false);
                } else {
                    C.setEnabled(true);
                }
            } catch (NumberFormatException ea) {
                this.syote.setText("");
                return;
            }
        } else if (e.getSource() == kerto) {
            try {
                int syotettyLuku = Integer.parseInt(syote.getText());
                int tulostettuLuku = Integer.parseInt(tuloste.getText());
                int kertolasku = laskut.tulo(syotettyLuku, tulostettuLuku);

                tuloste.setText("" + kertolasku);
                syote.setText("");
                if (kertolasku == 0) {
                    C.setEnabled(false);
                } else {
                    C.setEnabled(true);
                }

            } catch (NumberFormatException ea) {
                this.syote.setText("");
                return;
            }
        } else if (e.getSource() == yhtakuin) {
            try {
                int syotettyLuku = Integer.parseInt(syote.getText());
                int tulostettuLuku = Integer.parseInt(tuloste.getText());
                int lukusyotetty = laskut.yhtakuin(syotettyLuku);
                tuloste.setText("" + lukusyotetty);
                syote.setText("");
                if (syotettyLuku == 0) {
                    C.setEnabled(false);
                } else {
                    C.setEnabled(true);
                }
            } catch (NumberFormatException ea) {
                this.syote.setText("");
                return;
            }
        } else if (e.getSource() == pii) {
            try {
                int syotettyLuku = Integer.parseInt(syote.getText());
                int tulostettuLuku = Integer.parseInt(tuloste.getText());
                double piintulos = this.laskut.pii(tulostettuLuku, syotettyLuku);
                tuloste.setText("" + piintulos);
                syote.setText("");
                if (piintulos == 0) {
                    C.setEnabled(false);
                } else {
                    C.setEnabled(true);
                }
            } catch (NumberFormatException ea) {
                this.syote.setText("");
                return;
            }

        } else if (e.getSource() == C) {
            C.setEnabled(false);
            nollaa();

        }

    }

    private void nollaa() {
        int tyhja = 0;
        String tyhja2 = "";
        tuloste.setText("" + tyhja);
        syote.setText("" + tyhja2);
    }

}
