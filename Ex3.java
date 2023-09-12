//Enter 2 no and return greater than another

import java.util.Scanner;

public class Ex3 {
    public static void main(String a[]){
        Scanner sObj = new Scanner(System.in);
        
        System.out.println("Enter the first number");
        int iNo1 = sObj.nextInt();

        System.out.println("Enter the second number");
        int iNo2 = sObj.nextInt();

        Avg aObj = new Avg(iNo1, iNo2);
        int iRet = aObj.Greater();
        System.out.println("Greater number is: "+iRet);
    }    
}

class Avg{
    public int n1;
    public int n2;

    public Avg(int N1,int N2){
        n1 = N1;
        n2 = N2;
    }

    public int Greater(){
        if(n1>n2){
            return n1;
        }
        else{
            return n2;
        }
    }
}
