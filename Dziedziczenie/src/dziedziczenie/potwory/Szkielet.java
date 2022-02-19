
package dziedziczenie.potwory;

public class Szkielet extends Potwor
{
    String TypBroni;
    public Szkielet()
    {
        //Domyślny
        System.out.println("Domyślny konstruktor z klasy Szkielet");
    }
    public Szkielet(double predkoscChodzenia,double zywotnosc)
    {
        super(predkoscChodzenia,zywotnosc);
        System.out.println("NieDomyślny konstruktor z klasy Szkielet");
    }
    public Szkielet(double predkoscChodzenia,double zywotnosc, String TypBroni)
    {
        super(predkoscChodzenia,zywotnosc);
        this.TypBroni=TypBroni;
        System.out.println("NieDomyślny konstruktor z klasy Szkielet");
    }
}
