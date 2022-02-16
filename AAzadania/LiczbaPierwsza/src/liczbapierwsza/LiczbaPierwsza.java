
package liczbapierwsza;
import java.util.Random;

public class LiczbaPierwsza {

    public static void main(String[] args) {
        
        Los liczba= new Los();
        System.out.println(liczba.number);
        if(liczba.los())
            System.out.println("TAK");
        else
            System.out.println("NIE"); 
        
    }
    
}
class Los
{
    Random random=new Random();
    public int number = random.nextInt(10000);
    int ile=0;
    boolean los()
    {
        for(int i=1;i<=number;i++)
        {
            if(number%i==0)
                ile++;
        }
        if(ile!=2)
            return false;
        else
            return true;
    }

}
