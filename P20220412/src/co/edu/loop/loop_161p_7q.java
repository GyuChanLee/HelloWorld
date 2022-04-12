package co.edu.loop;

import java.util.Scanner;

public class loop_161p_7q {

	public static void main(String[] args) 
	{ // 입력한 데이터로 예금 출금 조회 종료 기능이 있는 계좌 기능 코드
		Scanner scn = new Scanner(System.in);
		boolean run = true;
		int balance = 0;
		
		while(run)
		{
			System.out.println("--------------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("--------------------------------------");
			System.out.println("선택> ");
			int select = scn.nextInt();
			if(select==1)
			{
				System.out.println("예금액을 넣으시오 > ");
				int a = scn.nextInt();
				balance += a;
				System.out.println("예금액> "+a);
			}
			else if(select==2)
			{
				System.out.println("출금액을 넣으시오 > ");
				int a = scn.nextInt();
				if(a>balance)
				{
					System.out.println("출금할 금액이 부족합니다!");
					continue;
				}
				balance -= a;
				System.out.println("출금액> "+a);
			}
			else if(select==3)
			{
				System.out.println("잔고> "+balance);
			}
			else if(select==4)
			{
				break;
			}
			
		}
		System.out.println();
		System.out.println("프로그램 종료!!!");
	}

}
