package ch4.training;

public class ch4_3 
{

	public static void main(String[] args) 
	{
		while(true)
		{
			System.out.println("주사위를 돌립니다...");
			int dice1 = (int)(Math.random()*6)+1;
			int dice2 = (int)(Math.random()*6)+1;
			
			int sum5 = dice1 + dice2;
			System.out.printf("주사위 눈 : (%d , %d)%n",dice1,dice2);
			if(sum5 == 5)
			{
				System.out.println("주사위 눈의 합이 5이므로 종료함.");
				break;
			}
			System.out.println("주사위 눈의 합이 5가 아니므로 다시 돌립니다.");
			System.out.println();
		}
	}

}
