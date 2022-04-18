package co.test;

// friend 클래스.
//클래스의 생성과 필드, 메소드, 생성자.
public class Exam4 {
	// 친구의 이름, 생일, 연락처(중복값이 없는 키의 역할)
	private String name;
	private String birth;
	private String phone;
	
	Exam4(){}
	
	public Exam4(String name, String birth, String phone) 
	{
		this.name = name;
		this.birth = birth;
		this.phone = phone;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setBirth(String birth)
	{
		this.birth = birth;
	}
	
	public void setPhone(String phone)
	{
		this.phone = phone;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public String getBirth()
	{
		return this.birth;
	}
	public String getPhone()
	{
		return this.phone;
	}
	
	public void showInfo()
	{
		System.out.printf("%-10s     %-10s    %-15s%n",this.name,this.birth,this.phone);
	}
}
