import java.io.*;

class BufferedInput1 
{    
    public static void main(String arg[]) 
    {
        InputStreamReader iObj = new InputStreamReader(System.in);
        BufferedReader bObj = new BufferedReader(iObj);
        String name = null;
        int Age = 0;
        float marks = 0.0f;

        try
        {
            System.out.println("Enter your name:");
            name = bObj.readLine();
            
            System.out.println("Enter your age");
            Age = Integer.parseInt(bObj.readLine());
            
            System.out.println("Enter your marks:");
            marks = Float.parseFloat(bObj.readLine());
        }
        catch(IOException obj)
        {}
        System.out.println("Name : "+name);
        System.out.println("Age : "+Age);
        System.out.println("Marks : "+marks);        
    }    
}
