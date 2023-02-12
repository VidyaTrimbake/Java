import java.util.*;
/*
Input : 4592

    2 9 5 4
    2 9 5 4
    2 9 5 4
    2 9 5 4


 */
class j260PatternTepmlt 
{
    public static void main(String a[])
    {
        Pattern pObj = new Pattern();
        Scanner sObj = new Scanner(System.in);

        System.out.println("Enter the string : ");
        int i = sObj.nextInt();

        pObj.Display(i);
    }
}

class Pattern
{
    public void Display(int iNo)
    {
        int iDigit = 0;
        int iTemp1 = 0, iTemp2 = 0;
        while(iTemp1 != iNo)
        {
            while(iTemp2 != 0)
            {
                iDigit = iTemp2 % 10;
                System.out.print(iDigit+"\t");
                iTemp2 = iTemp2 /10;
            }
            iTemp2 = iNo;
            
            System.out.println();
            iTemp1 = iTemp1 / 10;
        }

        System.out.println();
    }
}