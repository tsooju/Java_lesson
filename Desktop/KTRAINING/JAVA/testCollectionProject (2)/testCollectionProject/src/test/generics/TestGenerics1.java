package test.generics;

import java.util.ArrayList;
import java.util.List;

import test.list.Book;

public class TestGenerics1 {

	public static void main(String[] args) {
		// 제네리스(Generics) 사용 테스트
		// 컬렉션 특징
		// 1. 저장공간 크기에 제한이 없다. 
		// 2. 여러 종류의 클래스 객체들을 저장할 수 있다. 
		
		// 컬렉션에 저장된 여러 종류의 객체들을 하나씩 꺼내서 다룰 때
		// 각 클래스가 가진 고유 기능을(메소드)을 사용하려면 
		//instanceof 클래스타입을 확인하고 나서 형변환(다운캐스팅)하고 
		// 사용하는 코드를 작성해야 함. => 이 코드가 복잡함. 

		List list = new ArrayList();
		list.add("apple"); // String auto boxing
		list.add(123); // integer auto boxing
		list.add(23.5); // double auto boxing
		list.add(new Book("자바 정복", 30000));
		
		for(Object obj : list) {
			if(obj instanceof Integer) {	// obj가 참조하는 객체 instance의 integer type의 객체냐?
				Integer value = (Integer)obj;	// 맞으면 형병환(down casting)
				int data = value.intValue(); // Unboxing 처리
				double result = Math.sqrt(data);
				System.out.println(data + "의 제곱근 : " + result);
				
			}else if(obj instanceof String) {
				String str = (String)obj;
				String result = str.substring(3);	// 3번 인덱스부터 끝 글자를 분리 추출해라
				System.out.println("분리추출 : " + result);
				
			}else if(obj instanceof Double) {
				Double value = (Double)obj;
				double data = value.doubleValue();
				double result = Math.random() * data;
				System.out.println("계산결과 : " + result);
				
			}else if(obj instanceof Book) {
				Book book = (Book)obj;
				int price = book.getPrice() * 3;
				System.out.println("3권 구매가격 : " + price);
			}
		}
		
		// Generics 사용 : 
		// collection에 한가지 종류의 객체들만 저장하는 경우에도
		// 하나씩 꺼내면 type 이 Object 임. => down casting 즉 형변환 해야 함. 
		
		// 컬렉션에 한가지 종류의 객체들만 저장하도록 제한을 설정하는 것. 이것이 제네릭스이다.
		// 하나씩 꺼내서 사용할 때 형변환 필요없음.
		List<Book> blist;	// 이리스트는 Book이 가지고 있는 객체만 저장한다는 의미. 다름 객체 저장하면 에러남.
		blist = new ArrayList<Book>();  // 레퍼런스에서 Book 선언했으면 생성자에도 Book선언해야 한다. 
		
		List<Book> blist1 = new ArrayList<Book>();
		
		blist.add(new Book("자바 완성", 32000));
		// blist.add("apple");	// 다른 클래스 객체는 저장할 수 없음
		
		blist.add(new Book("컴퓨터 비전", 50000));
		blist.add(new Book("딥러닝 cnn", 42000));
		
		// 저장된 객체를 하나씩 꺼내서 사용시 형변환 필요없음.
		for(Book b : blist) {	// 꺼낼 때는  Object아닌 Book 바로 사용함. 
			System.out.println(b.getTitle() + "," + b.getPrice());
		}
		
		
		

	}

} // class end
