package oop.encapsulation;

public class TestThis {

	public static void main(String[] args) {
		// 클래스로 만든 변수는 참조변수(reference) 이다.
		// 참조변수는 객체의 주소를 저장한다.
		User u1 = new User();
		// new 로 객체 생성이 되면 , 생성자로 할당된 객체의 주소가
		// 자동 전달됨. ==> 생성자 안의 숨겨진 this 가 주소를 받음.
		
		System.out.println("u1이 가진 주소 : " + u1.hashCode()); // 계산의 의해서 만든 위치 정보
		User u2 = new User("u1234", "p1234", "홍길동");
		
		System.out.println("u2가 가진 주소 : " + u2.hashCode());
		
		// 클래스가 가진 메소드 사용시(호출시) 
		// 참조변수.메소드(전달값)
		// 메소드 안의  this 에게 참조변수가 가진 주소를 전달하기 위함. 
		
		System.out.println("u1이 참조하는 객체 정보 : ");
		System.out.println(u1.userInfo());
		System.out.println("u2이 참조하는 객체 정보 : ");
		System.out.println(u2.userInfo());
	}

	
	
	
	
	
	
	
}
