package silsub3;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Book {
	// Field
	String title;
	String author;
	int price;
	Calendar dates;
	double discountRate;
	// Constructor
	public Book() {
		super();
	}
	public Book(String title, String author, int price, Calendar dates, double discountRate) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
		this.dates = dates;
		this.discountRate = discountRate;
	}
	//Getter & Setter
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
	public Calendar getDates() {
		return dates;
	}
	public void setDates(Calendar dates) {
		this.dates = dates;
	}
	public double getDiscountRate() {
		return discountRate;
	}
	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
	// Override
	@Override
	public String toString() {
		SimpleDateFormat fmt = new SimpleDateFormat("yyyy'년' MM'월' dd'일 출간'");
		
		return "Book [title=" + title + ", author=" 
				+ author + ", price=" + price + ", dates=" 
				+ fmt.format(this.dates.getTime()) 
				+ ", discountRate=" + discountRate + "]";
	}
	

} // class end 
