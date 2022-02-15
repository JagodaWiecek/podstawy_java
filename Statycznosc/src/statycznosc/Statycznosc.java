
package statycznosc;

public class Statycznosc {

    public static void main(String[] args) 
    {
        Matematyka zmienna = new Matematyka();
       double wynik = zmienna.dodaj(10.5,20.6);
       System.out.println(wynik);
       
       //statyczna klasa
       double wynik2 = Matematyka.dodaj(10,20);
       System.out.println(wynik2+ " + " + Matematyka.PI+"\n");
       
       Klient a = new Klient("Kinga");
       Klient b = new Klient("Jagoda");
       Klient c = new Klient("Irena");
       System.out.println("Imię: "+a.imie +"\n id: "+a.id);
       System.out.println("Imię: "+b.imie+"\n id: "+b.id);
       System.out.println("Imię: "+c.imie+"\n id: "+c.id);
       
    }
    
}

class Matematyka
{
    static final double PI =3.14;
    static double dodaj (double a,double b)
    {
        return a+b;
    }
}
class Klient
{
    Klient(String imie)
    {
        this.imie=imie;
        id=nastepnyId;
        nastepnyId++;
    }
    String imie;
    int id=0;
    static int nastepnyId=1;
}
