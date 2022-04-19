package co.edu.intefaces;

// 클래스 이름이 있는 구현 클래스
interface Runnalbe
{
	public void run();
}

class Run implements Runnable
{
	@Override
	public void run()
	{
		System.out.println("움직입니다.");
	}
}


public class RunnableExample 
{
	public static void main(String[] args) 
	{
		Runnable runnable = new Run();
		runnable.run();
		
		// 때마다 기능이 조금씩 달라지는 경우. > 따로 클래스 선언 대신 익명 구현객체 사용.
		runnable = new Runnable() 
		{
			@Override
			public void run()
			{
				System.out.println("개가 달립니다.");
			} // 익명구현객체.
		};
		runnable.run();
		
		runnable = new Runnable() 
		{
			@Override
			public void run()
			{
				System.out.println("고양이가 달립니다.");
			} // 익명구현객체.
		};
		runnable.run();
		
		// 람다식 : 익명구현객체를 함수형 프로그래밍으로 구현.
		runnable = () -> System.out.println("곰이 달립니다.");
		
		runnable.run();
	}
}
