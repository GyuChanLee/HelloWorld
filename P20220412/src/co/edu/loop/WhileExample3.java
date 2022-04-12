package co.edu.loop;

import java.util.Scanner;

public class WhileExample3 
{

	public static void main(String[] args) 
	{
		// 랜덤 1-10 정수 생성 randVal
		// 사용자 입력값 userVal
		//while구문 사용. 임의의 값이 입력값과 같으면 종료.
		int randVal = (int) (Math.random()*10)+1;
		Scanner scn = new Scanner(System.in);
		int count = 0;
		
		while(true)
		{
			System.out.println("1과 10의 값 중 하나를 입력하세요.");
			int userVal = scn.nextInt();
			
			if(randVal == userVal)
			{
				System.out.println("입력한 값이 랜덤값과 일치합니다.");
				System.out.println("프로그램 종료!!");
				count++;
				break;
			}
			else if(randVal>userVal)
			{
				System.out.println("입력한 값이 랜덤값보다 작습니다.");
			}
			else if(randVal<userVal)
			{
				System.out.println("입력한 값이 랜덤값보다 큽니다.");
			}
			count++;
		}
		scn.close();
		System.out.printf("랜덤값 : %d , 시도한 횟수 : %d%n",randVal,count);
	}
	
}
