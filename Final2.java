class Base
{
    public void fun()
    {
        System.out.println("Base fun");
    }
    public final void gun()
    {
        System.out.println("Base gun");
    }
}
class Derived extends Base
{
    public void fun()
    {
        System.out.println("Derived fun");
    }
    public void gun()
    {
        System.out.println("Derived gun");
    }
}
class Final2
{
    public static void main() 
    {
        Derived dObj = new Derived();
    }
}
