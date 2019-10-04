package me.brunosantana.java8_date_time_api.example6;

import java.time.LocalDate;

public class NewDateTimeApiExample6 {

	public static void main(String[] args) {
		
		LocalDate pastDate = LocalDate.now().withDayOfMonth(19).withMonth(9).withYear(2002);
		System.out.printf("%d/%d/%d", pastDate.getDayOfMonth(), pastDate.getMonthValue(), pastDate.getYear());

	}

}
