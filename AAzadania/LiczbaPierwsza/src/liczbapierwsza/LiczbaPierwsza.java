
package liczbapierwsza;
import java.util.Random;

public class LiczbaPierwsza {

    public static void main(String[] args) {
        
        Random random=new Random();
        int number = random.nextInt(10000);
        int ile=0;
        System.out.println(number);
        for(int i=1;i<=number;i++)
        {
            if(number%i==0)
                ile++;
            
        }
        //System.out.println(ile);
        if(ile==2)
            System.out.println("Tak");
        else if (ile>2)
            System.out.println("Nie");
        else
            System.out.println("To nie liczba pierwsza");
            
    }
    
}
