package com.cg.Date_Time_API;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class DateTimeFormatterExample_2 {

		public static void main(String[] args) {
			LocalDateTime datetime=LocalDateTime.now();
			DateTimeFormatter df=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
			String var=datetime.format(df);
			System.out.println(var);

		}

	}