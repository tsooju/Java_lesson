package logic.sample;

import java.util.Scanner;

/**
 * 횟수가 정해진 반복에 주로 사용함
 * 배열 데이터 처리에 주로 사용됨
 * 구문 형식 : 
 * 		for(초기식; 조건식; 증감식){
 * 			반복처리 구문들
 * 		}
 * 		초기식 : 반복 카운트의 시작값 지정
 * 		조건식 : 반복 카운트의 종료값 제시
 * 		증감식 : 반복 횟수 결정
 * */

public class ForSample {
	// Field
	private Scanner sc = new Scanner(System.in);
	
	//Constructor
	
	//Method
	public void testFor1(int bound) {
		// 1부터 bound 값까지의 정수들의 합계를 게산해서 출력 처리
		int sum = 0;
		
		for(int n = 1; n <= bound; n++) {
			sum += n;
			System.out.print(n + " + ");
		}
		System.out.println();
		System.out.println("1~ " + bound + "까지 정수의 합 : " + sum);
		
	
	} // method close
	
	
	public void printGugudan() {
		// 구구단의  단수를 입력받아서, 해당 단의 구구단을 출력 처리
		/* 단수 :  3*/ 
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i=1; i <=9; i++) {
			System.out.println(num + "  * " + i + " = " + (num * i));
		}
	}
	
	public void sumEven(int bound) {
		// 1~bound까지 짝수들 
int sum = 0;
		
		for(int n = 2; n <= bound; n+=2) {
			sum += n;
			System.out.print(n + " + ");
		}
		System.out.println();
		System.out.println("1~ " + bound + "까지 짝수의 합 : " + sum);
	}
	
	public void sumMinToMax(int a, int b ) {
		//전달받은 두 개의 정수를 작은 값과 큰 값을 구문하고, 
		//작은값부터 큰값까지의 정수들의 합계를 구해서
		
		int sum = 0;
		if (a > b) {
			for(int i = b; i <= a; i++) {
				sum += b;
				System.out.println(sum);
			}
		}else {
				System.out.println(sum);
	}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
} // class close
