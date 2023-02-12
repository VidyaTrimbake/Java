
class Demo
{
    public void fun()
    {
        System.out.println("fun without parameters");   
    }
    public void fun(int iNo)
    {
        System.out.println("fun with one parameters");   
    }
    public void fun(int iNo1, int iNo2)
    {
        System.out.println("fun with two parameters");   
    }
    public void fun(double dNo)
    {
        System.out.println("fun with double as parameters");   
    }
}
public class Overloading 
{
    public static void main(String Arg[]) 
    {
        Demo dObj = new Demo();

        dObj.fun();
        dObj.fun(iNo);
        dObj.fun(iNo1, iNo2);
        dObj.fun(dNo);
    }    
    
}