package test.synch;

public class Account {
	private static int balance = 10000; // 잔액 : 공유 자원

	public Account() {
	}

	public static int getBalance() {
		return balance;
	}

	public static void setBalance(int balance) {
		Account.balance = balance;
	}

	public /* synchronized */ void withDraw(int money) throws BalanceNotEnoughException {
		// 인출(출금)하는 메소드 : 임계영역으로 지정함.
		// 동작 확인을 위한 sleep 사용
		try {
			Thread.sleep(100);
		} catch (Exception e) {
			e.printStackTrace();
		}

		synchronized (this) {
			if (balance >= money) {
				balance -= money;
				System.out.println(money + "인출됨.");
			} else {
				throw new BalanceNotEnoughException("잔액이 부족합니다.");
			}
		}
	}

} // class end
