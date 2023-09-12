
import java.util.Scanner;

class D2Array {
    public static void main(String a[]){
        Scanner s = new Scanner(System.in);
        int Arr[][] = new int[2][3];

        System.out.println("Enter the elements:");
        for(int i=0; i<2;i++){
            for(int j=0;j<3;j++){
                Arr[i][j] = s.nextInt();
            }
        }

        System.out.println("Display the array: ");
        for(int i=0; i<2;i++){
            for(int j=0;j<3;j++){
                System.out.print(Arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
