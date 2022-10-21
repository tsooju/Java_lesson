package inherit.polymorphism.model;

public class Rectangle extends Shape implements IShape {
	// Field
	private double width;
	private double height; 
	
	// Constructor
	public Rectangle() {
		super();
	}
	
	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}

	// Method
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

	// 상속받은 추상메소드 오버리이딩 >> 면적과 둘레 계산 코드 작성함.
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return width * height;
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return (2 * (width + height));
	}
	
	
	
	
}
