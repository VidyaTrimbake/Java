import java.util.*;

class Numbers
{
    public void EvenFactorDisplay(int iNo)
    {
        int iCnt = 0;
        for(iCnt=2; iCnt<iNo; iCnt++)
        {
            if(iNo%iCnt == 0)
            {
                if(iCnt%2 == 0)
                {
                    System.out.println("Numbers are "+iCnt);
                }
            }
        }
    }
    
}  

class j228EvnFactors
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Please enter number : ");
        int iNo = sobj.nextInt();

        Numbers nobj = new Numbers();

        nobj.EvenFactorDisplay(iNo);
        
    }
}