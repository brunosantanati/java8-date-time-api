package me.brunosantana.java8_date_time_api.example5;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class NewDateTimeApiExample5 {

	public static void main(String[] args) {
		
		LocalDate date = LocalDate.of(2019, 12, 25);
		System.out.println(date);
		
		LocalDateTime dateTime = LocalDateTime.of(2019, 9, 19, 00, 30);
		System.out.println(dateTime);
		
	}

}
