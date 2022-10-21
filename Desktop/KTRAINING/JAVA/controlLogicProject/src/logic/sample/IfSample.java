package logic.sample;
/**
 * 조건문으로 if 문 사용 테스트용 샘플 클래스다.
 * 조건 표현식의 결과(true or false)에 따라 준비된 내용을 선택해서
 * 실행하는 구문이다. 
 * 사용형식 1 : 
 * 		if(조건표현식){
 * 		 true일때 샐행 시킬 구문들	
 *		}
 * */
import java.util.Scanner;

public class IfSample {
	Scanner sc = new Scanner(System.in);
	// 멤버 : 멤버변수(Field), 생성자함수(Constructor), 멤버함수(method)
	// method : 클래스가 제공하는 기능이란 의미다. 그래서 그 안에서 코드 작성을 해야 한다. 
	// 접근제한자 : 예 (public) + 예약어 + 반화자료형(void => (리턴값 없다는 의미)) ==>
												// ==>	 메소드명([자료형 변수명(선택)]){코드 작성}
	// 예약어(static(전적메모리에 저장)  static 없으면 동적메모리에 저장)
	// static 붙은 클래스 메소드를 new 사용 안하고 사용할 가능
	public void testIf1() {
		// 정수 하나 입력 받아, 양수일때만 "양수다" 출력
		System.out.println("정수 입력 : ");
		int num = sc.nextInt();
		if(num % 2 == 0) {
			System.out.println("짝수다");
		}else {
			System.out.println("홀수다");
			
		}		
	} 
	
	public void testIf2() {
		//문자 하나 입력받아, 대문자일때만 유니코드 출력
		System.out.println("문자 입력 : ");
		char ch = sc.next().charAt(0);
		if(ch >= 'A' && ch <= 'Z') {
			System.out.println("대문자 : " + "유니코드는 : " + (int)ch);
		}else if(ch >= 'a' && ch <= 'z'){ 
			System.out.println("소문자 : " + "유니코드는 : " + (int)ch);
		}else if(ch >= '0' && ch <= '9') {
			System.out.println("숫자 : " + ch);
		}
	}
	
	public void testIf3() {
		
		//회원이면 1, 비회원이면 2를 입력받도록 처리
		System.out.println("회원이면 1, 비회원이면 2를 입력하세요 : ");
		int num = sc.nextInt();
		
		// if  만 사용
		/* 회원이면 
		 * "로그인항 아이디 : " 출력하고, 아이디 입력 받음
		 * 
		 * 비회원이면 회원 가입하기 : 
		 * */
		
		if(num == 1) {
			System.out.println("로그인할 아이디 입력 : ");
			String id = sc.next();
			
			System.out.println("암호 입력 : ");
			String pass = sc.next();
			
			System.out.println("아이디 : " + id + ", 패스 : " + pass);
			
		}if(num == 2) {
			System.out.println("회원 가입하셔야 합니다.");
			System.out.println("이름 : ");
			String name = sc.next();
			
			System.out.println("아이디 : ");
			String new_id = sc.next();
			
			System.out.println("패스워드 : ");
			String new_pass = sc.next();
			
			System.out.println("이메일 : ");
			String mail = sc.next();
			
			System.out.println("전화번호 : ");
			String phone = sc.next();
			
			System.out.println("성별(남/여) : ");
			char gender = sc.next().charAt(0);
			
			System.out.println("나이 : ");
			int age = sc.nextInt();
			
			System.out.println("회원 가입되셨습니다.");
			System.out.println("이름 : " + name + "\n" + 
									"아이디 : " + new_id + "\n" +
									"암호 : " + new_pass + "\n" +
									"이메일 : " + mail + "\n" +
									"전화번호 : " + phone + "\n" +
									"성별 : " + gender + "\n" +
									"나이 : " + age);
			
		}
		
	} // method close
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
} // class close


































