package co.edu;
// 객체(Object) > 도면(class) > 텔레비전(Instance)
// 추상화 > 필요한 부분만 쓰는데 사용.
public class Television 
{
	//속성 -> 필드 (변수)
	String company;
	String model;
	int price;
	String color;
	
	//기능 -> 메서드 (생성시 반환유형, 메서드명, 매개변수 필요.)
	void turnOn()
	{
		System.out.println("텔레비전을 킵니다.");
	}
	
	void turnOff()
	{
		System.out.println("텔레비전을 끕니다.");
	}
	
	void changeChannel(int channel)
	{
		System.out.println("텔레비전 채널을 "+channel+"로 바꿉니다.");
	}
}
