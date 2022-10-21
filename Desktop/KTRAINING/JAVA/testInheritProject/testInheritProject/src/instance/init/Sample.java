package instance.init;

public class Sample {
	// Field
	private int num;	// 인스턴스 변수
	private static int snum;  // 클래스 변수
	
	// Constructor : instance 초기화 메소드
	// 반환형 없음. 클래스명과 이름이 같아야 함. :  이점이 메소드와 다름. 
	public Sample() {	// 기본 생성자(public  생략시 default 되기 때문에 주의!)
		this(100); // 생성자 안에서 다른 생성자를 호출할 수 있다. 
		//this() 생성자는 생성자 안 첫 줄에만 작성할 수 있음. 
		
		// this.num = 100;     ==     this(100);  같은 개념이다.
		// Sample.snum = 0;  // static 에는 this를 사용못한다. 객체 안에 없는 필드임.
		// 대신 "클래스명.변수명" 으로 지정한다.
		
		/* Sample. */snum++;
		
	} 
	
	// 오버로딩(overloading) : 클래스 안에서 같은 이름의 메소드가 여러 개 작성된 것.
	// 오버로딩 규칙 : 매개변수가 달라야 한다. 
	public Sample(int num) {
		this.num= num;	
		/* Sample. *//* snum++; */
	}

	// 복사 생성자 : 
	// 새로운 객체 생성시 다른 객체가 가진 필드값을 복사해서 초기화에 
	// 사용하는 생성자
	public Sample(Sample ref) {
		this.num = ref.num;
		Sample.snum++;
	}
	
	// method
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public static int getSnum() {
		return snum;
	}

	public static void setSnum(int snum) {
		Sample.snum = snum;
	}

	@Override //부모필드를 고쳐서 쓰는 방식을 Override라 한다.
	public String toString() {
		return "Sample [num=" + num + "]";
	}
	
	
	
	
	
	
	
	
	
}
