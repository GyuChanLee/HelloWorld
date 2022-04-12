package co.edu.loop;

public class NestedExample 
{

	public static void main(String[] args) 
	{
		// 구구단
		for(int i=2;i<=9;i++)
		{
			for(int j=1;j<=9;j++)
			{
				System.out.printf("%d * %d = %2d%n",i,j,i*j);
			}
			System.out.println();
		}
		System.out.println();
		
		//별 찍기
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i=1;i<=5;i++)
		{
			for(int j=i;j<=5;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
	}

}
