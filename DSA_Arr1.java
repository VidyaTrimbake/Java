//Operation on Array--->>> """Insertion"""

import java.util.Scanner;

public class DSA_Arr1 {
    public static void main(String a[]){
        Scanner sObj = new Scanner(System.in);
        System.out.println("Please enter the size of array");
        int iSize = sObj.nextInt();

        ArrarX aObj = new ArrarX(iSize);
        aObj.Accept();
    }
}

class ArrarX{
    public int Arr[];
    public int Size;

    public ArrarX(int iSize){
        Size = iSize;
        Arr = new int[Size];
    }

    public void Accept(){
        Scanner sObj = new Scanner(System.in);
        System.out.println("Please enter the elements of array");
        for(int i=0; i<Size; i++){
            System.out.println("Element at index "+i+" is:");
            Arr[i] = sObj.nextInt();
        }
    }
}
