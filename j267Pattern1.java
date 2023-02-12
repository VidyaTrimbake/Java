import java.util.*;
/*
 H e l l o
 H e l l o
 H e l l o
 H e l l o
 H e l l o

 */
class j260PatternTepmlt 
{
    public static void main(String a[])
    {
        Pattern pObj = new Pattern();
        Scanner sObj = new Scanner(System.in);

        System.out.println("Enter the string : ");
        String s = sObj.nextLine();

        pObj.Display(s);
    }
}

class Pattern
{
    public void Display(String str)
    {
        char Arr[] = str.toCharArray();
        int i = 0, j = 0;

        for(i = 0; i<Arr.length;i++)
        {
            for(j=0; j<Arr.length;j++)
            {
                System.out.print(Arr[j]+"\t");
            }
        }
        System.out.println();
    }
}