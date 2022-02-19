
package butelka;

public class Butelka {

    private double ileLitrow;
    private double ograniczenie;
    
    Butelka()
    {
    }
    Butelka(double ileLitrow,double ograniczenie)
    {
        this.ileLitrow=ileLitrow;
        this.ograniczenie=ograniczenie;
    }
    double getIleLItrow()
    {
        return ileLitrow;
    }
    double getOgraniczenie()
    {
        return ograniczenie;
    }
    void wlej(double ilosc)
    {
        this.ileLitrow+=ilosc;
        if(this.ileLitrow>this.ograniczenie)
            this.ileLitrow=this.ograniczenie;
            
    }
    boolean wylej(double ilosc)
    {
        if (ilosc <= ileLitrow)
            this.ileLitrow-=ilosc;
        else
            return false;
        
        return true;
        
    }
    void przelej(double ilosc , Butelka gdziePrzelac)
    {
        if(this.wylej(ilosc))
            gdziePrzelac.wlej(ilosc);
        else 
            System.out.println("za mało wody w butelce");
    }
    
    //-----------------------------------------
    public static void main(String[] args) {
        Butelka[] butelka= new Butelka[4]; //NULL
        String separator = "--------------------------------";
        
        for(int i=0;i<butelka.length;i++)
        {
            butelka[i]=new Butelka(5,10);
            System.out.println(butelka[i].getIleLItrow());
        }
        System.out.println(separator);
        butelka[0].przelej(1,butelka[3]);
        System.out.println(butelka[0].getIleLItrow()+"\n"+butelka[3].ileLitrow);
        
    }
    
}
