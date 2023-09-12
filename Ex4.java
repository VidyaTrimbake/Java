//enter radius and return circumference

import java.util.Scanner;

public class Ex4 {
    public static void main(String a[]){
        Scanner sObj = new Scanner(System.in);
        
        System.out.println("Enter the radius");
        int iRd = sObj.nextInt();

        Circumference aObj = new Circumference(iRd);
        double iRet = aObj.Cirf();
        System.out.println("Circumference is: "+iRet);
    }    
}

class Circumference{
    public int r;

    public Circumference(int R){
        r = R;
    }

    public double Cirf(){
        double iCirf = 2*(3.14)*r;
        return iCirf;
    }
}
