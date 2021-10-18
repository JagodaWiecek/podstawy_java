
package breakcontinue;


public class BreakContinue {

    
    public static void main(String[] args) {
        
     for (int j=1; j<=10;j++)
     {
            for (int i=1; i<=10;i++)
            {
               if (i%2!=0)
                   continue;
                System.out.print(i*j+" ");
            }
            
            System.out.println();
     }
//        for (int i=0; i<12; i++)
//        {
//            if (i%2!=0)
//                continue;
//            if (i==11)
//                break;
//            System.out.println(i);
//        }

    }
    
}
