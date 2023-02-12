import java.util.*;

class j226Addition
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        
        int iNo1 = 0, iNo2 = 0, iAns = 0;

        System.out.println("Enter first number : ");
        iNo1 = sobj.nextInt();

        System.out.println("Enter second number : ");
        iNo2 = sobj.nextInt();

        Arithematic aobj = new Arithematic(iNo1,iNo2);
        iAns = aobj.Addition(iNo1,iNo2);

        System.out.println("Addition is : "+iAns);
    } 
}

class Arithematic
{
    public int iValue1;     //Characteristic
    public int iValue2;     //Characteristic

    public Arithematic(int i, int j)    //Parameterised constructor
    {
        iValue1 = i;
        iValue2 = j;
    }
    public int Addition(int i, int j)   //Behaviour
    {
        int Sum = 0;
        Sum = iValue1 + iValue2;
        return Sum;
    }
}