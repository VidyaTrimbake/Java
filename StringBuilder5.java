import java.lang.StringBuilder;

class StringBuilder5 {
    public static void main(String a[]){
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        //insert the char
        sb.insert(3,'y');
        System.out.println(sb);

        //delete the char at
        sb.deleteCharAt(3);
        System.out.println(sb);

        //delete the char from start index to end index
        sb.delete(1,3);
        System.out.println(sb);

    }
}
