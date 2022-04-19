package co.edu.intefaces;

public interface RemoteControl
{
	// 인스턴스, 클래스 필드 선언 불가.
	// 상수 선언 가능
	public int MAX_VOLUME = 100; // 컴파일러가 자동으로 public final static를 붙여줌.
	
	public abstract void turnOn();
	void turnOff(); // interface에서 컴파일 중에 자동으로 public abstract를 붙여줌.
	void volumeUp();
	void volumeDown();
	
	// java8 추가 > default 메서드, static 메서드 구현 가능.
	
	public default void adjustScreen()
	{
		System.out.println("화면을 조정합니다.");
	}
	// default 메서드 : 특정 한 구현 클래스에서만 오버라이딩 or 그대로 써서 사용하게 하고 싶을 때.
	
	public static void changeBattery()
	{
		System.out.println("건전지를 교환합니다.");
	}
	// static 메서드 : 객체호출 없이 인터페이스에서 바로 호출가능
}
