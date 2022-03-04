
package dziedziczenie.potwory;

public class Potwor {
    
    protected double predkoscChodzenia=10;
    protected double zywotnosc;
    
    public void atakuj()
    {
        //
        System.out.println("To jest metoda ataku z klasy Potwor");
    }
    
    public Potwor()
    {
        System.out.println("Domyślny konstruktor z klasy Potwor");
    }
    public Potwor(double predkoscChodzenia,double zywotnosc)
    {
        this.predkoscChodzenia = predkoscChodzenia;
        this.zywotnosc=zywotnosc;
        System.out.println("NieDomyślny konstruktor z klasy Potwor");
    }
}
