
import java.util.*;

public class j234Array 
{
    public static void main(String arr[])
    {
        ArrayX aObj = new ArrayX(5);
        aObj.Accept();
        aObj.Display();
    }
}

class ArrayX
{
    public int  Arr[];

    public ArrayX(int iSize)
    {
        Arr = new int[iSize];
    }
    public void Accept()
    {
        Scanner sObj = new Scanner(System.in);
        System.out.println("Please enter the "+Arr.length+" elements");
        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            System.out.println("Enter the elements no : "+(iCnt+1));
            Arr[iCnt] = sObj.nextInt();
        }
    }

    public void Display()
    {
        System.out.println("Elements of array are:");
        for(int iCnt = 0; iCnt<Arr.length; iCnt++)
        {
            System.out.println(Arr[iCnt]+"\n");
        }
    }
}