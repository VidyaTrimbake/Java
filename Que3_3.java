//Write a program which accept number from user and print even factors of that number

//Input:  36
//Output: 2 6 12 18
import java.util.*;

public class Que3_3 {
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
        for(int i=1; i<N; i++){
            if(N%i == 0){
                if(i%2==0){
                    System.out.println(i);
                }
            }
        }
    }
}
