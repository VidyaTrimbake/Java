
class StaticDemo
{
    static
    {
        System.out.println("Inside static block of staticDemo class which contains mains");
    
    }
    public StaticDemo()
    {
        System.out.println("Inside constructor of staticDemo");
    }
    public static void main(String Arg[])
    {
        System.out.println("Inside main");
        System.out.println("VAlue of static No3: "+Demo.No3);
        System.out.println("VAlue of static No4: "+Demo.No4);

        Demo obj1 = new Demo();
        Demo obj2 = new Demo();

        obj1.Fun();
    }
};
class Demo
{
    public int No1;
    public int No2;
    public static int No3;
    public static int No4;

    static                      //static block
    {
        System.out.println("Inside the static block");
        No3 = 51;
        No4 = 101;
    }
    public Demo()            //constructor
    {
        System.out.println("Inside the constructor");
        No1 = 11;
        No2 = 21;
    
    }
    public void Fun()          //non static method
    {
        System.out.println("Inside the constructor");
        System.out.println("Inside the static method gun");
        System.out.println("VAlue of  No1: "+this.No1);
        System.out.println("VAlue of  No2: "+this.No2);
        System.out.println("VAlue of  No3: "+this.No3);
        System.out.println("VAlue of  No4: "+this.No4);
        
    
    }
    public static void gun()    //static method
    {
        System.out.println("Inside the static method gun");
        // System.out.println("VAlue of No1: "+No1);
        //System.out.println("VAlue of No2: "+No2);
        System.out.println("VAlue of No3: "+No3);
        System.out.println("VAlue of No4: "+No4);
    
    }

}
