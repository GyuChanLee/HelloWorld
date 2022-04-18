package co.test;

import java.util.Arrays;

// 배열의 사용.
// 크기가 10인 배열에 1 ~ 10까지의 임의의 수를 저장. > 여기서 평균값 구하기.
// 평균값보다 큰 값을 새로운 배열에 저장하도록 하세요.
// 배열1, 2.
public class Exam3 
{
	public static void main(String[] args) 
	{
		int[] randArr = new int[10];
		int[] randArr2 = new int[10];
		int sum = 0;
		double avg = 0.0;
		
		for(int i=0; i<randArr.length;i++)
		{
			randArr[i] = (int)(Math.random()*10);
			sum += randArr[i];
		}
		avg = sum / 10.0;
		
		
		for(int i=0; i<randArr2.length; i++)
		{
			int rand = (int)(Math.random()*avg)+(int)(avg+1);
			randArr2[i] = rand;
		}
		
		System.out.println(Arrays.toString(randArr));
		System.out.println("첫번째 랜덤 배열의 평균 : "+avg);
		System.out.println(Arrays.toString(randArr2));
	}
}
