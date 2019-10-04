package me.brunosantana.java8_date_time_api.example7;

import java.time.LocalDate;

public class NewDateTimeApiExample7 {

	public static void main(String[] args) {

		LocalDate yesterday = LocalDate.now().minusDays(1);
		LocalDate today = LocalDate.now();
		
		System.out.println(yesterday.isBefore(today));
		System.out.println(yesterday.isAfter(today));
		System.out.println(yesterday.isEqual(today));

	}

}
