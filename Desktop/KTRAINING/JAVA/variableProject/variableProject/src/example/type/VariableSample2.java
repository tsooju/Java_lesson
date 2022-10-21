package example.type;

public class VariableSample2 {
	//멤버함수(method) 작성형식 : 
	//접근제한자 반환자료형 메소드명([자료형 매개변수]){ 소스 작성 }
	
	//정수 변수값 오버플로우 테스트용 메소드
	public void valueOverflow() {
		byte bnum;  //1바이트 크기의 변수방 메모리에 할당됨
		//1byte == 8bit (bit(0,1) 8개 기록하는 공간)
		//정수는 음수, 0, 양수를 포함함
		//byte 의 값의 범위는 -128 ~ 127
		
//		bnum = 128;  //error
		bnum = 127;
		System.out.println("bnum : " + bnum);
		
		//계산 과정에서 결과값이 오버플로우가 발생한 경우
		//취급 값의 범위를 초과한 경우 : overflow
		bnum++;  //127 + 1 => -128 이 됨
		System.out.println("bnum : " + bnum);
		
		bnum -= 2;  //-128 - 2 => -130 => overflow => 126
		System.out.println("bnum : " + bnum);
	}
	
	//자바에서는 기본자료형(8개)에 대한 클래스를 제공함
	//기본자료형 클래스를 래퍼(Wrapper) 클래스라고 함
	//Wrapper class : 기본자료형 값에 캡슐(보호막) 처리가 목적임
	//Boxing : value --> encapsulation(캡슐화) : object
	//UnBoxing : object --> value
	//자바가 제공하는 클래스 메소드들 중에 객체만 취급하는 메소드를
	//사용할 때 Wrapper class 메소드 이용할 필요가 있음
	public void testWrapper() {
		//각 자료형의 메모리 할당크기(BYTES), 기록 비트수(SIZE),
		//최대값(MAX_VALUE), 최소값(MIN_VALUE) 상수필드가 제공됨
		int num = 123;  //값 기록
		//값 --> 객체로 바꿔야 할 경우		
		Integer inum = new Integer(num);
		
		double dnum = 45.6;  //값
		//값 --> 객체
		Double dd = new Double(dnum);
		
		System.out.println(num + ", " + inum/* .toString() */);
		System.out.println(dnum + ", " + dd/* .toString() */);
		
		
		//필드나 메소드에 static 이 표기된 경우
		//사용시 : 클래스명.필드명, 클래스명.메소드명()
		System.out.println("할당 바이트 : " + Integer.BYTES);
		System.out.println("기록 비트갯수 : " + Integer.SIZE);
		System.out.println("최대값 : " + Integer.MAX_VALUE);
		System.out.println("최소값 : " + Integer.MIN_VALUE);
		
		System.out.println("할당 바이트 : " + Double.BYTES);
		System.out.println("기록 비트갯수 : " + Double.SIZE);
		System.out.println("최대값 : " + Double.MAX_VALUE);
		System.out.println("최소값 : " + Double.MIN_VALUE);
		
		//각 자료형의 메모리할당 크기, 비트수, 최대값, 최소값 확인은
		//해당 자료형의 Wrapper class 의 상수필드로 확인하면 됨.
		//상수필드(constant field) : final 이 붙은 멤버변수
		//상수필드의 이름은 반드시 모두 대문자로 작성할 것
		//  => 단어간 구분을 위해 '_'(underscore)를 사용함
		//저장된 값을 변경 못하는 멤버변수임 : 상수필드임
	}
	
	//형변환 테스트
	//값의 자료형이 바뀌는 것
	//컴퓨터의 계산원칙이 지켜지지 않았을 때 형변환 발생
	public void testCasting() {
		//자동형변환 : 자료형이 다른 값이 대입될 때
		//원칙 1 : 같은 종류끼리만 대입할 수 있다.
		int inum = 'A';  //int <- char >> int 로 바꿈
		//문자의 유니코드(unicode) 값으로 변환되고 나서, 대입됨
		System.out.println("inum : " + inum);  //65
		
		//자동형변환 : 자료형이 다른 값들이 섞여서 계산될 때
		//원칙 2 : 같은 종류끼리만 계산할 수 있다.
		//메모리 할당 크기가 큰 자료형으로 자동형변환됨
		double result = 3 + 2.5 * 7;  
		//int + double * int  => 3.0+2.5*7.0
		//double + double * double => double
		System.out.println("result : " + result);
		
		//강제형변환(명시적 형변환)이 필요한 경우
		//경우 1 : 크기가 큰 자료형 값을 크기가 작은 변수에 대입시
		//cast 연산자 사용 : (바꿀자료형)값 or (바꿀자료형)변수
		int k = (int)35.7;  
		//int(4) <- double(8) >> int 변환 명시
		System.out.println("k : " + k);
		
		//경우 2 : 계산의 결과가 같은 종류가 아닐 때, 형변환 필요
		//원칙 3 : 계산의 결과형도 같은 종류여야 함
		int value = Integer.MAX_VALUE;
		System.out.println("value : " + value);
		
		long result2 = (long)value + value;
		System.out.println("result2 : " + result2);
	}
	
	public void testCasting2() {
		//자바는 byte, short 자료형 값 계산의 결과형은 
		//무조건 int 임
		byte b1 = 10;
		byte b2 = 20;
		byte b3 = (byte)(b1 + b2);  
		//byte + byte => int(4) -> byte(1)
		
		int num = b1 + b2;
		
		short s1 = 11;
		short s2 = 22;
		short s3 = (short)(s1 + s2);
		int snum = s1 + s2;
		
		System.out.println(b3 + ", " + num);
		System.out.println(s3 + ", " + snum);
		
		//문자와 정수간의 형변환은 char <=> int 만 가능함
		char ch = 97;  //자동형변환
		//유니코드 97번 문자('a')가 기록이 됨
		System.out.println("ch : " + ch + ", unicode : " + (int)ch);
	}
}










