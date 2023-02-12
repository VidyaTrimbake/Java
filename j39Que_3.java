//Write Java program which accept string from user and display below pattern
//Inpur:    Hello
//Output:   H # # # #
//          H e # # #
//          H e l # #
//          H e l l o

import java.util.*;
class j39Que_3
{
    public static void main(String agr[]) 
    {
        Scanner sObj = new Scanner(System.in);

        System.out.println("Please enter the any word: ");
        String str = sObj.nextLine(); 

        PatternX pObj = new PatternX();
        pObj.Pattern(str);
    }
}

class PatternX
{
    public void Pattern(String str)
    {
        for(int iCnt = 0; iCnt < str.length(); iCnt++)
        {
            for(int jCnt = 0; jCnt < str.length(); jCnt++)
            {
                if(jCnt > iCnt)
                {
                    System.out.print("#\t");
                }
                else
                {
                    System.out.print(str.charAt(jCnt)+"\t");
                }
            }
            System.out.println();
        }
    }
}
