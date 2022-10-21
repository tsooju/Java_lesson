package logic.sample;

import java.util.Scanner;

// 무조건 한번 실행하고 나서 반복을 결정할 때 사용하는 구문이다. 
// do{
//		반복 실행할 구문들
//		}while(반복을 결정하는 조건식);
public class DoWhileSample {
	//멤버변수(Field) : 일종의 전역변수
	//클래스 안의 메소드들이 모두 사용 가능한 변수임.
	//선언 형식 : 
	//접근제한자 [필요시 예약어 사용] 자료형 변수임[ = 초기값];
	//접근제한자 [필요시 예약어 사용] 클래스명 참조변수[ = new 생성자()];
	
	//객체 지향 프로그래밍(Object Oriented Programming : OOP)언어
	//OOP가장 핵심 원칙 1 : 캡슐화(encapsulation) => 멤버변수 비공개화 작업 즉 데이터 보호의 목적임.
	//접근제한자(access modifier) : private(비공개), public(공개)

	private Scanner sc = new Scanner(System.in);  // 클래스 외부에서 사용 못함. 안에서만 사용 가능
	
	//Method
	public void printUnicode() {
		//문자 입력 >> 유니코드 출력을 반복새서 작동되게 함
		//'0' 입력되면 반복 종료됨
		char ch; //while  문에서 사용하기 위해 변수를 외부에서 선언
		
		do {
			System.out.print("문자 입력 : ");
			ch = sc.next().charAt(0);
			
			// 종료값 '0' 입력되면, 유니코드 출력하고 반복 종료
			System.out.println(ch + " is unicode " + (int)ch);
		}while(ch != '0');	//참이면 계속 반복, 거짓이면 반복 종료
		
	}
	
	public void printUnicode2() {
		//문자 입력 >> 유니코드 출력을 반복새서 작동되게 함
		//'0' 입력되면 반복 종료됨
		char ch; //while  문에서 사용하기 위해 변수를 외부에서 선언
		
		do {
			System.out.print("문자 입력 : ");
			ch = sc.next().charAt(0);
			
			//종료값 '0' 입력되면, 유니코드 출력하지 않고 종료됨
			if(ch == '0') break;
			System.out.println(ch + " is unicode " + (int)ch);
		}while(true);	//참이면 계속 반복, 거짓이면 반복 종료
		
		System.out.println("--- end ---");
	}
	
	public void displayMenu() {
		int no; 
		
		do {
			System.out.println("*** 제어문 연습 프로그램 ***\n");
			System.out.println("1. 여러 줄 별 출력");
			System.out.println("2. 양수일 때만 별 출력");
			System.out.println("3. 문자열에서 문자 찾기");
			System.out.println("4. 문자 유니코드 확인");
			System.out.println("9. 끝내기");
			
			System.out.print("번호 선택 : ");
			no = sc.nextInt();
			
			DoubleForSample dfs = new DoubleForSample();
			
			switch(no) {
			case 1: dfs.printStar2(5); break;
			case 2: dfs.printStar1(); break;
			case 3: new WhileSample().containChar(); break; // 같은 패키지 묶음 안에서 import안 해도 된다.
			case 4: printUnicode2(); break;
			case 9: System.out.println("정말로 끝내시겠습니까?[y|n] : ");
					char answer = sc.next().toUpperCase().charAt(0);
					if(answer == 'Y') {
						return;    //메인으로 돌려보냄, 프로그램 종료됨
					}else {
						break;		//switch 문 종료함, 반복 다시 실행됨
					}
			default: System.out.println("잘못 입력했습니다.");
					  System.out.println("다시 입력하세요.\n");
			
			}
		}while(true);
		
		
	}
	
	
	
} //class close




















