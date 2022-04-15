package co.edu.statics;

public class Person 
{
	final String nation = "Korea";
	final String ssn;
	final static double PI = 3.14; // 클래스 소속, 값 변경 불가능
	String name;
	
	public Person(String ssn, String name)
	{
		this.ssn = ssn;
		this.name = name;
	}
}
