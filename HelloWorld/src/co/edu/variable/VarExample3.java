package co.edu.variable;

public class VarExample3 
{
	public static void main(String[] args) 
	{
		{
			int age = 20;
		
			System.out.println("나이는 "+age);
		}
		int age = 26;
		System.out.println("나이는 "+age);
		
		// if 조건문.
		boolean isTrue = true;
		isTrue = false;
		isTrue = age > 20;
		if(isTrue)
		{
			System.out.println(age+"는 20보다 큽니다.");
		}
		
		// int 정수, double 실수, boolean 참거짓값
	}
}
