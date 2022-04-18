package co.edu.abstracts;

public class Fish extends Animals
{
	@Override
	public void eat()
	{
		System.out.println("물고기가 먹이를 먹습니다.");
	}
	
	@Override
	public void run()
	{
		System.out.println("물고기가 헤엄쳐 갑니다.");
	}
	
	@Override
	public void sleep()
	{
		System.out.println("물고기가 잠을 잡니다.");
	}
}
