package oop.polymorphism;

import java.util.GregorianCalendar;

public class TestPolymorphism2 {

	public static void main(String[] args) {
		// 다형성 사용될 때 클래스 간의 형변환이 발생함.
		// 부모클래스 타입으로 레퍼런스 만들고 = 후손객체의 주소;
		// PC 연산원칙 : 같은 종류의 값(주소)만 대입할 수 있다.
		// 후손클래스형이 =>> 부모클래스형으로 자동 형변환된다. : UpCasting 라고 한다.
		// 상속구조에서 위(부모)쪽 타입으로 바뀜을 : UpCasting(자동으로 처리 된다.)
		// 후손클래스형 인스턴스 참조에서 후손 인스턴스 안에 있는 부모인스턴스만
		// 참조하는 것으로 바뀐다.

		Object[] array = new Object[5];
		// Object 타입의 주소변수 5개를 배열로 할당함.

		array[0] = new String("upcasting test");
		// String 안에 Object 있기 때문에 형변환이 가능하다는 의미
		// Object 형 레퍼런스 = String 객체의 주소;
		// Object 형 레퍼런스 = (Object)String 객체주소; ==>> 자동 처리 됨.
		// 상속관계 있는 클래스끼리만 형변환 할 수 있다.
		// UpCasting : 후손타입 >> 부모타입 (자동)
		// 부모레퍼런스로는 후손 인스턴스 안의 부모것만 참조할 수 있음.
		// 즉, toString() 매소드는 사용 가능하지만 subString, charAt(index)은 사용 못함. \
		// 이유는 charAt은 String것이라 Object에서 사용 못하다는 의미.
		System.out.println(array[0].toString());
		// == >> System.out.println("추출한 문자 : " + array[0].charAt(0)); == error

		// DownCasting : 부모타입 >> 후손타입 (명시 해야 한다. )
		// 후손 멤버를 사용하려면, 다시 후손타입으로 형변환 필요함.
		// 후손 타입으로 형변환시에는 참조하는 인스턴스이 클래스형에 대한 확인이 필요함.
		// 확인 : instanceof 연산자 사용함.
		if (array[0] instanceof String) {
			// 참조하는 인스턴스의 클래스가 String 이냐? 맞으면 타입으로 형변환 하라!
			String ref = (String) array[0];
			System.out.println("문자 확인 : " + ref.charAt(0));
		}

		array[1] = new ClassA();
		array[2] = new GregorianCalendar(2022, 8, 17);
		array[3] = new StringBuilder("부모것 참조로 변경됨.");
		array[4] = new ClassD();

		for (Object obj : array) {
			System.out.println(obj.toString()); // 동적바인딩이 작성 됨.
			// 동적은 실행될 때 란 의미. ( **동적(실행시) 바인딩(연결됨)** )
			// 정적 바인딩 : 컴파일시에 연결됨.
			// 컴파일시에는 부모의 메소드로 연결하고 컴하일됨.
			// 실행시 참조하는 인스턴스의 클래스형에 따라 후손클래스의
			// 오버라이딩된 메소드로 연결을 바꾸면서 실행함.
		}

		// DownCasting Test
		for (Object obj : array) {
			if (obj instanceof String) {
				System.out.println("글자갯수 : " + (((String) obj).length()));
			}
			if (obj instanceof GregorianCalendar) {
				System.out.println("type : " + (((GregorianCalendar) obj).getCalendarType()));
			} else if (obj instanceof StringBuilder) {
				System.out.println("append : " + (((StringBuilder) obj).append("- 형변환").toString()));
			} else if (obj instanceof ClassD) {
				((ClassD) obj).methodD();
			} else if (obj instanceof ClassA) {
				((ClassA) obj).methodA();
			}
		}
	}

} // TestPolymorphism2 end
