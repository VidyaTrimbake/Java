//  *
//  * *
//  * * *
//  * * * *
//  * * * * *
//
import java.util.*;

public class Pattern1 {
    public static void main(String a[])
    
    {
        int i, j;
        int n=4;

        // outer loop to handle rows
        for (i = 1; i <= n; i++) {

            // inner loop to handle columns
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // printing new line for each row
            System.out.println();
        }
    }
    // int n = 4;

    // for(int i = 1; i<=n; i++){

    //     for(int j=1; j<=i; j++){

    //             System.out.print("*");
    //         }
    //     }
    //     System.out.println();
    // }
}
