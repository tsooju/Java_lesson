package oop.inheritance.run;

import oop.inheritance.sample.Shape;

public class TestInheritance {

	public static void main(String[] args) {
		// 상속 실행 테스트
		Shape shape = new Shape();
		// protected 멤버는 비상속시 패키지 밖에서 사용 못함. 
		// System.out.println(shape.info()); 	==> error
		
		// java.lang.Object 클래스가 가진 메소드 사용 테스트
		Shape ref = shape;	// 주소 복사 (얕은 복사 : shallow copy)
		System.out.println("shape이 참조하는 객체 정보 : " 
									+ shape.toString());		
		System.out.println("shape이 참조하는 객체 정보 : " 
									+ ref.toString());
		
		System.out.println("주소 비교 : " + shape.equals(ref));
		Shape shape2 = new Shape(10., 20.);
		System.out.println("shape이 참조하는 객체 정보 : " 
				+ shape2.toString());
		System.out.println("주소 비교2 : " + shape.equals(shape2));
		
		System.out.println("shape : " + shape.hashCode());
		System.out.println("shape2 : " + shape2.hashCode());
		
		Shape ref2 = (Shape)shape2.clone();
		System.out.println("ref2 : " + ref2.toString());
		
		
	}

}
