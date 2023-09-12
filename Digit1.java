import java.util.Scanner;

class Digit1{
    public static void main(String a[]){
        Scanner Obj = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int iNo = Obj.nextInt();

        Reverse rObj = new Reverse(iNo);
        rObj.RevereNo();
    }
}

class Reverse{
    public int No;

    public Reverse(int N){
        No = N;
    }

    public void RevereNo(){
        int Remainder;
        int Sum = 0;
        System.out.print("Reverse of "+No+" is: ");
        while(No!=0){
            Remainder = No % 10;    //= 159%10=9
            System.out.print(Remainder);
            //Sum = Sum + Remainder;
            No = No/10;
        }
        System.out.println();
        //System.out.println("Sum is: "+Sum);
    }
}