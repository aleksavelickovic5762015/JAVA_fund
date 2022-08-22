/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalkulatorgume;
import java.util.Arrays;

/**
 *
 * @author leka
 */
public class TeretnaGuma extends Tocak{
    public int nosivost, nosivostA;
    public int precnikFelne, sirinaGume, visina;
    
    public TeretnaGuma (int precnikFelne, int sirinaGume, int visina, int nosivost, int nosivostA)
    {
        super(precnikFelne, sirinaGume, visina);
        this.nosivost = nosivost;
        this.nosivostA = nosivostA;
    }
        
    
    public static final int[] indexNosivost = {62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 
        88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 
        115, 116, 117, 118, 119, 120, 121, 122, 123, 124, 125,127};
    
    public static final int[] nosivostKG = {265,272,280,290,300,307,315,325,335,345,355,365,375,387,400,412,425,437,450,462,475,487,500,515,530,
        545,560,580,600,615,630,650,670,690,710,730,750,775,800,825,850,875,900,925,950,975,1000,1030,1060,1090,1120,1150,1180,
        1215,1250,1285,1320,1360,1400,1450,1500,1550,1600,1650,1700};
    
    public static final double[] BrzinaBroj = {140,150,160,170,180,190,200,210,240,255,270,300};
       public int vratiIndex(int nosivost, int[] indexNosivosti)
    {
        for(int i=0;i<indexNosivosti.length;i++)
        {
            if(indexNosivosti[i]==nosivost)
                return i;
        }
        return 0;
    }
    
    public int razlikaNosivosti(int nosivost, int nosivostA)
    {
        return nosivostKG[vratiIndex(nosivostA,indexNosivost)]-nosivostKG[vratiIndex(nosivost,indexNosivost)];
    }    

    
}
