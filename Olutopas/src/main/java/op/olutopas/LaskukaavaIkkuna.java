

package op.olutopas;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.UIManager;

/**
 *
 * @author ollivaan
 */
/**
 * Luokka luo uuden ikkunan jossa voi laskea laskuja
 *
 */
public class LaskukaavaIkkuna implements Runnable {
  
/**
 * Metodi luo uuden ikkunan
 *
 */
    
    public static void uusiIkkuna() {
        EventQueue.invokeLater(new Runnable() {
            
            @Override
            public void run() {
                JFrame frame = new JFrame("Laskin");
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (Exception e) {
                    e.printStackTrace();
                }

                JPanel panel = new JPanel();
                panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
                JTextArea textArea = new JTextArea(15, 50);
                Laskutoimitukset laskut = new Laskutoimitukset();

                textArea.setEditable(false);
                JScrollPane scroller = new JScrollPane(textArea);
                scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
                scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
                JPanel inputpanel = new JPanel();
                inputpanel.setLayout(new FlowLayout());
                JTextField input = new JTextField(20);
                JButton button = new JButton("Laske");
                LaskuJarjestys laskujarjestys = new LaskuJarjestys(textArea, laskut);
                
                LKTapahtumaKuuntelija laskukaavaikkunantapahtumakuuntelija = new LKTapahtumaKuuntelija(button, textArea, input, laskujarjestys);
                button.addActionListener(laskukaavaikkunantapahtumakuuntelija);
                
                    
                panel.add(scroller);
                inputpanel.add(input);
                inputpanel.add(button);
                panel.add(inputpanel);
                frame.getContentPane().add(BorderLayout.CENTER, panel);
                frame.pack();
                frame.setVisible(true);
                frame.setResizable(false);

                input.requestFocus();
            }
        });
    }


    @Override
    public void run() {
    }


}
