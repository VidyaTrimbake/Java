//Write a java program which accept string from user and return difference between frequency of small characters and frequency of capital characters.
//Input:    "Marvellous"
//Output:   6 (8-2)

import java.util.*;

class j31Que_3
{
    public static void main (String srg[])
    {
        Scanner sObj = new Scanner(System.in);

        System.out.println("Please enter any string");
        String str = sObj.nextLine();

        StringDemo dobj = new StringDemo();
        int iRet = dobj.CountDiff(str);
        System.out.println("Difference of frequency is : "+iRet);

    }
}

class StringDemo
{
    public int CountDiff(String str)
    {
        
        int iCnt = 0, iCntCap = 0, iCntSm = 0;

        for(iCnt=1; iCnt < str.length(); iCnt++)
        {
            if((str.charAt(iCnt) >= 'a') && (str.charAt(iCnt)) <= 'z')
            {
                iCntSm++;
            }
            else
            {
                iCntCap++;
            }
        }
        int iDiff = iCntCap - iCntSm;

        if(iDiff < 0)   //Updater
        {
            iDiff = -iDiff;
        }
        return iDiff;
    }
}