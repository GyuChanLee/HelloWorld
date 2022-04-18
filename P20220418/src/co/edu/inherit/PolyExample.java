package co.edu.inherit;

class Driver 
{
	public void driver(Car car)
	{
		car.drive();
	}
}

public class PolyExample 
{
	public static void main(String[] args) 
	{
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		Driver d = new Driver();
		d.driver(bus); // 매개 변수의 다형성.
		d.driver(taxi);
	}
}
