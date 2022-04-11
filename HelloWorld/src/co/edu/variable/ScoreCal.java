package co.edu.variable;

import java.util.Scanner;

public class ScoreCal 
{

	public static void main(String[] args) 
	{ // 점수 세개 입력 > 합, 평균, 고득점 구하여 출력.
		Scanner scn = new Scanner(System.in);
		System.out.println("점수를 입력하세요 >>> ");
		int a = scn.nextInt();
		System.out.println("점수를 입력하세요 >>> ");
		int b = scn.nextInt();
		System.out.println("점수를 입력하세요 >>> ");
		int c = scn.nextInt();
		int sum = a+b+c;
		double avg = sum / 3.0;
		int best = a;
		
		if(best < b)
		{
			best = b;
		}
		if(best<c)
		{
			best=c;
		}
		
		System.out.printf("합은 %3d이고 평균은 %.2f이고 최고점은 %3d점입니다.",sum,avg,best);
	}

}
