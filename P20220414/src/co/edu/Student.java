package co.edu;

public class Student 
{
	// 필드
	String name;
	String stdNo;
	int age;
	double height;	
	
	// 생성자 > 인스턴스를 생성할 때 처리할 기능 정의. (초기화)
	public Student(){} // 기본 생성자.
	
	// 생성자는 대체로 필드의 값을 지정할 때 사용자 정의.
	Student(String nm, String sn)
	{
		name = nm;
		stdNo = sn;
	}
	
	public Student(String name, String stdNo, int age, double height)
	{
		super();
		this.name = name;
		this.stdNo = stdNo;
		this.age = age;
		this.height = height;
	}

	//메서드
	void study()
	{
		System.out.println(name+"이/가 공부를 합니다!!");
	}
	
	void eat()
	{
		System.out.println(name+"이/가 식사를 합니다!!");
	}
	
	void showInfo()
	{
		System.out.println("이름은 "+name+"이고, 학생번호는 "+stdNo+"이고, 나이는"+age+"이고 키는"+height+"입니다.");
	}
}
