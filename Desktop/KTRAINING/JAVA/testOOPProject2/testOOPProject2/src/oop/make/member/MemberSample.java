package oop.make.member;

/**
 * 클래스 멤버에 사용하는 접근제한자(access modifier)
 * 접근에 제한을 주는 단어
 * 
 * ( - )  private : 비공개, 클래스 안에서만 사용 가능
 * ( ~ ) default : package private, 클래스안, 패키지 안에서만 사용 가능
 * ( + ) public : 공개, 패키지 안, 패키지 안/밖 모두 사용 가능
 * ( # ) protected : default 와 같음, 패키지 밖에서는 상속 받은 후속 안. 
 * 
 * 
 * */



public class MemberSample {
	// 멤버변수(Field)
	// 접근제한자 [예약어] 자료형 변수명 [= 초기값];
	// 접근제한다 [예약어] 클래스명 레퍼런스 [= new 생성자(전달값, ....)];
	// oop 에서 가장 중요한 특징이 캡슐화임. 
	// 멤버변수는 private 이 캡슐화임. 이것이 기본이고 원칙이다. 
	private int num; // 클래스 밖에서 사용 불가능
	int dnum;
	protected int pnum;
	public int pbnum;
	
	
	
	
	// 생성자함수(Constructor)
	// 접근제한자 클래스명(){ 필드 = 초기값; }
	// 접근제한자 클래스명(자료형 매개변수,....){ 필드 = 초기값; }
	public MemberSample() {
		// jvm 이 준비한 기본값으로 초기화 처리함.
		
	}
	public MemberSample(int num, int dnum, int pnum, int pbnum) {
		// new 할 때(객체 생성될 때) 필드 초기값 기록 처리가 목적임.
		this.num = num;//매개변수이름과 field이름 같아도 된다. this가 객체 주소 안이란 뜻
		this.dnum = dnum;
		this.pnum = pnum;
		this.pbnum = pbnum;
	}
	
	
	
	
	// 멤버함수(Method)
	// 접근제한자
	public void information() {
		System.out.println(num + ", " + dnum + ", " + pnum + " , " + pbnum);
	}
	
	
	
	
	// 내부클래스(Nested)
	// 접근제한자
}
