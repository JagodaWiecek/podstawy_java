
package dziedziczenie.potwory;

public class Zombie extends Potwor
{
    @Override
    public void atakuj()
    {
        super.atakuj();
        System.out.println("Metoda ataku z klasy Zombie");
    }
    public Zombie()
    {
        System.out.println("Domyślny konstruktor z klasy Zombie");
    }
    public Zombie(double predkoscChodzenia,double zywotnosc)
    {
        super(predkoscChodzenia,zywotnosc);
        System.out.println("NieDomyślny konstruktor z klasy Zombie");
    }
}
