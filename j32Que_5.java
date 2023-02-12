//write java program which accept N number from user and display all such elements which are multiple of 11.
//Input:    N: 6
//          Elements:85 66 3 15 93 88
//Output:   66 88

import java.util.*;

class j32Que_5
{
    public static void main(String ar[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the size of array that you want to create ");
        int iSize = sobj.nextInt();

        MarvellousX mObj = new MarvellousX(iSize);
        
        mObj.Accept();

        mObj.Display();

        mObj.Divisible();
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
    public void Divisible()
    {
        System.out.println("Divisible elements are : ");
        for(int iCnt=0; iCnt<Arr.length;iCnt++)
        {
            if((Arr[iCnt] % 11 == 0))
            {
                System.out.println(Arr[iCnt]+"\t");
            }
        }
    }
}