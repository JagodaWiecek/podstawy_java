
package klasaobject;


public class main {

    public static void main(String[] args) {
        
        Punkt p = new Punkt(4,10);
        System.out.println(p.getClass());
        Punkt p2 =new Punkt(10,10);
        
        if(p.equals(p2))
            System.out.println("Są równe");
        else
            System.out.println("Nie są równe");
        Punkt[] punkty = new Punkt[4];
        punkty[0]=new Punkt(3,6);
        punkty[1]=new Punkt(66,12);
        punkty[2]=new Punkt(24,41);
        punkty[3]=new Punkt(11,0);
        
        for(Punkt punkciki: punkty)
        {
            System.out.println(punkciki);
        }
    }
    
}
class Punkt
{
    private int x;
    private int y;
    Punkt()
    {
        
    }
    
    Punkt(int x,int y)
    {
        this.x=x;
        this.y=y;
    }
    int getX()
    {
        return x;
    }
    int getY()
    {
        return y;
    }
    @Override
    public boolean equals(Object o)
    {
        Punkt przyslany = (Punkt)o;
        if (o==null)
            return false;
        if (this.getClass()!= o.getClass())
            return false;
        return this.x==przyslany.x && this.y==przyslany.y;
    } 
    public String toString()
    {
        return getX()+" "+getY();
    }
    
    
}
