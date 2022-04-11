package co.edu.variable;

import java.util.Scanner;
// java.lang package > 기본 설치 패키지
public class IfExample3 
{
	public static void main(String[] args) 
	{
		
		Scanner scanner = new Scanner(System.in);
		int num1, num2;
		
		System.out.println("첫번째 정수를 입력하세요>");
		num1 = scanner.nextInt(); // 사용자 입력을 받아 int형 반환.
		System.out.println("두번째 정수를 입력하세요>");
		num2 = scanner.nextInt(); // 사용자 입력을 받아 int형 반환.
		
		// 큰 수에서 작은 수를 뺀 결과값을 result에 저장.
		int result;
		if(num1 > num2) 
		{
			result = num1 - num2;
		}
		else 
		{
			result = num2 - num1;
		}
		System.out.println("큰 수에서 작은 수를 뺀 값은 "+result+"입니다.");

	}
}
