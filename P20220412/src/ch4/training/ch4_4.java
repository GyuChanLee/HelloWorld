package ch4.training;

public class ch4_4 
{

	public static void main(String[] args) 
	{
		// 4x + 5y = 60의 모든 해 구하기.
		for(int x=0;x<=10;x++)
		{
			for(int y=0;y<=10;y++)
			{
				if((4*x) + (5*y) == 60)
				{
					System.out.printf("(%d , %d)%n",x,y);
				}
			}
		}
	}

}
