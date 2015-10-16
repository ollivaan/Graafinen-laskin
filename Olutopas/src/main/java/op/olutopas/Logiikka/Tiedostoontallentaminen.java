/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package op.olutopas.Logiikka;


import java.io.File;
import java.io.PrintWriter;
import java.util.Calendar;


/**
 *
 * @author pirita
 */
public class Tiedostoontallentaminen {
    public Laskutoimitukset laskut;
    public Calendar calendar = Calendar.getInstance();
    public java.util.Date now = calendar.getTime();
    
    public void talleta(String input, String output) throws Exception{


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
