package oop.polymorphism;

public class TestPolymorphism1 {

	public static void main(String[] args) {
		// 다형성(Polymorphism) 
		// 여러 종류의 클래스를 한가지 클래스로 다루는 기술이다. 
		
		// 상속관계 있는 클래스간(부모-자식관계)에 사용하는 기술이다. 비상속시 사용 불가능!
		// 한까지 타입의 레퍼런스로 여러 종류의 클래스 객체를 다룰 수 있음.
		// 다형성은 메소드 매개변수, 메소드 리턴타입, 배열 레퍼런스 등에 사용 가능!
		Object obj; // 최상위 부모 레퍼런스다. 
		obj = new String("다형성 테스트");
		// 부모클래스 타입의 레퍼런스가 후손객체의 주소를 받음
		System.out.println(obj/* .toString() */);
		
		obj = new java.util.Date();	// 클래스 이름 앞에 패키지 이름을 써주면 임포트 할 필요없다. 
		System.out.println(obj);
		// 출력구문에 레퍼런스만 사용하면, 컴파일시에 자동으로 
		// jvm에 의해 레퍼런스.toString() 으로 추가되면서 실행됨. 
		
		obj = new StringBuilder("polymorphism test");
		System.out.println(obj);
		System.out.println("obj =============");
		obj = new ClassA();
		System.out.println(obj);
		
		obj = new ClassB();
		System.out.println(obj);
		
		obj = new ClassC();
		System.out.println(obj);
		
		obj = new ClassD();
		System.out.println(obj);
		//==========================================
		System.out.println("ClassA ============");
		ClassA ref;
		
		ref = new ClassA();
		System.out.println(ref);
		
		ref = new ClassB();
		System.out.println(ref);
		
		ref = new ClassC();
		System.out.println(ref);
		
		ref = new ClassD();
		System.out.println(ref);
		System.out.println("ClassB ============");
		ClassB bref;
		bref = new ClassB();
		System.out.println(bref);
		
		bref = new ClassD();
		System.out.println(bref);
		
		// bref = new ClassC();  ==> error
		// 형제간인 클래스간에는 다형성 사용 못 함.
		
		ClassC cref;
		// cref = new ClassD(); // error  (부모 자식 관계 아님.)
		
		
	}

}	// class end

