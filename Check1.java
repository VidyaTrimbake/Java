//Accept one number and check whether it is divisible by 5 or not

import java.util.*;
public class Check1 {
    public static void main(String a[]) {
        Scanner sObj = new Scanner(System.in);

        System.out.println("Enter the number:");
        int No = sObj.nextInt();
        boolean bRet = check(No);

        if(bRet == true){
            System.out.println("Divisible");
        }
        else{
            System.out.println("Not Divisible");
        }
    }
    static boolean check(int N) {
        if(N%5==0){
            return true;
        }
        else{
            return false;
        }    
    }
}
