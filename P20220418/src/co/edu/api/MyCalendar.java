package co.edu.api;

import java.util.*;

public class MyCalendar 
{

	public static void main(String[] args) 
	{
		String y = "2022";
		String m = "10"; // 02 or 2
		
		showCal(y,m);
	}
	
	public static void showCal(String year, String month)
	{
		// 달력출력.
		int year1 = Integer.parseInt(year);
		int month1 = Integer.parseInt(month);
		Calendar cal = Calendar.getInstance();
		cal.set(year1, month1-1, 1);
		
		String[] days = {"Sun","Mon","Tue","Wed","Thu","Fri","Sat"};
		int lnth = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		int[] intAry = new int[lnth];
		
		System.out.println(year+"년 "+month+"월 달력 : ");
		System.out.println();
		for(int i=0;i<intAry.length;i++)
		{
			intAry[i] = i+1;
		}
		
		for(int i=0;i<days.length;i++)
		{
			System.out.printf("%4s",days[i]);
		}
		
		System.out.println();		
		
		// 매 월 1일이 늘 sun이 아니므로 1일의 요일위치를 조정.
		
		int spc=0;
		for(int i=1; i<=7;i++)
		{
			if(cal.get(Calendar.DAY_OF_WEEK)==i)
			{
				spc=i-1;
			}
		}
		
		for(int i=0;i<spc;i++) // 첫주에 5칸 만큼 공백 입력.
		{
			System.out.printf("%4s"," ");
		}
		// 날짜 출력.
		for(int i=0;i<intAry.length;i++)
		{
			System.out.printf("%4d",intAry[i]);
			if(((i+spc))%7==6) // i값에 밀어놓은 값만큼 줄바꿈 실시.
			{
				System.out.println();
			}
		}
	}
	
}
