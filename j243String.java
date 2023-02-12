import java.util.*;

class j243String 
{
    public static void main(String ar[]) 
    {
        Scanner sObj = new Scanner(System.in);
        System.out.println("PLease enter the your full name : ");
        String str = sObj.nextLine();
        
        for(int i =0; i < str.length(); i++)
        {
            System.out.println(str.charAt(i));
        }
    }    
}
