//Write a java program which accept number of rows and number of columns from user and display below pattern
//Input:    iRow = 4  iCol = 4
//Output:   4444
//          3333
//          2222
//          1111

import java.util.*;

public class j36Que_4
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
        for(i = iRow; i >= 1; i--)
        {
            for(j = 1; j <= iCol; j++)
            {
                System.out.print(i+"\t");
                
            }
            System.out.println();
        }
    }
}
