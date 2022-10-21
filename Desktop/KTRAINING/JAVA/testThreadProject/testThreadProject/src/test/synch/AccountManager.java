package test.synch;

// 통장 관리 클래스
public class AccountManager extends Thread {
	private Account account; // 통장
	private String using; // 인출방식

	public AccountManager() {
		account = new Account();
	}

	public AccountManager(String using) {
		this(); // 첫 줄에만 작성함(super or this)

		// 기본 생성자 실행시킴
		this.using = using;
	}

	@Override
	public void run() {
		// account.setBalance(10000); // 잔액은 10000

		// 테스트 구동
		if (account.getBalance() > 0) { // 0보다 클 동안 작동
			System.out.println(using + ": 현재 잔액 : " + account.getBalance());
			
			int money = new java.util.Random().nextInt(10) * 1000; // 0부터 9 사이 정수 발생
			System.out.println(using + " : 인출금액" + money);

			try {
				account.withDraw(money);
			} catch (BalanceNotEnoughException e) {
				System.out.println(using + " : " + e.getMessage());
			}
		}
	}

} // class end
