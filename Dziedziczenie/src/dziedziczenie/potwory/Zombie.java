/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dziedziczenie.potwory;

/**
 *
 * @author jwiec
 */
public class Zombie extends Potwor
{
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
