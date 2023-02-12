import java.util.*;

class j244String 
{
    public static void main(String ar[]) 
    {
        Scanner sObj = new Scanner(System.in);
        
        System.out.println("PLease enter the string : ");
        String str = sObj.nextLine();

        MarvellousX obj = new MarvellousX();
        obj.Display(str);
    }    
}

class MarvellousX
{
    public void Display(String s)
    {
        for(int i=0; i<s.length();i++)
        {
            System.out.println(s.charAt(i));
        }
    }
}