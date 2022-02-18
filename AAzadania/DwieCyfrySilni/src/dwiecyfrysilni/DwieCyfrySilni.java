
package dwiecyfrysilni;
import java.util.Scanner;

public class DwieCyfrySilni {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Factorial f = new Factorial();
        System.out.println("proszę wpisać liczbę całkowitą");
        int a = scan.nextInt();
        while(a<0 || a>30)
        {
            a = scan.nextInt();
        }
         Foo foo=new Foo();
         foo.silnia = f.factorial(a);
         System.out.println(foo.silnia);
         f.iled(foo); // ile dziesiątek
         f.ilej(foo); // ile jedynek
         System.out.println(foo.dziesiec+" "+foo.jeden);
    }
    
}
class Factorial
{
    int factorial(int n)
    {
        int nn=1;
        for(int i=1;i<=n;i++)
        {
            nn*=i;
        }
        if(n<2)
            return nn=1;
        else if (n>=2)
            return nn;
        return 0;
    }
    void iled(Foo var)
    {
         while (var.silnia>=10)
        {
            var.silnia=var.silnia-10;
            var.dziesiec++;
        }
    }
    void ilej(Foo var)
    {
        while (var.silnia>0)
        {
            var.silnia--;
            var.jeden++;
        }
    }
}
class Foo
{
    int silnia=0;
    int dziesiec=0;
    int jeden=0;
}
