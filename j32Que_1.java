//Write a java program which accept N numbers from usera nd return difference between summation of even elements and summation of odd elements.
//Input:    N:  6
//            Elements:85 66 3 80 93 88
//Output:   53(234-181)            

import java.util.*;

class j32Que_1 
{
    public static void main(String ar[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the size of array that you want to create ");
        int iSize = sobj.nextInt();

        MarvellousX mObj = new MarvellousX(iSize);
        
        mObj.Accept();

        mObj.Display();

        int iRet = mObj.FunDiff();
        System.out.println("Addition is: "+iRet);
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
    public int FunDiff()
    {
        int iEvSum = 0, iOdSum = 0;
        for(int iCnt=0; iCnt<Arr.length; iCnt++)
        {
            if(Arr[iCnt] % 2 == 0)
            {
                iEvSum = iEvSum + Arr[iCnt];
            }
            else
            {
                iOdSum = iOdSum + Arr[iCnt];
            }
        }
        int iDiff = iEvSum - iOdSum;
        if(iDiff<0)
        {
            iDiff = -iDiff;
        }
        return iDiff;
    }
}