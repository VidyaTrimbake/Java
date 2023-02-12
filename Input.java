import java.util.*;          //utilities
//import java.util.Scanner;

class Input
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int iNo1 = 0, iNo2 = 0;
        int iAns = 0;

        System.out.println("Enter the first number : ");
        iNo1 = sobj.nextInt();

        System.out.println("Enter the first number : ");
        iNo2 = sobj.nextInt();

        iAns = iNo1 + iNo2;

        System.out.println("Addition is : "+iAns);
        //System.out.format("Addition is : ",iAns);
    }
}