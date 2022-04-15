package co.edu.statics;

public class SingletonExample 
{

	public static void main(String[] args) 
	{
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		if(s1 == s2)
		{
			System.out.println("same");
		}
		else
		{
			System.out.println("diff");
		}
		
		Car car = new Car();
	}

}
