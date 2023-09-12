//Enter 3 no from user and make fun to print avg.

import java.util.Scanner;

public class Ex1 {
    public static void main(String a[]){
        Scanner sObj = new Scanner(System.in);
        
        System.out.println("Enter the first number");
        int iNo1 = sObj.nextInt();

        System.out.println("Enter the second number");
        int iNo2 = sObj.nextInt();

        System.out.println("Enter the third number");
        int iNo3 = sObj.nextInt();

        Avg aObj = new Avg(iNo1, iNo2, iNo3);
        int iRet = aObj.PriAvg();
        System.out.println("Aversge is: "+iRet);
    }    
}

class Avg{
    public int n1;
    public int n2;
    public int n3;

    public Avg(int N1,int N2,int N3){
        n1 = N1;
        n2 = N2;
        n3 = N3;
    }

    public int PriAvg(){
        int iAvge = (n1+n2+n3)/3;
        return iAvge;
    }
}
