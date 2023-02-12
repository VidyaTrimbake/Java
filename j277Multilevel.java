
class j277Multilevel 
{
    public static void main(String arg[]) 
    {
        C cObj = new C();
        cObj.AFun();
        cObj.BFun();
        cObj.CFun();    
    }
}

class A
{
    public void AFun()
    {
        System.out.println("I am the Parent class A");
    }
}

class B extends A
{
    public void BFun()
    {
        System.out.println("Im the child class, derived from A class");
    }
}

class C extends B
{
    public void CFun()
    {
        System.out.println("I am also child class, deriverd from B class");
    }
}
