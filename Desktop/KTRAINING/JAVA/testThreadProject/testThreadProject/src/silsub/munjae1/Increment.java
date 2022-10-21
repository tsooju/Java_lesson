package silsub.munjae1;

public class Increment implements Runnable {
	int num;
	
	public Increment(int num) {
		this.num = num;
	}


	@Override
	public void run() {
		for(int i=1; i<=num; i += 2) {
			System.out.println("Inc : " + i);
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
