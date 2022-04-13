package co.edu.array;

public class ArrayExample7 
{

	public static void main(String[] args) 
	{ // 2022년 4월의 달력표 그리기.
		String[] days = {"Sun","Mon","Tue","Wed","Thu","Fri","Sat"};
		int lnth = getLastDay(5);
		int[] intAry = new int[lnth];
		
		for(int i=0;i<intAry.length;i++)
		{
			intAry[i] = i+1;
		}
		
		for(int i=0;i<days.length;i++)
		{
			System.out.printf("%4s",days[i]);
		}
		
		System.out.println();		
		
		int spc = getDayInfo(5); // 매 월 1일이 늘 sun이 아니므로 1일의 요일위치를 조정.
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
	} // main method
	
	public static int getDayInfo(int month)
	{
		switch(month)
		{
		case 1:
			return 6;
		case 2:
		case 3:
		case 11:
			return 2;
		case 4:
		case 7:
		case 10:
			return 5; // 요일정보
		case 6:
			return 3;
		case 8:
			return 1;
		case 9:
		case 12:
			return 4;
		case 5:
		default:
			return 0;
		}
	}
	
	public static int getLastDay(int month)
	{
		switch(month)
		{
		case 2:
			return 28;
		case 4:
		case 6:
		case 9:
		case 11:
			return 30;
		case 5:
		default:
			return 31;
		}
	}
	
}
