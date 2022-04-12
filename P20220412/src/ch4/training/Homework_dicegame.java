package ch4.training;

import java.util.Scanner;

public class Homework_dicegame 
{

	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		int dice = (int)(Math.random()*6)+1;
		while(true)
		{
			System.out.println("주사위의 숫자를 입력하세요 >");
			int user = scn.nextInt();
			
			if(user == dice)
			{
				System.out.println("정답입니다!  주사위 눈의 값 : "+dice);
				break;
			}
			else if(user>dice)
			{
				System.out.println("입력값이 정답보다 더 큽니다! 값을 낮춰보세요...");
			}
			else
			{
				System.out.println("입력값이 정답보다 더 작습니다! 값을 높여보세요...");
			}
		}
		scn.close();
	}

}

//[이규찬] [오후 5:34] 4/12 숙제
//[이규찬] [오후 5:34] 1. 임의의 값 주사위1-6범위 : 맞추기 게임