//Write java program which accept two arraus from user and display even contents of each arr
//Input:    2 9 7 5 2 3
//          9 6 5 5 4
//Output:   2 2 
//          6 4

import java.util.*;

class j41Que_2
{
    public static void main(String arg[]) 
    {
        Scanner sObj = new Scanner(System.in);
        
        System.out.println("Please enter the size of first array:");
        int A1Size = sObj.nextInt();

        System.out.println("Please enter the size of first array:");
        int A2Size = sObj.nextInt();

        ArrayX aObj = new ArrayX(A1Size, A2Size);
        aObj.Accept();
        aObj.DisplayEven();
    }
}

class ArrayX
{
    public int Arr1[];
    public int Arr2[];

    public ArrayX(int A1Size, int A2Size)
    {
        Arr1 = new int[A1Size];
        Arr2 = new int[A2Size];
    }

    public void Accept()
    {
        Scanner sObj = new Scanner(System.in);

        System.out.println("Please enter the elements of first array: ");
        for(int iCnt = 0; iCnt < Arr1.length; iCnt++)
        {
            Arr1[iCnt] = sObj.nextInt();
        }
        
        System.out.println("Please enter the elements of second array: ");
        for(int iCnt = 0; iCnt < Arr2.length; iCnt++)
        {
            Arr2[iCnt] = sObj.nextInt();
        }
    }

    public void DisplayEven()
    {
        System.out.println("Even elements from the first array are: ");
        for(int iCnt = 0; iCnt < Arr1.length; iCnt++)
        {
            if(Arr1[iCnt] % 2 == 0)
            {
                System.out.println(Arr1[iCnt]);
            }
        }

        System.out.println("Even elements from the second array are: ");
        for(int iCnt = 0; iCnt < Arr2.length; iCnt++)
        {
            if(Arr2[iCnt] % 2 == 0)
            {
                System.out.println(Arr2[iCnt]);
            }
        }
    }
}