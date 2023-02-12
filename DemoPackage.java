import java.util.*;   //Inbuilt package
import Marvellous.Arithmatic;  //User defined package
import Marvellous.PPA.Loop;

class DemoPackage
{
    public static void main(String Arr[])    //Main method
    {
        Scanner sObj = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int iNo1 = sObj.nextInt();

        System.out.println("Enter the first number: ");
        int iNo2 = sObj.nextInt();

        Arithmatic aObj = new Arithmatic(iNo1, iNo2);

        int iResult = aObj.Addition();
        System.out.println("Addition is : "+iResult);

        iResult = aObj.Substraction();
        System.out.println("Substraction is : "+iResult);

        Loop lObj = new Loop();
        lObj.Display();
    }
}