package ch4.training;

import java.util.Scanner;

public class ch4_7 
{

	public static void main(String[] args) 
	{
		boolean run = true;
		int balance = 0;
		Scanner scn = new Scanner(System.in);
		
		while(run)
		{
			System.out.println("-----------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-----------------------------------");
			System.out.println("선택 > ");
			int menu = scn.nextInt();
			
			if(menu==1)
			{
				System.out.println("예금액을 넣으세요 > ");
				int money = scn.nextInt();
				balance += money;
				System.out.println("예금액>"+money);
			}
			else if(menu==2)
			{
				System.out.println("출금액을 넣으세요 > ");
				int money = scn.nextInt();
				if(money > balance)
				{
					System.out.println("잔고가 부족합니다!");
					continue;
				}
				balance -= money;
				System.out.println("출금액>"+money);
			}
			else if(menu==3)
			{
				System.out.println("잔고>"+balance);
			}
			else if(menu==4)
			{
				run = false;
			}
			else
			{
				System.out.println("잘못된 명령어를 입력했습니다.");
			}
		}
		
		System.out.println("프로그램 종료!!!");
	}
}
