//Write a java program which accept two strings from user and check whether contents of two strings are equal or not.
//Input:    "Marvellous Infosystem"
//          "Marvellous Infosystem"
//Output:   TRUE
import java.util.*;
import java.lang.Boolean;
import java.nio.file.FileStore;

public class j35Que_2 
{
    public static void main(String arg[]) 
    {
        Scanner sObj = new Scanner(System.in);
        System.out.println("Please enter the first string: ");
        String str1 = sObj.nextLine();

        System.out.println("Please enter the first string: ");
        String str2 = sObj.nextLine();

        StringDemo dObj = new StringDemo();
        boolean bRet = dObj.StrCmpX(str1, str2);
        if(bRet == true)
        {
            System.out.println("Both strings are equal");
        }
        else
        {
            System.out.println("Both strings are not equal");
        }
    }
}

class StringDemo
{
    public boolean StrCmpX(String str1, String str2) 
    {
        if(str1.equals(str2))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
