/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalkulatorgume;

/**
 *
 * @author leka
 */
public class PutnickaGuma extends Tocak {
    public String brzina;
    public String brzinaA;
    public int precnikFelne, sirinaGume, visina;
    
    public PutnickaGuma (int precnikFelne, int sirinaGume, int visina, String brzina, String brzinaA)
    {
        super(precnikFelne, sirinaGume, visina);
        this.brzina = brzina;
        this.brzinaA = brzinaA;
        //super.precnikGume(precnikFelne, sirinaGume, visina);
        //super.obimGume( super.precnikGume(precnikFelne, sirinaGume, visina));
        //super.brObrtajaKM(super.obimGume(super.precnikGume(precnikFelne, sirinaGume, visina)));
        //super.brObrtaja100kmh(super.obimGume(super.precnikGume(precnikFelne, sirinaGume, visina)));
    }
 
    public static final String[] BrzinaSlovo = {"N","P","Q","R","S","T","U","H","V","Z","W","Y"};
    
    public static final double[] BrzinaBroj = {140,150,160,170,180,190,200,210,240,255,270,300};
       public int vratiIndex(String brzina, String[] brzinaSlovo)
    {
        for(int i=0;i<brzinaSlovo.length;i++)
        {
            if(brzinaSlovo[i].equals(brzina))
                return i;
        }
        return 0;
    }   
    
    public double brObrtajaMaxBrzina (String brzina, double obimGume)
    {
        return BrzinaBroj[vratiIndex(brzina,BrzinaSlovo)]/3.6*100 / obimGume;
    }
    public double razlikaBrzina(String brzina, String brzinaA)
    {
        return (BrzinaBroj[vratiIndex(brzinaA,BrzinaSlovo)]-BrzinaBroj[vratiIndex(brzina,BrzinaSlovo)]);
    }
}
