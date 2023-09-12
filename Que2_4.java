//Accept number from user, if number is less than 10 then print "Hello" otherwise print "Demo"

import java.util.Scanner;

class Que2_4{
    public static void main(String a[]){
        Scanner sObj = new Scanner(System.in);

        System.out.println("Please enter the any number: ");
        int No = sObj.nextInt();

        Print pObj = new Print(No);
        pObj.Print();
    }
}

class Print{
    public int No;

    public Print(int N){
        No = N;
    }

    public void Print(){
        if((No < 10) || (No == 10)){
            System.out.println("Hello");
        }
        else{
            System.out.println("Namste");
        }
    }
}