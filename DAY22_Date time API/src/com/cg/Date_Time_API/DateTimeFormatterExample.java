package com.cg.Date_Time_API;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterExample {

	public static void main(String[] args) {
			String datetime="2022-07-27 18:17";
			DateTimeFormatter df=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
			LocalDateTime l=LocalDateTime.parse(datetime, df);
			System.out.println(l);

		}

	}