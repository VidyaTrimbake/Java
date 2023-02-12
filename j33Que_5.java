//Write a java program which accept number from user and return the difference between summation of even digits and summation of odd digits.
//Input:    2395
//Output:   -15 (2-17)

import java.util.*;

class j33Que_5
{
    public static void main(String arg[])
    {
        Scanner sObj = new Scanner(System.in);
        System.out.println("Please enter any number:");
        int iNo = sObj.nextInt();

        Digit dObj = new Digit();
        int iRet = dObj.CountDiff(iNo);
        System.out.println("Required Difference is : "+iRet);
    }
}

class Digit
{
    public int CountDiff(int iNo)
    {
        int iDigit = 1;
        int iEvSum = 0, iOdSum = 0;
        while(iNo != 0)
        {
            iDigit = iNo % 10;
            if(iDigit % 2 == 0)
            {
                iEvSum = iEvSum + iDigit;
            }
            else
            {
                iOdSum = iOdSum + iDigit;
            }
            iNo = iNo / 10;
        }
        return (iEvSum - iOdSum);
    }    
}