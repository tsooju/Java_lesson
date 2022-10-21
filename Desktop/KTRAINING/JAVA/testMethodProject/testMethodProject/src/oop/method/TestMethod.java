package oop.method;

public class TestMethod {

	public static void main(String[] args) {
		// method 사용 테스트
		MethodSample ref = new MethodSample();
		
		// method 호출
		//반환값 없고 매개변수 없는 메소드
		ref.hello();
		
		//반환값 없고 매개변수 있는 메소드
		ref.hello(3);
		
		//반환값 있고 매개변수 없는 메소드
		int value = ref.randomValue();
		System.out.println("value : " + value);
		System.out.println("리턴값 확인 : " + ref.randomValue());
		
		//반환값 있고 매개변수 있는 메소드
		int result = ref.maxValue(10, 20);
		System.out.println("큰값 : " + result);
		System.out.println("리턴값 확인 : " + ref.maxValue(ref.randomValue(), result));

	}

}
