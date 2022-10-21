package oop.encapsulation;

public class User {
	// Field 멤버변수 : 비공개(private) 처리를 => 캡슐화라한다.
	//접근제한자 [예약어(예 : static, final, abstract)] 자료형 변수명 [= 초기값];
	private String usetId;
	private String userPwd;
	private String userName;
	
	// constructor/생성자함수 : new 할 때 자동 실행되는 함수
	// new에 의해 힙(heap) 메모리에 객체공간이 만들어질 때
	// 객체 안의 필드값들 초기화 처리가 목적인 함수임. 
	// 반환자료형이 없음. 함수명은 클래스명과 같아야 한다. 대신 오버로딩 가능함.
	// overloading : 한 클래스 안에 같은 이름의 함수가 여러 개 작성된것. 
	// overloading 규직 : 이름만 같고 매개변수가 달라야 함.
	// public ClassName(){} // 기본 생성자라 한다. 
	public User() {	// 기본 생성자
		System.out.println("this 가 받은 주소 : " + this.hashCode());
	}	

	public User(String userId, String userPwd, String userName) {
		System.out.println("this 가 받은 주소 : " + this.hashCode());
		this.usetId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
	}
	
	// 멤버함수(Method) : setter, getter, 일반메소드 3까지 있다.
	// 접근제한자 [예약어] 반환자료형 메소드명([자료형 변수명, ...]){  기능코드 }
	public String userInfo() {
		System.out.println("this ref address : " + this.hashCode());
		return this.usetId + ", " + this.userPwd + ", " + this.userName;
	}
	
	
} // class end
