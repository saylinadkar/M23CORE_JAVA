package com.cg.Date_Time_API;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;


public class DateTimeExample1 {

	
	
		public static void main(String[] args) {
			LocalDate l=LocalDate.now();
			LocalTime t=LocalTime.now();
			LocalDateTime dt=LocalDateTime.now();
		//	LocalDate d=LocalDate.of(2022,Month.FEBRUARY,29);
			System.out.println(l);
			System.out.println(t);
			System.out.println(dt);
			//System.out.println(d);
		}

	}