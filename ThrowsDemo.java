import java.util.*;

class Arithematic
{
    public int Division(int A, int B) throws ArithmeticException
    {
        int iAns = 0;
        iAns = A / B;
        return iAns;
    }
}
class ThrowsDemo 
{
    public static void main(String arg[]) 
    {
        Scanner sObj = new Scanner(System.in);
        System.out.println("Enter first number");
        int iNo1 = sObj.nextInt();

        System.out.println("Enter second number");
        int iNo2 = sObj.nextInt();

        Arithematic aObj = new Arithematic();

        try 
        {
            int iRet = aObj.Division(iNo1, iNo2);
            System.out.println("Division is:"+iRet);
        }
        catch(ArithmeticException Obj)
        {
            System.out.println("Exception occured");  
            System.out.println(aObj);  
        }
    }
}
