package co.edu.api;

import java.lang.reflect.Method;

public class ClassExample 
{

	public static void main(String[] args) 
	{
		try 
		{
			Class cls = Class.forName("java.lang.String");
			Method[] methods = cls.getDeclaredMethods();
			for(Method method : methods)
			{
				System.out.println(method.toString());
			}
		}
		catch(Exception e)
		{
			System.out.println("오류남ㅎ");
		}
		
		Class obj = ObjectExample.class;
		obj.getDeclaredConstructors();
	}

}
