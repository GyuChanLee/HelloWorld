package co.edu;

public class ReferenceExample 
{

	public static void main(String[] args) 
	{
		// 기본타입.
		int num1 = 100;
		int num2 = 100;
		
		System.out.println("기본타입끼리의 비교");
		if(num1==num2)
		{
			System.out.println("같은 값");
		}
		else
		{
			System.out.println("다른 값");
		}
		System.out.println();
		
		//참조타입.
		String str1 = new String("string");  // 인스턴스
		String str2 = new String("string");  // 인스턴스   > 인스턴스들은 메모리 주소가 무조건 다름. 각각의 다른 객체이기 때문!!!
		str1 = null;
		str1 = "string"; // String 클래스에만 예외로 간단한 생성기능 제공.
		
		// 참조타입이 가리키고 있는 메모리 주소를 비교함.
		System.out.println("참조타입끼리의 비교 (메모리 주소)");
		if(str1==str2)
		{
			System.out.println("같은 값");
		}
		else
		{
			System.out.println("다른 값");
		}
		System.out.println();
		
		// string이 갖고있는 문자열을 비교하는 메서드.
		System.out.println("참조타입끼리의 비교 (String 내용)");
		if(str1.equals(str2))
		{
			System.out.println("같은 값");
		}
		else
		{
			System.out.println("다른 값");
		}
		System.out.println();
	}

}
