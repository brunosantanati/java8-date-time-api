package me.brunosantana.java8_date_time_api.example8;

import java.time.LocalDate;
import java.time.MonthDay;
import java.time.YearMonth;

public class NewDateTimeApiExample8 {

	public static void main(String[] args) {
		
		LocalDate date = LocalDate.now();
		
		System.out.println("Day of month: " + MonthDay.now().getDayOfMonth());
		System.out.println("Day of month: " + MonthDay.from(date).getDayOfMonth());
		System.out.println("Year: " + YearMonth.from(date).getYear());

	}

}
