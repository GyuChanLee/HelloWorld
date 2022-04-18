package co.edu.inherit;

public class Taxi extends Car
{
	String type; // 개인, 회사택시 여부
	
	public Taxi()
	{
		System.out.println("택시 생성자 호출");
	}
	
	public void metering()
	{
		System.out.println("요금 계기판 기능이 있습니다.");
	}
	
	@Override // 에러상황을 알려줌 > 문법체크.
	public void drive()
	{
		System.out.println("택시가 출발합니다!!!");
	}

	@Override
	public String toString() 
	{
		return "택시의 종류는 "+type;
	}
	
}
