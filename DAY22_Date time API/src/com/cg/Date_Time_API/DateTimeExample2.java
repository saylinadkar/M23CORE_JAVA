package com.cg.Date_Time_API;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public class DateTimeExample2 {

		public static void main(String[] args) {
			LocalDate date1=LocalDate.now();//27th
			LocalDate date2=date1.plusDays(5);
			System.out.println(date2);
			long df=ChronoUnit.DAYS.between(date1, date2);
			System.out.println(df);

		}

	}
