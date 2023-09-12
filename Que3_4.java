//Accept one character from user and convert cace of that character 
//Input : a  Output : A
//Input : D  Output : d

import java.util.*;
import java.lang.*;

public class Que3_4 {
    public static void main(String a[]) {
        Scanner sObj = new Scanner(System.in);

        System.out.println("PLease enter any character");
        char ch = sObj.next().charAt(0);
        Character cObj = new Character(ch);
        cObj.Convert();
    }
}

class Character{
    public char ch;

    public Character(char c){
        ch = c;
    }

    public void Convert(){
        char c1;
        c1 = Character.toUpperCase(ch);
        System.out.println(c1);
    }
}