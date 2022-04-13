package ch4.training;

public class ch4_6 
{

	public static void main(String[] args) 
	{
		for(int i=1;i<5;i++)
		{
			for(int j=i;j<4;j++)
			{
				System.out.print(" ");

			}
			int x = 0;
			while(x<i)
			{
				System.out.print("*");
				x++;
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();

		// for문 두개를 이용한 풀이.
		for(int i=1; i<5;i++)
		{
			for(int j=i;j<4;j++)
			{
				System.out.print(" ");
			}
			for(int x=0;x<i;x++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
	}

}
