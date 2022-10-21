package test.generics;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import test.list.Book;

public class TestGenerics2 {

	public static void main(String[] args) {
		// Map 계열에 Generics 적용 테스트
		// 레퍼런스 선언시 지정하면, 생성자에도 표기해야 하고
		// 주고 받는 매개변수, 리턴티입에도 표기해야 한다. 
		TestGenerics2 test2 = new TestGenerics2();
		Map<String, Book> map = test2.inputMap();
		test2.output(map);

	}

	// 맵 객체 선언과 생성 처리하고, 지정된 객체들 저장처리한 다음
	// 맵 객체를 리턴 처리
	public Map<String, Book> inputMap() {
		Map<String, Book> books = new HashMap<String, Book>();
		
		books.put("java", new Book("java", 35000));
		books.put("oracle", new Book("oracle", 45000));
		books.put("jdbc", new Book("jdbc", 25000));
		
		return books;
		}
	// 전달 받은 맵 객체안에 저장된 객체들을 하나씩 꺼내서 출력 처리
	public void output(Map<String, Book> map) {
		// 방법 1 : keySet() 사용 
		//메소드 사용 결과에도 Generics 명시해야 함.
		System.out.println("keySet()=====================");
		Set<String> keys = map.keySet();	// 키 타입만 변경
		Iterator<String> keyIter = keys.iterator();
		
		while(keyIter.hasNext()) {
			String key = keyIter.next(); // 원칙적으로  Object 변환 했지만 generics애서는 바로 명시된 대로 해도 된다. 
			Book book = map.get(key); // 클래스 형변환 필요없음.
			System.out.println(key + ", " + book);
			
		}
		
		// 방법 2 : entrySet()
		System.out.println("entrySet()=====================");
		Set<Map.Entry<String, Book>> entries = map.entrySet();
		Iterator<Map.Entry<String, Book>> entryIter = entries.iterator();
		while(entryIter.hasNext()) {
			Map.Entry<String, Book> entry = entryIter.next();
			String key = entry.getKey();	 // 형변환 필요없음
			Book value = entry.getValue(); // 형변환 필요없음
			System.out.println(key + ", " + value);
		}
		
		// 방법 3 : 값 객체들을  collection 으로 바꾸고, 객체배열로 바꿔서 출력
		Collection<Book> books = map.values();
		
		Book[] booksArray = new Book[books.size()];
		books.toArray(booksArray);
		
		for(Book book : booksArray) {
			System.out.println(book);
		}
		
	}
	
	
	
	
	
	
	
	
} // class end
