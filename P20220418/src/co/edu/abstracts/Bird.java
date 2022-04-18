package co.edu.abstracts;

public class Bird extends Animals
{
	@Override
	public void eat()
	{
		System.out.println("새가 먹이를 먹습니다.");
	}
	
	@Override
	public void run()
	{
		System.out.println("새가 날아갑니다.");
	}

}
