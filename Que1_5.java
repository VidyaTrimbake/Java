//Accept one number from user and print that number of * on screen
import java.util.*;

class Que1_5 {
    public static void main(String a[]) {
        Scanner sObj = new Scanner(System.in);

        System.out.println("Enter any number: ");
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
        System.out.println("Required Pattern");
        for(int i = 1; i<=No; i++){
            System.out.println("*");
        }
    }
}


