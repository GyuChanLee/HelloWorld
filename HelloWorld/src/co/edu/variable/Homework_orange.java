package co.edu.variable;

import java.util.Scanner;

public class Homework_orange 
{

	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("오렌지의 개수를 입력하세요 > ");
		int orange = scn.nextInt();
		
		int box10=orange/10;
		orange %= 10; 
		
		int box5 = orange / 5;
		if((orange%5)>0)
		{
			box5++;
		}
		
		scn.close();
		
		System.out.println("총 10개 짜리 상자의 개수 : "+box10+" /  총 5개 짜리 상자의 개수 : "+box5);

	}

}


//오렌지 127개 
//10개씩 담을 수 있는 상자.
//5개씩 담을 수 있는 상자.