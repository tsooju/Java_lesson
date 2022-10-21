package com.practice2.model.entity;
// [실습문제 2]
public class Point {
	// Field
	protected int x;
	protected int y;
	
	// Constructor
	public Point() {
		super();
	}
	
	// Method
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	//getter, setter
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	// + draw():void	//x, y 좌표값 출력 처리 ???
	public void draw() {
		System.out.println("x : " + x);
		System.out.println("y : " + y);
	}
	
	
	
}
