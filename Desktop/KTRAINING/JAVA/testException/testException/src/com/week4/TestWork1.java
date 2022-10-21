package com.week4;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class TestWork1 {
	public static void main(String[] args) {
		Calendar current = Calendar.getInstance();  // static 라서 getInstance() 함
		// System.out.println(current);
		
		System.out.println(current.get(Calendar.YEAR) + "년 "
				+ (current.get(Calendar.MONTH) + 1) + "월 " 
				+ current.get(Calendar.DAY_OF_MONTH) + "일 " 
				+ (current.get(Calendar.AM) == 0 ? "오전 " : "오후 ")
				+ current.get(Calendar.HOUR) + "시 "
				+ current.get(Calendar.MINUTE) + "분 " 
				+ current.get(Calendar.SECOND) + "초");
		
		Calendar when = new GregorianCalendar(2011, 3, 21);
		// System.out.println(when);
		
		System.out.println(when.get(Calendar.YEAR) + "년 "
				+ when.get(Calendar.MONTH) + "월 " 
				+ when.get(Calendar.DAY_OF_MONTH) + "일 " 
				+ (when.get(Calendar.DAY_OF_WEEK) != 1 ?  "금요일 " : "월요일 ")
				+ (when.get(Calendar.AM) == 0 ? "오전 " : "오후 ")
				+ when.get(Calendar.HOUR) + "시 "
				+ when.get(Calendar.MINUTE) + "분 " 
				+ when.get(Calendar.SECOND) + "초");
			
	}
	
	
	
	public TestWork1() {
		
	}

	
	
	

}
