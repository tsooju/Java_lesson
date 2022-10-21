package inherit.polymorphism.model;

public class Triangle implements IShape {
	private double base;
	private double height;
	
	public Triangle() {
		super();
	}
	
	public Triangle(double base, double height) {
		super();
		this.base = base;
		this.height = height;
	}

	
	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 0;
	}


	
	
}
