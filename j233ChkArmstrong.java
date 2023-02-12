//Check Armstrong number

import java.util.*;

class j233ChkArmstrong
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
    public boolean ChkArmstrong(int iNo)
    {
        int iDigitCount = 0;
        int iTemp = iNo;
        int iDigit = 0;
        int iPower = 0;
        int iSum = 0;

        while(iTemp != 0)    //Logic to calculate no of digits
        {
            iDigitCount++;
            iTemp = iTemp/10;
        }
        iTemp = iNo;

        while(iTemp != 0)
        {
            iDigit = iTemp % 10;
            for(int iCnt = 1; iCnt<=iDigitCount; iCnt++)    //logic to calcu power
            {
                iPower = iPower * iDigit;
            }
            iSum = iSum + iPower;
            iPower = 1;         //********************* */

            iTemp = iTemp / 10;
        }
        if(iSum == iNo)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
} 