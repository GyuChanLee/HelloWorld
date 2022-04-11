package co.edu.variable;

import java.io.IOException;
import java.util.Scanner;

public class SystemExample 
{

	public static void main(String[] args) 
	{   // 전체 주석처리 : ctrl + /
		//표준 입출력. System.in System.out
		Scanner scn = new Scanner(System.in); // 키보드. input
		
//		System.out.println("세 개의 단어를 입력. 예) 안녕 방가 잘가");
//		while(scn.hasNext())
//		{
//			String str = scn.next();// 입력값을 문자열 형식으로 출력.
//			if(str.equals("exit"))
//				break;
//			System.out.println(str);
//		}
		
		System.out.println("숫자를 입력하세요.");
		while(true)
		{
				try
				{
					int readByte = System.in.read();
					System.out.println(readByte);
					if(readByte == 97)
						break;
				}
				catch(IOException e)
				{
					e.printStackTrace();
				}
		}
		

		
		System.out.println("End Of Program");
	}

}
