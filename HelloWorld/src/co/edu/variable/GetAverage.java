package co.edu.variable;

import java.util.Scanner;

public class GetAverage 
{
	public static void main(String[] args) 
	{
		//입력 값 num1, num2, num3
		Scanner scn = new Scanner(System.in);
		System.out.println("첫번째 숫자를 입력하세요.");
		int num1 = scn.nextInt();
		System.out.println("두번째 숫자를 입력하세요.");
		int num2 = scn.nextInt();
		System.out.println("세번째 숫자를 입력하세요.");
		int num3 = scn.nextInt();
		// 정수 연산 > 결과값 정수. 
		double avg = (num1+num2+num3)/3.0f;
		// 결과갑 : 입력한 세 정수는 10, 15, 15, 평균은 13.33333 입니다.
		System.out.printf("입력한 세 정수는 %3d, %d, %d 이고 평균은 %.5f 입니다.%n",num1,num2,num3,avg);
		for(int i = 0; i < 10; i++)
		{
			for(int j=i;j<10;j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
