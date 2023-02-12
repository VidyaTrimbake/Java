import java.io.*;

class BufferedInput2 
{    
    public static void main(String arg[]) throws IOException
    {
        InputStreamReader iObj = new InputStreamReader(System.in);
        BufferedReader bObj = new BufferedReader(iObj);

        //BufferedReader bObj = new BufferedReader(new InputStreamReader(System.in));
        
        String name = null;
        int Age = 0;
        float marks = 0.0f;

        System.out.println("Enter your name:");
        name = bObj.readLine();
            
        System.out.println("Enter your age");
        Age = Integer.parseInt(bObj.readLine());
            
        System.out.println("Enter your marks:");
        marks = Float.parseFloat(bObj.readLine());
    
        System.out.println("Name : "+name);
        System.out.println("Age : "+Age);
        System.out.println("Marks : "+marks);        
    }    
}
