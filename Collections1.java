import java.util.*;

class Collections1
{
    public static void main(String Arr[]) 
    {
        LinkedList <Integer> lObj = new LinkedList<Integer>();    

        lObj.add(11);
        lObj.add(21);
        lObj.add(51);
        lObj.add(101);
        lObj.add(111);

        System.out.println("Elements of linked list are: "+lObj);

        lObj.addFirst(1);
        System.out.println("Elements of linked list are: "+lObj);

        lObj.addLast(120);
        System.out.println("Elements of linked list are: "+lObj);

        Iterator iObj = lObj.iterator();
        System.out.println("Data using iterator is");
        while(iObj.hasNext())
        {
            System.out.println(iObj.next());
        }
        if(lObj.contains(1))
        {
            System.out.println("Element is present in LL");
        }
        else
        {
            System.out.println("Element is not present in LL");
        }

        lObj.remove();
        System.out.println("Elements of linked list are: "+lObj);

        lObj.remove(0);
        System.out.println("Elements of linked list are: "+lObj);

        lObj.removeLast();
        System.out.println("Elements of linked list are: "+lObj);

        System.out.println("Number of Elements of linked list are: "+lObj.size());

        lObj.set(2, 222222);
        System.out.println("Elements of linked list are: "+lObj);

        //lObj.clear();
        //System.out.println("Elements of linked list are: "+lObj);

    }
}