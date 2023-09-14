import java.util.ArrayList;

class ArrayLists2 {
    public static void main(String a[]){
        ArrayList<Integer> list = new ArrayList<Integer>();
        //add elements
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);
        
        //get element
        System.out.println(list.get(2));
        System.out.println(list.get(0));

        
    }
}
