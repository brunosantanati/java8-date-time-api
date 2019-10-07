package me.brunosantana.java8_date_time_api.example11;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;

public class NewDateTimeApiExample11 {

	public static void main(String[] args) {
		differenceBetweenDatesWithCalendar();
		differenceBetweenDatesWithChronoUnit();
		differenceBetweenDatesWithPeriod();
		differenceBetweenDatesWithDuration();
	}
	
	private static void differenceBetweenDatesWithCalendar() {
		Calendar today = Calendar.getInstance();
		Calendar pastDate = Calendar.getInstance();
		pastDate.set(1986, Calendar.SEPTEMBER, 19);
		long difference = today.getTimeInMillis() - pastDate.getTimeInMillis();
		long oneDayMilis = 1000 * 60 * 60 * 24;
		long days = difference / oneDayMilis;
		System.out.printf("difference in days: %s (considering only this unit)\n", days);
	}
	
	public static void differenceBetweenDatesWithChronoUnit() {
		LocalDate today = LocalDate.now();
		LocalDate pastDate = LocalDate.of(2011, Month.AUGUST, 30);
		
		long days = ChronoUnit.DAYS.between(pastDate, today);
		System.out.printf("difference in days: %s (considering only this unit)\n", days);
		
		long months = ChronoUnit.MONTHS.between(pastDate, today);
		System.out.printf("difference in months: %s (considering only this unit)\n", months);
		
		long years = ChronoUnit.YEARS.between(pastDate, today);
		System.out.printf("difference in years: %s (considering only this unit)\n", years);
	}
	
	public static void differenceBetweenDatesWithPeriod() {
		LocalDate today = LocalDate.now();
		LocalDate pastDate = LocalDate.of(2018, Month.JULY, 11);
		Period period = Period.between(pastDate, today);
		System.out.printf("%s day(s), %s month(s) and %s year(s) (all together)\n",
				period.getDays(), period.getMonths(), period.getYears());
	}
	
	public static void differenceBetweenDatesWithDuration() {
		LocalDateTime now = LocalDateTime.now();
		LocalDateTime oneHourAhead = LocalDateTime.now().plusHours(1);
		Duration duration = Duration.between(now, oneHourAhead);
		if (duration.isNegative()) {
			duration = duration.negated();
		}
		System.out.printf("%s hour(s) (considering only this unit)\n", duration.toHours());
		System.out.printf("%s minute(s (considering only this unit)\n", duration.toMinutes());
		System.out.printf("%s second(s) (considering only this unit)\n", duration.getSeconds());
	}

}
