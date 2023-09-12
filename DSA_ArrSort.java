//Operation on Array--->>> """Insertion"""

import java.util.Scanner;

class DSA_ArrSearch2 {
    public static void main(String a[]){
        Scanner sObj = new Scanner(System.in);
        System.out.println("Please enter the size of array");
        int iSize = sObj.nextInt();

        ArrayX aObj = new ArrayX(iSize);
        aObj.Accept();
        aObj.Display();

    }
}

class ArrayX{
    public int Arr[];
    public int Size;

    public ArrayX(int iSize,int iElement){
        Size = iSize;
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

    public void Sort(){
        
    }
}
