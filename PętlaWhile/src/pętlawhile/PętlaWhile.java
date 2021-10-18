
package pętlawhile;

public class PętlaWhile {

    public static void main(String[] args) {
        String[] kursyProgramowania = 
        {
            "Java",
            "Java Aplikacje",
            "Java Strumienie",
            "Java Aspekty Zaawansowane",
            "Java Android",
            "C#",
            "C# Tworzenie Aplikacji"
        };
        int i=0;
        while (i <= kursyProgramowania.length -1)
        {
            System.out.println(kursyProgramowania[i]);
            i++;
        }
        //-------------------------------------------------------------
        i=0;
        do
        {
            System.out.println(kursyProgramowania[i]);
            i++;
            
        }while(i<kursyProgramowania.length);
        //------------------------------------------------------------
        int a=0;
        
        while (a<=100)
        {
            System.out.println(a);
            a=a+10;
        }
      //-------------------------------------------------------------  
        for (int c=0; c<kursyProgramowania.length; c++)
        {
            System.out.println(kursyProgramowania[c]);
        }
        //-----------------------------------------------------------
        //Enhanced for
        for (String MyValue: kursyProgramowania)
        {
            System.out.println(MyValue);
        }
        
    }
    
}
