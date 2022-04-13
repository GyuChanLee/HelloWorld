package co.edu.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample5 
{

	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		
		// 학생 다섯명 수학점수
		int[] mathScores = new int[5];
		int max=0, min=0;
		
		for(int i=0; i<mathScores.length;i++)
		{
			System.out.println((i+1)+"번째 학생의 점수를 입력하세요(0-100점 사이) > ");
			mathScores[i] = scn.nextInt();
			
			min=mathScores[0];
			
			if(max<mathScores[i])
			{
				max = mathScores[i];
			}
			

			if(min>mathScores[i])
			{
				min = mathScores[i];
			}
		}

		
		System.out.println("최고점은 "+max+"점, 최저점은 "+min+"점");
		System.out.println("학생 수학점수 목록 : "+Arrays.toString(mathScores));
		scn.close();
	}

}
