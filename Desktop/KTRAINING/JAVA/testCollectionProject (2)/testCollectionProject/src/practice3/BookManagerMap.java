package practice3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import practice2.Book;

public class BookManagerMap {
	//Feild
	private HashMap booksMap;
	
	public BookManagerMap() {
		booksMap = new HashMap();
		
	}
	
	public BookManagerMap(HashMap map) {
		booksMap = new HashMap(map);
	}
	
	//Method
	public void putBook(Book book) {

		this.booksMap.put(book.getbNo(), book);
		
	}
	public void removeBook(String key) {
		booksMap.remove(key);

	}
	
	public String searchBook(String bTitle) {
		
		String key = null;
		Set entries = booksMap.entrySet();	// entry를 set으로 바꿈
		Iterator entryIter = entries.iterator(); // 엔트리 목록
	
		while(entryIter.hasNext()) {

			Map.Entry entry = (Map.Entry)entryIter.next();
			Book b = (Book)entry.getValue();
			
			if(b.getTitle().equals(bTitle)) {
				key = (String)entry.getKey();
				break;
			}
		}
		return key;
		
	}
	
	public void displayAll() {
		Iterator iter = booksMap.keySet().iterator();
		while(iter.hasNext()) {
			System.out.println(booksMap.get(iter.next()));
		}
		
	}
	
	public Book[] sortedBookMap() {
		List booksList = new ArrayList(booksMap.values());
		booksList.sort(new AscBookTitle());
		
		Book[] bar = new Book[booksList.size()];
		booksList.toArray(bar);
		
		return bar;
		
	}
	public void printBookMap(Book[] br) {
		
		for(Book b:br)
			System.out.println(b);
	}
	
	public void printBook(String key){
		System.out.println(booksMap.get(key));
	}
	

} // class end
