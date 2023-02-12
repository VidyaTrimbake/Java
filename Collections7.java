import java.util.*;

public class Collections7 
{
    public static void main(String ar[]) 
    {
        Stack <Character> sObj = new Stack<Character>();

        sObj.push('a');
        sObj.push('b');
        sObj.push('c');
        sObj.push('d');
        sObj.push('e');

        System.out.println("Elements of stack:"+sObj);
        
        System.out.println("Poped Element of stack:"+sObj.pop());
    }    
}
