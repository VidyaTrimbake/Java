//write a java program which accept a string from user and revers the contents of that string by toggling the case

//Input:    "aCBdef"
//Output:   "FEDcbA"

import java.util.*;

public class j35Que_4
{
    public static void main(String arg[]) //throws StringIndexOutOfBoundsException
    {
        Scanner sObj = new Scanner(System.in);
        System.out.println("Please enter the first string: ");
        String str = sObj.nextLine();

        StringDemo dobj = new StringDemo();
        String strRet = dobj.StrRevTog(str);
        System.out.println("Reverse Toggled string is: ");
    }
}

class StringDemo
{
    public String StrRevTog(String str)
    {
        String strTemp1 = " ";
        char ch = '\0';
        for(int iCnt=0; iCnt < str.length(); iCnt++)
        {
            ch = str.charAt(iCnt);
            strTemp1 = strTemp1 + ch;
        }
        
        for(int iCnt = 0; iCnt<strTemp1.length(); iCnt++)
        {
            if((strTemp1.charAt(iCnt) >= 'a') && (strTemp1.charAt(iCnt) >= 'a'))
            {
                //strTemp1.charAt(ch) = String(strTemp1.charAt(iCnt) + 'A' - 'a');
            }
        }
    }
}
