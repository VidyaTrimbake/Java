import java.util.*;
/*
Input : 4592

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
        while(iNo != 0)
        {
            iDigit = iNo % 10;
            System.out.print(iDigit+"\t");
            iNo = iNo /10;
        }
        System.out.println();
    }
}