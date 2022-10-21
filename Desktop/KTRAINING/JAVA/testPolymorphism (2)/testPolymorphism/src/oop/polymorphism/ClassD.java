package oop.polymorphism;

// 자바는 클래스간의 상속시 단일상속만 허용한다. (부모가 1개)
public class ClassD extends ClassB {
	public ClassD() {
	}

	@Override
	public String toString() {
		return "ClassD toString() run!";
	}

	public void methodD() {
		System.out.println("ClassD methodD() run!");
	}
} // ClassD end

