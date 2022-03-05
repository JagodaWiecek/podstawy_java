
package main;

public class Main {

    public static void main(String[] args)
    {
        Osoba[] osoba = new Osoba[4];
        osoba[0]=new Pracownik("Jagoda","Wiecek",1000);
        osoba[1]= new Student("Jagoda","Więcek");
        osoba[3]=new Pracownik("Klara","Skart",12210);
        
       /* for(Osoba person: osoba)
        {
            if(person instanceof Osoba)
                person.PobierzOpis();
            else
                break;
        }*/
       for(Osoba person: osoba)
       {
           if(person instanceof Pracownik)
           {
               Pracownik tmp = (Pracownik)person;
               tmp.PobierzOpis();
               tmp.work();
                System.out.println();
           }
       }
    }
    
}
abstract class Osoba
{
    String imie;
    String nazwisko;
    
    Osoba(String imie,String nazwisko)
    {
        this.imie=imie;
        this.nazwisko=nazwisko;
    }
    abstract void PobierzOpis();
}
class Pracownik extends Osoba
{
    double wynagrodzenie;
    Pracownik(String imie,String nazwisko, double wynagrodzenie)
    {
        super(imie,nazwisko);
        this.wynagrodzenie=wynagrodzenie;
    }
    @Override
    void PobierzOpis()
    {
        System.out.println("Jestem Pracownikiem");
        System.out.println("Imię: "+imie);
        System.out.println("Nazwisko: "+nazwisko);
        System.out.println("Wynagrodzenie: "+wynagrodzenie);
    }
    void work()
    {
        System.out.println("I like working");
    }
    
}
class Student extends Osoba
{
    Student(String imie,String nazwisko)
    {
        super(imie,nazwisko);
    }
    @Override
    void PobierzOpis()
    {
        System.out.println("Jestem Studentem");
        System.out.println("Imię: "+imie);
        System.out.println("Nazwisko: "+nazwisko);
    }
    
}
