package test.generics;

public class Outer<T> {
	//필드 선언, 초기화블럭 작성, 생성자, 메소드 작성
	
	// 내부 클래스(Inner class or Nested member) : 멤버로 취급됨. 
	// private, static  사용할 수 있음
	// 사용시 : Outer.Inner
	public static class Inner {	// Nested class임
		//필드 선언, 초기화블럭 작성, 생성자, 메소드 작성
	}	
	
	
}
