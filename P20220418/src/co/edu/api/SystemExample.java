package co.edu.api;

public class SystemExample 
{

	public static void main(String[] args) 
	{
//		System.out.println("start");
//		System.exit(0);
//		System.out.println("end");
		
		long start = System.currentTimeMillis();
		start = System.nanoTime();
		
		long sum = 0L;
		for(int i=0; i<100000000; i++)
		{
			sum += i;
		}
		long end = System.currentTimeMillis();
		end = System.nanoTime();
		System.out.println(end-start);
	}

}
