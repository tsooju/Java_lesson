package oop.makeclass;


// 같은 패키지 안에 있는 클래스 사용시에는 import 하지 않음.
public class TestClass {

	public static void main(String[] args) {
		// class 테스트
		// 클래스의 사용 : 클래스명 레퍼런스변수;
		
		DefaultClass ref;
		PublicClass ref2;
		
		FinalClass ref3 = new FinalClass();  // 객체 생성할 수 있다.
		//abstract class는 : 레퍼런스 선언은 할 수 있다.
		AbstractClass ref4;  //  변수는 만들 수 있다.
		// 미완성 클래스이므로 객체 생성은 못한다. 
		
		// ref4 = new AbstractClass();  ==> error

	}

}
