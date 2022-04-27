package co.micol.fileCopy.copy;

import java.io.*;

public class CopyFile 
{
	public void copyf(char[] data)
	{
		try
		{
			Writer writer = new FileWriter("C:\\Temp\\Object.txt");
//			String fighting = data;
			writer.write(data);
			writer.flush();
			writer.close();
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		
	}
}
