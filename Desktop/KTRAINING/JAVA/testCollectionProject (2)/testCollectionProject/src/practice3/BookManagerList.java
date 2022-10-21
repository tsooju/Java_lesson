package practice3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import practice2.Book;

public class BookManagerList {
	//Field
	private List booksList;
	
	//Constructor
	public BookManagerList() {
		this.booksList = new ArrayList();
	}
	
	public BookManagerList(ArrayList list) {
		this.booksList = new ArrayList(list);
	}
	
	public void addBook(Book book) {
		this.booksList.add(book.getbNo());
	}
	
	public void removeBook(String list) {
		this.booksList.remove(list);
	}
	
	public String searchBook(String bTitle) {
		Book b = new Book();
		String key = null;
		Iterator iter = this.booksList.iterator();	
		while(iter.hasNext()) {
			if(b.getTitle().equals(bTitle))
			key = (String)iter.next();
			break;
		}
	return key;	
	}
	
	public void displayAll() {
		Iterator iter = booksList.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
	public Book[] sortedBookList() {
		booksList.sort(new AscBookTitle());
		
		Book[] bar = new Book[booksList.size()];
		booksList.toArray(bar);
		return bar;}
	
	
	public void printBookList(Book[] br) {
		for(Book b : br)
			System.out.println(b);
	}
	
	public void printBook(String key) {
		System.out.println(booksList.toString());
	}
	

} // class end
