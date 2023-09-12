import java.util.Scanner;

class Array5 {
    public static void main(String a[]){
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the size of array that you want to create ");
        int iSize = sobj.nextInt();
        ArrayX aObj = new ArrayX(iSize);
        aObj.Accept();
        aObj.Display();
    }
}

class ArrayX{
    public int Arr[];
    public int Size;

    public ArrayX(int iSize){
        Size = iSize;
        Arr = new int[Size];
    }

    public void Accept(){
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the elements");
        for(int iCnt = 0; iCnt < Size; iCnt++)
        {
            System.out.println("Enter the element no : "+ (iCnt+1));
            Arr[iCnt] = sobj.nextInt();
        }
    }

    public void Display(){
        for(int i=0;i<Size; i++){
            System.out.println("Element at index "+i+" is "+Arr[i]);
        }
    }
}
