package co.edu.loop;

public class ForExample3 
{

	public static void main(String[] args) 
	{
		// 1-100 반복
		// 1000보다 큰 값 중 가장 작은 값 구하기.
		int sum = 0;
		
		for(int i=1;i<=100;i++)
		{
			sum += i;
			
			if(sum >= 1000)
			{
				System.out.println("1000보다 큰 수 중 최소값 : "+sum+" , 순번 : "+i);
				break;
			}

		}
		System.out.println();

		// 1-10 곱셈반복
		int sum1=1;
		for(int i=1;i<=10;i++)
		{
			sum1 *= i;
		}
		System.out.println("1-10까지의 곱셈 결과 : "+sum1);
		System.out.println();
		
		// 숫자 100의 약수를 출력하는 프로그램.

		for(int i=1;i<=100;i++)
		{
			if(100%i==0)
			{
				System.out.println("100의 약수 : "+i);
			}
		}
		
	}

}
