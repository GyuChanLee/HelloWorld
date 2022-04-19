package co.edu.intefaces;

public class RemoteExample 
{

	public static void main(String[] args) 
	{
		// 상속관계 > 부모 참조변수에 자식 인스턴스 할당 가능.
		// 구현관계 > 인터페이스 참조변수에 구현 인스턴스 할당 가능.
		
		// 인터페이스는 객체생성 X.
//		RemoteControl rc = new RemoteControl();
		
		RemoteControl rc = new Television(); // RemoteControl을 구현하는 Television의 구현 객체 호출.
		
		// 코드 --호출--> 인터페이스 --호출--> 구현 객체
		
		// 객체의 공통적인 기능들을 뽑아 개발코드를 바꿀 필요없이 쉽게 관리 가능, 세부적인 부분은 각 객체에서 설정.
		
		rc.turnOn();
		rc.turnOff();
		rc.volumeUp();
		rc.volumeDown();
		rc.adjustScreen(); // television 클래스에만 구현.
		
		System.out.println();
		
		rc = new Audio();
		rc.turnOn();
		rc.turnOff();
		rc.volumeUp();
		rc.volumeDown();
		RemoteControl.changeBattery(); // static : 객체호출 없이 인터페이스에서 바로 호출가능
	}

}
