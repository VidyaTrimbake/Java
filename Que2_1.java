//Accept one number from user and print that number of * on screen

import java.util.*;
public class Que2_1 {
    public static void main(String a[]) {
        Scanner sObj = new Scanner(System.in);

        System.out.println("Please enter the any number");
        int No = sObj.nextInt();

        Pattern pObj = new Pattern(No);
        pObj.PrPattern();
    }
}

class Pattern{
    public int No;

    public Pattern(int N){
        No = N;
    }

    public void PrPattern(){
        System.out.println("Required Pattern is");
        for(int i =1; i<=No; i++){
            System.out.println("*");
        }
    }
}

