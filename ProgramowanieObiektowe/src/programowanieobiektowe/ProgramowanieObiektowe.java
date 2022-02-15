
package programowanieobiektowe;


public class ProgramowanieObiektowe {

    public static void main(String[] args) {
     /* 
            Obiekty -> to pojemniki do przechowywania zmiennych 
                       i funkcji tematycznie ze sobą powiązanych do
                       dalszego ponownego użycia
            Klasy (class) -> foremki do tworzenia egzemplarzy obiektów
            Properties -> właściwości
            Metody -> funkcje
        */
     Punkt p= new Punkt();
     p.x = 5;
     p.y = 20;
     System.out.println(p.x+" and "+p.y);
     
     Punkt P = new Punkt(17,19);
     
    System.out.println(P.x+" i "+P.y);
  
     Test a = new Test();
     a.wypisz("Truskawka", "jest smaczna");
     Test j= new Test();
     j.wypisz("jagoda", "jest fioletowa");
     
     System.out.println(a.dzielenie(112.6, 16));
     System.out.println(j.dzielenie(9.11, 0));
    }
}
class Punkt
{ 
    int x;
    int y;
    Punkt()
    {
        System.out.println("wywołano konstruktor domyślny");
    }
    Punkt (int x1, int y1)
    {
        System.out.println("wysłano argument z dwoma parametrami");
        this.x = x1;
        this.y = y1;
    }
   
}

class Test
{
    void wypisz(String slowo, String zdanie)
    {
        System.out.println("Wywołany parametr");
        System.out.println(slowo +": \n"+ zdanie +"\n");
    }
    
    double dzielenie (double a, double b)
    {
        if(b==0)
            return 0;
        else
            return a/b;
    }
}
