//Write a java program which accept two array from user and reverse each number of that array
//Input:    12 252 387 793 252 11
//Output:   21 252 783 397 252 11

import java.util.*;


class j43Que_1
{
    public static void main(String ar[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the size of array that you want to create ");
        int iSize = sobj.nextInt();

        MarvellousX obj = new MarvellousX(iSize);
        
        obj.Accept();
        obj.Display();

        obj.ReverseArray();
    }
}

class ArrayX
{
    protected int Arr[];

    public ArrayX(int iSize)
    {
        Arr = new int[iSize];
    }

    protected void Accept()
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Please enter "+Arr.length + " elements ");
        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            System.out.println("Enter the element no : "+ (iCnt+1));
            Arr[iCnt] = sobj.nextInt();
        }
    }

    protected void Display()
    {
        System.out.println("Elements of array are : ");

        for(int iCnt =0; iCnt < Arr.length; iCnt++)
        {
            System.out.print(Arr[iCnt]+"\t");
        }

        System.out.println();
    }
}

class MarvellousX extends ArrayX
{
    public MarvellousX(int iSize)
    {
        super(iSize);
    }

    int iReverse = 0, iRemainder = 0;
    public void ReverseArray()
    {
       for(int iCnt = 0; iCnt < Arr.length; iCnt++)
       {
            while (Arr[iCnt] != 0) 
            {
                iRemainder = Arr[iCnt] % 10;
                iReverse = iReverse * 10 + iRemainder;
                Arr[iCnt] /= 10;
            }
       }
       System.out.print(iReverse+"\t");

    }
}