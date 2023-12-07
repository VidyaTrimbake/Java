
interface A{
	void m1();
}

public class LambdaExpression {
	public static void main(String a[]) {
		
//		A obj = new A() {
//
//			public void m1() {
//				System.out.println("Interface");
//			}
//		};
//		obj.m1();
		
		A obj;
		obj = ()->System.out.println("Hello");
		obj.m1();
	}
}
