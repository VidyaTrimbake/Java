
import java.util.*;

import javax.swing.Icon;

/*
1 2 3 4
5 6 7 8
9 1 2 3
4 5 6 7
 */
class j66Pattern5
{
    public static void main(String a[])
    {
        Pattern pObj = new Pattern();
        Scanner sObj = new Scanner(System.in);

        System.out.println("Enter the number of rows : ");
        int i = sObj.nextInt();

        System.out.println("Enter the number of columns : ");
        int j = sObj.nextInt();

        pObj.Display(i, j);
    }
}

class Pattern
{
    public void Display(int iRow, int iColumn)
    {
        int i = 0, j = 0;
        int iCnt = 0;

        System.out.println("Required pattern is: \n");

        for(i=1; i<=iRow; i++)
        {
            for(j=1; j<=iColumn; j++)
            {
                System.out.print(((iCnt%9)+1) +"\t");
                iCnt++;
            }
            System.out.println();
        }
    }
}
