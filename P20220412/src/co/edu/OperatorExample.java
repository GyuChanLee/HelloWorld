package co.edu;

public class OperatorExample
{

	public static void main(String[] args) 
	{
		// 증감연산자
		int num1 = 10;
		int num2 = 20;
		num1 += 2; // num1 = num1 + 2; 복합 대입 연산자.
		System.out.println(num1);
		
		num1++; //연산 작업 후, num1 = num1 + 1. 1을 누적연산.
		System.out.println(num1);
		System.out.println(num1++); // 출력처리 후 1 증가.
		System.out.println(++num1); // 1을 누적하고 연산 작업 수행.

		int result = num1++ + ++num2;
		System.out.println(result);
		
		byte num3 = 10;
		num3 += 5; // 정상처리.
		num3 =(byte)(num3+1);// byte와 short타입의 정수연산 결과값은 int타입으로 처리.
		num3++; // 정상처리.
		
		num3 = 125; // 비트 맨앞에는 부호비트가 있음. (-/+ 여부)
		num3++; //126
		num3++; // 127
		num3++; // -128  >> 오버플로우 발생!!!
		num3++; // -127
		num3++; // -126
		num3++; // -125
		// num3=-125, num3--로 활용해보기.
		
		System.out.println(num3);
	}	
}
