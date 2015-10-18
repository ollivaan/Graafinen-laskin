package op.olutopas.Kayttoliittyma;

/**
 * Luokassa luodaan komponentit/elementit
 *
 */

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.WindowConstants;
import op.olutopas.Logiikka.Laskutoimitukset;
import op.olutopas.Logiikka.TapahtumanKuuntelija;
import op.olutopas.Logiikka.Tiedostoontallentaminen;


/**
 * Metodissa luodaan komponentit ja elementit
 *
 */
public class GraafinenLaskin implements Runnable {

    private JFrame frame;
   

    @Override
    public void run() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
        }
        frame = new JFrame("Laskin");
        frame.setPreferredSize(new Dimension(500, 500));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        luoKomponentit(frame.getContentPane());
        frame.setVisible(true);
        frame.setResizable(false);
        frame.pack();
        
    }

    private void luoKomponentit(Container container) {
        
        GridLayout GL = new GridLayout(3, 5);
        container.setLayout(GL);
        JTextField naytto1 = new JTextField("0");
        naytto1.setEnabled(false);

        JTextField naytto2 = new JTextField();

        JPanel panel = new JPanel(new GridLayout(0, 6, 5, 5));
//        panel.setBackground(Color.lightGray);

        container.add(panel);

        container.add(naytto1);
        Laskutoimitukset laskutoimitukset = new Laskutoimitukset();
        Tiedostoontallentaminen tiedostoontallentaminen = new Tiedostoontallentaminen();
        LaskukaavaIkkuna laskukaavaikkuna = new LaskukaavaIkkuna();
        JButton yksi = new JButton("1");
        JButton kaksi = new JButton("2");
        JButton kolme = new JButton("3");
        JButton plus = new JButton("+");
        JButton miinus = new JButton("-");
        JButton kerto = new JButton("*");
        JButton neljä = new JButton("4");
        JButton viisi = new JButton("5");
        JButton kuusi = new JButton("6");
        JButton yhtakuin = new JButton("=");
        JButton C = new JButton("C");
        JButton pii = new JButton("π");
        JButton seitsemän = new JButton("7");
        JButton kahdeksan = new JButton("8");
        JButton yhdeksän = new JButton("9");
        JButton nolla = new JButton("0");
        JButton jako = new JButton("/");
        JButton sin = new JButton("Sin");
        JButton cos = new JButton("Cos");
        JButton tan = new JButton("Tan");
        JButton CE = new JButton("CE");
        JButton round = new JButton("round");
        JButton uusiikkuna = new JButton("New"); //uutta
        JButton tallenna = new JButton("Save");
        C.setEnabled(false);
        
        tallenna.setToolTipText("Save");                
        yksi.setToolTipText("One");
        kaksi.setToolTipText("Two");
        kolme.setToolTipText("Three");
        neljä.setToolTipText("Four");
        viisi.setToolTipText("Five");
        kuusi.setToolTipText("Six");
        seitsemän.setToolTipText("Seven");
        kahdeksan.setToolTipText("Eight");
        yhdeksän.setToolTipText("Nine");
        nolla.setToolTipText("Zero");

        kerto.setToolTipText("Multiply");
        miinus.setToolTipText("Minus");
        plus.setToolTipText("Plus");
        round.setToolTipText("Round");
        C.setToolTipText("Clear");
        CE.setToolTipText("Cleat everything");
        tan.setToolTipText("Tanget");
        cos.setToolTipText("Cosine");
        sin.setToolTipText("Sini");
        jako.setToolTipText("Divide");
        pii.setToolTipText("Pi");       
        
        uusiikkuna.setToolTipText("New window");
        yhtakuin.setToolTipText("Equals to");

        TapahtumanKuuntelija kuuntelija = new TapahtumanKuuntelija(
        naytto2, naytto1, C,laskutoimitukset, CE,laskukaavaikkuna,
        tiedostoontallentaminen);
        

        plus.addActionListener(kuuntelija);
        plus.getToolTipText();
        jako.addActionListener(kuuntelija);
        jako.getToolTipText();
        miinus.addActionListener(kuuntelija);
        miinus.getToolTipText();
        kerto.addActionListener(kuuntelija);
        kerto.getToolTipText();
        C.addActionListener(kuuntelija);
        C.getToolTipText();
        yhtakuin.addActionListener(kuuntelija);
        yhtakuin.getToolTipText();
        pii.addActionListener(kuuntelija);
        pii.getToolTipText();

        yksi.addActionListener(kuuntelija);
        yksi.getToolTipText();
        kaksi.addActionListener(kuuntelija);
        kaksi.getToolTipText();
        kolme.addActionListener(kuuntelija);
        kolme.getToolTipText();
        neljä.addActionListener(kuuntelija);
        neljä.getToolTipText();
        viisi.addActionListener(kuuntelija);
        viisi.getToolTipText();
        kuusi.addActionListener(kuuntelija);
        kuusi.getToolTipText();
        seitsemän.addActionListener(kuuntelija);
        seitsemän.getToolTipText();
        kahdeksan.addActionListener(kuuntelija);
        kahdeksan.getToolTipText();
        yhdeksän.addActionListener(kuuntelija);
        yhdeksän.getToolTipText();
        nolla.addActionListener(kuuntelija);
        nolla.getToolTipText();
        CE.addActionListener(kuuntelija);
        CE.getToolTipText();
        sin.addActionListener(kuuntelija);
        sin.getToolTipText();
        cos.addActionListener(kuuntelija);
        cos.getToolTipText();
        tan.addActionListener(kuuntelija);
        tan.getToolTipText();
        round.addActionListener(kuuntelija);
        round.getToolTipText();
        uusiikkuna.addActionListener(kuuntelija);
        uusiikkuna.getToolTipText();
        tallenna.addActionListener(kuuntelija);
        tallenna.getToolTipText();

        panel.add(yksi);
        panel.add(kaksi);
        panel.add(kolme);
        panel.add(plus);
        panel.add(miinus);
        panel.add(kerto);
        panel.add(neljä);
        panel.add(viisi);
        panel.add(kuusi);
        panel.add(jako);
        panel.add(pii);
        panel.add(round);
        panel.add(seitsemän);
        panel.add(kahdeksan);
        panel.add(yhdeksän);
        panel.add(sin);
        panel.add(cos);
        panel.add(tan);
        panel.add(nolla);
        panel.add(yhtakuin);
        panel.add(C);
        panel.add(CE);
        panel.add(uusiikkuna);
        panel.add(tallenna);
        container.add(naytto1);
        container.add(naytto2);
        container.add(panel);

    }
    //parseri xy koordinaatisto runnable?

    public JFrame getFrame() {
        return frame;
    }
    


}
