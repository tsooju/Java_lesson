package oop.method;

public class MethodSample {
	// 기본생성자
	public MethodSample() {
	} // 모든 클래스의 기본생성자는 만든다.

	// 반환값 없고 매개변수 없는 메소드
	public void hello() {
		System.out.println("hello! java...");
		return; // void 는 메소드 마지막에 return; 값이 숨겨져 있음. 생략해도 됨.

	}

	// 반환값 없고 매개변수 있는 메소드
	public void hello(int no) {
		switch (no) {
		case 1:
			System.out.println("환영합니다");
			break;
		case 2:
			System.out.println("반갑습니다");
			break;
		case 3:
			System.out.println("어서오세요");
			break;
		default:
			System.out.println("안녕하세요");
			break;
		}
		return;
	}

	// 반환값 있고 매개변수 없는 메소드
	public int randomValue() {
		return (int) (Math.random() * 100) + 1;
	}

	// 반환값 있고 매개변수 있는 메소드
	public int maxValue(int first, int second) {
		int result;
		if (first > second) {
			result = first;
		} else {
			result = second;
		}
		return result; // 리턴의 조건 : 마지막에 딱 한번 사용되게 작성함.
		// 리턴되는 값은 한개만 리턴할 수 있음.
	}

}
