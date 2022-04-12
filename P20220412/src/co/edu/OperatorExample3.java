package co.edu;

public class OperatorExample3 
{

	public static void main(String[] args) 
	{
		// 비교 연산자, 논리 연산자.
		int num1 = 10;
		int num2 = 20;
		
		if(num1 == num2) 
		{
			System.out.println("두 수는 같습니다.");
		}
		if(num1 >= num2)
		{
			System.out.println(num1+"이 더 큽니다.");
		}
		if(num1 <= num2)
		{
			System.out.println(num2+"가 더 큽니다.");
		}
		
		if((num1%2==0)&&(num2%2==0)) // && : and  논리곱
		{
			System.out.println("두 수는 짝수입니다.");
		}
		else
		{
			System.out.println("두 수가 모두 짝수는 아닙니다.");
		}
		System.out.println(num1 +" "+num2);
		
		if((num1%2==0)||(num2++%2==0)) // || : or 논리합
		{
			System.out.println("두 수 중 하나 이상은 짝수입니다.");
		}
		else
		{
			System.out.println("두 수는 모두 홀수입니다.");
		}
		System.out.println(num1 +" "+num2);
		
		System.out.println("End Of Program");
	}

}
