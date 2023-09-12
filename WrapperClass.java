//Wrapper Class

public class WrapperClass {
    public static void main(String a[]){
        byte b = 10;
        char c = 'a';
        int i = 20;
        short s = 30;
        
        //Autoboxing

        Byte bObj = b;
        Character cObj = c;
        Integer iObj = i;
        Short sObj = s;

        System.out.println("Autoboxing");
        System.out.println(b);
        System.out.println(c);
        System.out.println(i);
        System.out.println(s);

        byte bValue = bObj;
        char cValue = cObj;
        int iValue = iObj;
        short sValue = sObj;

        System.out.println("Unboxing");
        System.out.println(bObj);
        System.out.println(cObj);
        System.out.println(iObj);
        System.out.println(sObj);
    }
}
