package co.dodo.prj.menu;

import java.util.Scanner;

import co.dodo.prj.game.*;

public class Menu 
{
	private Scanner scn = new Scanner(System.in);
	private Lotto lot = new Lotto();
	private MagicSquare ms = new MagicSquare();
	private Tetris tet = new Tetris();
	
	private void mainTitle()
	{
			System.out.println();
			System.out.println("================================");
			System.out.println("== 다양한 게임을 즐겨보세요.  ==");
			System.out.println("==                            ==");
			System.out.println("== 1. 로또 게임               ==");
			System.out.println("== 2. 마 방 진                ==");
			System.out.println("== 3. 테트리스                ==");
			System.out.println("== 4. 게임 종료               ==");
			System.out.println("================================");
	}
	
	private void mainMenu()
	{
		boolean b = true; // 일반적으로 false 사용.
		do
		{
			mainTitle();
			int key = Integer.parseInt(scn.nextLine());
			
			switch(key)
			{
				case 1:
					lot.run();
					break;
				case 2:
					ms.run();
					break;
				case 3:
					tet.run();
					break;
				case 4:
					b = false;
					break;
				default:
					System.out.println("1 - 4번 중 하나를 고르세요 > " );
			}
		}
		while(b);
		scn.close();
	}
	
	public void run()
	{
		mainMenu();
	}
}
