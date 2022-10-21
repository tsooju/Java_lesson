package logic.run;

import home.menu.CashBurgerKing;
import logic.sample.DoWhileSample;
import logic.sample.DoubleForSample;
import logic.sample.ForSample;
import logic.sample.IfElseIfSample;
import logic.sample.IfElseSample;
import logic.sample.IfSample;
import logic.sample.SwitchSample;
import logic.sample.WhileSample;

public class TestLogic {

	public static void main(String[] args) {
		// 제어문 실행 테스트용
		// 클래스명 참조변수명 = new 클래스명();
		// new는 : 동적메모리(ram : heap영역)이며 여기에 객체공간을 만들어라란 의미. 
		
		//new 클래스명() == 관호의 의미는 new 생성자함수() 를 의미한다.
		IfSample samp = new IfSample();
			//samp.testIf1();
			//samp.testIf2();
			//samp.testIf3();
		
		// 클래스명 참조변수명 = new 생성자함수(); 란 의미.
		IfElseSample iesamp = new IfElseSample();
			//iesamp.testIfElse1();
			//iesamp.IfElseSample2();
			//iesamp.testIfElse3();
		
		// 클래스명 참조변수명 = new 생성자함수(); 란 의미. 생성자함수 이름이 클래스와 같아야함.
		// 클래스명() : 기본 생성자(default constructor)라 한다. 매개변수 없는 생성자이다. 
		// 클래스가 생성자를 가지고 있지 않으면, 실행시에 jvm이
		// 자동으로 클래스의 기본생성자를 추가하면서 컴파일함. 
		IfElseIfSample ref = new IfElseIfSample();
			//ref.testThreeMax();
			//ref.testScoreGrade();
			
		SwitchSample ref2 = new SwitchSample();
			//ref2.test1();
			//ref2.calculator();
			//ref2.test2();
			//ref2.test2ChangeIf();
		DoWhileSample ref3 = new DoWhileSample();
			//ref3.printUnicode();
			//ref3.printUnicode2();
			//ref3.displayMenu();
		
			
			//System.out.println("*** 프로그램 끝 ***");
		
		WhileSample ref4 = new WhileSample();
			//ref4.testWhile1();
			//ref4.testWhile2();
			//ref4.testWhile3();
			//ref4.containChar();
			//ref4.sumNumber(10);
		ForSample ref5 = new ForSample();
		//ref5.testFor1(100);
		//ref5.testFor1(10);
		//ref5.printGugudan();
		//ref5.sumEven(100);
		//ref5.sumMinToMax(10, 5);
		
		DoubleForSample ref6 = new DoubleForSample();
		//ref6.gugudan();
		//ref6.printStar1();
		//ref6.printStar2(7);
		
		//new ContinueSample().testContinue(3);
		
		CashBurgerKing sbk = new CashBurgerKing();
		//sbk.selectMenu();
		
		
		
	}
	


	}


