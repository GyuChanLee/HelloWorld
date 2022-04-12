package co.edu;

public class OperatorExample5 
{

	public static void main(String[] args) 
	{
		// 비트 연산자
		int num = 8;
		
		int result = num << 2; // 비트 연산. 왼쪽으로 비트를 2만큼 이동. 8에서 32로 이동.
		System.out.println(result);
		int result1 = num >> 2; // 오른쪽으로 비트를 2만큼 이동. 8에서 2로 이동.
		System.out.println(result1);		
	}

}
