package co.edu.variable;

public class VarExample5 
{
	public static void main(String[] args) 
	{
		int val = 2147483647; // 4 byte = 32bit; 1bit == 값이 on/off 0/1.
		
		long val2 = 2147483648L;
		long val3 = 10; // 10 -> long 변환 (promotion). 작은 것에서 큰 것으로 변환은 값 손실 X. 자동 형변환 가능
		
		int val4 = (int)2147483648L; // long -> int 강제 형변환(casting). 작은 표현범위가 표현못하는 비트는 사라짐.
		
		int result = (int)(100L / 5); // long / int형 계산 > long/long > 결과는 long형 -> 캐스팅으로 result값 형식에 맞춤.
		
		long val5 = 10000000000L;
		long val6 = 10L;
		result = (int)(val5 - val6);
		
		char charList = 97; // 0 ~ 65535 까지의 정수값에 문자를 표현하는 값을 매핑. (유니코드)
		charList = 44032; // '가'
		
		System.out.println(val2);
		System.out.println(val3);
		System.out.println(val4);
		System.out.println(result);
		System.out.println(charList);
		System.out.println((int)charList);
		
		
	}
}
