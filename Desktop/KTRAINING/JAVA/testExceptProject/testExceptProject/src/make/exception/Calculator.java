package make.exception;

public class Calculator {
	public Calculator() {}
	
	public int sum(int a, int b) throws RangeBoundException {
		// 조건 : 전달된 두 정수가 반드시 1~100사이의 값이어야 한다. 
		// 아니면 예외발생시킴.
		int result = 0;
		
		if((a >= 1 && a <=100) && (b >=1 && b <= 100)) {
			result = a + b;
		}else {
			// 예외를 발생시킴
			throw new RangeBoundException("1~100사이의 값이어야 합니다.");
		}
		return result;
	}
	
	public int divide(int a, int b) throws NotDivideZeroException {
		// 나눌 수 b 가 0 이면 예외 발생시킴
		int result = 0;
		
		if(b == 0) {
			throw new NotDivideZeroException("0 나누기 못 함!");
		}else {
			result = a / b;
		}
		return result;
	}
	
	
}
