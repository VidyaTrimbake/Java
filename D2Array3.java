//Take a matrix as input from user. Search for a given no X and print the indices at which it occurs.

import java.util.Scanner;

class D2Array3 {
    public static void main(String a[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter the no of row: ");
        int iRow = s.nextInt();

        System.out.println("Please enter the no of col: ");
        int iCol = s.nextInt();

        System.out.println("Please enter the no you want to search: ");
        int iNo = s.nextInt();

        ArrarX aX = new ArrarX(iRow, iCol, iNo);
        aX.Accept();
        aX.Display();
        boolean bRet = aX.Search();
        if(bRet==false){
            System.out.println(iNo+" is not found");
        }
    }
}

class ArrarX{
    public int Arr[][];
    public int iR;
    public int iC;
    public int iN;

    public ArrarX(int R,int C,int N){
        iR = R;
        iC = C;
        iN = N;
        Arr = new int[iR][iC];
    }

    public void Accept(){
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter the elements: ");
        for(int i=0; i<iR; i++){
            for(int j=0; j<iC; j++){
                Arr[i][j] = s.nextInt();
            }
        }
    }

    public void Display(){
        System.out.println("All the elements of Array: ");
        for(int i=0; i<iR; i++){
            for(int j=0; j<iC; j++){
                System.out.print(Arr[i][j]+ " ");
            }
            System.out.println();
        }
    }

    public boolean Search(){
        for(int i=0; i<iR; i++){
            for(int j=0; j<iC; j++){
                if(Arr[i][j] == iN){
                    System.out.println(iN+" is found at "+i+","+j+" index");
                    return true;
                }
                // s

            }
        }
        return false;
    }
}
