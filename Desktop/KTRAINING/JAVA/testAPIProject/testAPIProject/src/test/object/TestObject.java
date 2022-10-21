package test.object;
/**
 * 하나의 클래스 파일 안에 클래스를 여러 개 작성할 수 있음.
 * 단, 주의사항 : 파일명으로 사용된 클래스만 public class 로 지정함
 * 						파일명이 아닌 클래스는 public 사용못함(default class 로 작성해야 함.)
 * */
public class TestObject {
	
	public static void main(String[] args) {
		// 모든 클래스는 java.lang.Object 의 후손이다.
		// Object 가 제공하는 메소드 모두 사용할 수 있다.
		Book book = new Book();
		Book ref = book; // 주소 복사
		
		System.out.println("book.hasjCode : " + book.hashCode());
		System.out.println("equals : " + book.equals(ref)); // true(주소 같음)
		System.out.println("toString : " + book.toString());
		System.out.println("getClass : " + book.getClass());
//		System.out.println("getTitle : " + book.getTitle());

	}

}

class Book { // TestObject class 에서만 사용 가능, 외부에서 사용 불가능!
	//Field
	private String title;
	
	public Book() {}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + "]";
	}
	
	
	
}