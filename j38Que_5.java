//Write Java program which accept string from user and display below pattern
//Inpur:    Hello
//Output:   H
//          H e 
//          H e l 
//          H e l l 
//          H e l l o
//          H e l l 
//          H e l 
//          H e 
//          H 


import java.util.*;
class j38Que_5
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
        for(int iCnt = 1; iCnt < str.length(); iCnt++)
        {
            for(int jCnt = 0; jCnt <= iCnt; jCnt++)
            {
                System.out.print(str.charAt(jCnt)+"\t");
            }
            System.out.println();
        }

        for(int iCnt = (str.length() - 2); iCnt >= 0; iCnt--)
        {
            for(int jCnt = 0; jCnt <= iCnt; jCnt++)
            {
                System.out.print(str.charAt(jCnt)+"\t");
            }
            System.out.println();
        }
    }
}
