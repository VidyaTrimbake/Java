//Write a java program which accept number from user and return the count of odd digits
//Input:    2395
//Output:   3

import java.util.*;

class j33Que_2
{
    public static void main(String arg[])
    {
        Scanner sObj = new Scanner(System.in);
        System.out.println("Please enter any number:");
        int iNo = sObj.nextInt();

        Digit dObj = new Digit();
        int iRet = dObj.CountOdd(iNo);
        System.out.println("Odd numbers are : "+iRet);
    }
}

class Digit
{
    public int CountOdd(int iNo)
    {

        int iCnt = 0, iDigit = 0;
        while(iNo != 0)
        {
            iDigit = iNo % 10;
            if(iDigit % 2 != 0)
            {
                iCnt++;
            }
            iNo = iNo / 10;
        }
        return iCnt;
    }    
}