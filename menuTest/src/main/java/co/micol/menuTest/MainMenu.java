package co.micol.menuTest;

import java.util.*;

public class MainMenu // 메뉴를 객체지향적으로 작성하기.  : 추상화, 캡슐화, 다형성!!!
{
	// 내부적으로 처리하는 것은 모두 private : 정보은폐기술 > 외부에 연결될 것만 최소한으로 public 제한.
	private Scanner scn = new Scanner(System.in);
	
	private void mainMenu()
	{
		boolean b = true;
		do
		{
			menuTitle();
			System.out.println("원하는 직업을 선택하세요 > ");
			int choise = scn.nextInt();
			switch(choise)
			{
			case 1:
				subTitle();
				break;
			case 2:
				b=false;
				break;
			}
		}
		while(b);
		scn.close();
	}
	
	private void menuTitle()
	{
		System.out.println("===================");
		System.out.println("= 1. 입력 =");
		System.out.println("= 2. 종료 =");
		System.out.println("===================");
	}
	
	private void subTitle()
	{
		System.out.println("===================");
		System.out.println("= 이 름 =");
		System.out.println("= 1. 돌아가기 =");
		System.out.println("===================");
		int ll = scn.nextInt();
		
	}
	
	public void run()
	{
		mainMenu();
	}
}
