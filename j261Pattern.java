
import java.util.*;

/*
 * * * *
 * * * * 
 * * * *
 * * * *
 */
class j260PatternTepmlt 
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
        for(i = 1; i <= iRow; i++)
        {
            for(j = 1; j <= iColumn; j++)
            {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}
