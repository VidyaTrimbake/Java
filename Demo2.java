public class Demo2 {
    
    static int Add(int N1, int N2){
        int iAns = N1 + N2;
        return iAns;
    }

    public static void main(String a[]) {
        int iNo1 = 10;
        int iNo2 = 20;
        int iRet = Add(iNo1, iNo2);
        System.out.println("Ans:"+iRet);
    }
}
