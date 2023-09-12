// * * * * 
// * * *    
// * *    
// *

import java.util.Scanner;

public class Pattern9 {
    public static void main(String a[]){
        Scanner sObj = new Scanner(System.in);
        System.out.println("Please enter the no of row");
        int iRow = sObj.nextInt();

        System.out.println("Please enter the no of col");
        int iCol = sObj.nextInt();

        Pattern pObj = new Pattern(iRow, iCol);
        pObj.Print();
    }
}

class Pattern{
    public int row;
    public int col;

    public Pattern(int r,int c){
        row = r;
        col = c;
    }

    public void Print(){
        for(int i=row; i>=1; --i){
            for(int j=1; j<=i; ++j){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
