//Write a java program which accept number from user and return the count of evev digits
//Input:    2395
//Output:   1

import java.util.*;
class j33Que_1
{
    public static void main(String arg[])
    {
        Scanner sObj = new Scanner(System.in);
        System.out.println("Please enter any number: ");
        int iNo = sObj.nextInt();

        Digit dObj = new Digit();
        int iRet = dObj.CountEven(iNo);
        System.out.println("Total even numbers are: "+iRet);
    }
}

class Digit
{
    public int CountEven(int iNo)
    {
        int iCnt = 0, iDigit = 0;
        while(iNo != 0)
        {
            iDigit = iNo % 10;
            if(iDigit % 2 == 0)
            {
                iCnt++;
            }
            iNo = iNo / 10;
        }
        return iCnt;
    }
}