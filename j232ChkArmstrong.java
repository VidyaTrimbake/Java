//Check Armstrong number

import java.util.*;

class j232ChkArmstrong
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Please enter number : ");
        int iNo = sobj.nextInt();

        Digits dObj = new Digits();

        boolean bRet = dObj.ChkArmstrong(iNo);
        if(bRet == true)
        {
            System.out.println(iNo+" is a Armstrong number.");
        }
        else 
        {
            System.out.println(iNo+" is not a Armstrong number.");
        }        
    }
}

class Digits
{
    private int CountDigits(int iNo)
    {
        int iCnt = 0;
        while(iNo != 0)
        {
            iCnt++;
            iNo = iNo / 10;
        }
        return iCnt;
    }

    private int Power(int Base,int Index)   //Base=4 index=5
    {
        int iAns = 1;
        for(int iCnt=1;iCnt<=Index;iCnt++)
        {
            iAns = iAns * Base;
        }
        return iAns;
    }

    public boolean ChkArmstrong(int iNo)
    {
        int iTemp = iNo;
        int iSum = 0;
        int iDigit = 0;
        int iRet = 0;

        int iCount = CountDigits(iNo);

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iRet = Power(iDigit, iCount);
            iSum = iSum + iRet;

            iNo = iNo / 10;
        }

        if(iSum == iTemp)
        {
            return true;
        }
        else 
        {
            return false;
        }
    }
} 