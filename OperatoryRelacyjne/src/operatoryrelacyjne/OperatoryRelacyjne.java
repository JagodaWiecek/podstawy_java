
package operatoryrelacyjne;


public class OperatoryRelacyjne {

    
    public static void main(String[] args) {
        
        /*
            Operator Relacyjny -> Porównania
            
            4 = 4 -> przypisanie
            4 == 4 -> porównanie
            != -> sprawdzenie czy coś jest różne ( 4!=5 true)
            < -> Czy jest mniejsze od
            <= -> Czy jest mniejsze bądź równe
            > -> Czy jest większe od
            >= -> Czy jest większe bądź równe
            
            
        */
        
        boolean isTrue = 4==4, isFalse = 4==3;
        
            System.out.println(isTrue);
            System.out.println(isFalse);
            System.out.println(5 != 6);
        
        if (5==7)
            System.out.println(isTrue);
            
        if (4==4)
            System.out.println(isTrue);
    }
    
}
