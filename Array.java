
class Array
{
    public static void main(String arr[]) 
    {
        int Arr[] = {10,20,30,40,50};
        int iMin = Arr[0];
        System.out.println("Smallest number\n");

        for(int i = 0;i<Arr.length;i++)
        {
            if(Arr[i] < iMin)
            {
                iMin = Arr[i];
            }
        }  
        System.out.println(iMin);
    }
}