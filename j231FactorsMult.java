//multiplication of even factors

import java.util.*;

class j231FactorsMult
{
    public static void main(String A[])
    {
        int iRet = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Please enter first number : ");
        int iNo = sobj.nextInt();

        Numbers nobj = new Numbers();

        iRet = nobj.FactorsMult(iNo);
        System.out.println("Multiplication of factors of " + iNo +" is : "+iRet);
    }
}

class Numbers
{
    public int FactorsMult(int iValue)
    {
        int iCnt = 0;
        int iMult = 1;

        for(iCnt=1; iCnt<=(iValue/2);iCnt++)
        {
            if((iValue % iCnt) == 0)
            {
                iMult = iMult * iCnt;
            }
        }
        return iMult;
    }    
} 