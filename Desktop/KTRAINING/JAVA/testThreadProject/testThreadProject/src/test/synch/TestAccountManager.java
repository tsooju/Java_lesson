package test.synch;

public class TestAccountManager {

	public static void main(String[] args) {
		// 스레드 공유자원 동기화 테스트
		Thread t1 = new AccountManager("인터넷뱅킹");
		Thread t2 = new AccountManager("체크카드");
		Thread t3 = new AccountManager("앱사용");
		
		t1.start();
		t2.start();
		t3.start();
		
	}

}
