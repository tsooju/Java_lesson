package test.abst;

/**
 * interface : 추상(미완성)메소드만 멤버로 가진 추상클래스이다. 
 * 제공되는 메소드 사용 규칙에 대한 강제화가 필요할 때 사용함. 
 * public abstract 반환자료형 메소드명([자료형 매개변수, ....]);
 * public abstract 생략해도 됨. interface  메소드는 반드시 생략되어 있다. 기억하기!!
 * */
public interface IGrade {
	/* public abstract */ char getGrade(int score);
	
	// 상수필드를 가질 수도 있음. 상수필드 이름은 대문자로 지어준다.	
	public static final int NUMBER = 100;
	
}
