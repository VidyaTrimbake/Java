import java.lang.StringBuilder;

class StringBuilder1 {
    public static void main(String a[]){
        String str = "Vidya";
        System.out.println("String: "+str);
        str = str + " Trimbake";
        System.out.println("String: "+str);

        StringBuilder strB = new StringBuilder("Vidya");
        System.out.println("StringBuilder: "+ strB);
        strB.append("Trimbake");

        System.out.println("StringBuilder: "+strB);
    }
}
