package instance.init;

public class TestSample {

	public static void main(String[] args) {
		// 1. 생성자 사용 테스트
		Sample ref1 = new Sample();
		System.out.println("instance 변수 확인 : " + ref1.toString());
		
		// 출력시 레퍼런스.toString() 에서  toString() 생략할 수 있음.
		System.out.println("instance 변수 확인 : " + ref1);
		
		Sample ref2 = new Sample(ref1); // ref1의 가지고 있는 값을 ref2에 입력한다.
		System.out.println(ref2/* .toString() */);
		
		System.out.println("객체 수 : " + Sample.getSnum());
		
		
		
	}
	

}
