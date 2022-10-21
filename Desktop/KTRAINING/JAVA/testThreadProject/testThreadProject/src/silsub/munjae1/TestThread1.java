package silsub.munjae1;

public class TestThread1 {

	public static void main(String[] args) {
//		Increment inc = new Increment();
//		Decrement dec = new Decrement();
//		
//		Runnable r1 = new Increment();
//		Runnable r2 = new Decrement();
		
		Thread t1 = new Thread(new Increment(50));
		Thread t2 = new Thread(new Decrement(12, 45));
		
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(3);
		
		
		t1.start();
		t2.start();
		
		
		
		

	}

}
