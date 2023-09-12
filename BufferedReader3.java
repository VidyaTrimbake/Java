import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class BufferedReader3{
    public static void main(String a[]){
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Entered text");
        String x = bf.readLine();
        System.out.println("Entered text is "+x);
    }
}