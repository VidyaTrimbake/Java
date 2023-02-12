//write a java program which accept string from user and count number of small characters
//Input:    "marvellous Multi OS"
//Output:   13

import java.util.*;

class j31Que_2
{
    public static void main(String arg[])
    {
        Scanner sObj = new Scanner(System.in);

        System.out.println("Enter the string");
        String str = sObj.nextLine();

        StringDemo dObj = new StringDemo();
        int iRet = dObj.CountSmall(str); 
        System.out.println("Number of capital case letters are: "+iRet);
    }
}

class StringDemo
{
    public int CountSmall(String str)
    {
        int iCnt = 0;
        int iCntLetter = 0;
        for(iCnt=1; iCnt<str.length(); iCnt++)
        {
            if((str.charAt(iCnt) >= 'a') && (str.charAt(iCnt) <='z'))
            {
                iCntLetter++;
            }
        }
        return iCntLetter;
    }
}

