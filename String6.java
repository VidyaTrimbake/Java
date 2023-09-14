import java.util.Scanner;

class String6 {
    public static void main(String a[]){
        Scanner s = new Scanner(System.in);

        System.out.println("Please enter the name: ");
        String name = s.nextLine();

        for(int i=0; i<name.length(); i++){
            System.out.println("CHaracter at index "+i+" is: "+name.charAt(i));
        }
    }
}
