//Write a java program which accept N numbers from user and accept range , Display all the elements from that range 
//Input:    N:          6
//          Start:      66
//          End:        90   
//          Elements:   85 66 3 73 93 88 
//Output:   66 76 88

import java.util.Scanner;

import javax.swing.plaf.synth.SynthStyle;

public class j34Que_4
{
    public static void main(String arg[]) 
    {
        Scanner sObj = new Scanner(System.in);

        System.out.println("Please enter the size of array: ");
        int iSize = sObj.nextInt();

        Number nObj = new Number(iSize);
        nObj.Accept();
        nObj.Display();

        System.out.println("Please enter the starting number: ");
        int iStart = sObj.nextInt();

        System.out.println("Please enter the ending number: ");
        int iEnd = sObj.nextInt();

        nObj.DisplayRange(iSize, iStart, iEnd);

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
        int iCnt = 0;
        System.out.println("elements of the array are : ");
        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            System.out.println(Arr[iCnt]+"\t");
        }
        System.out.println();
    } 
}

class Number extends ArrayX
{
    public Number(int iSize)
    {
        super(iSize);
    }
    public void DisplayRange(int iSize,int iStart, int iEnd)
    {
        System.out.println("Numbers between " +iStart+ " and "+iEnd+ " are ");
        for(int iCnt=0; iCnt<Arr.length; iCnt++)
        {
            if((Arr[iCnt] > iStart) && (Arr[iCnt] < iEnd))
            {
                System.out.println(Arr[iCnt]);
            }
        }
        System.out.println();
    }
}
