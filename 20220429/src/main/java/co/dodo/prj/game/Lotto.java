package co.dodo.prj.game;

import java.util.*;

public class Lotto 
{
	private int[] lotts = new int[7];
	private ArrayList<Integer[]> run = new ArrayList<Integer[]>();
	private Scanner scn = new Scanner(System.in);
	private Integer[] winning = null;
	
	private void lotto()
	{
		// 1회당 천원씩 돈받아서 실행. > 메서드 
		// 다중 실행은 5회씩 끊어서 출력.
		// 당첨 결과를 비교해서 당첨여부 출력, 당첨 값 출력.
		
		int runs = money(); // 실시회수
		shake(); // 로또 당첨 번호 생성
		
		winning = shake();
		
		for(int i =0; i< runs; i++)
		{
			run.add(shake());
		} // 회수만큼 번호 자동 생성
		
		showResult();
		
		System.out.println();
		System.out.println("============= 게임 끝 =============");
		System.out.println();
	}
	
	private int money()
	{
		int money = 0;
		System.out.println("돈을 넣으세요 > ");
		money = Integer.parseInt(scn.nextLine());
		int runs = (money / 1000);
		int na = (money % 1000);
		System.out.println(money+"원 투입, "+runs+"회 실시, 거스름돈 : "+na);
		return runs;
	}
	
	private Integer[] shake()
	{
		for(int i=0; i<lotts.length; i++)
		{
			int rand = (int)(Math.random()*45)+1;
			lotts[i] = rand;
			for(int j=0; j<i; j++)
			{
				if(lotts[i] == lotts[j])
				{
					i--;
					break;
				}
			}
		}
		Arrays.sort(lotts);
		
		Integer[] lotts2 = new Integer[7];
		for(int k=0; k<lotts2.length;k++)
		{
			lotts2[k] = lotts[k];
		}
		
		return lotts2;
	}
	
	private void showResult()
	{
		boolean wins = false;
		System.out.println("=== 로또 번호 ===================");
		for(int j=0; j<run.size(); j++)
		{
			System.out.println(Arrays.toString(run.get(j)));
			if((j+1)%5==0)
			{
				System.out.println("==================================");
				System.out.println();
			}
			
			if(Arrays.toString(run.get(j)).equals(Arrays.toString(winning)))
			{
				System.out.println(" 당첨되었습니다 !!");
				wins =true;
			}
		}
		if(wins == false)
		{
			System.out.println("당첨 실패!!!");
		}
		
		System.out.println("=====================");
		System.out.println();
		System.out.println("=== 당첨 번호 =======");
		System.out.println(Arrays.toString(winning));
		
		run.clear();
		
	}
		
	public void run()
	{
		lotto();
	}
}
