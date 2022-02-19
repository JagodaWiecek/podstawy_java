
package butelka;

public class Butelka {

    private double ileLitrow;
    
    Butelka()
    {
    }
    Butelka(double ileLitrow)
    {
        this.ileLitrow=ileLitrow;
    }
    double getIleLItrow()
    {
        return ileLitrow;
    }
    void wlej(double ilosc,double ograniczenie)
    {
        this.ileLitrow+=ilosc;
        if(this.ileLitrow>ograniczenie)
            this.ileLitrow=ograniczenie;
            
    }
    boolean wylej(double ilosc)
    {
        if (ilosc <= ileLitrow)
            this.ileLitrow-=ilosc;
        else
            return false;
        
        return true;
        
    }
    void przelej(double ilosc,double ograniczenie, Butelka gdziePrzelac)
    {
        if(this.wylej(ilosc))
            gdziePrzelac.wlej(ilosc,ograniczenie);
        else 
            System.out.println("za mało wody w butelce");
    }
    
    //-----------------------------------------
    public static void main(String[] args) {
        Butelka[] butelka= new Butelka[4]; //NULL
        String separator = "--------------------------------";
        
        for(int i=0;i<butelka.length;i++)
        {
            butelka[i]=new Butelka(5);
            System.out.println(butelka[i].getIleLItrow());
        }
        System.out.println(separator);
        butelka[0].przelej(1,9,butelka[3]);
        System.out.println(butelka[0].getIleLItrow()+"\n"+butelka[3].ileLitrow);
        
    }
    
}
