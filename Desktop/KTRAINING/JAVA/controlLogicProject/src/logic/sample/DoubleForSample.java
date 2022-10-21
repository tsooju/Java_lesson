package logic.sample;

import java.util.Scanner;

/**
 * 다중  for  문 : 반복이 다시 여러번 반복 수행될 때 사용한다.
 * for 문 안에 for 를 사용하는 구조임.
 * 이중 for 문 예: 
 * 		for(초기식; 조건식; 증감식){
 * 			반복 수행 내용
 * 			for(초기식; 조건식; 증감식){
 * 		
 * 		}
 * 		}
 *  => 안쪽 for문을 여러번 반복 실행하게 됨. 
 * */
public class DoubleForSample {
	//Field
	private Scanner sc = new Scanner(System.in);
	
	//Constructor
	
	//Method
	public void gugudan() {

		// 2단부터 9단까지 구구단 출력 처리
		for(int num = 2; num <= 9; num++) {
			System.out.println(num + "단 =====");
			for(int i=1; i <=9; i++) {
				System.out.println(num + "  * " + i + " = " + (num * i));
			}
			System.out.println();
		}
	} // method end
	
	public void printStar1() {
		// ******
		// ******
		// ******
		// ******
		// ******
		
		for(int n = 1; n <= 5; n++) {
		for(int k = 1; k <= 7; k++) {
			System.out.print("*");
		}
		System.out.println();
		}	
	}
	
	public void printStar2(int line) {
		// ******
		// ******
		// ******
		// ******
		// ******
		
		
		if (line >= 0) {
			for(int n = 1; n <= line; n++) {
				for(int k = 1; k <= line; k++) {
					if(n > k) {
						System.out.print(" ");
					}else {
						System.out.print("*");
					}
				}
				System.out.println();
			}
		}else {
			System.out.println("양수만 입력");
		}	
	}
	
	
	
	
	
} // class end
