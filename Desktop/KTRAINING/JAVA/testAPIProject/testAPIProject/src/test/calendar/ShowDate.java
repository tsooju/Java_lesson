package test.calendar;

public class ShowDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DateCalculator totalDay = new DateCalculator();
		//올해가 윤년인지? 평년인지? 출력 확인
		
		System.out.println(totalDay.isLeapYear(2022)? "윤년" : "평년");   // 2.29 윤년
		
		//1년 1월 1일부터 오늘까지의 총 날수 계산 출력
		long total = totalDay.getDays();
		System.out.println("총날짜수 : " + total);
		
		
		
	}

}
