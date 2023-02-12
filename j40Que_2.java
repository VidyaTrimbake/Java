//Write Java program which accept string from user and display below pattern
//Input:    iRow = 4    iCol = 4
//Output:   * * * #
//          * * # @
//          * # @ @
//          # @ @ @

import java.util.*;

class j40Que_3
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
        for(int iCnt=iRow; iCnt >= 1; iCnt--)
        {
            for(int jCnt=1; jCnt<=iRow; jCnt++)
            {
                if(jCnt < iCnt)
                {
                    System.out.print("*\t");
                }
                else
                {
                    System.out.print("@\t");
                }
            }
            System.out.println();
        }
    }
}
