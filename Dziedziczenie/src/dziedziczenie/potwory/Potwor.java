/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dziedziczenie.potwory;

/**
 *
 * @author jwiec
 */
public class Potwor {
    
    public double predkoscChodzenia=10;
    public double zywotnosc;
    
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
