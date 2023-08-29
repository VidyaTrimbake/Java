//Write a program which accept one number from user and print that number of even numbers on screen

//Input:  7
//Output: 2 4 6 8 10 12 14

import java.util.Scanner;

public class Demo4 {
    public static void main(String a[]) {
        Scanner sObj = new Scanner(System.in);

        System.out.println("Please enter any number");
        int No = sObj.nextInt();

        Arithmatic aObj = new Arithmatic(No);
        aObj.Print();
    }
}

class Arithmatic{
    public int N;

    public Arithmatic(int No){
        N = No;
    }

    public void Print(){
    // if(iNo <= 0)
    // {
    //     return 0;
    // }
    for(int iCnt = 2; iCnt <= N*2; iCnt+=2){
        System.out.println(iCnt);
        // if(iCnt % 2 == 0)
        // { 
        //     System.out.println(iCnt);
        // }
    }
    }
}
