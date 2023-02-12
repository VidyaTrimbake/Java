
import java.util.*;

class Data
{
    public int Arr[];
    public Data(int size)     //constructor
    {
        Arr = new int[size];
    }

    protected void finalize()  //destructor
    {
        Arr = null;
    }
    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter numbers");
        for(int i = 0; i < Arr.length; i++)
        {
            Arr[i] = sobj.nextInt();
        }
    }
}

class DemoEven extends Thread
{
    public Data dobj; //reference

    public DemoEven(Data obj)
    {
        dobj = obj;
    }

    public void run()
    {
        for(int i = 0 ; i< dobj.Arr.length; i++)
        {
            if(dobj.Arr[i] % 2 == 0)
            {
                System.out.println("Even number is : "+dobj.Arr[i]);
            }
        }
    }
}

class DemoOdd extends Thread
{
    public Data dobj;  //reference

    public DemoOdd(Data obj)
    {
        dobj = obj;
    }

    public void run()
    {
        for(int i = 0 ; i< dobj.Arr.length; i++)
        {
            if(dobj.Arr[i] % 2 != 0)
            {
                System.out.println("Odd number is : "+dobj.Arr[i]);
            }
        }
    }
}

class ThreadDemo12
{
    public static void main(String a[]) throws InterruptedException
    {
        Data obj1 = new Data(10);
        obj1.Accept();

        DemoEven eobj = new DemoEven(obj1);
        DemoOdd oobj = new DemoOdd(obj1);

        Thread t1 = new Thread(eobj);
        Thread t2 = new Thread(oobj);

        t1.start();
        t2.start();

        t1.join();
        t2.join();
    }
}