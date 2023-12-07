
public class MainSync {

	public static void main(String[] args) {
		DemoSync dObj = new DemoSync();
		
		Thread1 t1 = new Thread1(dObj);
		Thread2 t2 = new Thread2(dObj);
		
		t1.start();
		t2.start();
	}

}

class DemoSync{
	int n;
	synchronized public void Increment(int n) {
		this.n = n;
		n++;
		System.out.println(n);
		
		try {
			Thread.sleep(40);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}

class Thread1 extends Thread{
	DemoSync dObj;
	
	Thread1(DemoSync dObj){
		this.dObj = dObj;
		System.out.println("Thread1");
	}
	
	public void run() {
		dObj.Increment(5);
		
	}
	
}

class Thread2 extends Thread{
	DemoSync dObj;
	
	Thread2(DemoSync dObj){
		this.dObj = dObj;
		System.out.println("Thread2");
	}
	
	public void run() {
		dObj.Increment(50);
	}
	
}
