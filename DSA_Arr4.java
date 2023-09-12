//Operation on Array--->>> """Traverse"""

import java.util.Scanner;

public class DSA_Arr4 {
    public static void main(String a[]){
        Scanner sObj = new Scanner(System.in);
        System.out.println("Please enter the size of array");
        int iSize = sObj.nextInt();

        System.out.println("Enter the index at which you want to delete the element");
        int iIndex = sObj.nextInt();

        ArrarX aObj = new ArrarX(iSize,iIndex);
        aObj.Accept();

        aObj.Traverse();
        aObj.Display();

        aObj.Deletion();

        System.out.println("Array after the deletion of no at index "+iIndex+" is :");
        aObj.Traverse();

        
    }
}

class ArrarX{
    public int Arr[];
    public int Size;
    public int Index;

    public ArrarX(int iSize,int iIndex){
        Size = iSize;
        Arr = new int[Size];
        Index = iIndex;
    }

    public void Accept(){
        Scanner sObj = new Scanner(System.in);
        System.out.println("Please enter the elements of array");
        for(int i=0; i<Size; i++){
            //System.out.println("Add Element at index "+i+" is:");
            Arr[i] = sObj.nextInt();
        }
    }

    public void Display(){
        System.out.println("Elements in the array");
        for(int i=0; i<Size; i++){
            System.out.println(Arr[i]);
        }
    }

    public void Deletion(){
        // System.out.println("Array after the deletion of no at index "+Index+" is :");
        for(int i=0;i<Size;i++){
            Arr[i] = Arr[i+1];
            Size = Size - 1;
        }
    }

    public void Traverse(){
        System.out.println("Elements in the array");
        for(int i=0; i<Size; i++){
            System.out.println("Add Element at index "+i+" is: "+Arr[i]);
        }
    }
}
