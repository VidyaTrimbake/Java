
public class ThreadMain4 {
	public static void main(String a[]) {
		
		Number1 nObj = new Number1(100);
		
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

class Number4{
	int n;
	
	public Number4(int n) {
		this.n = n;
	}

	public void printEvenNo() {
		synchronized(this) {
			try {
				for(int i=1; i<=n; i++) {
					if(i%2==0) {
						System.out.println(i);
					}
					Thread.sleep(40);
				}		
			}
			catch(Exception e){
				System.out.println(e);
			}
		}
	}
	
	public void printOddNo() {
		synchronized(this) {
			try {
				for(int i=1; i<=n; i++) {
					if(i%2==1) {
						System.out.println(i);
					}
					Thread.sleep(40);
				}		
			}
			catch(Exception e){
				System.out.println(e);
			}
		}
	}
}


