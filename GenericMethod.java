
class GenericMethod
{
    public static <T> void Display(T Arr[])
    {
        for(int i = 0; i < Arr.length; i++)
        {
            System.out.println(Arr[i]);
        }
    }

    public static void main(String Ar[])
    {
        Integer iArr[] = {10,20,30,40};
        Display(iArr);

        Character cArr[] = {'a','b','c','d'};
        Display(cArr);

        Float fArr[] = {10.9f,90.5f,89.0f};
        Display(fArr);
    }
}