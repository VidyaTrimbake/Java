import java.util.Scanner;

class String7 {
    public static void main(String a[]){
        Scanner s = new Scanner(System.in);

        System.out.println("Please enter the name1: ");
        String name1 = s.nextLine();

        System.out.println("Please enter the name2: ");
        String name2 = s.nextLine();

        if(name1.equals(name2)){
            System.out.println(name1+" is equal to "+name2);
        }
        else{
            System.out.println(name1+" is not equal to "+name2);
        }
    }
}
