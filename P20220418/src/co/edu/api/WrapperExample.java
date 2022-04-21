package co.edu.api;

public class WrapperExample 
{

	public static void main(String[] args) 
	{
		// 래퍼 클래스
		// 기본 데이터 -> 참조 데이터(클래스) 포장 (박싱)
		// 참조 데이터(클래스) -> 기본 데이터 (언박싱)
		// Integer, Long, Byte, Double... > 앞의 글자만 클래스처럼 대문자로.
		
		int n1 = 100;
		Integer n2 = new Integer(200); // 쓰지않길 권장.
		Integer n3 = 200; // 자동 박싱. int형 200 >> Integer 200
		n1 = n3; // 언박싱. Integer형이 int형으로. 연산중 발생.
		Byte b1 = n3.byteValue();
		System.out.println(b1);
		
		Float f1 = 12.3F;
		
		Integer.parseInt("100"); // 숫자로 바꿀수 있는 문자열의 매개변수를 받아 기본타입값으로 변환. (int)
		Double.parseDouble("100"); // String을 double형으로 변환
	}

}
