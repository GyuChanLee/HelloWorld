package co.micol.prj.outstream;

import java.io.*;


public class OutStreamTest
{
	public void run()
	{
		try 
		{
			OutputStream out = new FileOutputStream("C:\\Temp\\test.txt");
			byte a = 40;
			byte b = 43;
			byte c = 41;
			out.write(a);
			out.write(b);
			out.write(c);
			
			out.flush(); // 버퍼 비우기.
			out.close(); // 스트림 닫기.
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		// try-catch문을 메서드 내에서 쓰면 > 메인에서 예외처리를 하는 것을 안해도 됨.
		
	}
}
