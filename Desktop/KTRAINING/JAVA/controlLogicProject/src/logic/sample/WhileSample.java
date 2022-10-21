package logic.sample;

import java.util.Scanner;	// (cntr+shift+o = import)

/**
 * 반복할 횟수가 정해지지 않은 반복 처리에 주로 사용
 * 구문 형식 : 
 * 			while(반복에 대한 조건식){
 * 					반복 수행할 구문들
 * 			}
 * 
 * */

public class WhileSample {
private Scanner sc = new Scanner(System.in);	// <== Field를 캡슐화(private)하는 작업, 


	//Field, Constructor, Method
	//접근제한자 [예약어] 기본자료형 변수명[직접초기화 값 입력가능 (= 초기값)];
	//클래스 타입의 Field는 : 접근제한자 [예약어] 클래스명 참조변수명[= new 생성자함수();]

	//Constructor
	//생성자가 없는 클래스는 컴파일할 때 기본생성자(메개변수 없는 생성자)
	// 자동 추가하면서 class 파일이 만들어진다.

	//Method(빈값으로 작동되는 void)
	public void testWhile1() {
		// 키보드로 문자하나 입력 받아서, 유니코드 출력
		// 종료조건은 '0'문자 입력시 반복 종료됨.
		// while문은 순서가 중요하다. 
		
		System.out.print("문자 입력 : ");
		char ch = sc.next().charAt(0);
		
		while(ch != '0') {
			System.out.println(ch + " is unicode " + (int)ch);
			System.out.print("문자 입력 : ");
			ch = sc.next().charAt(0);
		}
		System.out.println("== end ==");
	} // method close

	public void testWhile2() {
		// 키보드로 문자하나 입력 받아서, 유니코드 출력
		// 종료조건은 '0'문자 입력시 반복 종료됨.
		// while문은 순서가 중요하다. 
		
		System.out.print("문자 입력 : ");
		char ch;
		
		while((ch  = sc.next().charAt(0)) != '0') {
			System.out.println(ch + " is unicode " + (int)ch);
			System.out.print("문자 입력 : ");
		}
		System.out.println("== while end ==");
	} // method close
	
	public void testWhile3() {
		// 키보드로 문자하나 입력 받아서, 유니코드 출력
		// 종료조건은 '0'문자 입력시 반복 종료됨.
		// while문은 순서가 중요하다. 
				
		while(true) {
			System.out.print("문자 입력 : ");
			char ch = sc.next().charAt(0);
			if(ch == '0') {
				break;
			}
			System.out.println(ch + " is unicode " + (int)ch);	
		}
		System.out.println("== while end ==");
	} // method close
	
	public void containChar() {
		// 문자열 입력 받아
		// 문자 입력 : p
		// 반복처리 내용 : 문자열 안에 입력 받은 문자가 몇 개 포함되어 있는지 갯수 카운드
		// 출력 : apple 에 포함되 p의 갯수는 개
		
		
			System.out.print("문자열 입력 : ");
			String word = sc.next();
			System.out.print("문자 입력 : ");
			char ch = sc.next().charAt(0);
			
			int index = 0, count = 0;
		while(index < word.length()) {	
			if(word.charAt(index) == ch) {
				count++;
			}
			index++;
			
		} System.out.println(word + "에 포함된 " + ch + " 문자의 갯수는 " +  count + "개");
	} // method close
	
	
	// 매개변수(parameter) : 메소드 실행시 메소드로 전달오는 값 받는 변수
	// 전달인자(argument) : 실행하는 메소드 쪽으로 전달되는 값
	// 전달값과 매개변수는 갯수와 자료형이 같아야 한다. 
	// 참조변수.매소드명(전달값, 전달값) --> 작성된 메소드(자료형 매개변수, 자료형 매개변수){}
	// 예 : ref.sum(10, 20) --> ......sum(int a, int b) {}
	// 메소드가 정의된대로 실행시 사용해야 됨
	public void sumNumber(int bound) { // 실행하는 쪽에서 값 받아올 때 사용하는 매개변수
		// 1부터 bound까지의 정수( 1식 차이나는 수를 정수라 한다. )들의 합계를 구해서 출력 처리
		//단, 전달값은 1이상의 양수여야 함. 
		if(bound >= 1) {
			int sum = 0, n = 1; // 시작 값
			
			// 반복처리 : 더하기 연산
			while(n <= bound) {
				System.out.print(n + " + ");
				sum += n;
				n++;
			}
			System.out.println(); // 줄 바꿈
			System.out.println("1 ~ " + bound + "까지 정수들의 합계 : " + sum);
		}else {
			System.out.println("전달값은 반드시 1이상의 양수여야 함.");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
} // class close
