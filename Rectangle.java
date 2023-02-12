//Write a program to calculate perimeter and area of rectangle implment the program using class and object

import java.util.Scanner;

public class Rectangle
{
    public static void main(String Arg[]) 
    {
        Scanner sObj = new Scanner(System.in);
        
        int iLength = 0, iBredth = 0; 
        int iRet = 0;

        System.out.println("Enter the length:");
        iLength = sObj.nextInt();

        System.out.println("Enter the Bredth:");
        iBredth = sObj.nextInt();

        Area aObj = new Area();

        iRet = aObj.iArea(iLength,iBredth);
        System.out.println("Area of rectangle is: "+iRet);

        Perimeter pObj = new Perimeter();

        iRet = pObj.iPerimeter(iLength,iBredth);
        System.out.println("Perimeter of rectangle is:"+iRet);
    }
}

class Area
{
    public int iArea(int iValue1, int iValue2)
    {
        int iAns = iValue1 * iValue2;
        return iAns;
    }
}

class Perimeter 
{
    public int iPerimeter(int iValue1, int iValue2)
    {
        int iAns = iValue1 + iValue2;
        return iAns;
    }
}