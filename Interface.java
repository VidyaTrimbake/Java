
interface Circle
{
    float PI = 3.14f;

    float Area(float Radius);
    float Circumference(float Radius);
}

class Marvellous implements Circle
{
    public float Area(float Radius)
    {
        return PI * Radius * Radius;
    }
    public float Circumference(float Radius)
    {
        return 2*PI * Radius ;
    }
}
class Interface
{
    public static void main(String Arr[])
    {
        System.out.println("Value of PI "+Circle.PI);
        //Circle.PI = 7.12f;
        Circle cObj = new Marvellous();
        float Ret = 0.0f;
        Ret = cObj.Area(10.5f);
        System.out.println("Area is: "+Ret);
        Ret = cObj.Area(10.5f);
        System.out.println("Circumference is: "+Ret);
    }
}