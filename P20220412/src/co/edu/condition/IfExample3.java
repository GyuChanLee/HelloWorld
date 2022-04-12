package co.edu.condition;

import java.util.Scanner;

public class IfExample3
{

	public static void main(String[] args) 
	{
		// 중첩 구문.
		// 90점 이상 A, 80점 이상 B, 70점 이상 C, 나머지 F.
		Scanner scn = new Scanner(System.in);
		System.out.println("숫자적으셈 > ");
		int score=scn.nextInt();
		if(score >= 90)
		{
			if(score>=95)
			{
				System.out.println("A+ 학점 입니다.");
			}
			else
				System.out.println("A 학점 입니다.");
		}
		else if(score >= 80)
		{
			if(score>=85)
			{
				System.out.println("B+ 학점 입니다.");
			}
			else
				System.out.println("B 학점 입니다.");
		}
		else if(score >= 70)
		{
			if(score>=75)
			{
				System.out.println("C+ 학점 입니다.");
			}
			else
				System.out.println("C 학점 입니다.");
		}
		else
		{
			System.out.println("F 학점 입니다.");
		}
	}

}
