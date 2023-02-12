//Write a java program which accept N numbers from user and accept one another number as NO , check whether NO is present or not
//Input:    N:          6
//          No:         66
//          Elements:   85 66 3 66 93 88
//Output:   TRUE

import java.util.Scanner;
import java.lang.Boolean;

public class j34Que_1 
{
    public static void main(String arg[]) 
    {
        Scanner sObj = new Scanner(System.in);

        System.out.println("Please enter the size of array: ");
        int iSize = sObj.nextInt();

        Number nObj = new Number(iSize);
        nObj.Accept();
        nObj.Display();

        System.out.println("Please enter any number: ");
        int iNo = sObj.nextInt();

        Boolean bRet = nObj.CheckNo(iSize, iNo);
        if(bRet == true)
        {
            System.out.println("Number is present");
        }
        else
        {
            System.out.println("Number is not present");
        }
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
    boolean CheckNo(int iSize,int iNo)
    {
        int iCntNo = 0;
        for(int iCnt = 0; iCnt<Arr.length; iCnt++)
        {
            if(iNo == Arr[iCnt])
            {
                iCntNo++;
            }
        }
        if(iCntNo!=0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
