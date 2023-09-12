import java.util.Scanner;

class D2Array2 {
    public static void main(String a[]){
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the no of rows: ");
        int iRow = s.nextInt();

        System.out.println("Enter the no of col: ");
        int iCol = s.nextInt();

        ArrayX aX = new ArrayX(iRow, iCol);
        aX.Accept();
        aX.Display();
    }
}

class ArrayX {
    public int Arr[][];
    public int iR;
    public int iC;
    

    public ArrayX(int R,int C){
        iR = R;
        iC = C;
        Arr = new int[iR][iC];
    }

    public void Accept(){
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter the elements of array:");
        for(int i=0;i<iR; i++){
            for(int j=0; j<iC; j++){
                Arr[i][j] = s.nextInt();
            }
        }
    }

    public void Display(){
        System.out.println("Display the array: ");
        for(int i=0; i<iR;i++){
            for(int j=0;j<iC;j++){
                System.out.print(Arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
