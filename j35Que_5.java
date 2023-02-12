//accept string from user n check whether the string is pallindrome or not without considering its case.
//Input:    "1abccBA1"
//Output:   TRUE

import java.util.*;

import java.lang.Boolean;

class j35Que_5 
{
    public static void main(String arg[]) 
    {        
        Scanner sObj = new Scanner(System.in);
        System.out.println("Please enter the first string: ");
        String str = sObj.nextLine();
    
        StringDemo dobj = new StringDemo();

        Boolean bRet = dobj.StrPallinDrome(str);
        if(bRet == true)
        {
            System.out.println("Given string is pallindrome");
        }        
        else
        {
            System.out.println("Given string is not pallindrome");
        }
    }
}

class StringDemo
{
    public Boolean StrPallinDrome(String str)
    {
        String strTemp = " ";
        //char ch = '\0';

        for(int iCnt = str.length() - 1; iCnt >= 0; iCnt--)
        {
            strTemp = strTemp + str.charAt(iCnt);
        }

        if(str.equals(strTemp))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
