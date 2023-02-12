import java.util.*;

class j224Addition
{
    static int Addition(int N1, int N2)
    {
        int sum = 0;
        sum = N1 + N2;
        return sum;
    }
    public static void main(String arg[])
    {
        Scanner sObj = new Scanner(System.in);
        int iNo1 = 0, iNo2 = 0, iAns = 0;

        System.out.println("Enter the first number : ");
        iNo1 = sObj.nextInt();

        System.out.println("Enter the second number : ");
        iNo2 = sObj.nextInt();

        iAns = Addition(iNo1,iNo2);
        System.out.println("Addition is "+iAns);
    }
}