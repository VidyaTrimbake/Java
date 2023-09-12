//Operation on Array--->>> """Insertion"""

import java.util.Scanner;

public class DSA_ArrSearch {
    public static void main(String a[]){
        Scanner sObj = new Scanner(System.in);
        System.out.println("Please enter the size of array");
        int iSize = sObj.nextInt();

        System.out.println("Please enter the element you want to insert");
        int iElement = sObj.nextInt();

        ArrayX aObj = new ArrayX(iSize, iElement);
        aObj.Accept();
        aObj.Display();

        boolean bRet = aObj.Search();
        if(bRet==true){
            System.out.println(iElement+" is present in array");
        }
        else{
            System.out.println(iElement+" is not present in array");
        }
    }
}

class ArrayX{
    public int Arr[];
    public int Size;
    public int Element;

    public ArrayX(int iSize,int iElement){
        Size = iSize;
        Element = iElement;
        Arr = new int[Size];
    }

    public void Accept(){
        Scanner sObj = new Scanner(System.in);
        System.out.println("Please enter the elements you want to search array");
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
    public boolean Search(){
        for(int i=0; i<Size;i++){
            if(Arr[i] == Element){
                return true;
            }
        }
        return false;
    }
}
