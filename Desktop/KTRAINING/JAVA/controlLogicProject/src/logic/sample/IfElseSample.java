package logic.sample;

import java.util.Scanner;

/**
 * if(조건표현식){
 * 		저건의 결과가 true 일때 실행할 내용 구문들
 * 		}else{
 * 				위의 if 조건의 결과가 false 일때 실행할 구문들 
 * 		}
 * */
public class IfElseSample {
	//Field
	//Constructor
	
	//Method
	
	Scanner sc = new Scanner(System.in);
	public void testIfElse1() {
		//정수를 하나 입력 받아서, 짝수이면 "짝수다." 출력
		// 짝수가 아니면 "홀수다" 출력
		
		System.out.println("정수 입력 : ");
		int num = sc.nextInt();
//		if(num % 2 == 0) {
//			System.out.println("짝수다");
//		}else {
//			System.out.println("홀수다");
//		}
		
		
		// if or else 의 실행구문이 1개일 때는 {}block 기호를 생략할 수 있다. (but block표시 권장한다.)
		if(num % 2 == 0) 
			System.out.println("짝수다");
		else 
			System.out.println("홀수다");
			
	}	// method close
	
	public void IfElseSample2() {
		// 정수형으로 국어, 영어, 수학 점수 입력받아
		// 총점과 평균 계산하고
		// 각 과목의 점수가 각 각 40점 이상이고, 
		// 평균이 60점이상이면 "합격" 출력하고
		// 아니면 "불합격" 출력
		System.out.println("국어 : ");
		int kor = sc.nextInt();
		System.out.println("영어 : ");
		int eng = sc.nextInt();
		System.out.println("수학 : ");
		int mat = sc.nextInt();
		
		int tot = kor + eng + mat;
		int avr = tot / 3;
		
		if(kor >= 40 && avr >= 60 && eng >= 40 && mat >= 40) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
	}	// method close
	
	public void testIfElse3() {
		//두 개의 정수를 입력받아
		//두수 모두 양수일 때만 
		//두수의 합, 차, 곱, 몫, 나머지를 계산해서 출력
		//한개라도 양수가 아니면 
		//양수가 아닌 값을 계산할 수 없다. 출력
		
		System.out.println("정수 입력 : ");
		int num1 = sc.nextInt();
		System.out.println("정수 입력 : ");
		int num2 = sc.nextInt();
		
		int result1 = num1 + num2;
		int result2 = num1 - num2;
		int result3 = num1 * num2;
		int result4 = num1 / num2;
		int result5 = num1 % num2;
		System.out.println(result1 + ", " + result2 + ", " + result3 + ", " + result4 + ", " + result5);
		
		if(num1 > 0 && num2 > 0) {
			System.out.println("양수");
		}else {
			System.out.println("음수");
		}
		
	}// method close
	
	
	
} // class close
