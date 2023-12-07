
public class ThreadMain3 {
	public static void main(String a[]) {
        //N = 10;
		Number3 nObj = new Number3(200);
		
		Thread t1 = new Thread(new Runnable() {

			public void run() {
				nObj.printEvenNo();
			}
			
		});
		
		Thread t2 = new Thread(new Runnable() {

			public void run() {
				nObj.printOddNo();
			}
			
		});

        t1.start();
        t2.start();
	}
}

class Number3{
	int n;
	
	public Number3(int n) {
		this.n = n;
		// TODO Auto-generated constructor stub
	}

	synchronized public void printEvenNo() {
		try {
			for(int i=1; i<=n; i++) {
				if(i%2==0) {
					System.out.println(i);
				}
			}		
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
	
	synchronized public void printOddNo() {
		try {
			for(int i=1; i<=n; i++) {
				if(i%2==1) {
					System.out.println(i);
				}
			}		
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}


