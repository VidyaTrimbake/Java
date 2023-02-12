//Write a java program which accept number from user and return the count of digits in between 3 and 7.
//Input:    23956
//Output:   1

import java.util.*;

class j33Que_3
{
    public static void main(String arg[])
    {
        Scanner sObj = new Scanner(System.in);
        System.out.println("Please enter any number:");
        int iNo = sObj.nextInt();

        Digit dObj = new Digit();
        int iRet = dObj.CountRange(iNo);
        System.out.println("Count of digits in between 3 and 7 is : "+iRet);
    }
}

class Digit
{
    public int CountRange(int iNo)
    {

        int iCnt = 0, iDigit = 0;
        while(iNo != 0)
        {
            iDigit = iNo % 10;
            if((iDigit > 3) && (iDigit < 7))
            {
                iCnt++;
            }
            iNo = iNo / 10;
        }
        return iCnt;
    }    
}