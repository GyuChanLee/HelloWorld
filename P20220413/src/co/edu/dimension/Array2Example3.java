package co.edu.dimension;

import java.util.Scanner;

public class Array2Example3 
{

	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		// 변수 활용.
		int num1 ,num2, num3;
//		System.out.println("첫번째 값 입력 : ");
//		num1 = scn.nextInt();
//		System.out.println("두번째 값 입력 : ");
//		num2 = scn.nextInt();
//		System.out.println("세번째 값 입력 : ");
//		num3 = scn.nextInt();
//		// 제일 작은 수 - 제일 큰 수의 순으로 출력.
//		if(num1> num2)
//		{
//			if(num2 > num3)
//			{
//				System.out.println(num3+num2+num1);
//			}
//			else
//			{
//				if(num1 > num3)
//				{
//					System.out.println(num2+num3+num1);
//				}
//			}
//		}
		
		// 배열 활용.
		System.out.println("첫번째 값 입력 : ");
		num1 = scn.nextInt();
		System.out.println("두번째 값 입력 : ");
		num2 = scn.nextInt();
		System.out.println("세번째 값 입력 : ");
		num3 = scn.nextInt();
		int[] arr = {num1,num2,num3};
		
		for(int i=0; i<arr.length-1; i++)
		{
			for(int j=0; j <arr.length-1; j++)
			{
				if(arr[j]>arr[j+1])
				{
					int tmp = arr[j];  // 임시변수 선언.
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
		System.out.println(""+arr[0]+arr[1]+arr[2]); // 321 케이스 ??
		
		
	}

}
