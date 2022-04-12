package co.edu.loop;

public class ForExample
{

	public static void main(String[] args) 
	{
		int sum = 0;
		for(int i= 0; i < 5; i++) 
		{
			sum += 3;
			// i=0일때 sum=3.
			// i=1일때 sum=6.
			// i=2일때 sum=9.
			// i=3일때 sum=12.
			// i=4일때 sum=15.
			// i=5일때 조건식은 거짓이므로 for문을 탈출함.
		}

		System.out.println(sum);
		System.out.println();

		int num=3;
		for(int i = 1; i<=9;i++)
		{
			System.out.println(num+" * "+i+" = "+(num*i));
		}
		System.out.println();
		
		for(int i = 9; i>=1;i--)
		{
			System.out.println(num+" * "+i+" = "+(num*i));
		}
		System.out.println();
		
		for (int i = 2; i <= 5; i++) 
		{
			for (int j = 1; j <= 9; j++) 
			{
				System.out.printf("%d * %d = %d%n", i, j, i * j);
			}
			System.out.println();
		}
		System.out.println();
		
		int sum1 = 0;
		for (int i = 1; i <= 10; i++) 
		{
			if(i%2==0)
			{
				sum1 += i;
				System.out.println("sum + " + i + " = " + sum1);
			}
		}
		System.out.println("sum -> " + sum1);
	}

}
