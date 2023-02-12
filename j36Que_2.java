//Write a java program which accept number of rows and number of columns from user and display below pattern
//Input:    iRow = 4  iCol = 4
//Output:   A B C D
//          a b c d
//          A B C D
//          a b c d

import java.util.*;

public class j36Que_2 
{
    public static void main(String arg[])
    {
        Scanner sObj = new Scanner(System.in);

        System.out.println("Please enter the number of rows : ");
        int iRow = sObj.nextInt();

        System.out.println("Please enter the number of coulums : ");
        int iCol = sObj.nextInt();

        PatternX pObj = new PatternX();
        pObj.Pattern(iRow, iCol);
    }
}

class PatternX
{
    public void Pattern(int iRow, int iCol)
    {
        int i = 0, j = 0;
        char ch1 = 'A';
        char ch2 = 'a';
        for(i = 1; i <= iRow; i++)
        {
            for(j = 1; j <= iRow; j++)
            {
                if(i % 2 == 0)
                {
                    System.out.print(ch2+"\t");
                    ch2++;
                }
                else
                {
                    System.out.print(ch1+"\t");
                    ch1++;
                }      
                  
            }
            System.out.println();
            
            
        }
    }
}
