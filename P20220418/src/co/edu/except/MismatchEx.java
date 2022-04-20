package co.edu.except;

import java.util.*;

public class MismatchEx 
{

	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("1.추가  2.종료");
			System.out.println("선택 > ");
			int menu=0;
			
			try 
			{
				Class.forName("java.lang.String");
			}
			catch(ClassNotFoundException e1) // 일반 예외 (Exception)
			{
				e1.printStackTrace();
			}
			
			try
			{
				menu = scn.nextInt();
			}
			// NumberFormatException : Integer.parseInt(scn.nextLine()); 과 같은 구문에서 발생.
			catch(InputMismatchException | NumberFormatException e2) // 성능상 문제로 꼭 필요한 곳에만 예외처리. > 다중 예외처리로 비슷한 주제의 예외를 한꺼번에 처리.
			{
				System.out.println("1-2 사이의 숫자만 넣으세요");
				scn.nextLine(); // enter키로 인해 반복문 오류나는 것을 방지.
			}
			catch(Exception e) // Exception은 최상위 예외 클래스이므로 가장 하위 catch문에 위치. 모든 예외를 처리가능.
			{
				System.out.println("알 수 없는 예외!");
			}
			finally // 마지막에 반드시 실행하는 코드. return문에서는 무조건 finally문의 return이 채택됨. 없어도 무관.
			{
				System.out.println("예외처리에서 반드시 한번은 실행하는 코드를 삽입.");
			}
			
			if(menu==1)
			{
				System.out.println("추가");
			}
			else if(menu==2)
			{
				break;
			}				
			
		}
		System.out.println("End of program");
	}

}
