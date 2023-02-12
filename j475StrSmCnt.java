//Convert str into char array

import java.util.*;

class j475StrSmCnt
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the any string");
        String str = sobj.nextLine();

        char Arr[] = str.toCharArray();

        System.out.println(str.length());
        System.out.println(Arr.length);

        int Count = 0;
        int i = 0;

        while(i<Arr.length)
        {
            if((Arr[i] >= 'a') && (Arr[i] <= 'z'))
            {
                Count++;
            }
            i++;
        }
        System.out.println("Small char are: "+Count);
    }
}