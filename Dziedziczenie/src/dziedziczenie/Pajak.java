
package dziedziczenie;
import dziedziczenie.potwory.Potwor;

public class Pajak extends Potwor
  {
    
    @Override
    public void atakuj()
    {
        super.atakuj();
    }
    public Pajak()
    {
        this.predkoscChodzenia=15;
        this.zywotnosc=20;
    }
}
