package inherit.polymorphism.model;

public abstract class Shape {
	// 추상메서드 :
	public Shape() {}
	
	abstract public double area(); //면적 계산 리턴용
	abstract public double perimeter(); //둘레 계산 리턴용
}
