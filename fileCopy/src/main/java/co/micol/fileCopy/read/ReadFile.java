package co.micol.fileCopy.read;

import java.io.*;

public class ReadFile
{
	public char[] readf() // return 값을 String으로 받는 방법?
	{
		try
		{
			Reader reader = new FileReader("C:\\Temp\\source.txt");
			int data = 0;
			char[] chars = new char[200];
			int i=0;
			while(true)
			{
				data = reader.read();
				if(data == -1)
				{
					break;
				}
				chars[i] = (char)data;
				i++;
			}
			reader.close();
			return chars;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}
}
