package co.edu.statics;

public class Singleton  // 메모리를 아껴서 객체 하나만 쓰고 싶을 때...
{
	
	private static Singleton singleton = new Singleton();
	
	private Singleton() {}
	
	static Singleton getInstance()
	{
		return singleton;
	}
}
