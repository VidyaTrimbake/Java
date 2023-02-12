//write a java program which 

//write a java program which accept 2 strings from user and check whether first N contents of two strings are equal or not.
//Note: If third parameter is greater than the size of second then concat whole string after first string
//Input:    "Marvellous Infosystem"
//          "Marvellous Logic Building"
//          10
//Output:   TRUE

import java.util.*;
import java.lang.Boolean;

public class j35Que_3
{
    public static void main(String arg[]) //throws StringIndexOutOfBoundsException
    {
        Scanner sObj = new Scanner(System.in);
        System.out.println("Please enter the first string: ");
        String str1 = sObj.nextLine();

        System.out.println("Please enter the second string: ");
        String str2 = sObj.nextLine();

        System.out.println("Please enter any number: ");
        int iNo = sObj.nextInt();

        StringDemo dobj = new StringDemo();
        boolean bRet = dobj.StrNCatX(str1, str2, iNo);
        if(bRet == true)
        {
            System.out.println("TRUE");
        }
        else
        {
            System.out.println("FALSE");   
        }
    }
}

class StringDemo
{
    public boolean StrNCatX(String str1, String str2, int iNo)
    {
        String strRet1 = " ";
        String strRet2 = " ";

        if(iNo > str2.length())
        {
            //strRet = str2;
            System.out.println(str1 +" " +str2);
            return false;
        }

        for(int iCnt1 = 1; iCnt1 < iNo; iCnt1++)
        {
            strRet1 += str1.charAt(iCnt1);
            //strRet2 += str2.charAt(iCnt);
        }

        for(int iCnt2 = 1; iCnt2 < iNo; iCnt2++)
        {
            strRet2 += str2.charAt(iCnt2);
        }

        if(strRet1.equals(strRet2))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
