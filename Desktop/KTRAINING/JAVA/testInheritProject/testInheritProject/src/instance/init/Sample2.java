package instance.init;

// 필드 초기화 테스트
public class Sample2 {
	//Field
	private String name = "noname"; // 명시적 초기화
	private int age = 19;	// 명시적 초기화
	private char gender;	// jvm 이 준비한 기본값으로 초기화
	private double height;	// jvm 이 준비한 기본값으로 초기화
	private boolean marriage;	// jvm 이 준비한 기본값으로 초기화
	
	private static int count = 1;	// 명시적 초기화
	private static String message = "nomessage";	// 명시적 초기화
	
	
	
	// 초기화 블럭 : 필드 초기값 대입 처리하는 구역을 의미함.
	
	// 인스턴스변수 초기화블럭
	{
		// 인스턴스변수 = 초기값;
		name = "홍길동";
		age = 30;
		gender = '남';
		height = 178.5;
		marriage = true;

	}
	
	// 클래스변수 초기화블럭
	static {
		// 클래스변수 = 초기값;
		count = 10;
		message = "객체들이 공유하는 문자열값";
		
	}
	
	// Constructor
	public Sample2() {	//jvm 이 준비한 기본값으로 초기화 처리한다.
		name = "이순신";
		age = 45;
		gender = '남';
		height = 189.9;
		marriage = true;
	}	

	
	// Method
	@Override
	public String toString() {
		return "Sample2 [name=" + name + ", age=" + age + ", gender=" + gender + ", "
				+ "height=" + height + ", marriage="
				+ marriage + ", count="+ count  + ", message=" + message + "]";
	}
	
	
	
	
}
