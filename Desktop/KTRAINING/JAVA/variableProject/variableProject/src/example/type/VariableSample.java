//1. 패키지 선언문 : 반드시 첫줄에 작성
package example.type;

//2. 필요한 클래스 import 선언
import java.util.Scanner;


//3. 클래스 작성부
//자바는 클래스명.java 
//클래스명은 반드시 첫글자가 영어대문자로 작성할 것
public class VariableSample {
	//main method 가 없는 클래스는 기능 제공용 클래스임
	
	//클래스에 소속되는 멤버들을 작성함
	//멤버변수(Field)
	//생성자함수(Constructor)  ==> 자바는 소멸자(Destructor) 없음
	//자바는 jvm 이 동적메모리 관리를 자동으로 해 줌
	//사용이 끝난 기억공간들(객체, 배열 등)을 찾아내서 자동 제거해 줌
	// => 쓰레기 수집기(Garbage Collector) 가 자동 작동됨
	
	//멤버함수(Method)
	
	//** 클래스 안의 클래스 만들 수 있음 : 내부클래스라고 함
	//   inner class == nated class 라고도 함
	
	//자바에서 클래스 안에 메소드 작성법 :
	//접근제한자 [예약어] 반환자료형 메소드명(자료형 매개변수){코드 작성}
	public void usePrimitiveType() {
		//기본자료형 확인용 메소드
		//자바는 기본자료형 8개 제공함 : 
		//char, boolean, byte, short, int, long, float, double
		
		//변수(variable) : 메모리(RAM)에 값을 기록하기 위한 방
		//자바에서는 변수 만들기하려면, 
		//자료형 변수명;
		//어떤 종류의 값을 기록하는 방(기억공간)인지 미리 정함
		boolean flag;	//true or false 만 기록할 수 있음. 1바이트
		char gender;  //문자값 한개만 기록할 수 있음. 2바이트
		byte bvalue;	//1바이트 정수를 기록함(-128~127)
		short svalue;	//2바이트 정수를 기록함(-32768~32767)
		int age;	//4바이트 정수 기록 (-2147483648~2147483647)
		long pay; //int 보다 큰 정수 기록, 8바이트(2의 63승)
		float tax;			//4바이트 실수형
		double salary;		//8바이트 실수형
		
		//준비된 변수방에 값 기록함
		//변수명 = 기록할값;
		//선언된 변수의 자료형과 일치하는 값을 기록해야 함
		//자료형과 일치하지 않는 값 기록시 에러 발생함
		flag = false;
//		flag = 'F';  //다른 자료형 값 기록시 에러
		gender = '남';  //문자하나만 기록할 수 있음
		//문자 하나 표현시에는 반드시 작은따옴표 사용할 것
		//문자나열값(string)은 반드시 큰따옴표 사용할 것
		// '남' 과 "남"은 다름. (주의)
		
		bvalue = 100;   //-128~127
		svalue = 30000; //-32768~32767
		age = 30;
		pay = 450000L;  
		//iso 표준문법에서 long형 정수값은 반드시 숫자뒤에 대문자L 붙임
		
		tax = 0.03f;
		//iso 표준문법에서 float형 실수값은 반드시 숫자뒤에 소문자f 붙임
		salary = 5800000.;  //3. 은 3.0과 같음
		
		System.out.println("flag : " + flag + "\n" 
				+ "gender : " + gender + "\n"
				+ "bvalue : " + bvalue + "\n"
				+ "svalue : " + svalue + "\n"
				+ "age : " + age + "\n"
				+ "pay : " + pay + "\n"
				+ "tax : " + tax + "\n"
				+ "salary : " + salary);
	}  //method close
	
	//문자변수와 문자열변수 다루기
	public void useString() {
		//파이썬에서는 문자와 문자열 구분하지 않음
		//str = 'python', str = "python"  => 둘 다 ok
		
		//자바에서는 작은따옴표는 char 자료형 값 표현에 사용
		char ch = 'A';  //문자 하나값은 작은따옴표로
		
		//문자나열값(문자열)은 기본자료형으로 제공되지 않는다.
		//자바에서는 String 클래스가 제공됨 : 문자열 취급 클래스임
		//클래스 사용법 : 클래스명 참조변수 = new 클래스명();
		//String str = new String();
		//자바에서 String 클래스만 예외로 사용할 수 있게 제공함
		//String 을 기본자료형처럼 사용할 수 있게 제공함
		String str = "java";
//		str = 'python';  //문자열값은 반드시 큰따옴표로 표기함
		
		System.out.println("ch : " + ch + ", str : " + str);		
		
	}

