package zmienne;


public class Zmienne {

    
    public static void main(String[] args) {
    
        int a=10, b=6;
        String imie="Jagoda";
        String nazwisko="Więcek";
        long p=11212121212121212L;
        int c;
        short s=127;
        byte o;
        long h;
        c=a+b;
        h=a+p;
        System.out.println(imie);
        imie="Selena";
        String DaneOsobowe = imie + " " + nazwisko;
        System.out.println(imie);
        System.out.println(c);
        System.out.println(h);
        System.out.println(s);

          /*
            Typy całkowite
                byte - 8 bity - od -128 do 127
                short - 16 bity - od 32,768 do 32,787
                int - 32 bity - od -2^31 do 2^32 -1
                long - 64 bity - od -2^63 do 2^63 -1 

            Typ tekstowy
                char - 2 bajtowy
                String
                
            Zmienne zmiennoprzecinkowe 
                float - 32 bity - 1,4 * 10 ^-45 do 3,4 * 10^138
                double - 64 bity od -4,9 * 10^-324 do 1,8 * 10^308
        */      
          imie="Jagoda";
          System.out.println(DaneOsobowe);
          char znak= 'A';
          System.out.println(znak);
          System.out.println(imie+ " "+ nazwisko);
          
          float liczba1=6.66f;
          double liczba=8.77;
          /* 
          NIE WOLNO 
            1. Nazywać zmiennych keywordami
            2. na początku nazwy zmiennej nie może być liczb
            3. nie wolno korzystać w nazwie zmiennej ze spacji
          */
          final double LICZKA_PI=3.14;
    }
    
}
