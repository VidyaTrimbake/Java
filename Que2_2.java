//Accept one number from user and print that number of * on screen
import java.util.*;
public class Que2_2 {
    public static void main(String a[]) {
        Scanner sObj = new Scanner(System.in);

        System.out.println("Please enter the any number");
        int No = sObj.nextInt();

        Pattern pObj = new Pattern(No);
        pObj.PiPat();
    }
}

class Pattern{
    public int N;

    public Pattern(int No){
        N = No;
    }

    public void PiPat(){
        System.out.println("Required pattern is:");

        int i = 1;
        while(i<=N){
            System.out.println("*");
            i++;
        }
    }
}