	//실습
	//본인의 신상정보를 변수에 기록저장한 다음, 출력 확인
	//이름, 나이, 성별(남|여), 키, 몸무게, 전화번호, 이메일
	//키와 몸무게는 소숫점아래 첫째자리까리 기록함
	public void printProfile() {
		//변수 선언 : 번수방 만들기 => 자료형 변수명;
		//변수에 값기록 : 변수명 = 기록할값;
		//자료형 변수명 = 기록할값;  => 변수 초기화
		String name = "홍길동";
		int age = 30;
		char gender = '남';
		double height = 180.5;
		double weight = 78.5;
		String phone = "010-1234-5678";
		String email = "hong1234@test.org";
		
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("키 : " + height);
		System.out.println("몸무게 : " + weight);
		System.out.println("성별 : " + gender);
		System.out.println("전화번호 : " + phone);
		System.out.println("이메일 : " + email);
	}

	//키보드 입력 테스트용 메소드
	public void useScanner() {
		//키보드 입력을 위해 java.util.Scanner 를 사용할 수도 있고,
		//java.io 패키지의 클래스들을 사용할 수도 있음
		Scanner sc = new Scanner(System.in);
		
		//Scanner 가 제공하는 각 자료형별 값 입력용 메소드 사용함
		//자료형 변수명 = 참조변수.next자료형();
		
		System.out.print("문자열값 입력 : ");
		String str = sc.next();
		System.out.println("str : " + str);
		
		System.out.print("정수 숫자 입력 : ");
		int num = sc.nextInt();
		System.out.println("num : " + num);
		
		System.out.print("실수 숫자 입력 : ");
		double dnum = sc.nextDouble();
		System.out.println("dnum : " + dnum);
		
		System.out.print("논리값 입력 : ");
		boolean bool = sc.nextBoolean();
		System.out.println("bool : " + bool);
		
		//Scanner 에는 char 자료형(문자하나) 입력 기능 없음
		//문자하나를 String 으로 입력받아서
		//String 클래스의 문자하나 추출하는 메소드롤 문자꺼냄
		System.out.print("문자하나 입력 : ");
//		String s = sc.next();
//		char ch = s.charAt(0);
		char ch = sc.next().charAt(0);
		System.out.println("ch : " + ch);
	}
	
	//본인 신상정보 저장할 변수 선언함
	//각 변수에 키보드로 신상정보를 입력받아서 저장 처리함
	//출력 확인
	public void inputProfile() {
		Scanner sc = new Scanner(System.in);
		
		//변수 선언
		String name, phone, email;
		int age;
		char gender;
		double height, weight;
//		double weight;
//		String phone;
//		String email;
		
		//키보드 입력
		System.out.print("이름 입력 : ");
		name = sc.next();
		System.out.print("나이 입력 : ");
		age = sc.nextInt();
		System.out.print("성별 입력 : ");
		gender = sc.next().charAt(0);
		System.out.print("키 입력 : ");
		height = sc.nextDouble();
		System.out.print("몸무게 입력 : ");
		weight = sc.nextDouble();
		System.out.print("전화번호 입력 : ");
		phone = sc.next();
		System.out.print("이메일 입력 : ");
		email = sc.next();
		
		//출력 확인
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("성별 : " + gender);
		System.out.println("키 : " + height);
		System.out.println("몸무게 : " + weight);
		System.out.println("전화번호 : " + phone);
		System.out.println("이메일 : " + email);
	}
	
	public void inputProfile2() {
		Scanner sc = new Scanner(System.in);		
		
		//키보드 입력
		System.out.print("이름 입력 : ");
		String name = sc.next();
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		System.out.print("성별 입력 : ");
		char gender = sc.next().charAt(0);
		System.out.print("키 입력 : ");
		double height = sc.nextDouble();
		System.out.print("몸무게 입력 : ");
		double weight = sc.nextDouble();
		System.out.print("전화번호 입력 : ");
		String phone = sc.next();
		System.out.print("이메일 입력 : ");
		String email = sc.next();
		
		//출력 확인
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("성별 : " + gender);
		System.out.println("키 : " + height);
		System.out.println("몸무게 : " + weight);
		System.out.println("전화번호 : " + phone);
		System.out.println("이메일 : " + email);
	}


}  //class close









