import java.lang.StringBuilder;

class StringBuilder6 {
    public static void main(String a[]){
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb); //Tony

        //insert the char
        sb.insert(3,'y');   //Tonyy
        System.out.println(sb);

        //delete the char at
        sb.deleteCharAt(3); //Tony
        System.out.println(sb);

        //delete the char from start index to end index
        sb.delete(1,3); //Ty
        System.out.println(sb);

    }
}
