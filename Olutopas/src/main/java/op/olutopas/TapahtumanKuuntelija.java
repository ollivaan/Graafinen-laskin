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
    private JButton potenssiinkaksi;
    private JButton yksi;
    private JButton kaksi;
    private JButton kolme;
    private JButton neljä;
    private JButton viisi;
//    private String moi="moi";
    public JTextField naytto1;
    public JTextField naytto2;
    public Laskutoimitukset laskut;

    public TapahtumanKuuntelija(JButton plus, JButton miinus, 
            JButton jako, JButton kerto, JButton yhtakuin, 
            JTextField naytto2, JTextField naytto1, JButton C,
            JButton pii, Laskutoimitukset laskutoimitukset, JButton potenssiinkaksi,
            JButton yksi, JButton kaksi, JButton kolme, JButton neljä, JButton viisi) {
        
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

        
    }

    
    public void nappaintenTunnistus(ActionEvent e) {
        JButton jbutton = (JButton)e.getSource();
        String nimi = jbutton.getText();
//        this.yksi.par
        System.out.println(nimi);
// int numero= 233223;
        switch (nimi) {
            case "1": naytto1.setText("toimii");
                
                
        }
    }



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
                
                tyhjennaNappain(summa);

            } catch (NumberFormatException ea) {
                this.naytto2.setText("");
                return;
            }


        } else if (e.getSource() == miinus) {
            try {
                double syotettyLuku = Double.parseDouble(naytto2.getText());
                double tulostettuLuku = Double.parseDouble(naytto1.getText());
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
                double syotettyLuku = Double.parseDouble(naytto2.getText());
                double tulostettuLuku = Double.parseDouble(naytto1.getText());
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
                double syotettyLuku = Double.parseDouble(naytto2.getText());
                double tulostettuLuku = Double.parseDouble(naytto1.getText());
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
                double syotettyLuku = Double.parseDouble(naytto2.getText());
                double tulostettuLuku = Double.parseDouble(naytto1.getText());
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
                double syotettyLuku = Double.parseDouble(naytto1.getText());
                double tulostettuLuku = Double.parseDouble(naytto2.getText());
                double jakolasku = this.laskut.jakoLasku(tulostettuLuku, syotettyLuku);
                naytto1.setText("" + jakolasku);
                naytto2.setText("");
                tyhjennaNappain(jakolasku);

            } catch (NumberFormatException ea) {
                this.naytto2.setText("");
                return;
            }
                    if (e.getSource() == potenssiinkaksi) {
            try {
                double syotettyLuku = Double.parseDouble(naytto2.getText());
                double tulostettuLuku = Double.parseDouble(naytto1.getText());
                double potenssiin = this.laskut.potenssiinKaksi(syotettyLuku);

                naytto1.setText(potenssiin + "");
    
                naytto2.setText("");
                
                tyhjennaNappain(potenssiin);

            } catch (NumberFormatException ea) {
                this.naytto2.setText("");
                return;
            }


        } else if (e.getSource() == C) {
            C.setEnabled(false);
            nollaa();

        }
        
    }
    }
    
    public void tyhjennaNappain(double lasku) {
                if (lasku == 0) {
                    C.setEnabled(false);
                } else {
                    C.setEnabled(true);
                }
        
    }


//    public double nappaimenTunnistus(ActionEvent e) {
//        if(e.getSource() == yksi)) {
//            double syotetty = 1.0;
//            return  syotetty;
//        }
//        return 0;
//        
//    }

    private void nollaa() {
        int tyhja = 0;
        String tyhja2 = "";
        naytto1.setText("" + tyhja);
        naytto2.setText("" + tyhja2);
    }

}
