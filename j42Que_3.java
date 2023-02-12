//Write a java program which accept two array from user and copy the contents of that array into another array in reverse order and return new array
//

import java.util.*;

class j42Que_3 
{
    public static void main(String arg[]) 
    {
        Scanner sObj = new Scanner(System.in);
        System.out.println("PLease enter the size of array: ");
        int iSize = sObj.nextInt();

        int Arr[];
        Arr = new int[iSize];

        System.out.println("Please enter the" +iSize+" elements of array:");
        for(int iCnt=0;iCnt<iSize; iCnt++)
        {
            System.out.println("Enter the element:"+(iCnt+1));
            Arr[iCnt] = sObj.nextInt();
        }

        ArrayX aObj = new ArrayX();
        int newArr[] = new int[iSize];
        newArr = aObj.CopyArrayRev(Arr);
        System.out.println("Elements of new array in reverse order are : ");

        for(int iCnt=0; iCnt < iSize; iCnt++)
        {
            System.out.print(newArr[iCnt]+"\t");
        }
    }
}

class ArrayX
{
    public int[] CopyArrayRev(int Arr[])
    {
        int newArr[];
        newArr = new int[Arr.length];

        int iCnt = 0, jCnt = 0;

        for(iCnt = (Arr.length-1);iCnt >= 0; iCnt--,jCnt++)
        {
            //System.out.print(Arr[iCnt] + " "); 
            newArr[jCnt] = Arr[iCnt];
        }

        return newArr;
    }
}
