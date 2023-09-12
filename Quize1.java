public class Quize1 {
    public static void main(String a[]) {
        int a = 10, b = 5;
        int iRet = Ans(a,b);
        System.out.println("Ans is "+iRet);

    }

    public int Ans(int a,int b) {
        int iAns = (a * b)/(a + b);
        return iAns;
}
}