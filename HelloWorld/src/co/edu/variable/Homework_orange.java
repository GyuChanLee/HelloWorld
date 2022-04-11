package co.edu.variable;

public class Homework_orange 
{

	public static void main(String[] args) 
	{
		int orange = 127;
		int box5 = orange / 5;
		int remain5 = orange % 5;
		int box10=orange/10;
		int remain10=orange%10;
		
		System.out.println("5개 짜리 상자의 개수 : "+box5+" 남은 오렌지 개수 : "+remain5);
		System.out.println("10개 짜리 상자의 개수 : "+box10+" 남은 오렌지 개수 : "+remain10);
	}

}


//오렌지 127개 
//10개씩 담을 수 있는 상자.
//5개씩 담을 수 있는 상자.