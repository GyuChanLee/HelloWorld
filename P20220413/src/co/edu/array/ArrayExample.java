package co.edu.array;

import java.util.Arrays;

public class ArrayExample 
{

	public static void main(String[] args) 
	{
		// 30명의 학생의 점수 저장.
		int[] score = new int[30]; // 30개의 빈 공간이 있는 int형 배열 score을 생성.
		// 여러개의 같은 유형의 값을 저장.
		double[] dblAry = new double[10]; // double타입의 배열을 10개의 빈 공간으로 생성.
		int[] test1 = new int[] {1,2,3,4,5,6,7,8,9,10}; // 값 목록으로 배열 생성.
		System.out.println(Arrays.toString(test1));
		
		// index : 0 부터 시작. 인덱스값 위치는 정수.
		test1[0] = 30;
		test1[4] = 40;
//		test1[11] = 40;  //  java.lang.ArrayIndexOutOfBoundsException
		System.out.println(Arrays.toString(test1));
		
		String[] strAry = new String[5];
		System.out.println(strAry[0]); // 초기값 null.
		
		int[] otherAry = {10,20,30,40}; // 초기값 지정.
		int[] theOtherAry = {10,20,30,40};
		System.out.println(otherAry[0]);
		System.out.println(Arrays.toString(test1));
		
		if(otherAry==theOtherAry) // 두 배열의 메모리 주소는 다르다.
		{
			System.out.println("same");
		}
		else
		{
			System.out.println("diff");
		}
		
		if(otherAry[0]==theOtherAry[0]) // 인덱스 값에 있는 값을 비교하므로 == 연산 정상으로 기능. 
		{
			System.out.println("same");
		}
		else
		{
			System.out.println("diff");
		}
		
	}

}
