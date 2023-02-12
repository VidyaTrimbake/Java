import java.util.*;

class Collections8
{
    public static void main(String ar[]) 
    {
        Hashtable<String, Integer>hObj = new Hashtable<String, Integer>();

        hObj.put("PPA",18000);
        hObj.put("LB",17000);
        hObj.put("Python",16500);
        hObj.put("LSP",21000);

        System.out.println(hObj.get("Python"));

        hObj.remove("LB");

        Enumeration eObj = hObj.keys();

        while(eObj.hasMoreElements())
        {
            System.out.println("Data is" +eObj.nextElement());
        }

    }    
}
