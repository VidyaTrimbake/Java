//Operation on Array--->>> """Insertion"""

import java.util.Scanner;

public class DSA_ArrInsert {
    public static void main(String a[]){
        Scanner sObj = new Scanner(System.in);
        System.out.println("Please enter the size of array");
        int iSize = sObj.nextInt();

        System.out.println("Please enter the Position at which you want to insert the element");
        int iPos = sObj.nextInt();

        System.out.println("Please enter the element you want to insert");
        int iElement = sObj.nextInt();

        ArrayX aObj = new ArrayX(iSize, iPos, iElement);
        aObj.Accept();
        aObj.Insert();
        aObj.Display();
    }
}

class ArrayX{
    public int Arr[];
    public int Size;
    public int Position;
    public int Element;

    public ArrayX(int iSize,int iPos, int iElement){
        Size = iSize;
        Position = iPos;
        Element = iElement;
        Arr = new int[Size+1];
    }

    public void Accept(){
        Scanner sObj = new Scanner(System.in);
        System.out.println("Please enter the elements of array");
        for(int i=0; i<Size; i++){
            //System.out.println("Element at index "+i+" is:");
            Arr[i] = sObj.nextInt();
        }
    }

    public void Display(){
        System.out.println("All the elemens of array are: ");
        for(int i=0; i<Size; i++){
            System.out.println(Arr[i]);
        }
    }
    public void Insert(){                           //size = 4              //Pos=2
        for(int i=(Size); i>=(Position-1);i--){
            Arr[i+1] = Arr[i];
        }
        Arr[Position-1] = Element;
    }
}
