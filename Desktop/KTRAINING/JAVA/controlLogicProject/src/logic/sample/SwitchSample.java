package logic.sample;

import java.util.Scanner;

public class SwitchSample {
	Scanner sc = new Scanner(System.in);
	
	//Field
	//Constructor : 클래스에 생성자 코드 없으면, 자동으로 기본 생성자 추가됨
	
	//멤버함수 : method
	public void test1() {
		//정수로 번호를 입력받아, 번호에 따라 인사말이 선택되어 출력
		System.out.print("번호선택 : [1,2,3] : ");
		int no = sc.nextInt();
		
		String message = null;	
		// 클래스타입의 변수 초기화는  null을 사용할 수 있다.(비어 있다 또는 뜻이 없다) 
		
		switch(no) {
		case 1: message = "안녕하세요"; break;
		case 2: message = "어서 오세요"; break;
		case 3: message = "환영합니다"; break;
		default: message = "안녕히 가세요"; break;
		}

		System.out.println(no + " : " + message);
	}
	public void calculator() {
		//정수를 2개와 연산문자(+,-,*,/,%)를 입력받아
		//연산문자에 따라 두 정수의 산술연산을 계산해서 출력
		
		System.out.print("정수 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("정수 입력 : ");
		int num2 = sc.nextInt();
		System.out.println("연산선택 : [+,-,*,/,%]");
		char tot = sc.next().charAt(0);

		int result = 0;
		switch(tot) {
		case '+': result = num1 + num2; break; 
		case '-': result = num1 - num2; break; 
		case '*': result = num1 * num2; break; 
		case '/': result = num1 / num2; break; 
		case '%': result = num1 % num2; break;
		default: System.out.println("잘못입력");
		}
		
		if(tot == '+')  result = num1 + num2;
		else if(tot == '-') result = num1 + num2;
		
		
		
		
		
		
		System.out.println(result);
	}
	
	public void test2() {
		//과일명(문자열)과 수량(정수)을 입력받아, 가격을 계산해서 출력
		//과일의 단가 저장용 변수 : int price = 0;
		//사과 1200, 배 2500, 포도 5000, 오렌지 700, 키위 350
		//그 외 과일은 "제품이 품절되었습니다." 출력 
		//출력 : 사과 : 1200원 출력 * 3개 => 가격 : 3600원
		
		System.out.print("과일 선택 : [사과, 배, 포도, 오렌지, 키위] : ");
		String fruits = sc.next();
		
		int apple = 1200;
		int pear = 2500;
		int grape = 5000;
		int orange = 700;
		int kiwi = 350;
		
		switch(fruits) {
		case "사과": 
			System.out.println("사과 " + apple + "원입니다.");
			System.out.print("구매 수량 선택 하세요 : ");
			int tot_apple = sc.nextInt();
			int price1 = tot_apple * apple;
			System.out.println("총 " + price1 + "원입니다."); break;
		case "배": 
			System.out.println("배 " + pear + "원입니다.");
			System.out.print("구매 수량 선택 하세요 : ");
			int tot_pear = sc.nextInt();
			int price2 = tot_pear * pear;
			System.out.println("총 " + price2 + "원입니다."); break;
		case "포도": 
			System.out.println("포도 " + grape + "원입니다.");
			System.out.print("구매 수량 선택 하세요 : ");
			int tot_grape = sc.nextInt();
			int price3 = tot_grape * grape;
			System.out.println("총 " + price3 + "원입니다."); break;
		case "오렌지": 
			System.out.println("오렌지 " + orange + "원입니다.");
			System.out.print("구매 수량 선택 하세요 : ");
			int tot_orange = sc.nextInt();
			int price4 = tot_orange * orange;
			System.out.println("총 " + price4 + "원입니다."); break;
		case "키위": 
			System.out.println("키위 " + kiwi + "원입니다.");
			System.out.print("구매 수량 선택 하세요 : ");
			int tot_kiwi = sc.nextInt();
			int price5 = tot_kiwi * kiwi;
			System.out.println("총 " + price5 + "원입니다."); break;
		default: System.out.println("품절됨");
		}
		
		
		
		
	}
	
	public void test2ChangeIf() {
		//과일명(문자열)과 수량(정수)을 입력받아, 가격을 계산해서 출력
		//과일의 단가 저장용 변수 : int price = 0;
		//사과 1200, 배 2500, 포도 5000, 오렌지 700, 키위 350
		//그 외 과일은 "제품이 품절되었습니다." 출력 
		//출력 : 사과 : 1200원 출력 * 3개 => 가격 : 3600원
		
		System.out.print("과일 선택 : [사과, 배, 포도, 오렌지, 키위] : ");
		String fruits = sc.next();
		
		int apple = 1200;
		int pear = 2500;
		int grape = 5000;
		int orange = 700;
		int kiwi = 350;
		
		if(fruits.equals("사과")) {
			System.out.println("사과 " + apple + "원입니다.");
			System.out.print("구매 수량 선택 하세요 : ");
			int tot_apple = sc.nextInt();
			int price1 = tot_apple * apple;
			System.out.println("총 " + price1 + "원입니다.");
		}else if(fruits.equals("배")) {
			System.out.println("배 " + pear + "원입니다.");
			System.out.print("구매 수량 선택 하세요 : ");
			int tot_pear = sc.nextInt();
			int price2 = tot_pear * pear;
			System.out.println("총 " + price2 + "원입니다."); 
		}else if(fruits.equals("포도")) { 
			System.out.println("포도 " + grape + "원입니다.");
			System.out.print("구매 수량 선택 하세요 : ");
			int tot_grape = sc.nextInt();
			int price3 = tot_grape * grape;
			System.out.println("총 " + price3 + "원입니다."); 
		}else if(fruits.equals("오렌지")) {
			System.out.println("오렌지 " + orange + "원입니다.");
			System.out.print("구매 수량 선택 하세요 : ");
			int tot_orange = sc.nextInt();
			int price4 = tot_orange * orange;
			System.out.println("총 " + price4 + "원입니다."); 
		}else if(fruits.equals("키위")) { 
			System.out.println("키위 " + kiwi + "원입니다.");
			System.out.print("구매 수량 선택 하세요 : ");
			int tot_kiwi = sc.nextInt();
			int price5 = tot_kiwi * kiwi;
			System.out.println("총 " + price5 + "원입니다.");
		}else { System.out.println("품절됨");
		}
		
		//기본자료형(primitive type) 변수에는 값이 기록된다.
		//변수가 가진 값과 == 비교값 : 비교연산 가능함. 
		//클래스자료형 변수는 참조변수(레퍼런스변수)임.
		//참조변수에는 해당 클래스 객체의 주소가 기록된다.
		//문자열을 제공하는  String class는 메소드로 비교연산처리 해야 한다. 
		//String class는 문자열 값이 같은지 비교하는 메소드 제공 됨.
		//문자열변수.equals("비교할문자열") 사용함.
		
		
	}
	
	
	
	
	
	
} // class close
