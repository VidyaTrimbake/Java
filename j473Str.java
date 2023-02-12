//Convert str into char array

import java.util.*;

class j473Str
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the any string");
        String str = sobj.nextLine();

        char Arr[] = str.toCharArray();

        System.out.println(str.length());
        System.out.println(Arr.length);


    }
}