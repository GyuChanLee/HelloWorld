package co.edu.friend;

public class ComFriend extends Friend
{
	private String company;
	private String department;
	
	public ComFriend() 
	{
		super();
	}

	public ComFriend(String name, String phone, String company, String department) 
	{
		super(name, phone);
		this.company = company;
		this.department = department;
	}

	public String getCompany()
	{
		return company;
	}

	public void setCompany(String company) 
	{
		this.company = company;
	}

	public String getDepartment() 
	{
		return department;
	}

	public void setDepartment(String department) 
	{
		this.department = department;
	}

	@Override
	public String toString()
	{
		return "ComFriend [name=" + this.getName() + ", phone=" + super.getPhone() + ", company=" + company + ", department=" + department + "]";
	}
	
	@Override
	public void setPhone(String phone)
	{
		super.setPhone("연락처는 "+phone);
	}
	
	
}
