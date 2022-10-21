package test.abst;

import java.io.Serializable;

// interface 끼리 상속에도 extends 사용함. 
// 인터페이스 상속은 다중상속 가능함. 
public interface ICalc extends IGrade, Serializable {
		// 추상(미완성) 메소드로 만 구성된 추상클래스다.
		/* public abstract */ int sum(int a, int b);
		int sub(int a, int b);
		int mul(int a, int b);
		int div(int a, int b);
		int mod(int a, int b);
}
