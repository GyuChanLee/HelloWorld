package co.edu.inherit;

public class CarExample 
{

	public static void main(String[] args) 
	{
		Bus bus = new Bus();
		// 부모에게 상속받은 필드, 메서드
		bus.model="45인승 버스";
		bus.drive();
		// 자식에서 정의된 필드, 메서드
		bus.busNo = "449";
		bus.fee();
		System.out.println(bus.toString());
		
		Taxi taxi = new Taxi();
		taxi.model="전기차 택시";
		taxi.drive();
		
		taxi.type="개인 택시";
		taxi.metering();
		System.out.println(taxi.toString());
		
		// 자식클래스의 인스턴스 > 부모 참조변수에 할당 가능.
		Bus[] buses = new Bus[10];
		Taxi[] taxies = new Taxi[10];

		Car[] cars = new Car[10]; // Car 배열에 bus, taxi 두 종류의 인스턴스를 담을 수 있음.
		cars[0] = bus; // promotion 자동형변환
		cars[1] = taxi;
	}

}
