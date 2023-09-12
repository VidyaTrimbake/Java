import java.util.*;
import java.util.Scanner;

class Array3{
    public static void main(String arr[])
    {
        ArrayX aObj = new ArrayX(5);
        aObj.Accept();
        aObj.Display();
    }
}

class ArrayX{
    public int Arr[];

    public ArrayX(int iSize){
        Arr = new int[iSize];
    }

    public void Accept(){
        Scanner sObj = new Scanner(System.in);
        System.out.println("Please enter the "+Arr.length+" elements");
        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            System.out.println("Enter the elements no : "+(iCnt+1));
            Arr[iCnt] = sObj.nextInt();
        }

    }

    public void Display(){
        System.out.println("Elements are");
        for(int i=0; i<Arr.length; i++){
            System.out.println(Arr[i]);
        }
    }
}
