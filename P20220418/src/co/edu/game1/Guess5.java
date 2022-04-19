package co.edu.game1;

import java.util.*;

public class Guess5
{

	public static void main(String[] args) 
	{
		int[] guesses = new int[5];
		
		for(int i=0; i<guesses.length;i++) // 중첩.
		{
			guesses[i] = (int)(Math.random()*5)+1;
			for(int j=0; j<i; j++)
			{
				if(guesses[j]==guesses[i])
				{
					i--;
					break;
				}
			}
		}
		
		Scanner scn = new Scanner(System.in);
		int[] search = new int[5];
		
		while(true)
		{
			System.out.println("뒤집을 위치의 숫자를 입력하시오 1-5 > ");
			int num = Integer.parseInt(scn.nextLine());
			
			for(int i=0; i<5; i++)
			{
				if(search[i]!=0)
				{
					System.out.print("["+search[i]+"]");
				}
			    else if(i==(num-1))
				{
					System.out.print("["+guesses[i]+"]");
					search[i] = guesses[i];
				}
				else
				{
					System.out.print("[*]");
				}
			}
			
			int idx = 0;
			for(int y=0; y<guesses.length; y++)
			{
				if(guesses[y]==5)
				{
					idx = y;
				}
			}
			
			if(guesses[num-1] == guesses[idx] )
			{
				System.out.println("맞췄습니다.");
				System.out.println();
				break;
			}
			else
			{
				System.out.println("틀렸습니다.");
				System.out.println(Arrays.toString(guesses));
				System.out.println();
			}
		}
		scn.close();
 	}

}
