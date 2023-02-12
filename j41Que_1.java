//Write java program which accept two arraus from user and display contents of each arr
//Input:    2 9 7 5 2 3
//          9 3 5 5
//Output:   2 9 7 5 2 3
//          9 3 5 5

import java.util.*;

class j41Que_1
{
    public static void main(String arg[]) 
    {
        Scanner sObj = new Scanner(System.in);
        System.out.println("Please enter the size of first array: ");
        int Arr1Size = sObj.nextInt();

        System.out.println("Please enter the size of second array: ");
        int Arr2Size = sObj.nextInt();

        ArrayX aObj = new ArrayX(Arr1Size, Arr2Size);
        aObj.Accept();
        aObj.Display();

    }
}

class ArrayX
{
    public int Arr1[];
    public int Arr2[];

    public ArrayX(int Arr1Size, int Arr2Size)
    {
        Arr1 = new int[Arr1Size];
        Arr2 = new int[Arr2Size];
    }

    public void Accept()
    {
        Scanner sObj = new Scanner(System.in);

        System.out.println("Please enter the Elements of first array:");
        for(int iCnt = 0; iCnt < Arr1.length; iCnt++)
        {
            System.out.println("Enter the elements no : "+(iCnt+1));
            Arr1[iCnt] = sObj.nextInt();
        }

        System.out.println("Please enter the Elements of second array:");
        for(int iCnt = 0; iCnt < Arr2.length; iCnt++)
        {
            System.out.println("Enter the elements no : "+(iCnt+1));
            Arr2[iCnt] = sObj.nextInt();
        }
    }
    public void Display()
    {
        System.out.println("Elements of first array are:");
        for(int iCnt = 0; iCnt<Arr1.length; iCnt++)
        {
            System.out.println(Arr1[iCnt]+"\n");
        }

        System.out.println("Elements of second array are:");
        for(int iCnt = 0; iCnt<Arr2.length; iCnt++)
        {
            System.out.println(Arr2[iCnt]+"\n");
        }
    }

}