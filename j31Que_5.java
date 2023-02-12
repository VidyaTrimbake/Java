//Write a java program which accept string from usr and display it in reverse order.

//Input:    "MarvellouS"
//Output:   "SuollevraM" 

import java.util.Scanner;

class j31Que_5
{
    public static void main(String srg[]) 
    {
        Scanner sObj = new Scanner(System.in);
        System.out.println("Please enter any string: ");
        String str = sObj.nextLine();

        StringDemo dObj = new StringDemo();
        dObj.Reverse(str);
    }
}

class StringDemo
{
    public void Reverse(String str)
    {
        String newStr = " ";
        char ch;

        for(int iCnt = 0; iCnt < str.length() ; iCnt++)
        {
            ch = str.charAt(iCnt);
            newStr = ch+newStr;
        }
        System.out.println("Reversed string is : "+newStr);
    }
}