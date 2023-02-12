import java.util.*;

public class Collections4 
{
    public static void main(String ar[]) 
    {
        ArrayList <Float>aObj = new ArrayList<Float>();
        
        aObj.add(10.6f);
        aObj.add(20.6f);
        aObj.add(30.6f);
        aObj.add(40.6f);
        aObj.add(50.6f);

        aObj.addFirst(1.60f);

        aObj.addLast(100.60f);
        
        Iterator iObj = aObj.iterator();
        while(iObj.hasNext())
        {
            System.out.println(iObj.next());
        }
    }    
}
