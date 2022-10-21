package object.silsub3.model;

public class Product {
	// Field 구성 : 반드시 enCapsulation 할 것
	private String productID;	//상품아이디
	private String productName;	//상품명
	private String productArea;	//생산지
	private int price;	//가격
	private double tax;	//부가세비율
	
	// Constructor 만들기
	public Product(String productID, String productName, String productArea, int price, double tax) {
		
		this.productID = productID;
		this.productName = productName;
		this.productArea = productArea;
		this.price = price;
		this.tax = tax;
	}
	
	// Method 만들기
	public void information() {
		System.out.println("상품아이디 : " + productID);
		System.out.println("상품명 : " + productName);
		System.out.println("생산지 : " + productArea);
		System.out.println("가격 : " + price);
		System.out.println("부가세비율 : " + tax);
		

	} // method end
	
	
	public void setPrice(int price) {
		this.price = price;
		
	}
	
	public void setTax(double tax) {
		this.tax = tax;
	}
	public void getPrice(int price) {
		this.price = price;
		
	}
	
	public void getTax(double tax) {
		this.tax = tax;
	}
	
	//getter : 객체 안의 필드값 얽어서 리턴(넘기는 )하는 메소드임
	//public  필드자료형 get  필드명(){ return this.fieldname; }
	public String getProductName() {
		return this.productName;
	}
	
	
	
	
	
	
} // class end
