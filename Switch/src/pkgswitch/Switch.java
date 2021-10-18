
package pkgswitch;

public class Switch {

    public static void main(String[] args) {
        /*
            switch -> przełącznik
        */
        int a=49;
        switch(a) //można int i char
          {
            case 50:
            {
                System.out.println("a jest warte 50");
                break;
            }
            case 100:
            {
                System.out.println("a jest warte 100");
                break;
            }
            default :
            {
                System.out.println("a nie jest warte ani 50 ani 100, jest warte " + a);
                break;
            }
                    
          }
    }
    
}
