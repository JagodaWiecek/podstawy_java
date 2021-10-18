
package operatoryarytmetyczne;

public class OperatoryArytmetyczne {

    public static void main(String[] args) {
        
        /*
            + Dodawanie
            - Odejmowanie
            * Mnożenie
            / Dzielenie
        
            = Przypisanie wartości/ równość
            += Dodanie oo zmiennej ( a=1 -> a += 2 -> a=3 )
            -= Odejmowanie od zmiennej 
            *= Mnożenie zmiennej
            /= Dzielenie zmiennej
            %= Poda resztę z dzielenia ( a=3 -> a %= 3 -> a=0, a=2 -> a %= 3 -> a=2)
             ( int a = 3 % 3 )
        
             ++ Inkrementacja - zwiększa wartość zmiennej o 1
             -- Dekrementacja - zmiejsza wartość zmiennej o 1
        
             y++ Post Inkrementacja
             y-- Post Dekrementacja
        
             ++y Pre Inkrementacje
             --y Pre Dekrementacja
        */
        int a=2, y=3;
        a%=3;
        System.out.println(a);
        
        System.out.println(y++);
        System.out.println(++y);
        System.out.println(--y);
        
       
    }
    
}
