//Write a program which accept number from user and print even factors of that number

//Input:  24
//Output: 1 2 4  6 8 12 

import java.util.*;

public class Que3_2 {
    public static void main(String a[]) {
        Scanner sObj = new Scanner(System.in);

        System.out.println("Please enter any number");
        int No = sObj.nextInt();

        Arithmatic aObj = new Arithmatic(No);
        aObj.Print();
    }
}

class Arithmatic{
    public int No;

    public Arithmatic(int No){
        No = No;
    }

    public void Print(){
        int iCnt = 0;
        for(iCnt=1; iCnt<=No; iCnt++){
            if(No%iCnt == 0){
                System.out.println(iCnt);
            }
        }
    }
}
