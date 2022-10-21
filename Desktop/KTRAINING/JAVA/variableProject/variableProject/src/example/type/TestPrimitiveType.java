package example.type;  //패키지 선언문은 반드시 첫 줄에 작성

//다른 클래스 또는 다른 패키지에 소속된 클래스를 사용하려면
//import 패키지명.클래스명;  선언해야 함
import java.util.Scanner;
import java.text.*;

//같은 패키지 묶음 안에 있는 클래스끼리 사용시에는 import 안 함


//클래스 작성함 : 클래스명이 파일명임. 클래스명.java (원시 소스파일이라고 함)
//  => 컴파일함(기계어로 번역한 소스파일을 만듦) : 클래스명.class
//    ** eclipse 에서 소스 저장시, 자동 컴파일됨
//  => jvm 위에서 실행됨
public class TestPrimitiveType {
	//main method 를 가진 클래스는 실행용 클래스임

	public static void main(String[] args) {
		// 프로그램을 실행시킬 때 이용하는 메소드임
		// 자바는 main method 의 signature 를 정해놓았음

		System.out.println("변수와 자료형 테스트");
		
		//자바에서 다른 클래스가 가진 메소드를 실행하려면.
		//해당 클래스에 대한 객체 생성부터 해야 함
		//클래스명 참조변수 = new 클래스명();
		//참조변수.메소드명();
		
		VariableSample vsamp = new VariableSample();
		//vsamp.usePrimitiveType();
		//vsamp.useString();
		//vsamp.printProfile();
		//vsamp.useScanner();
		//vsamp.inputProfile();
		//vsamp.inputProfile2();
		
		VariableSample2 samp2 = new VariableSample2();
		//samp2.valueOverflow();
		//samp2.testWrapper();
		//samp2.testCasting();
		samp2.testCasting2();
	}

}







