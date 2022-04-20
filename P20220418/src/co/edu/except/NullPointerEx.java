package co.edu.except;

public class NullPointerEx 
{

	public static void main(String[] args) 
	{
		String str = "hi";
		str = null;
		
		try 
		{
			System.out.println(str.toString());
		}
		catch(NullPointerException e)  // runtime exception 를 상속받음.
		{
			System.out.println("Null값을 참조.");
		}
		System.out.println("End of program");
	}

}
