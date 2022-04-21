package co.edu.api;

import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class CalendarExample 
{

	public static void main(String[] args) 
	{
		
		int year = 2020;
		int month = 5;
		
		Calendar cal = Calendar.getInstance();
		
		cal.set(year, month-1,1);
		System.out.println("년도: "+cal.get(Calendar.YEAR));
		System.out.println("월: "+cal.get(Calendar.MONTH)); // 0부터 시작. Jan=0;
		System.out.println("일: "+cal.get(Calendar.DAY_OF_MONTH));
		System.out.println("요일: "+cal.get(Calendar.DAY_OF_WEEK)); // 일 월 화 수 목 금 토 > 순서 1-7
		System.out.println("월의 마지막날: "+cal.getActualMaximum(Calendar.DAY_OF_MONTH)); // 가장 큰 수의 날짜.
		
		System.out.println();
		// /////////////////
		
		Date date = new Date();
		date = new Date("2020/05/01"); // 쓰지않길 권장.
		date.setYear(122);
		System.out.println(date.toString());
		//
		
		// 날짜 기준 처리 - 최신 권장판.
		LocalDate ldate = LocalDate.of(2022, 10, 10);
		System.out.println(ldate.toString());
		// 시간 기준 처리 - java.time
		LocalTime ltime = LocalTime.of(10, 10,10);
		System.out.println(ltime.toString());
		// 날짜 시간 모두 처리 - java.time
		LocalDateTime ldt = LocalDateTime.now(); // now() : 현재시간 기준.
		ldt = LocalDateTime.of(2022, 10, 5, 10, 20, 30); // of(년,월,일,시,분,초) : 날짜와 시간 지정.	
		System.out.println(ldt.toString());
		
		// 원하는 패턴에 맞게 날짜시간을 제공. > DateTimeFormatter.
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd h-m-s");
		System.out.println(ldt.format(dtf));
		
		// Date, Calendar 클래스 > deprecated : java.time패키지 클래스들을 사용권장.
		
				
	}

}
