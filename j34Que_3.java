//Write a java program which accept N numbers from user and accept one another number as NO ,return index of last occurence of that NO
//Input:    N:          6
//          No:         66
//          Elements:   85 66 3 66 93 88 
//Output:   3

import java.util.Scanner;

public class j34Que_3
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

        int iRet = nObj.LastOcc(iSize, iNo);
        if(iRet == -1)
        {
            System.out.println(iNo + " is not found ");
        }
        else
        {
            System.out.println("Last occurence of " +iNo + " is at index " +iRet);
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
    int LastOcc(int iSize,int iNo)
    {
        int iCnt= 0;
        int iCntIndex = 0;
        for(iCnt = 0; iCnt<Arr.length; iCnt++)
        {
            if(Arr[iCnt] == iNo)
            {
                iCntIndex++;
            }
        }
        if(iCntIndex == Arr.length)
        {
            return -1;
        }
        else
        {
            return iCntIndex;
        }
    }
}
