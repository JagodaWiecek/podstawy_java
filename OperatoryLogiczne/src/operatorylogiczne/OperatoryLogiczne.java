
package operatorylogiczne;

public class OperatoryLogiczne {

    public static void main(String[] args) {
        /*
            Operatory Logiczne -> true false
            ! -> negacja
            !(true) -> false
            !(false) -> true
        
            && -> koniunkcja ("I") W TYM SAMYM MOMENCIE oba są prawdziwe
            true true -> true
            false true -> false
            true false -> false
            false false -> false
        
            || -> alternatywa "lub"
            true true -> true
            true false -> true
            false true -> true
            false false -> false
        */
        int a = 5, b=5, c=7;
        
        if (a==b && a<c)
            System.out.println("tak");
    }
    
}
