//Write java program which accept two arraus from user and display odd contents of each arr
//Input:    2 9 7 5 2 3
//          9 6 5 5 4
//Output:   2 9 7 5 2 3 9 6 5 5 4

import java.util.*;

class j41Que_5
{
    public static void main(String arg[]) 
    {
        Scanner sObj = new Scanner(System.in);
        
        System.out.println("Please enter the size of first array:");
        int A1Size = sObj.nextInt();
        int Arr1[];
        Arr1 = new int[A1Size];
        System.out.println("Please enter the elements of first array: ");
        for(int iCnt = 0; iCnt < Arr1.length; iCnt++)
        {
            Arr1[iCnt] = sObj.nextInt();
        }
        
        System.out.println("Please enter the size of second array:");
        int A2Size = sObj.nextInt();
        int Arr2[];
        Arr2 = new int[A2Size];
        System.out.println("Please enter the elements of second array: ");
        for(int iCnt = 0; iCnt < Arr2.length; iCnt++)
        {
            Arr2[iCnt] = sObj.nextInt();
        }

        ArrayX aObj = new ArrayX();
        aObj.SumArray(Arr1, Arr2);

    }
}

class ArrayX
{

    public void SumArray(int Arr1[],int Arr2[])
    {
        int iSum1 = 0, iSum2 = 0;
        for(int iCnt = 0; iCnt < Arr1.length; iCnt++)
        {
            iSum1 = iSum1 + Arr1[iCnt];
        }

        for(int iCnt = 0; iCnt < Arr2.length; iCnt++)
        {
            iSum2 = iSum2 + Arr2[iCnt];
        }
        System.out.println("Sum of first array is:"+iSum1);
        System.out.println("Sum of first array is:"+iSum2);

    }
}