package com.practice2.model.entity;
// 후손클래스 2 : com.practice2.model.entity.Rectangle.java
public class Rectangle extends Point {
	// Field
	private int width;	//가로너비
	private int height;	//세로높이
	// 부모의 x, y는 사각형 좌측상단의 좌표값으로 처리 ???
	// Constructor
	public Rectangle() {
		super();
	}
	// x, y는 부모 생성자로 넘김
	public Rectangle(int width, int height, int x, int y) {
		super(x, y);
		this.width = width;
		this.height = height;
	}
	
	// Method : getter, setter 는 직접 구현함.
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	// draw() : void	//사각형의 x, y좌표, 면적, 둘레 계산 출력 처리
	public void draw() {
		// 면적 : 가로 * 세로
		System.out.println("면적 : " + (width * height)); 
		
		// 둘레 : 2 * (가로 + 세로)
		System.out.println("둘레 : " + (2 * (width * height)));
		
		// 면적과 둘레는 모두 반올림하여 소숫점 아래 첫째자리까지 처리할 것
		
		
		
	}
	
	
	
}
