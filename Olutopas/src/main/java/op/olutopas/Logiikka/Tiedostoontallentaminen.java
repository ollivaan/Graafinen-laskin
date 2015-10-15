/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package op.olutopas.Logiikka;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import java.io.File;
import java.io.PrintWriter;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author pirita
 */
public class Tiedostoontallentaminen {
    public Laskutoimitukset laskut;
    
    public void talleta(String input, String output) throws Exception{

           Calendar calendar = Calendar.getInstance();
           java.util.Date now = calendar.getTime();



       try{
        PrintWriter tiedosto = new PrintWriter(new File( "Saved:  " + now + ".txt"));
        tiedosto.print(input);
        tiedosto.printf(" = ");
        tiedosto.print(output);
        
        tiedosto.close();
       } catch(Exception e ){
           
       }
//        PrintWriter tiedosto = new PrintWriter(new File( "Tallennettu.txt"));
//        tiedosto.print(arvo);
//        tiedosto.close();
    }
    
}
