package co.edu.inherit;

public class Bus extends Car
{
	String busNo;
	
	public Bus()
	{
		super(); // 부모의 생성자를 호출.  super > 부모를 의미.
		System.out.println("Bus 생성자 호출");
	}
	
	public void fee()
	{
		System.out.println("버스 요금을 받습니다.");
	}
	
	public void drive()
	{
		System.out.println("버스가 출발합니다!!!");
	}

	@Override
	public String toString() 
	{
		return "Bus [busNo=" + busNo +", "+super.model+ "]";
//		return super.toString(); // 메모리주소를 출력. > 부모의 toString() 호출.
	}
	
	
}
