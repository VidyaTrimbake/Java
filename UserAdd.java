import java.util.Scanner;

public class UserAdd
{
    public static void main(String Arg[])
    {
        Scanner sc = new Scanner(System.in);

        int iNo1 = 0, iNo2 = 0;
        int iAns = 0;

        System.out.println("Enter first number: ");
        iNo1 = sc.nextInt();

        System.out.println("Enter first number: ");
        iNo2 = sc.nextInt();

        iAns = Sum(iNo1,iNo2);
        System.out.println("Addition is: "+iAns);

    }
    public static int Sum(int iValue1, int iValue2)
    {
        int iSum = iValue1 + iValue2;
        return iSum;
    }   
}
