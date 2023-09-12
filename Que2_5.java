//Accept two numbers from user and display first number in second number of times
//Input:  12 5
//Output: 12 12 12 12 12

//Input:  -2 3
//Output: -2 -2 -2 

//Input:  21 -3
//Output: 21 21 21

//Input:  -2 0
//Output: 

import java.util.*;

class Que2_5{
    public static void main(String a[]) {
        Scanner sObj = new Scanner(System.in);
        int No1, No2;

        System.out.println("Please enter the first number:");
        No1 = sObj.nextInt();

        System.out.println("Please enter the second number:");
        No2 = sObj.nextInt();

        Print pObj = new Print(No1, No2);
        pObj.Print();
    }
}

class Print{
    public int No1;
    public int No2;

    public Print(int N1,int N2){
        No1 = N1;
        No2 = N2;
    }

    public void Print(){
        System.out.println("Required:");
        if(No2 < 0){
            No2 = -No2;
        }
        int i = 1;
        do{
            System.out.println(No1);
            i++;
        }while(i<=No2);
    }
}