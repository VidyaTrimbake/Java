import java.util.ArrayList;

class ArrayLists5 {
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

        //add in between
        list.add(1,100);
        System.out.println(list);

        //set a element instead of another element
        list.set(3, 200);
        System.out.println(list);

        //remove element
        list.remove(0);
        System.out.println(list);

        list.remove(3);
        System.out.println(list);
    }
}
