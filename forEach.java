
import java.util.Arrays;
import java.util.List;

public class forEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> no = Arrays.asList(10,2,3,60);
		
		for(int i : no) {
			System.out.println(i);
		}
		no.forEach(System.out :: println);
		//int i;
		no.forEach(i-> System.out.println(i));

	}

}
