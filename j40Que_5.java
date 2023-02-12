//Write Java program which accept string from user and display below pattern
//Input:    iRow = 4    iCol = 4
//Output:   1 2 3 4 5
//          1 2     5
//          1   3   5
//          1     4 5 
//          1 2 3 4 5

import java.util.*;

class j40Que_5
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
            for(int jCnt=1; jCnt<=iCol; jCnt++)
            {
                if(iCnt == 1 || jCnt == 1 || iCnt == iRow || jCnt == iCol || iCnt == jCnt)
                {
                    System.out.print(jCnt+"\t");
                }
                else
                {
                    System.out.print(" \t");
                }

            }
            System.out.println();
        }
    }
}
