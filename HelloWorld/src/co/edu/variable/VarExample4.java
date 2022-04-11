package co.edu.variable;

public class VarExample4 
{
	public static void main(String[] args) 
	{
		// 영어 80, 수학 70, 영어 수학 비교 결과값.
		int eng = 80;
		int math = 70;
		boolean isBigger = eng > math;
		
		if(isBigger)
		{
			System.out.println("영어점수가 수학점수보다 큽니다.");
		}
	}
}
