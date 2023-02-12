
class Demo implements Runnable
{
    public void run()
    {
        int i = 0;
        for(i = 1; i<= 1000; i++)
        {
            System.out.println(Thread.currentThread().getName()+" : "+i);
        }
    }
}
class ThreadDemo3
{
    public static void main(String A[])
    {
        System.out.println("Inside main thread");
        Demo obj1 = new Demo();
        Demo obj2 = new Demo();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.setName("First");
        t2.setName("Second");

        t1.start();
        t2.start();
    }
}