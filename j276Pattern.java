
import java.util.*;
class j276Pattern 
{
    public static void main(String arg[]) 
    {
        Scanner sObj = new Scanner(System.in);
        System.out.println("Please enter the number of rows: ");
        int iRow = sObj.nextInt();

        System.out.println("Please enter the number of columns: ");
        int iCol = sObj.nextInt();

        PatternX pObj = new PatternX();
        pObj.Display(iRow,iCol);
    }
}

class PatternX
{
    public void Display(int iRow, int iCol)
    {
        for(int i=iRow; i>=1; i--)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print("*\t");
            } 
            System.out.println();
        }
    }
}
