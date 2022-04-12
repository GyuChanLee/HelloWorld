package co.edu;

import java.util.Scanner;

public class CalTimeEx 
{
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("시간을 입력하세요. ");
		int time = scn.nextInt();
		// 시, 분, 초 값 나타내기. > 5000초 == 5000/(60*60) -> 시
		// 나머지 > 5000%(60*60) == 1400 / 60 -> 분
		// 초 > 분나머지 
		
		int hours, minutes, secs;
		int tmp;
		hours = time/(60*60);
		tmp = time%(60*60);
		minutes = tmp/60;
		secs = tmp%60;
		
		System.out.printf("%d은 %d시 %d분 %d초 입니다.",time,hours,minutes,secs);
		
	}
}
