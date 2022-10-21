package test.list;

public class BookPriceAscending implements java.util.Comparator{
	@Override
	public int compare(Object o1, Object o2) {
		// test.list.Book 의 필드 중 정렬기준에 대한
		// 오름차순 또는 내림차순 설정을 명시해야 함. 
		int result = 0;
		
		if(o1 instanceof Book && o2 instanceof Book) {
			Book b1 = (Book)o1;
			Book b2 = (Book)o2;
			
			result = (b1.getPrice() > b2.getPrice())? 1 : ((b1.getPrice() < b2.getPrice())? -1 : 0);
			// 또 result = b1.getPrice() - b2.getPrice();
		}
		return result;
	}
}
