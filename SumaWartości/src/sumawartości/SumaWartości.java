
package sumawartości;


public class SumaWartości {

    
    public static void main(String[] args) {
        
       int[] liczby= {11,43,33,74,59,12};
       
       int suma=0;
       
        for (int i = 0; i< liczby.length; i++)
        {
            suma = suma + liczby[i];
            //suma+=liczby[i];
            
        }
        System.out.println(suma);
    }
    
}
