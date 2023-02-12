class Demo<T>
{
    public T no1;
    public T no2;

    public Demo(T a, T b)
    {
        no1 = a;
        no2 = b;
    }

    public void Display()
    {
        System.out.println(no1);
        System.out.println(no2);
    }
}

class GenericClass
{
    public static void main(String Ar[])
    {
        Demo <Integer> iobj = new Demo<Integer>(11,21);
        iobj.Display();

        Demo <Character> cobj = new Demo<Character>('a','b');
        cobj.Display();
    }
}