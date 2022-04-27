package co.micol.streamTest.read;

import java.io.*;

public class ReadExample 
{
	public void run()
	{
		try 
		{
			InputStream ip = new FileInputStream("C:\\Temp\\test2.txt");
			byte[] buffer = new byte[100]; // buffer : 한줄 씩 읽을 때, 100개씩 읽겠다는 뜻.
			while(true)
			{
				int data = ip.read(buffer);
				if(data==-1)
				{
					break;
				}
				
				for(int i=0; i<data; i++)
				{
					System.out.println(buffer[i]);
				}
			}
			ip.close();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
