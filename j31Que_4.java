//Write a java program which accept string from user and check whetther it contains vowels or not
//Input:    "Marvellous"
//Output:   6 (8-2)

import java.util.*;
import java.lang.Boolean;

class j31Que_4
{
    public static void main (String srg[])
    {
        boolean bRet = false;
        Scanner sObj = new Scanner(System.in);

        System.out.println("Please enter any string");
        String str = sObj.nextLine();

        StringDemo dobj = new StringDemo();
        bRet = dobj.CountDiff(str);
        if(bRet == true)
        {
            System.out.println("Vowels are present in given string i.e. TRUE ");
        }
        else
        {
            System.out.println("Vowels are not present in given string i.e. FALSE ");
        }
    }
}

class StringDemo
{
    public boolean CountDiff(String str)
    {
        int iCntV = 0;
        for(int iCnt = 1; iCnt < str.length(); iCnt++)
        {
            if((str.charAt(iCnt) == 'a') || (str.charAt(iCnt) == 'e') || (str.charAt(iCnt) == 'i') || (str.charAt(iCnt) == 'o') || (str.charAt(iCnt) == 'u'))
            {
                iCntV++;
            }
        }
        if(iCntV == 0)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
}