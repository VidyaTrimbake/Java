//Program to division of two numbers

import java.util.*;

class Div{

    public static void main(String a[]) {
        Scanner sObj = new Scanner(System.in);

        int iNo1,iNo2,iRet;

        System.out.println("Please enter the first number");
        iNo1 = sObj.nextInt();

        System.out.println("Please enter the second number");
        iNo2 = sObj.nextInt();

        Arithmatic aObj = new Arithmatic(iNo1, iNo2);
        iRet = aObj.Division();
        System.out.println("Ans is:"+iRet);
    }
}

class Arithmatic{
    public int iN1;
    public int iN2;

    public Arithmatic(int iNo1, int iNo2){
        iN1 = iNo1;
        iN2 = iNo2;
    }

    public int Division(){
        int iDiv = iN1/iN2;
        return iDiv;
    }
}