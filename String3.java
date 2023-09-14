import java.util.Scanner;

class String3 {
    public static void main(String a[]){
        Scanner s = new Scanner(System.in);

        System.out.println("Please enter the name: ");
        String name = s.nextLine();
        System.out.println("Please enter the Surname: ");
        String srname = s.nextLine();

        String fName = name+"@"+srname;
        System.out.println("Full Name is "+fName); 
    }
}
