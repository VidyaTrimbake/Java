
class ThreadDemo11
{
    public static void main(String A[])
    {
        System.out.println("Inside main method");

        System.out.println("Name of current thread is : "+Thread.currentThread().getName());

        System.out.println("Pririty of current thread is : "+Thread.currentThread().getPriority());
    }
}