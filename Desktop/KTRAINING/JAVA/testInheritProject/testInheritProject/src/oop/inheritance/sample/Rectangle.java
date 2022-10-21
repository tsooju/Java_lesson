package oop.inheritance.sample;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Objects;

//클래스간의 상속, 필드와 메소드만 상속 가능하고 
// 생성자와 초기화블럭은 상속 불가능
public class Rectangle extends Shape { 
	// Field
	private double width;	 // 가로 길이
	private double height; 	// 세로 길이
	
	//Constructor
	public Rectangle() {
		super();	// 부모의 기본생성자 호출구문임.
		// Shape(); 부모의 생성자는 상속 안됨. : 직접 사용 못 함. 
		System.out.println("Rectangle() 실행됨.");
	}

	public Rectangle(double width, double height) {
		super();	// 부모의 기본생성자 호출구문임.
		this.width = width;
		this.height = height;
		System.out.println("Rectangle(width, height) 실행됨.");
	}
	
	public Rectangle(double width, double height, double area, double perimeter) {
		super(area, perimeter);	// 부모의 매개변수 있는 생성자 호출
		
		//  this.area = area;  private 되어 있기 때문에 접근할 수 없다.
		this.width = width;
		this.height = height;
		System.out.println("Rectangle(width, height, area, perimeter) 실행됨.");
	}
	
	// getter, setter
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	// 메소드 오버라이딩(overriding == 재작성, 재구현 : implementation)
	// 상속관계에 있는 후손클래스가 부모 메소드를 다시 작성하는 것.
	// 오버라이딩은 부모메소드의 signature(method head)는 그대로 똑같이 작성함. 
	// 단, 접근제한자는 부모것보다 넓은 범위의 제한자로 변경할 수 있다.
	// 단, 부모의 예외처리클래스 갯수를 줄일 수 있음.
	
	@Override
	public String info() {
		// 부모의 protected 멤버는 상속받은 후손클래스 안에서 사용가능함.
		return this.width + ", " + this.height + ", " + super.info();
		
		
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}

//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = super.hashCode();
//		result = prime * result + Objects.hash(height, width);
//		return result;
//	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rectangle other = (Rectangle) obj;
		return Double.doubleToLongBits(height) == Double.doubleToLongBits(other.height)
				&& Double.doubleToLongBits(width) == Double.doubleToLongBits(other.width);
	}
	
	@Override
	public Object clone() {
		// 새 객체 생성하면서 this 가 참조하는 인스턴스변수 값 복사함.
		// 이것을 깊은 복사(deep copy)라고 한다. 
		return new Rectangle(this.width, this.height, this.getArea(), this.getPerimeter());
	}
	
	// 계산 처리용 
	public void calculator() {
		// 부모의 private 필드는 상속은 받았지만 접근은 못함. 
		// this.area = this.width * this.height;
		// this.perimeter = 2 * (this.width + this.height);
		
		this.setArea(this.width * this.height);
		this.setPerimeter(2 * (this.width + this.height));
		
		
	}
	
	
}
