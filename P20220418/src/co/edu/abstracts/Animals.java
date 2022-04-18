package co.edu.abstracts;

public abstract class Animals 
{
	// Animal() 생성자로 인스턴스 생성 X.
	public Animals()
	{}
	
	public abstract void eat(); // 강제로 eat()을 구현하도록 함.  > 자식클래스
	public abstract void run(); // 추상클래스.
	public void sleep() // 필드 or 메서드가 있어도 상관 X.
	{
		System.out.println("동물이 잠을 잡니다.");
	}
}
