package com.practice2.controller;

import com.practice2.model.entity.Circle;
import com.practice2.model.entity.Point;
import com.practice2.model.entity.Rectangle;

public class Main {

	
	public static void main(String[] args) {
		// 테스트용 클래스 : com.practice2.controller.Main.java
		//main() 포함
		
		// [실습문제 3]
		Point[] point = new Point[5];
		
		point[0] = new Circle(100, 100, 50);
		point[1] = new Rectangle(200, 200, 50, 50);
		point[2] = new Circle(150, 150, 30);
		point[3] = new Circle(100, 100, 50);
		point[4] = new Rectangle(400, 400, 150, 150);
		

		Circle[] circle = new Circle[3];
		circle[0] = new Circle();
		circle[1] = new Circle();
		circle[2] = new Circle();

		Rectangle[] rect = new Rectangle[3];
		rect[0] = new Rectangle();
		rect[1] = new Rectangle();
		rect[2] = new Rectangle();
		
		
		Circle circle1 = new Circle();
		Rectangle rect1 = new Rectangle();

		
		
		System.out.print("circle draw : ");
		System.out.println("rect : ");
		
	
		
		
	}

}
