//Write a java program which accept number of rows and number of columns from user and display below pattern
//Input:    iRow = 4  iCol = 4
//Output:   A A A A
//          B B B B
//          C C C C
//          D D D D

import java.util.*;

public class j36Que_1 
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
    public void Display(int iRow, int iCol)
    {
        int i = 0, j = 0;
        char ch = 'A';
        for(i = 1; i <= iRow; i++)
        {
            for(j = 1; j <= iCol; j++)
            {
                System.out.print(ch+"\t");
                
            }
            System.out.println();
            ch++;
        }
    }
    /*public void Pattern(int iRow, int iCol) 
    {
        int iCnt1 = 0, iCnt2 = 0;
        //char ch = 'A';
        for(iCnt1 = 1; iCnt1 <= iRow; iCnt1++)
        {
            for(iCnt2 = 1; iCnt2 <= iCnt1; iCnt2++)
            {
                System.out.print(iCnt1+"\t");
            }
            System.out.println();
        }
    }*/
}
