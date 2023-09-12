//Accept number from user and check whether number is even or odd
import java.util.*;

class Que2_6{
    public static void main(String a[]) {
        Scanner sObj = new Scanner(System.in);

        System.out.println("Plese enter the any number");
        int No = sObj.nextInt();

        boolean bRet = false;
        Arithmatic aObj = new Arithmatic(No);
        bRet = aObj.check();
        if(bRet==true){
            System.out.println(No+" is even");
        }
        else{
            System.out.println(No+" is Odd");
        }
    }
}

class Arithmatic{
    public int No;

    public Arithmatic(int N){
        No = N;
    }

    public boolean check(){
        if(No % 2 == 0){
            return true;
        }
        else{
            return false;
        }
    }
}