import java.util.Scanner;

class String5 {
    public static void main(String a[]){
        Scanner s = new Scanner(System.in);

        System.out.println("Please enter the name: ");
        String name = s.nextLine();
        System.out.println("Please enter the Surname: ");
        String srname = s.nextLine();

        String fName = name+" "+srname;
        System.out.println("Full Name is "+fName);
        
        System.out.println("Length of fName is: "+fName.length());

        for(int i=0; i<fName.length(); i++){
            System.out.println(fName.charAt(i));
        }
    }
}
