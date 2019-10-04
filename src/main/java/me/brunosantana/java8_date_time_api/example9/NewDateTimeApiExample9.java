package me.brunosantana.java8_date_time_api.example9;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;

public class NewDateTimeApiExample9 {

	public static void main(String[] args) {
		
		System.out.println(LocalDate.of(2019, Month.SEPTEMBER, 19));
		
		System.out.println(Month.FEBRUARY.firstMonthOfQuarter());
		System.out.println(Month.DECEMBER.plus(2));
		System.out.println(Month.JANUARY.minus(1));
		
		Locale pt = new Locale("pt");
		System.out.println(Month.DECEMBER.getDisplayName(TextStyle.FULL, pt));
		System.out.println(Month.DECEMBER.getDisplayName(TextStyle.SHORT, pt));
		System.out.println(Month.DECEMBER.getDisplayName(TextStyle.NARROW, pt));
		
		System.out.println(DayOfWeek.FRIDAY.getDisplayName(TextStyle.FULL, pt));
		System.out.println(DayOfWeek.FRIDAY.getDisplayName(TextStyle.SHORT, pt));
		System.out.println(DayOfWeek.FRIDAY.getDisplayName(TextStyle.NARROW, pt));

	}

}
