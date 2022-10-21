package test.thread;

public class TestThread {

	public static void main(String[] args) {
		//  Thread run test
		
		
		//Thread class 상속할 경우================
//		Star star = new Star();
//		Number number = new Number();
//		
//		Thread t1 = star;
//		Thread t2 = number;
		
//		Thread t1 = new Star();
//		Thread t2 = new Number();
		
		
		//Runnable 인터페이스 상속할 경우=============
		Runnable r1 = new Star();
		Runnable r2 = new Number();
		
		//Runnable  start 하기 위해 ==>> Thread 로 변경해야 함. 
//		Thread t1 = new Thread(r1); //하면 Runnable이 Thread 로 변경됨
//		Thread t2 = new Thread(r2);
		
		Thread t1 = new Thread(new Star());
		Thread t2 = new Thread(new Number());
		
		//thread 를 실행 : start() 사용 >> 오버로딩된  run() 구동함
//		t1.start();
//		t2.start(); // 이때 cpu가 알아서 나누어서 작동 시킨다. 
		
		//---------------------------------------------------------------------------------
		//Thread 우선순위 확인 
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		
		// Thread 우선순위 지정 
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(3); 	// 1~10 사이의 정수로 지정함. 
		
		t1.start();
		t2.start();
		
//		new Thread(new Number()).start();
//		new Thread(new Star()).start();
		
		
	}

}
