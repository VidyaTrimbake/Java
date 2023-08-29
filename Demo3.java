import java.util.Scanner;

public class Demo3 {
    public static void main(String a[]) {
        Scanner sObj = new Scanner(System.in);

        System.out.println("Enter first number : ");
        int iNo1 = sObj.nextInt();
        System.out.println("Enter second number : ");
        int iNo2 = sObj.nextInt();

        Addition aObj = new Addition(iNo1, iNo2);
        int iRet = aObj.AddFun();

        System.out.println("Addition is : "+iRet);
    }
}

class Addition{
    public int N1;
    public int N2;

    public Addition(int No1,int No2){
        N1 = No1;
        N2 = No2;
    }

    public int AddFun()
    {
        int iAns = N1+N2;
        return iAns;
    }
}