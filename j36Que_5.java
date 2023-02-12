//Write a java program which accept number of rows and number of columns from user and display below pattern
//Input:    iRow = 4  iCol = 4
//Output:   1 2 3 4
//          5 6 7 8
//          9 10 11 12

import java.util.*;

public class j36Que_5
{
    public static void main(String arg[])
    {
        Scanner sObj = new Scanner(System.in);

        System.out.println("Please enter the number of rows : ");
        int iRow = sObj.nextInt();

        System.out.println("Please enter the number of coulums : ");
        int iCol = sObj.nextInt();

        PatternX pObj = new PatternX();
        pObj.Display(iRow, iCol);
    }
}

class PatternX
{
    public void Display(int iRow, int iColumn)
    {
        int i = 0, j = 0;
        int iCnt = 1;

        for(i=1; i<=iRow; i++)
        {
            for(j=1; j<=iColumn; j++)
            {
                System.out.print(iCnt+"\t");
                iCnt++;
            }
            System.out.println();
        }
    }
}
