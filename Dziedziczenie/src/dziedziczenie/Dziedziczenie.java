
package dziedziczenie;

import dziedziczenie.potwory.Potwor;
import dziedziczenie.potwory.Szkielet;
import dziedziczenie.potwory.Zombie;

public class Dziedziczenie {

    public static void main(String[] args) {
        Potwor p = new Szkielet(20,50);
       /* Szkielet s = new Szkielet(20,50,"Łuk");
        Zombie z = new Zombie(5,30);
        s.atakuj();*/
       p.atakuj();
       Potwor z = new Zombie();
       
        
        
    }
    
}
