
import java.io.InputStreamReader;
//import java.io.BufferedReader;

public class BufferedReader {
    public static void main(String a[]){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int i = Integer.parseInt(reader.readLine());

        System.out.println(i);
    }
}
