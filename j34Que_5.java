//Write a java program which accept N numbers from user and return product of all odd elements 
//Input:    N:          6  
//          Elements:   15 66 3 70 10 88 
//Output:   45

import java.util.Scanner;

public class j34Que_5
{
    public static void main(String arg[]) 
    {
        Scanner sObj = new Scanner(System.in);

        System.out.println("Please enter the size of array: ");
        int iSize = sObj.nextInt();

        Number nObj = new Number(iSize);
        nObj.Accept();
        nObj.Display();

        int iRet = nObj.Product(iSize);
        System.out.println("Product of odd numbers is "+iRet);

    }    
}

class ArrayX
{
    public int Arr[];
    public ArrayX(int iSize)
    {
        Arr = new int[iSize];
    }

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Please enter "+Arr.length + " elements ");
        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            System.out.println("Enter the element no : "+ (iCnt+1));
            Arr[iCnt] = sobj.nextInt();
        }
    } 
    public void Display()
    {
        int iCnt = 0;
        System.out.println("elements of the array are : ");
        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            System.out.println(Arr[iCnt]+"\t");
        }
        System.out.println();
    } 
}

class Number extends ArrayX
{
    public Number(int iSize)
    {
        super(iSize);
    }
    public int Product(int iSize)
    {
        int iMult = 1;
        for(int iCnt=0; iCnt<Arr.length; iCnt++)
        {
            if(Arr[iCnt] % 2 != 0)
            {
                iMult = iMult * Arr[iCnt];
            }
        }
        return iMult;
    }
}
