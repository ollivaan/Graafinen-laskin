/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package op.olutopas;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
 
public class GraafinenLaskin implements Runnable {
 
    private JFrame frame;
 
 
    @Override
    public void run() {
        frame = new JFrame("Laskin");
        frame.setPreferredSize(new Dimension(500, 300));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        luoKomponentit(frame.getContentPane());
        frame.setVisible(true);   
        frame.pack();
    }
 
    private void luoKomponentit(Container container) {
        GridLayout GL = new GridLayout(3, 1);
        container.setLayout(GL);
        JTextField kentta = new JTextField("0");
        kentta.setEnabled(false);
        JTextField eka = new JTextField();
        JPanel panel = new JPanel(new GridLayout(2, 4));
         
        container.add(panel);
        container.add(kentta);
        
        JButton nolla = new JButton("0");
        JButton yksi = new JButton("1");
        JButton kaksi = new JButton("2");
        JButton kolme = new JButton("3");
        JButton neljä = new JButton("4");
        JButton viisi = new JButton("5");
        JButton kuusi = new JButton("6");
        JButton seitsemän = new JButton("7");
        JButton kahdeksan = new JButton("8");
        JButton yhdeksän = new JButton("9");
        JButton plus = new JButton("+");
        JButton miinus = new JButton("-");
        JButton kerto = new JButton("*");
        JButton yhtakuin = new JButton("=");
        JButton C = new JButton("C");
        JButton pii= new JButton("π");
        Laskutoimitukset laskutoimitukset = new Laskutoimitukset();
        C.setEnabled(false);

        TapahtumanKuuntelija kuuntelija = new TapahtumanKuuntelija(plus, miinus, kerto, yhtakuin, kentta, eka, C, pii, laskutoimitukset);
//        yksi, kaksi, kolme, neljä, viisi, kuusi, seitsemän, kahdeksan, yhdeksän,
        plus.addActionListener(kuuntelija);
        yksi.addActionListener(kuuntelija);
        miinus.addActionListener(kuuntelija);
        kerto.addActionListener(kuuntelija);
        C.addActionListener(kuuntelija);
        yhtakuin.addActionListener(kuuntelija);
        pii.addActionListener(kuuntelija);
        panel.add(yksi);
        panel.add(plus);
        panel.add(miinus);
        panel.add(kerto);
        panel.add(pii);
        panel.add(yhtakuin);
        panel.add(C);
        container.add(kentta);
        container.add(eka);
        container.add(panel);
 
    }
 
    public JFrame getFrame() {
        return frame;
    }
 
 
}
