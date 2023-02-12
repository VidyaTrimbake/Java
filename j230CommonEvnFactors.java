//Common even factors

import java.util.*;

class j230CommonEvnFactors
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Please enter first number : ");
        int iNo1 = sobj.nextInt();

        
        System.out.println("Please enter second number : ");
        int iNo2 = sobj.nextInt();

        Numbers nobj = new Numbers();

        nobj.CommonFactorDisplay(iNo1, iNo2);
        
    }
}

class Numbers
{
    public void CommonFactorDisplay(int iValue1, int iValue2)
    {
        int iCnt = 0;

        System.out.println("Common factors are : ");
        for(iCnt = 1;(iCnt <= iValue1/2) && (iCnt <= iValue2/2);iCnt++)
        {
            if((iValue1 % iCnt == 0) && (iValue2 % iCnt == 0))
            {
                System.out.println(iCnt);
            }
        }
    }    
} 