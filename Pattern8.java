// * * * * 
// * * *    
// * *    
// *

import java.util.Scanner;

public class Pattern8 {
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
        for(int i=1; i<=row; i++){
            for(int j=col; j>=1; j--){
            if((i==1) || (j==col)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
