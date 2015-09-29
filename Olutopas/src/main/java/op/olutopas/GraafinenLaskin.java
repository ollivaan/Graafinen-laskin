package op.olutopas;

/**
 * Luokassa luodaan komponentit/elementit
 *
 */
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.UIManager;
import javax.swing.WindowConstants;
import javax.swing.text.DefaultCaret;


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
            
        } catch (Exception e) {
            e.printStackTrace();
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
//        GraafinenLaskin glaskin = new GraafinenLaskin();
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
        JButton potenssiinkaksi = new JButton("^");
        JButton CE = new JButton("CE");
        JButton round = new JButton("round");
        JButton uusiikkuna = new JButton("New"); //uutta
        C.setEnabled(false);

        TapahtumanKuuntelija kuuntelija = new TapahtumanKuuntelija(plus, miinus, jako, kerto, yhtakuin,
                naytto2, naytto1, C, pii, laskutoimitukset, potenssiinkaksi, yksi, kaksi, kolme, neljä,
                viisi, kuusi, seitsemän, kahdeksan, yhdeksän, nolla, CE, sin, cos, tan, round, laskukaavaikkuna);

        plus.addActionListener(kuuntelija);
        jako.addActionListener(kuuntelija);
        miinus.addActionListener(kuuntelija);
        kerto.addActionListener(kuuntelija);
        C.addActionListener(kuuntelija);
        yhtakuin.addActionListener(kuuntelija);
        pii.addActionListener(kuuntelija);
        potenssiinkaksi.addActionListener(kuuntelija);
        yksi.addActionListener(kuuntelija);
        kaksi.addActionListener(kuuntelija);
        kolme.addActionListener(kuuntelija);
        neljä.addActionListener(kuuntelija);
        viisi.addActionListener(kuuntelija);
        kuusi.addActionListener(kuuntelija);
        seitsemän.addActionListener(kuuntelija);
        kahdeksan.addActionListener(kuuntelija);
        yhdeksän.addActionListener(kuuntelija);
        nolla.addActionListener(kuuntelija);
        CE.addActionListener(kuuntelija);
        sin.addActionListener(kuuntelija);
        cos.addActionListener(kuuntelija);
        tan.addActionListener(kuuntelija);
        round.addActionListener(kuuntelija);
        uusiikkuna.addActionListener(kuuntelija);

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
        panel.add(potenssiinkaksi);
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
        panel.add(round);
        panel.add(uusiikkuna);
        container.add(naytto1);
        container.add(naytto2);
        container.add(panel);

    }
    //parseri xy koordinaatisto runnable?

    public JFrame getFrame() {
        return frame;
    }
    


}
