package oop.make.member;

public class TestAccessField {
	public static void main(String[] args) {
		// 클래스의 멤버 사용하려면. 
		// 클래스명 레퍼런스 = new 생성자();
		// 레퍼런스.멤버변수
		// 레퍼런스.메소드()
		MemberSample msamp = new MemberSample();
		System.out.println(msamp.dnum); // 패키지내에서 default 사용 가능
		System.out.println(msamp.pnum); // 패키지내에서 protected 사용 가능
		System.out.println(msamp.pbnum); // 패키지내에서 public 사용 가능
	}
} // class end
