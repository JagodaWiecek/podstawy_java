
package dziedziczenie;
import dziedziczenie.potwory.Potwor;

public class Pajak extends Potwor
  {
    
    @Override
    public void atakuj()
    {
        super.atakuj();
        opis();
    }
    public Pajak()
    {
        this.predkoscChodzenia=15;
        this.zywotnosc=20;
    }
    @Override
     protected void opis()
    {
        System.out.println("Pająk potrafi się wspinać, ma jeden metr wysokości i atakuje szybciej ale ma mniej życia");
    }
}
