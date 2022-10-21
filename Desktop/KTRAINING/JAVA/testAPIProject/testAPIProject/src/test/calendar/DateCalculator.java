package test.calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateCalculator {
	public DateCalculator() {
	}

	// * isLeapYear(년도) 구현 내용
	public boolean isLeapYear(int year) {
		boolean isLeap = false;
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
			isLeap = true;
		return isLeap;
	}
	
	//  * getDays() 구현 내용
	public long getDays() {
		long totalDays = 0;
		Calendar today = new GregorianCalendar();

		int currentYear = today.get(Calendar.YEAR);
		int currentMonth = today.get(Calendar.MONTH);
		int currentDay = today.get(Calendar.DAY_OF_MONTH);

		for (int y = 1; y < currentYear; y++) {
			if (this.isLeapYear(y))
				totalDays += 366;
			else
				totalDays += 365;
		}

		for (int m = 1; m < currentMonth; m++) {
			if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12)
				totalDays += 30;
			if (m == 2) {
				if (this.isLeapYear(currentYear))
					totalDays += 29;
				else
					totalDays += 28;
			}
		}

		totalDays += currentDay;
		return totalDays;

	}

}
