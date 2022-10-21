package oop.inheritance.run;

import oop.inheritance.sample.Rectangle;

public class TestInheritance2 {

	public static void main(String[] args) {
		// 상속구조에서 생성자 호출 관계
		Rectangle rect = new Rectangle();
		// 부모생성자가 먼저 실행되고 나서, 후손생성자가 작동됨.
		
		System.out.println(rect.info());
		
		Rectangle rect2 = new Rectangle(10, 10);
		System.out.println(rect2.info());
		
		Rectangle rect3 = new Rectangle(20, 20, 400, 80);
		System.out.println(rect3.info());
		
		// 면적과 둘레 계산처리 : 클래스 내부에서 필드 사용
		rect2.calculator();
		System.out.println(rect2.info());
		
		// 면적과 둘레 계산을 외부에서 처리한다면 
		rect.setWidth(2.);
		rect.setHeight(3.);
		
		rect.setArea(rect.getWidth() + rect.getHeight());
		rect.setPerimeter(2 * (rect.getWidth() + rect.getHeight()));
		System.out.println(rect.info());
		
		
		// clone() 사용 : 복사본 객체 만들기(새 객체 생성)
		Rectangle rect4 = (Rectangle)rect.clone();
		System.out.println(rect.hashCode());
		System.out.println(rect4.hashCode());
		System.out.println("주소 비교 : " + (rect == rect4));	// false
		System.out.println("인스턴스 변수값 비교 : " + (rect.equals(rect4))); // true
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
