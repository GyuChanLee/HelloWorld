package co.micol.streamTest.writer;

import java.io.*;

public class WriteExample 
{
	public void write() // 호출되는 메서드가 예외처리 > 예외처리를 넘기지 않는 것을 권장! throws 편하지만 협업상 권장 X.
	{
		try 
		{
			OutputStream os = new FileOutputStream("C:\\Temp\\test2.txt");
			byte[] arr = {'A','B','C'}; // 타입에 배열을 붙이길 권장.
			
			os.write(arr);
			os.flush();
			os.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		// 바이트 단위 스트림 : 음원, 영상, 이미지파일에 많이 사용.
	}
	
}
