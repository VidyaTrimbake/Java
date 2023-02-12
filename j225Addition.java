import java.util.*;

class Program249
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        
        int iNo1 = 0, iNo2 = 0, iAns = 0;

        System.out.println("Enter first number : ");
        iNo1 = sobj.nextInt();

        System.out.println("Enter second number : ");
        iNo2 = sobj.nextInt();

        Arithematic aobj = new Arithematic();
        iAns = aobj.Addition(iNo1,iNo2);

        System.out.println("Addition is : "+iAns);
    } 
}

class Arithematic
{
    public int Addition(int i, int j)
    {
        int Sum = 0;
        Sum = i + j;
        return Sum;
    }
}