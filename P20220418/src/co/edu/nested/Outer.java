package co.edu.nested;

public class Outer 
{
	private String f1;
	
	class Inner // 중첩 클래스 - 인스턴스 멤버 클래스
	{
		String f2;
		public void method2() 
		{
			System.out.println("method2() 호출");
		}
	}
	
	static class StaticInner // 정적 멤버 클래스
	{
		String f4; // 객체 필요.
		static String f5;
		public static void method4() 
		{
			System.out.println("method4() 호출");
		}
	}
	
	public void method1() 
	{
		System.out.println("method1() 호출");
		
		class Local // 로컬 클래스 - 메서드 안에서 선언. 
		{
			String f3;
			
			void method3() 
			{
				System.out.println("method3() 호출");
			}
			
		}
		
		Local local = new Local();
		local.method3();
	}
	
	
}
