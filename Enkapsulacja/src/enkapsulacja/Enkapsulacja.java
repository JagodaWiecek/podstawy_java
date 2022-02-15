
package enkapsulacja;

public class Enkapsulacja {

    public static void main(String[] args) {
        
        /*
        Entapsulacja -> (hermetyzacja) pakowanie właściwości w taki sposób,
                        aby nie było do nich dostępu bezpośrednio z innych klas
        */
        int kasa=10555;
        KontoBankowe oszczednosciowe = new KontoBankowe();
        if (oszczednosciowe.wyplat(10000))
            System.out.println("wypłacono");
        else
            System.out.println("za mało pieniędzy");
        
        oszczednosciowe.wplac(kasa);
        System.out.println("wpłacono: "+ kasa+" zł");
        System.out.println(oszczednosciowe.getSaldo());
        
    }
    
}
class KontoBankowe
{
    public KontoBankowe()
    {
        saldo=1000;
    }
    private int saldo;
    
    int getSaldo()
    {
        return saldo;
    }
    private void setSaldo(int saldo)
    {
        ///Warunki!!
        this.saldo=saldo;
    }
    boolean wyplat (int ile)
    {
        if (saldo<ile)
            return false;
        else
            setSaldo(saldo-ile);
            return true;   
    }
    boolean wplac (int ile)
    {
        setSaldo(saldo+ile);
        return true;
    }
}
