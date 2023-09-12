import java.util.*;

class OneDArr3 {
    public static void main(String a[]){
        Scanner s = new Scanner(System.in);

        System.out.println("Please enter the no of elements");
        int iSize = s.nextInt();

        ArrayX a = new ArrayX(iSize);
        a.Accept();
    }
}

class ArrayX{
    public int Arr[];

    public ArrayX(int iSize){
        Arr = new int[size];
    }

    public void Accept(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the elements");

        for(int i = 0; i<Arr.length; i++){
            Arr[i] = s.nextInt();
        }

    }
}
