package me.brunosantana.java8_date_time_api.example2;

import java.time.LocalDate;

public class NewDateTimeApiExample2 {
	
	public static void main(String[] args) {
		
		LocalDate now = LocalDate.now();
		
		System.out.println(now);
		
		LocalDate plus = now.plusDays(1).plusWeeks(1).plusMonths(1).plusYears(1);
				
		System.out.println(plus);
		
		LocalDate minus = plus.minusDays(1).minusWeeks(1).minusMonths(1).minusYears(1);
		
		System.out.println(minus);
		
	}

}
