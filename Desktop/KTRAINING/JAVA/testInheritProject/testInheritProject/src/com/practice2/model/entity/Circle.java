package com.practice2.model.entity;

public class Circle extends Point {
	// Field
	private int radius;
	// Constructor
	public Circle() {
		super();
	}
	
	// Circle(x:int, y:int, radius:int)
	public Circle(int radius, int x, int y) {
		super(x, y);
		this.radius = radius;
	}
	// Method
	public void draw() {
		
		// 원면적 = PI * radius * radius;
		System.out.println("면적 : " + Math.PI * radius * radius);
		
		
		// 원둘레 = 2 * PI * radius;
		System.out.println("둘레 : " + (2 * Math.PI * radius));
		
		// 면적과 둘레는 모두 반올림하여 소숫점 아래 첫째자리까지 처리할 것
		
		
	}
	
	
	
	
}
