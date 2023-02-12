class Wrapper
{
    public static void main(String A[])
    {
        int no = 11;

        Integer iobj = new Integer(no);     // Boxing - Converting premitive to Wrapper

        System.out.println(no);
        System.out.println(iobj);
        
        int x = iobj;       // Unboxing - Converting Wrapper to premitive
        System.out.println(x);
    }
}