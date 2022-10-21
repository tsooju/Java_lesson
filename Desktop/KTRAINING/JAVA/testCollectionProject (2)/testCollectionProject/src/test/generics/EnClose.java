package test.generics;

public interface EnClose<T> {	// 이렇게 하면 generic interface 끝
	// 추상메소드 작성, 상수 필드 선언
	
	// 내부 인터페이스 : 사용시  EnClose.In
	// 인터페이스의 멤버로 취급됨 : 필요하면 static 사용 가능함.(멤버라서 가능함)
	public static interface In<T> {
		// 추상메소드 작성, 상수 필드 선언
	}

} // EnClose end
