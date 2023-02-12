
import java.io.*;
import java.util.*;

class Array2Sm
{
    public static void main(String arr[]) 
    {
        int Arr[] = {10,20,30,40,50};
        int n = Arr.length;
        System.out.println("Smallest number\n");

        Arrays.sort(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);

    }
}