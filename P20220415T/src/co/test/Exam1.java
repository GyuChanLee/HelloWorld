package co.test;

import java.util.Scanner;

// 변수 선언과 제어문 활용.
// 정수값을 받는 변수를 3개 선언하고 num1, num2, num3 의 변수에 저장.
// 제일 큰 값을 구하도록 기능을 구현하세요.
// 결과 => 3 수 중에서 가장 큰값은 100 입니다.
public class Exam1 {
	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		// 코드 작성.
		int num1=0, num2=0, num3=0;
		int max = 0;
		
		System.out.println("1번째 정수입력 > ");
		num1 = scn.nextInt();
		System.out.println("2번째 정수입력 > ");
		num2 = scn.nextInt();
		System.out.println("3번째 정수입력 > ");
		num3 = scn.nextInt();
		
		int[] arr = {num1,num2,num3};
		for(int i=0; i<arr.length; i++)
		{
			if(max < arr[i])
			{
				max = arr[i];
			}
		}
		System.out.println("결과 => 3 수 중에서 가장 큰값은 "+max+" 입니다.");
		scn.close();
	}
}
