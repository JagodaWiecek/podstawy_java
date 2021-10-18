
package wyrażeniawarunkowe;

public class WyrażeniaWarunkowe {

    public static void main(String[] args) {
        /*
            wyrażenie '?' co ma się wydarzyć jeśli jest true po : ma się wydarzyć gdy jest false
        */
        
        int a=5;
        
        /*if (a%2==0)
            System.out.println("liczba jest parzysta");
        else
            System.out.println("liczba nie jest parzysta");*/
        
        String czyParzysta = a % 2 == 0 ? "parzysta" : "nieparzysta";
        
        System.out.println(czyParzysta);
    
    }
    
}
