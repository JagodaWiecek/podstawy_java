
package interfejsy;

import java.util.Arrays;
import java.lang.Math;
import java.util.Collection;
import java.util.Collections;

public class Interfejsy {

    public static void main(String[] args) 
    {
       double a = nazwaInterfejsu.PI;
      // System.out.println(a);
       //nazwaInterfejsu b = new Pracownik();
       //((Pracownik)b).getWynagrodzenie();
       double[] tab= new double [5];
       
       for(int i=0; i<tab.length;i++)
       {
           tab[i]=Math.pow(-7.0,i);
           
           System.out.println(tab[i]);
       }
       System.out.println();
        Arrays.sort(tab);
        for(double t:tab)
        {
            System.out.println(t);
        }
        //----------------------------------
        Pracownik[] p = new Pracownik[3];
        p[0]=new Pracownik(10000);
        p[1]=new Pracownik(200);
        p[2]=new Pracownik(443000);
        Arrays.sort(p);
        System.out.println(p[0].compareTo(p[1]));
        
        String[] tekst = new String[3];
        tekst[0]="Krysia";
        tekst[1]="Anna";
        tekst[2]="Zuza";
        Arrays.sort(tekst); //rosnąco
        System.out.println(Arrays.toString(tekst));
        Arrays.sort(tekst,Collections.reverseOrder());
        System.out.println(Arrays.toString(tekst));
    }
    
}
interface nazwaInterfejsu
{
    double PI = 3.14; //public static final
    
    void cos(); //public abstract 
}
interface cosik
{
    int liczba = 10;
}
class Pracownik implements nazwaInterfejsu,cosik,Comparable // nie ma wieloimplementacji z klasami, tylko interfejsami
{
    @Override
    public void cos() {
        System.out.println(liczba);
    }
    private double wynagrodzenie;
    public double getWynagrodzenie()
    {
        return this.wynagrodzenie;
    }
    Pracownik (double wynagrodzenie)
    {
        this.wynagrodzenie=wynagrodzenie;
    }

    @Override
    public int compareTo(Object o) {
        Pracownik przyslany = (Pracownik) o;
       if( this.wynagrodzenie<przyslany.wynagrodzenie)
           return -1;
       else if (this.wynagrodzenie==przyslany.wynagrodzenie)
           return 0;
       else 
           return 1;
    }
    
}