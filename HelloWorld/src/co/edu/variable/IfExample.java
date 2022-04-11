package co.edu.variable;

public class IfExample 
{
	public static void main(String[] args) 
	{
		
		boolean isTrue; // 변수명은 의미있는 단어로. 첫머리 대문자 or 숫자 시작 X. 
		isTrue = true;
		int myAge = 19;
		isTrue = myAge > 20;
		
		if(isTrue)
		{
			System.out.println("over20");
		}
		else 
		{
			System.out.println("under20");
		}
	}
}
