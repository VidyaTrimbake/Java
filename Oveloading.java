import java.lang.*;      // Default package in java

class Demo
{
     public void fun()   // fun@0
     {
          System.out.println("Fun without parameters");
     }
     public void fun(int i)   // fun@1i
     {
          System.out.println("Fun with one integer as a parameter");
     }
     public void fun(int i, int j) // fun@2ii
     {
          System.out.println("Fun with two integer as a parameters");
     }
     public void fun(double i)     // fun@1d
     {
          System.out.println("Fun with one double as a parameter");
     }
}

class Overloading
{
     public static void main(String a[])
     {
          Demo obj = new Demo();
          obj.fun();
          obj.fun(11);
          obj.fun(11,21);
          obj.fun(11.21);
     }
}