package co.edu.loop;

import java.util.Scanner;

public class WhileExample 
{

	public static void main(String[] args) 
	{
		// 1-10의 합
		int sum=0, i=1;
		while(i<=10)
		{
			sum += i;
			System.out.println(i+" "+sum);
			i++;
		}
		System.out.println("총 합 : "+sum);
		System.out.println();
		// while구문은 횟수가 아닌 조건이 정해져있는 경우 사용하면 좋음.
		
		Scanner scn = new Scanner(System.in);
		boolean isTrue = true;
		int sum1=0;
		
		while(isTrue)
		{
			System.out.println("숫자를 입력하세요(나가기 : -1 입력) > ");
			int temp = scn.nextInt();
			if(temp==-1)
			{
				isTrue = false;
				continue;
			}
			sum1 += temp;
		}
		System.out.println("입력한 값의 합 : "+sum1);
		System.out.println();
		
		
	}

}
