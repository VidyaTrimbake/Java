import java.lang.StringBuilder;

class StringBuilder4 {
    public static void main(String a[]){
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        // //char at index 0
        // System.out.println(sb.charAt(0));

        // //set char at index
        // sb.setCharAt(0,'P');
        // System.out.println(sb);

        // //append at the end
        // sb.append(" Tony");
        // System.out.println(sb);

        //insert at position
        sb.insert(3,'t');
        System.out.println(sb);
    }
}
