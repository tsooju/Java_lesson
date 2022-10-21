package inherit.polymorphism.controller;

import inherit.polymorphism.model.Circle;
import inherit.polymorphism.model.Rectangle;
import inherit.polymorphism.model.Shape;

public class TestShape {

	public static void main(String[] args) {
		// 메인에서 다형성 사용 원객체와 사각형객체 생성하고, 면적과 둘레 출력
		
		Shape s;

		s = new Circle(15.5);
		System.out.println("원면적 : " + s.area());
		System.out.println("원둘레 : " + s.perimeter());

		s = new Rectangle(34.5, 42.7);
		System.out.println("사각형면적 : " + s.area());
		System.out.println("사각형둘레 : " + s.perimeter());

	}

}
