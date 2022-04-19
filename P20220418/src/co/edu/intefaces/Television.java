package co.edu.intefaces;

public class Television implements RemoteControl // 인터페이스를 구현!!!
{
	@Override
	public void turnOn()
	{
	System.out.println("티비를 켭니다.");	
	}

	@Override
	public void turnOff() 
	{
		System.out.println("티비를 끕니다.");	
	}

	@Override
	public void volumeUp() 
	{
		System.out.println("티비 볼륨을 올립니다.");
	}

	@Override
	public void volumeDown() 
	{
		System.out.println("티비 볼륨을 내립니다.");
	}
	
	@Override // default 메서드
	public void adjustScreen()
	{
		System.out.println("티비 스크린을 조정합니다.");
	}
}
