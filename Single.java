/*
  class Object  (belongs in package java.lang)
  {
        //Code
  }
 */
//implicitly import --> import java.lang.*;
class Base            //class Base extends Object
{
    public int A,B;

    public Base()
    {
        System.out.println("Base Constructor");
        this.A = 10;
        this.B = 11;
    }
    public void fun()          //Defination
    {
        System.out.println("Inside the base fun");
    }
    public void gun()          //Defination
    {
        System.out.println("Inside the base gun");
    }
    public void fun(int iNo)     //Overloaded defination
    {
        System.out.println("Inside the base fun with one integer");
    }
}
class Derived extends Base //C++ --> class Derived::public Base 
{
    public int X,Y;
    public Derived()
    {
        System.out.println("Derived Constructor");
        this.X = 30;
        this.Y = 40;
    }
    public void sun()      //Defination
    {
        System.out.println("Inside the derived sun");
    }
    public void gun()       //OverRided defination (In C++ --> Redefination)
    {
        System.out.println("Inside the derived gun");
    }
}

class Single 
{
    public static void main(String Arg[]) 
    {
        //Base bObj1 = new Base();          //No Casting
        //Derived dObj1 = new Derived();      //No Casting
        Base bObj2 = new Derived();       //Up Casting
        //Derived bObj2 = new Base();          //Down Casting

        bObj2.fun();                        //Base fun 
        bObj2.fun(11);                  //Base fun
        bObj2.gun();                         //Derived gun
        //bObj2.sun();                         //Derived sun
   }    
}
