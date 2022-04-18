package co.edu.game1;

import java.util.*;

public class GamePlay {

	public static void main(String[] args) 
	{
		int[] guesses = new int[5];
		// 겹치지 않는 난수 생성.
		for(int j=0; j<guesses.length; j++)
		{
			guesses[j] = (int)(Math.random()*5)+1;
			
			for(int i=0; i<j;i++) // 검사
			{
				if(guesses[j] == guesses[i])
				{
					j--; // 겹치는 난수가 있을 시 처음의 난수 생성을 돌리는 for문으로 돌아가 그전의 난수를 다시 만듬.
					break;
				}
			}
		}
		
		int[] arr = new int[5]; // 열어봤던 숫자 넣기?

// tmp를 이용한 변수 섞기.		
//		int[] guesses = {1,2,3,4,5};
//		for(int j=0; j<100; j++)
//		{
//			for(int i=0; i<guesses.length; i++)
//			{
//				int tmp = 0;
//				int rand = (int)(Math.random()*5);
//				tmp = guesses[i];
//				guesses[i] = guesses[rand];
//				guesses[rand] =tmp;
//				
//			}
//		}
		
		while(true)
		{
			System.out.println("================================================");
			System.out.println("5가 있는 위치를 찾는 게임.");
			System.out.println("[1] [2] [3] [4] [5] 중 하나의 위치를 선택 > ");
			Scanner scn = new Scanner(System.in);
			int idx = Integer.parseInt(scn.nextLine());
			int search5 = 0;
			
			for(int x=0; x<guesses.length;x++)
			{
				if(guesses[x]==5)
				{
					search5 = x;
				}
			}
			
			// testing
//			int[] arr = new int[5]; // 열어봤던 숫자 넣기?
			
			
			for(int i=0;i<5;i++)
			{
				if(arr[i]!=0)
				{
					System.out.print("["+arr[i]+"]");
				}
				else if(i==(idx-1))
				{
					System.out.print("["+guesses[i]+"]");
					arr[i] = guesses[i];
				}
				else
				{
					System.out.print("[*]");
				}
			}
			System.out.println();
			
			
			if(guesses[idx-1] == 5)
			{
				System.out.println("맞췄습니다! 5의 위치는 "+idx+"번째 자리 입니다.");
				System.out.println("배열 위치 : "+Arrays.toString(guesses));
				System.out.println("게임 종료!");
				break;
			}
			else
			{
				System.out.println("틀렸습니다! 5의 위치는 "+(search5+1)+"번째 자리 입니다.");
				System.out.println();
			}
			
		}
	}

}
