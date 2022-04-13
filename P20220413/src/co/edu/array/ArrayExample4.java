package co.edu.array;

import java.util.Arrays;

public class ArrayExample4 
{

	public static void main(String[] args) 
	{
		int[] intAry = new int[5];
		int sum = 0;
		
		for(int i=0; i<intAry.length;i++)
		{
			int rand = (int)(Math.random()*30)+1; // 1-31 범위의 난수 생성.
			intAry[i] = rand;
			if(intAry[i] > 15) // 15 초과인 요소를 추출하여 합 구하기.
			{
				sum += intAry[i];
				System.out.println(intAry[i]+"를 더하여 "+sum+"을 추출.");
			}
		}
		System.out.println("intAry 목록 : "+Arrays.toString(intAry));
		System.out.println("15보다 큰 값의 합 : "+sum);
		System.out.println();
		
		
		for(int i=1; i<11;i++)
		{
			for(int j=i;j<10;j++)
			{
				System.out.print(" ");
			}
			for(int x=0;x<i;x++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
