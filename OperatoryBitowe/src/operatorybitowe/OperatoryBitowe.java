
package operatorybitowe;

public class OperatoryBitowe {

    public static void main(String[] args) {
        /*
            0 - false, 1 - true
            Operatory bitowe
                & -> iloczyn bitowy
                | -> suma bitowa
                ^ -> XOR eXclusive OR
                x << 1 -> przesunięcie w lewo o 1
                x >> 2 -> przesunięcie w prawo o 2
        
                ~ -> Negacja bitowa 
        
        1 1 1 0 // 14 (mnożenie)
        1 0 1 1 // 11 *
        --------------
        1 0 1 0 // 10
        
        1 0 1 1 // 11 (dodawanie)
        1 0 0 1 // 9 +
        --------------
        1 0 1 1 // 11
        
        eXclusive OR
        1 1 -> 0
        0 0 -> 0
        1 0 -> 1
        0 1 ->
        
        1 1 0 1 // 13 
        1 0 1 1 // 11 ^
        --------
        0 1 1 0 // 6
        
        przesunięcia
        1 0 1 1 // 11 >>1
        0 1 0 1 // 5
        
        0 0 1 1 // 3 <<2
        1 1 0 0 // 12
        
        Negacja
        1 0 1 0 // 10~
        0 1 0 1 // -11
        */
        System.out.println(14&11);
        System.out.println(11|9);
        System.out.println(13^11);
        System.out.println(11>>1);
        System.out.println(3<<2);
        System.out.println(~10);
     }
     
}
