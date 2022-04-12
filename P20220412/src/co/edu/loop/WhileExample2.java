package co.edu.loop;

import java.util.Scanner;

public class WhileExample2 
{

	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		boolean isTrue = true;
		int sum = 0;
		int x=0;
		// 200을 넘기면 반복문을 종료하기.
		while(isTrue)
		{
			System.out.println("더할 숫자를 적으시오 > ");
			x = scn.nextInt();
			sum += x;
			System.out.println("더할 값 : "+x);
			if(sum >= 200)
			{
				isTrue=false;
			}
			System.out.println("더한 값 : "+sum);
		}
		System.out.println("총 합: "+sum);
		scn.close();
	}

}
