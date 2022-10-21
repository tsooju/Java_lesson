package com.week4;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class TestWork1 {
	public TestWork1() {
	}
	

	public void testWork1() {
		// 년, 월, 일, 시, 분, 초 값을 각각 변수에 분리 저장한 후
		Calendar cal = Calendar.getInstance();

		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int date = cal.get(Calendar.DATE);
		int day = cal.get(Calendar.DAY_OF_WEEK);
		String nday = "";

		switch (day) {
		case 1:
			nday = "일요일";
			break;
		case 2:
			nday = "월요일";
			break;
		case 3:
			nday = "화요일";
			break;
		case 4:
			nday = "수요일";
			break;
		case 5:
			nday = "목요일";
			break;
		case 6:
			nday = "금요일";
			break;
		case 7:
			nday = "토요일";
			break;
		}

		int amPm = cal.get(Calendar.AM_PM);
		int hour = cal.get(Calendar.HOUR);
		int min = cal.get(Calendar.MINUTE);
		int sec = cal.get(Calendar.SECOND);

		String str = amPm == Calendar.AM_PM ? "오전" : "오후";
		System.out.println(year + "년 " + month + "월 " + date + "일 " + nday + " " + str + " " + hour + "시 " + min + "분 "
				+ sec + "초");

		// "2011년 3월 21일 월요일" 로 출력해 보시오.
		Calendar when = new GregorianCalendar(2011, 2, 21);
		
		int year1 = when.get(Calendar.YEAR);
		int month1 = when.get(Calendar.MONTH) + 1;
		int date1 = when.get(Calendar.DATE);
		int day1 = when.get(Calendar.DAY_OF_WEEK);
		String nday1 = "";

		switch (day1) {
		case 1:
			nday1 = "일요일";
			break;
		case 2:
			nday1 = "월요일";
			break;
		case 3:
			nday1 = "화요일";
			break;
		case 4:
			nday1 = "수요일";
			break;
		case 5:
			nday1 = "목요일";
			break;
		case 6:
			nday1 = "금요일";
			break;
		case 7:
			nday1 = "토요일";
			break;
		}

		int amPm1 = cal.get(Calendar.AM_PM);
		int hour1 = cal.get(Calendar.HOUR);
		int min1 = cal.get(Calendar.MINUTE);
		int sec1 = cal.get(Calendar.SECOND);

		String str1 = amPm1 == Calendar.AM_PM ? "오전" : "오후";
		System.out.println(year1 + "년 " + month1 + "월 " + date1 + "일 " + nday1 + " " + str1 + " " + hour1 + "시 " + min1
				+ "분 " + sec1 + "초");

	} // method end
} // class end
