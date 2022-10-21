package oop.abst;

// abstract(추상 : 미완성된) 클래스
// 이 클래스는 객체 생성 못 하는 클래스임
// 상속을 목적으로 하느 클래스임. >> 후손을 만들어서 후손이 완성시키는 구조임.
// 메소드 사용 규칙을 강제적으로 따르게 할 목적으로 사용함.
public abstract class AbstractSample {
	
	//Constructor
	public AbstractSample() {
		
	}
	
	//Method
	/**추상(미완성) 메소드 : 메소드 헤드 선언만 하고, 메소드 바디가 없음. 즉 중괄호가 없다는 뜻 {} = X*/ 
	public abstract void abstMethod();
	// 추상 메소드를 멤버로 가진 클래스는 반드시 abstract class로 표기해야 됨. 
	
	// 오버라이딩 못 함
	public final void display() {
		System.out.println("final method test");
	}
	
	/** final 과 abstract 는 반대 의미 */
	
	
	
	
	
	
}
