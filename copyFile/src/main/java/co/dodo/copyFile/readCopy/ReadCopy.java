package co.dodo.copyFile.readCopy;

import java.io.*;

public class ReadCopy 
{
	private void readCopy()
	{
		try 
		{
			Reader read = new FileReader("C:\\Temp\\source.txt");
			char[] chars = new char[10000];
			
			for(int i=0; i<chars.length;i++)
			{
				int data = read.read();
				if(data == -1)
				{
					break;
				}
				chars[i] = (char)data;
			}
			read.close(); // source 파일 읽어오기.
			
			Writer wr = new FileWriter("C:\\Temp\\Object.txt");
			String copyChar = String.valueOf(chars);
			wr.write(copyChar);
			wr.flush();
			wr.close();
			// Object 파일에 복사하기.
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void run()
	{
		readCopy();
	}
}
