package co.edu;

public class OperatorExample2
{

	public static void main(String[] args) 
	{
		// 십진수 10  > 이진수 1010. 
		int num10 = 10;
		System.out.println(~num10); // 비트반전연산자. 해당 변수의 모든 비트를 반전. -11
		
		boolean isTrue = false;
		isTrue = !isTrue; // 논리부정연산자. boolean 타입에만 사용.
		System.out.println(isTrue);
		
		if(!(num10>5))
		{
			System.out.println("참입니다.");
		}
		else
		{
			System.out.println("거짓입니다.");
		}
	}

}
