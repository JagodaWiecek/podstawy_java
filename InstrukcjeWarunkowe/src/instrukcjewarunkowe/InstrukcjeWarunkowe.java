
package instrukcjewarunkowe;

public class InstrukcjeWarunkowe {

    public static void main(String[] args) {
        /*
            boolean -> true false
            Instrukcje Warunkowe
        
            if (wyrażenie)
                a = a + 2;
            else
                b++;
        */
        int a=5, b=7;
        
        if (a < b)
        {  
            System.out.println("a < b");
            a++;
        }
        else if (a > b)
            System.out.println("a > b");
        else
        {
           System.out.println("a = b"); 
           b++;
        }    
            
    }
    
}
