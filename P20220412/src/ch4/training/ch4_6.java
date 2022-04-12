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
	}

}
