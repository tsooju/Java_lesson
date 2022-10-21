package oop.inheritance.sample;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Objects;

// 자동으로 java.lang.Object 클래스이 후손(sub) 클래스가 된다.
public class Shape {
	// Field
	private double area;	// 도형의 면적
	private double perimeter; // 도형의 둘레길이
	
	// Constructor
	// *** 부모가 되는 클래스는 기본생성자 반드시 작성해 두어야 한다. *** 없으면 에러
	public Shape() {
		// 부모의 기본생성자 호출 구문임.
		super();	// 반드시 생성자 안 첫 줄에 작성한다. 
		System.out.println("Shape() 실행됨.");
		
	}

	public Shape(double area, double perimeter) {
		super();	// 반드시 생성자 안 첫 줄에 작성한다. 
		this.area = area;
		this.perimeter = perimeter;
		System.out.println("Shape(area, perimeter) 실행됨.");
	}
	
	// Method
	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public double getPerimeter() {
		return perimeter;
	}

	public void setPerimeter(double perimeter) {
		this.perimeter = perimeter;
	}
	
	//protected : 비상속시에는 default(package private)와 같다.
	// 				 : 상속시에는 : 후손클래스 내에서만 사용 가능함.
	protected String info() /* throws IOException, SQLException */ {
		return this.area + ", " + this.perimeter;
	
	}
	
	
	// 부모 메소드 오버라이딩시 접근제한자(더 넓은 것으로)와 예외클래스
	// (갯수가 같거나 줄일 수 있음) 수정할 수 있음.
	@Override
	public Object clone() {	// 새로운 복사 객체 만들기
		return new Shape(this.area, this.perimeter);
	}
	
	// 부모 메소드 오버라이딩(재작성)하면 부모의 같은 이름의 메소드는 
	// 자동 은닉됨(hiding) => 후손 오버라이딩 메소드가 실행 우선권을 가짐. 
	@Override
	public String toString() {
		// 후손 메소드 안에서 자동 은닉된 부모메소드 사용하려면 : 
		// super.부모메소드명() 으로 표기하면 됨. 
		return super.toString() + "\narea : " + area + ", perimeter : " + perimeter;
	}

//	@Override
//	public int hashCode() {
//		return Objects.hash(area, perimeter);
//	}

	@Override
	public boolean equals(Object obj) {
		// 두 객체의 this가 참조하는 객체와 전달받은 obj 가 참조하는 객체
		// 값들이 같은지 비교하는 내용으로 변경함. 
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (this.getClass() != obj.getClass())
			return false;
		Shape other = (Shape) obj;
		return Double.doubleToLongBits(area) == Double.doubleToLongBits(other.area)
				&& Double.doubleToLongBits(perimeter) == Double.doubleToLongBits(other.perimeter);
	}
	
	
	
	
	
	
	
	
	
	
	
 
} // class end
