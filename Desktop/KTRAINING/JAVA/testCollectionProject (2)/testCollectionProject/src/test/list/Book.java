package test.list;

// 입출력과 관련 클래스는 반드시 직렬화 윈칙이다. 
public class Book implements java.io.Serializable {
	// 수동으로 붙일시 다른 객체에 같은 번호 작성하면 안됨. 
	private static final long serialVersionUID = 10000L; 
	
	private String title;
	private int price;
	public Book() {
		super();
	}
	public Book(String title, int price) {
		super();
		this.title = title;
		this.price = price;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", price=" + price + "]";
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	
	
}
