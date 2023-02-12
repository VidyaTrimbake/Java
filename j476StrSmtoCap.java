//Convert str into char array

import java.util.*;

class j476StrSmToCap
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the any string");
        String str = sobj.nextLine();

        char Arr[] = str.toCharArray();

        int Count = 0;

        for(int i=0; i<Arr.length; i++)
        {
            if((Arr[i] >= 'a') && (Arr[i] <= 'z'))
            {
                Arr[i] = (char)(Arr[i] - 32);
            }
        }
        String output = new String(Arr);
        System.out.println("Converted string : "+output);
    }
}