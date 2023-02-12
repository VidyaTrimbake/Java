//Write a java prohram which accept two arrays from user and return difference between summation of arrays
//Input:    2 9 7 5 2 3
//          9 3 5 5
//Output:   2
//          3

import java.util.*;

class j42Que_2
{
    public static void main(String arg[]) 
    {
        Scanner sObj = new Scanner(System.in);

        System.out.println("Please enter the size of first array: ");
        int iArr1Size = sObj.nextInt(); 

        int Arr1[];
        Arr1 = new int[iArr1Size];

        System.out.println("Please enter the "+iArr1Size+" elements of first array: ");
        for(int iCnt=0;iCnt<iArr1Size; iCnt++)
        {
            System.out.println("Enter the element no : "+ (iCnt+1));
            Arr1[iCnt] = sObj.nextInt();
        }
        
        System.out.println("Please enter the size of second array: ");
        int iArr2Size = sObj.nextInt();   

        int Arr2[];
        Arr2 = new int[iArr2Size]; 
        System.out.println("Please enter the "+iArr2Size+" elements of second array: ");
        for(int iCnt=0;iCnt<iArr2Size; iCnt++)
        {
            System.out.println("Enter the element no : "+ (iCnt+1));
            Arr2[iCnt] = sObj.nextInt();
        }

        ArrayX aObj = new ArrayX();
        aObj.DiffArray(Arr1,Arr2);
    }
}

class ArrayX
{
    public void DiffArray(int Arr1[], int Arr2[])
    {
        int iMin1 = Arr1[0], iMin2 = Arr2[0];
        for(int iCnt = 0; iCnt < Arr1.length; iCnt++)
        {
            if(iMin1 > Arr1[iCnt])
            {
                iMin1 = Arr1[iCnt];
            }
        }

        for(int iCnt = 0; iCnt < Arr2.length; iCnt++)
        {
            if(iMin2 > Arr2[iCnt])
            {
                iMin2 = Arr2[iCnt];
            }
        }
        System.out.println("Smallest element of first array is : "+iMin1);
        System.out.println("Smallest element of Second array is : "+iMin2);

    }
}
