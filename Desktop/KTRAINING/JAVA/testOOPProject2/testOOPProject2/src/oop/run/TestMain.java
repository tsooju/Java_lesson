package oop.run;

import oop.make.member.MemberSample;
// 다른 패키지의 클래스 사용시에는 반드시  import  선언헤야 한다.
import oop.makeclass.PublicClass;
public class TestMain {

	public static void main(String[] args) {
		// 클래스 사용 테스트
		PublicClass ref;
		// DefaultClass ref2;	== 패키지 안에서 보호 되어 있기 때문에 접근 못한다.
		// default class는 패키지 밖에서 사용 불가능
		
		
		// 매개변수 없는 기본 생성자로 객체 생성한 경우임. 
		MemberSample msamp = new MemberSample();
		// System.out.println(msamp.dnum); // 다른 패키지에서 default 사용 불가능
		// System.out.println(msamp.pnum); // 다른 패키지에서 protected 사용 불가능
		// System.out.println(msamp.pbnum); // 다른 패키지에서  public 사용 가능
		
		
		
		// 매개변수 있는 생성자로 객체 생성함.
		MemberSample samp2 = new MemberSample(11, 22, 33, 44 );
		
		msamp.information();
		samp2.information();
		
		

	} // method end

} // class end
