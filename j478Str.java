//Convert str into char array

import java.util.*;

class j477Str
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the any string");
        String str = sobj.nextLine();

        String data = str.replaceAll("\\s+"," ");
        
        String newstr = data.trim();
        
        String Arr[] = newstr.split(" ");

        System.out.println("Number of words are "+Arr.length);
    }
}