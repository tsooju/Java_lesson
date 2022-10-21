package oop.polymorphism;

public class ClassA {
	// 자동으로 java.lang.Object 의 후손된다.

	public ClassA() {
	}

	@Override
	public String toString() {
		return "ClassA toString() run!";
	}

	public void methodA() {
		System.out.println("ClassA methodA() run!");
	}
}
