import java.util.Scanner;

class String12 {
    public static void main(String a[]){
        Scanner s = new Scanner(System.in);

        System.out.println("Please enter the name1: ");
        String str = s.nextLine();
        //SubString(beginning index)

        System.out.println(str.substring(3));

        
    }
}
