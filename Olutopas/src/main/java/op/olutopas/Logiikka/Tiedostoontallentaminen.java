
package op.olutopas.Logiikka;


import java.io.File;
import java.io.PrintWriter;
import java.util.Calendar;


/**
 * Luokka tallentaa laskutoimituksen tekstitiedostoon
 * 
 */
public class Tiedostoontallentaminen {
    public Laskutoimitukset laskut;
    public Calendar calendar = Calendar.getInstance();
    public java.util.Date now = calendar.getTime();
    
/**
 * Metodi talletaa laskutoimitukset
 * @param input käyttäjän lasku
 * @param output käyttäjän syöttämän laskun tulos
 */
    public void talleta(String input, String output) {


       try{
        PrintWriter tiedosto = new PrintWriter(new File( "Saved:  " + now + ".txt"));
        tiedosto.print(input);
        tiedosto.printf(" = ");
        tiedosto.print(output);
        
        tiedosto.close();
       } catch(Exception e ){
           
       }

    }
    
}
