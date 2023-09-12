// * * * *
// * * * *
// * * * *
// * * * *

import java.util.Scanner;

public class Pattern4 {
    public static void main(String a[]){
        Scanner sObj = new Scanner(System.in);

        int iRow, iCol;
        System.out.println("Please enter the number of row");
        iRow = sObj.nextInt();

        System.out.println("Please enter the number of column");
        iCol = sObj.nextInt();

        Pattern pObj = new Pattern(iRow, iCol);
        pObj.Print();
    }
}

class Pattern{
    public int rr;
    public int cc;

    public Pattern(int r,int c){
        rr = r;
        cc = c;
    }

    public void Print(){
        for(int i=1; i<=rr; i++){
            for(int j=1; j<=cc; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
