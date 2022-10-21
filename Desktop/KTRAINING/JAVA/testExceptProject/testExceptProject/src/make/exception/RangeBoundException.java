package make.exception;

public class RangeBoundException extends Exception {
	public RangeBoundException(String message) {
		super(message);
	}
	
	// 필요시 부뫁클래스의 메소드 오버라이딩해서, 원하는 에러 처리
	// 동작을 만들 수 있음.
}
