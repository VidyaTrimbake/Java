//enter radius and return circumference

import java.util.Scanner;

public class Ex5 {
    public static void main(String a[]){
        Scanner sObj = new Scanner(System.in);
        
        System.out.println("Enter the age");
        int iAge = sObj.nextInt();

        Eligible aObj = new Eligible(iAge);
        boolean bRet = aObj.Check();

        if(bRet==true){
            System.out.println("Eligible for voting");
        }
        else{
            System.out.println("Not Eligible for voting");
        }
    }    
}

class Eligible{
    public int age;

    public Eligible(int Age){
        age = Age;
    }

    public boolean Check(){
        if(age>=18){
            return true;
        }
        else{
            return false;
        }
    }
}
