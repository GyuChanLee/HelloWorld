package co.edu.friend;

public class UnivFriend extends Friend
{
	// fields
	private String univ;
	private String major;
	
	// constructor
	public UnivFriend(String name, String phone, String univ, String major)
	{
		super(name,phone);
		this.univ = univ;
		this.major = major;
	}

	//method
	public String getUniv() 
	{
		return univ;
	}

	public void setUniv(String univ) 
	{
		this.univ = univ;
	}

	public String getMajor() 
	{
		return major;
	}

	public void setMajor(String major) 
	{
		this.major = major;
	}

	@Override
	public String toString() 
	{
		return "UnivFriend [name=" + this.getName() + ", phone=" + super.getPhone() +", univ=" + univ + ", major=" + major + "]";
	}
	
}
