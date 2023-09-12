//write down a fun to print sm of odd no from 1 to n

import java.util.Scanner;

public class Ex2 {
    public static void main(String a[]){
        Scanner sObj = new Scanner(System.in);
        
        System.out.println("Enter the any N number");
        int N = sObj.nextInt();

        Avg aObj = new Avg(N);
        int iRet = aObj.SumOdd();
        System.out.println("SUm of Odd number is: "+iRet);
    }    
}

class Avg{
    public int n;

    public Avg(int N){
        n = N;
    }

    public int SumOdd(){
        int iOdSm = 0;
        for(int i=1; i<= n; i++){
            if(i%2!=0){
                iOdSm = iOdSm + i;
            }
        }
        return iOdSm;
    }
}
