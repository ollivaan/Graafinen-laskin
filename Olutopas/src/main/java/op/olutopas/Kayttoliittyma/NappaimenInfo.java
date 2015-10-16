/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package op.olutopas.Kayttoliittyma;

import javax.swing.JTextField;
import op.olutopas.Logiikka.Laskutoimitukset;
import op.olutopas.Logiikka.TapahtumanKuuntelija;
import op.olutopas.Logiikka.Tiedostoontallentaminen;

/**
 *
 * @author pirita
 */
public class NappaimenInfo extends TapahtumanKuuntelija{


    public NappaimenInfo(JTextField naytto2, JTextField naytto1, Laskutoimitukset laskutoimitukset, LaskukaavaIkkuna laskukaavaikkuna, Tiedostoontallentaminen tiedostoontallentaminen) {
        super(naytto2, naytto1, laskutoimitukset, laskukaavaikkuna, tiedostoontallentaminen);

                TapahtumanKuuntelija tapahtumakuuntelija = new TapahtumanKuuntelija(naytto2, naytto1,laskutoimitukset,laskukaavaikkuna,tiedostoontallentaminen);
                tapahtumakuuntelija.tallenna.setToolTipText("JEE");
                
                tapahtumakuuntelija.yksi.setToolTipText("One");
                tapahtumakuuntelija.yksi.setToolTipText("Two");
                tapahtumakuuntelija.yksi.setToolTipText("Three");
                tapahtumakuuntelija.yksi.setToolTipText("Four");
                tapahtumakuuntelija.yksi.setToolTipText("Five");
                tapahtumakuuntelija.yksi.setToolTipText("Six");
                tapahtumakuuntelija.yksi.setToolTipText("Seven");
                tapahtumakuuntelija.yksi.setToolTipText("Eight");
                tapahtumakuuntelija.yksi.setToolTipText("Nine");
                tapahtumakuuntelija.yksi.setToolTipText("Zero");
                
                tapahtumakuuntelija.kerto.setToolTipText("Multiply");
                tapahtumakuuntelija.miinus.setToolTipText("Minus");
                tapahtumakuuntelija.plus.setToolTipText("Plus");
                tapahtumakuuntelija.round.setToolTipText("Round");
                tapahtumakuuntelija.C.setToolTipText("Clear");
                tapahtumakuuntelija.CE.setToolTipText("Cleat everything");
                tapahtumakuuntelija.tan.setToolTipText("Tanget");
                tapahtumakuuntelija.cos.setToolTipText("Cosine");
                tapahtumakuuntelija.sin.setToolTipText("Sini");
                tapahtumakuuntelija.jako.setToolTipText("Divide");
                tapahtumakuuntelija.yhtakuin.setToolTipText("Equals to");
                
                
    }
      
    
    public void asettaaInfot() {
  
    }
    
}
