package test.thread;

public class Star /* extends Thread */ implements Runnable {
	public Star() {}
	
	
	@Override
	public void run() {
		for(int k = 1; k <= 500; k++) {
			System.out.println("★");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}
