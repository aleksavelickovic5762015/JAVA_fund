/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalkulatorgume;
import java.util.Scanner;
import java.text.DecimalFormat;

/**
 *
 * @author leka
 */
public class Tocak {
    public int precnikFelne, sirinaGume, visina; //visina je procenat sirine gume
    
    public final double inchToCMeter = 2.54;
    
    public Tocak(int precnikFelne, int sirinaGume, int visina) 
    {
        this.precnikFelne = precnikFelne;
        this.sirinaGume = sirinaGume;
        this.visina = visina;
    }
    
    public double precnikGume(double precnikFelne, double sirinaGume, double visina)
    { 
        return (precnikFelne * inchToCMeter) + (2 * sirinaGume * (double) visina/1000);
        //PAZI NA DOUBLE
    }
    public double obimGume(double precnikGume)
    {
        return precnikGume * Math.PI;
    }
    public double brObrtajaKM (double obimGume)
    {
        return (double) Math.pow(10,5)/obimGume;
    }
    
    public double brObrtaja100kmh (double obimGume)
    {
        return 100/3.6*100 / obimGume;
    }
    
    //Alternativna guma
    public int precnikFelneA, sirinaGumeA, visinaA;
    //Kada brzinometar pokazuje 100km/h stvarna brzina vozila je
    public double stvarnaBrzina(double obimGume, double obimGumeA)
    {
        //proporcija
        return (double) 100/obimGume*obimGumeA;
    }
    //Razlika u prečniku originalne i alternativne dimenzije iznosi
    public double razlikaVisine(double precnikGume, double precnikGumeA)
    {
        return precnikGumeA-precnikGume;
    }
    
    Scanner sc = new Scanner(System.in);
        
}