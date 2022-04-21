package co.edu.api;

import java.util.*;

public class StringExample 
{

	public static void main(String[] args) 
	{
		// 주민번호 -> 생년월일- 남/녀 구분.
		
		// ex) 960124 - 1345678 > 96년 1월 24일생, 남자입니다. - 1시작:남자, 2시작:여자, 3시작:00년생 남자, 4시작:00년생 여자.
//		String num1 = "9601241234567";
//		String num2 = "0101244234567";
//		String num3 = "9601244234567";
//		String num4 = "2010141234567";
		
		System.out.println("주민번호 입력 (숫자만입력 or 생년월일-뒷자리번호 형식)> ");
		Scanner scn = new Scanner(System.in);
		String search = scn.nextLine();
		String result = "";
		try
		{
			result = checkInfo(search);
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("잘못된 주민번호를 입력하셨습니다.");
		}
		System.out.println(result);
	}
	
	public static String checkInfo(String socialNumber) throws StringIndexOutOfBoundsException
	{
		String year = socialNumber.substring(0,2);
		String month = socialNumber.substring(2,4);
		String date = socialNumber.substring(4,6);
		String gender = "";
		
		char gen = socialNumber.charAt(6);
		if(gen=='-') // replaceAll("-","")로 "-" 모두 공백으로 바꿔서 무시 가능.
		{
			gen = socialNumber.charAt(7);
		}
		 
		if(gen=='1' || gen == '3')
		{
			gender = "남자"; 
		}
		else if(gen=='2' || gen=='4')
		{
			gender = "여자";
		}
		else
		{
			return"잘못된 주민번호 양식을 가진 번호입니다.";
		}
		
		if(Integer.parseInt(year)>23)
		{
			if(gen=='3' || gen=='4')
			{
				return "잘못된 주민번호 양식을 가진 번호입니다.";
			}
		}
		else
		{
			if(gen=='1' || gen=='2')
			{
				return "잘못된 주민번호 양식을 가진 번호입니다.";
			}
		}
		
		int year1 =Integer.parseInt(year); // 01 > 1로 보이게.
		int month1 =Integer.parseInt(month);
		int date1 =Integer.parseInt(date);
		
		return "입력한 주민번호 : "+year1+"년 "+month1+"월 "+date1+"일 생, "+gender+"입니다.";
	}

}
