
import java.util.Date;



public class Main {
    public static void main(String[] args) {
       
        final double PI;
        PI=3.14;
       Pracownik p = new Pracownik();
       System.out.println(p.dataZatrudnienia);
      // Pracownik a = new Pracownik(2002,01,12);
     //  System.out.println(a.dataZatrudnienia);
    }
    
}
abstract class Osoba
{
    String imie;
    String nazwisko;
}
class Pracownik extends Osoba
{
    Pracownik()
    {
        this.dataZatrudnienia=new Date();
    }
    Pracownik(Date data)
    {
        this.dataZatrudnienia=data;
    }
    Date getDataZatrudnienia()
    {
        return this.dataZatrudnienia;
    }
    final Date dataZatrudnienia;
}
class Programista extends Pracownik
{
    @Override
    Date getDataZatrudnienia()
    {
        return this.dataZatrudnienia;
    }
}
