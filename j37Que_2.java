//Write Java program which accept number of rows and number of columns from user and diplay below pattern
//Input:    iRow = 4    iCol = 3
//Output:   1 2 3
//          1 2 3
//          1 2 3
//          1 2 3

import java.util.*;

class j37Que_2 
{
    public static void main(String arg[]) 
    {
        Scanner sObj = new Scanner(System.in);
        System.out.println("Please enter the number of rows: ");
        int iRow = sObj.nextInt();

        System.out.println("Please enter the number of columns: ");
        int iCol = sObj.nextInt();

        PatternX pObj = new PatternX();
        pObj.Pattern(iRow, iCol);
    }    
}

class PatternX
{
    public void Pattern(int iRow, int iCol)
    {
        for(int iCnt=1; iCnt<=iRow; iCnt++)
        {
            for(int jCnt = 1; jCnt<=iCol; jCnt++)
            {
                System.out.print(jCnt);
            }
            System.out.println();
        }
    }
}
