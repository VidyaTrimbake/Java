import java.util.Scanner;

public class UserAdd2
{
    public static void main(String Arg[])
    {
        Scanner sObj = new Scanner(System.in);

        int iNo1 = 0, iNo2 = 0;

        System.out.println("Enter first number: ");
        iNo1 = sObj.nextInt();

        System.out.println("Enter second number: ");
        iNo2 = sObj.nextInt();

        Addition aObj = new Addition();
                
        int iAns = aObj.Sum(iNo1,iNo2);
        System.out.println("Addition is: "+iAns);

    }
  
}
class Addition
{
    public int Sum(int iValue1, int iValue2)
    {
        int iSum = iValue1 + iValue2;
        return iSum;
    }   
}