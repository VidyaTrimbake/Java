//Accept any character from user and check whether that character is vowel(a,e,i,o,u) or not.
//Input : E  Output : TRUE
//Input : E  Output : TRUE

import java.util.*;

public class Que3_5 {
    public static void main(String a[]){
        Scanner sObj = new Scanner(System.in);

        System.out.println("Enter the character");
        char chValue = sObj.next().charAt(0);

        Check cObj = new Check(chValue);
        boolean bRet = cObj.Check();
    }
}

class Check{
    public char chValue;

    public Check(char ch){
        chValue = ch;
    }

    public boolean Check(){
        if((chValue == a) || (chValue == e) || (chValue == i) || (chValue == o) || (chValue == u)){
            return true;
        }
        else{
            return false;
        }
    }
}
