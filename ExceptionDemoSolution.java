import java.util.Scanner;

class ExceptionDemoSolution
{
    public static void main (String a[])
    {
        Scanner sObj = new Scanner(System.in);

        int iNo1 = 0, iNo2 = 0, iAns = 0;

        System.out.println("Enter first number: ");
        iNo1 = sObj.nextInt();

        System.out.println("Enter second number: ");
        iNo2 = sObj.nextInt();

        try
        {
            System.out.println("Inside try block");
            iAns = iNo1 / iNo2;
            System.out.print("Division is: \n"+iAns);
        }
        catch(ArithmeticException Obj)
        {
            System.out.println("Inside Catch 1");
            System.out.println(Obj);
        }
        catch(NullPointerException Obj)
        {
            System.out.println("Inside Catch 2");
            System.out.println(Obj);
        }
        catch(Exception Obj)
        {
            System.out.println("Inside Catch 3");
            System.out.println(Obj);
        }
        finally 
        {
            System.out.println("Inside finally block\n");
            sObj.close();
        }
    }
}