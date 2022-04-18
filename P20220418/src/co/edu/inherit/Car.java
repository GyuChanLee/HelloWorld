package co.edu.inherit;
// Taxi, Bus, Truck
public class Car 
{
	String model;
	
	public Car() 
	{
		System.out.println("Car 생성자 호출");
	}
	
	public void drive() 
	{
		System.out.println("운행을 합니다.");
	}
}
