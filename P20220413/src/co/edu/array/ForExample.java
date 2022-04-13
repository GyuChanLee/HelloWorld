package co.edu.array;

public class ForExample 
{

	public static void main(String[] args) 
	{
		// 주사위 게임 - 2개.  던져서 나온 두 눈의 합이 6이 되는 경우.
		
		// 랜듐 주사위
//		for(int i=0; i<1000;i++)
//		{	
//			int dice1 = (int)(Math.random()*6)+1;
//			int dice2 = (int)(Math.random()*6)+1;
//			if(dice1 + dice2 == 6)
//			{
//				System.out.println("두 눈의 합이 6이 되는 경우 : ("+dice1+", "+dice2+") ");
//			}
//		}
		
		for(int i=1;i<=6;i++)
		{
			for(int j=1; j<=6;j++)
			{
				if(i+j == 6)
				{
					System.out.println("두 눈의 합이 6이 되는 경우 : ("+i+", "+j+")");
				}
			}
		}
	}

}
