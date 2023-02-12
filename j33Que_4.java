//Write a java program which accept number from user and return the multiplication of all digits.
//Input:    1018
//Output:   8

import java.util.*;

class j33Que_4
{
    public static void main(String arg[])
    {
        Scanner sObj = new Scanner(System.in);
        System.out.println("Please enter any number:");
        int iNo = sObj.nextInt();

        Digit dObj = new Digit();
        int iRet = dObj.Multiply(iNo);
        System.out.println("Required multiplication is : "+iRet);
    }
}

class Digit
{
    public int Multiply(int iNo)
    {

        int iDigit = 1, iMult = 1;
        while(iNo != 0)
        {
            iDigit = iNo % 10;
            if(iDigit == 0)
            {
                iDigit = 1;
            }
            iMult = iMult * iDigit;
            iNo = iNo / 10;
        }
        return iMult;
    }    
}