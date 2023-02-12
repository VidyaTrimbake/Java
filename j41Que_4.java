//Write java program which accept two arraus from user and concat arr
//Input:    2 9 7 5 2 3
//          9 6 5 5 4
//Output:   2 9 7 5 2 3 9 6 5 5 4

import java.util.*;

class j41Que_3
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
        aObj.ArrayConcat(Arr1, A1Size, Arr2, A2Size);

    }
}

class ArrayX
{

    public void ArrayConcat(int Arr1[], int iSize1, int Arr2[], int iSize2)
    {
        int newArrSize = iSize1 + iSize2;
        int newArr[] = new int[newArrSize];

        for(int iCnt = 0; iCnt < iSize1; iCnt++)
        {
            newArr[iCnt] = Arr1[iCnt];
        }

        for(int iCnt = 0; iCnt < iSize2; iCnt++)
        {
            newArr[iSize1+ iCnt] = Arr2[iCnt];
        }

        System.out.println("Concated array:");

        for(int iCnt=0; iCnt<newArrSize; iCnt++)
        {
            System.out.println(newArr[iCnt]);
        }
    }
}