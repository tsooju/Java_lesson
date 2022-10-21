package test.datetime;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateTime {
	public DateTime() {}
	
	public void usingDate() {
		Date today = new Date();	// util Date를 사용한다.
		// 오늘 날짜와 현재 시간으로 기본 생성됨. 
		Date whenDay = new Date(1000000L);
		//1970년 1월 1일 목요일 0시 0분 0초 부터 일백만초가 지난 
		// 날짜와 시간을 의미함.
		System.out.println(today);
		System.out.println(whenDay);
		System.out.println(today.getTime());
		
		
		// Calendar 를 통해 오늘 날짜 객체 생성
		Calendar current = Calendar.getInstance();  // static 라서 getInstance() 함
		System.out.println(current);
		// 여러 종류의 필드를 가지고 있음 : get(필드명) 사용
		
		System.out.println(current.get(Calendar.YEAR) + "년 "
									+ (current.get(Calendar.MONTH) + 1) + "월 " 
									+ current.get(Calendar.DAY_OF_MONTH) + "일 " 
									+ (current.get(Calendar.AM) == 0 ? "오전 " : "오후 ")
									+ current.get(Calendar.HOUR) + "시 "
									+ current.get(Calendar.MINUTE) + "분 " 
									+ current.get(Calendar.SECOND) + "초");
		
		// Calendar 를 Date로 변경
		Date when = current.getTime();
		System.out.println(when);
		

	} // method end
	
	public void usingCalendar() {
		GregorianCalendar today = new GregorianCalendar();
		Calendar current = new GregorianCalendar();
		Calendar when = new GregorianCalendar(2000, 8, 8);
		
		System.out.println(today);
		System.out.println(current);
		System.out.println(when);
		
		System.out.println(current.get(Calendar.YEAR) + "년 "
				+ (current.get(Calendar.MONTH) + 1) + "월 " 
				+ current.get(Calendar.DAY_OF_MONTH) + "일 " 
				+ (current.get(Calendar.AM) == 0 ? "오전 " : "오후 ")
				+ current.get(Calendar.HOUR) + "시 "
				+ current.get(Calendar.MINUTE) + "분 " 
				+ current.get(Calendar.SECOND) + "초");
		
	} // method end
	
	public void printFormatter() {
		// formatter 이용한 출력
		char ch = 'B';
		String str = "java formatter";
		int num = 12345;
		double dnum = 753.12;
		
		
		System.out.printf("c : %c, str : %s\n", ch, str); // 값을 출력할 위치에 formatter을 작성
		// 출력 문자에 사용된 포맷터와 적용할 값은 자료형과 순서가 일치해야 한다.
		
		System.out.printf("num : %d, %o, %x \n", num, num, num);
		System.out.printf("dnum : %f, %g, %e, %A \n", dnum, dnum, dnum, dnum);
		
		
		Calendar today = new GregorianCalendar();
		String pattern = "yy-MM-dd E a hh:mm:ss";	// E = 요일, a = 오전, 오후
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);	// format이 적용된 문자열을 만들수 있다
		String result = sdf.format(today.getTime());
		System.out.println(result);
		
		// 포멧 자릿수 지정
		String name = "김철수";
		int age = 27;
		double height = 178.5;
		System.out.printf("|%-10s|%10d|%10.2f|\n", name, age, height);
		
	} // method end
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
} // class end
