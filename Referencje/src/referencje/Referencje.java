
package referencje;


public class Referencje {

    public static void main(String[] args) {
        
        int a = 53;
        int b = a;
        b = 10;
        
        Test x = new Test(); //w x nie znajduje się żadna wartość zwykła typowa prymitywna TYLKO ADRES
        Test y = x;
        y.a=40;
        System.out.println(x.a);
        
        a = x.changeVariable(a);
        System.out.println(a); 
        
        Foo foo = new Foo();
        x.change(foo);
        System.out.println(foo.y);
         // Porównywanie Stringów
         String imie = new String("Jagoda");
         String imie2 = new String("Jagoda"); //Bo string jest optymalizowany, referencyjny
         if (imie.equals(imie2)) // (imie==imie2) to poównanie adresów
             System.out.println(imie);
        
    }
    
}
class Test
{
    int a = 20;
    
    int changeVariable(int var)
    {
        var=var+10;
        return var;
    }
    void change (Foo var)
    {
        var.y=var.y+20;
    }
}
class Foo
{
    int y = 20;
}