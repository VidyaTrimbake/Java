
import java.util.*;
class j271Pattern 
{
    public static void main(String arg[]) 
    {
        Scanner sObj = new Scanner(System.in);
        System.out.println("Please enter the number of rows: ");
        int iRow = sObj.nextInt();

        //System.out.println("Please enter the number of columns: ");
        //int iCol = sObj.nextInt();

        PatternX pObj = new PatternX();
        pObj.Display(iRow);
    }
}

class PatternX
{
    public void Display(int iRow)
    {
        for(int i=1; i<=iRow; i++)
        {
            System.out.println("*");
        }
    }
}
