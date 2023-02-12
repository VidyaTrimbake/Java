//write a java program which accept 2 strings from user and concat N characters of second string after first string. Valueof N should be accepted from user.
//Note: If third parameter is greater than the size of second then concat whole string after first string
//Input:    "Marvellous Infosystem"
//          "Logic Building"
//          5
//Output:   "Marvellous Infosystem Logic"

import java.util.*;
public class j35Que_1
{
    public static void main(String arg[]) 
    {
        Scanner sObj = new Scanner(System.in);
        System.out.println("Please enter the first string: ");
        String str1 = sObj.nextLine();

        System.out.println("Please enter the second string: ");
        String str2 = sObj.nextLine();

        System.out.println("Please enter any number: ");
        int iNo = sObj.nextInt();

        StringDemo dobj = new StringDemo();
        String strRet = dobj.StrNCatX(str1, str2, iNo);
        System.out.println("Concated string is: "+ str1 + strRet);
    }
}

class StringDemo
{
    public String StrNCatX(String str1, String str2, int iNo)
    {
        String strRet = " ";
        //String newstring = " ";
        if(iNo >= str2.length())
        {
            strRet = str2;
            //System.out.println(strRet);
        }
        else
        {
            for(int iCnt = 0; iCnt <iNo; iCnt++)
            {
                strRet += str2.charAt(iCnt);
                //System.out.print(str2.charAt(iCnt));
            }
            //System.out.println(str1 + (str2.charAt(iCnt)));
        }
        return strRet;
    }
}
