package test.synch;

public class TestProducerConsumer {

	public static void main(String[] args) {
		Buffer buffer = new Buffer();	// 공유 객체
		
		// 실행
		new Thread(new Producer(buffer)).start();
		new Thread(new Consumer(buffer)).start();

	}

}

class Buffer {
	private int data;
	private boolean empty = true;

	// 버퍼의 data 값을 꺼내는 메소드
	public synchronized int getData() {
		while (empty) { // 버퍼가 비어 있는 동안
			try {
				wait(); // 스레드 대기시킴
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} // empty 가 false 되면 루프 종료됨 : 버퍼에 값이 들어온다면...

		empty = true; // 값을 꺼내서 넘길것이므로, 다시 비었다로 처리
		notifyAll(); // wait 된 스레드들을 모두 실행상태로 바꿈.
		return data; // 값을 넘기고 빈 상태로 바꿈.
	}

	// 버퍼의 data 값을 넣는 메소드
	public synchronized void putData(int data) {
		while (!empty) { // 값이 있다면 (비어 있지 않을 경우)
			try {
				wait(); // 스레드 대기 시킴(값이 있으면 기다려라)
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} // 값이 꺼내져서 빈 상태가 되면 루프가 멈출 것...

		this.data = data; // 버퍼 data 에 값 넣음
		empty = false; // 비어 있지 않다고 표시함
		notifyAll(); // 대기 상태의 모든 스레드를 실행 상태로 바꿈.

	}
}

// 공유 객체 Buffer 에 공유데이터 넣는 스레드----------------------------------------------------
class Producer implements Runnable {
	private Buffer buffer;

	public Producer(Buffer buffer) {
		this.buffer = buffer;

	}

	@Override
	public void run() {
		for (int k = 1; k <= 10; k++) {
			buffer.putData(k);
			System.out.println("Producer : " + k + "번 케익을 생산했습니다.");
			try {
				Thread.sleep((int) (Math.random() * 100));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

// 공유 객체 Buffer 에 공유데이터 꺼내는 스레드------------------------------------------
class Consumer implements Runnable {
	private Buffer buffer;

	public Consumer(Buffer buffer) {
		this.buffer = buffer;
	}

	@Override
	public void run() {
		for (int k = 1; k <= 10; k++) {
			int data = buffer.getData();
			System.out.println("Consumer : " + data + "번 케익을 판매했습니다.");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
