package com.var.example;

import java.util.Scanner;

public class Example {
	//연습1
	public void example1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수 : ");
		int first = sc.nextInt();
		System.out.print("두번째 정수 : ");
		int second = sc.nextInt();
		
		System.out.println("더하기 결과 : " + (first + second));
		System.out.println("빼기 결과 : " + (first - second));
		System.out.println("곱하기 결과 : " + (first * second));
		System.out.println("나누기한 몫 : " + (first / second));
		System.out.println("나누기한 나머지 : " + (first % second));
	}
	
	//연습2
	public void example2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가로 : ");
		double width = sc.nextDouble();
		System.out.print("세로 : ");
		double height = sc.nextDouble();

		double area = width * height;
		double perimeter = (width + height) * 2;

		System.out.println("면적 : " + area);
		System.out.println("둘레 : " + perimeter);
	}
	
	//연습3
	public void example3() {
		Scanner sc = new Scanner(System.in);

		System.out.print("문자열을 입력하시오 : ");
		String str = sc.next();

		System.out.println("첫번째 문자 : " + str.charAt(0));
		System.out.println("두번째 문자 : " + str.charAt(1));
		System.out.println("세번째 문자 : " + str.charAt(2));
	}
}
