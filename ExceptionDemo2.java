import java.util.Scanner;

class ExceptionDemo2
{
    public static void main (String a[])
    {
        Scanner sObj = new Scanner(System.in);
        int Arr[] = {10,20,30,40};

        System.out.println("Enter the index of array: ");
        int i = sObj.nextInt();

        System.out.println("DAta at the specified index is: "+Arr[i]);

    }
}