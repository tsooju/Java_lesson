package com.practice1.model.vo;

import java.util.Objects;

// [실습문제 1]
public class Book {
	//Field
	private String title;	//책제목
	private String author;	//저자명
	private int price;	 //가격
	
	// 기본생성자와 매개변수 생성자 작성함
	public Book() {
		super();
	}

	public Book(String title, String author, int price) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	// Getter and Setter 작성함
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	// Object 클래스의 toString() 메소드 오버라이딩함
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", price=" + price + "]";
	}

	// Object 클래스의 equals() 메소드 오버라이딩함
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(author, other.author) && price == other.price && Objects.equals(title, other.title);
	}
	
	// Object 클래스의  clone() 메소드 오버라이딩함
		public Object clone() {
			return new Book(this.title, this.author, this.price);
		}
	
	
	
	
	
}
