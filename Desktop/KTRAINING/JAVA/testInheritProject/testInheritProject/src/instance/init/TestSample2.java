package instance.init;

public class TestSample2 {
	
	public static void main(String[] args) {
		// 필드 초기화순서 확인 테스트
		Sample2 ref = new Sample2();
		System.out.println(ref);
		// 인스턴스 변수 초기화 순서 : 객체 생성시 초기화 실행됨.
		// 1. jvm이 준비한 기본값으로 초기화됨.
		// 2. 명시적 초기화 >> 3. 초기화블럭 >> 4. 생성자 초기화
		
		// 클래스변수 초기화 순서 : main() 실행될 때 초기화 처리됨.
		// 1. jvm이 준비한 기본값으로 초기화됨.
		// 2. 명시적 초기화 >> 3. static 초기화블럭
		
		
	}
	

}
