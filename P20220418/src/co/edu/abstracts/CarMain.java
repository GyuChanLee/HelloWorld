package co.edu.abstracts;

import java.util.Scanner;

public class CarMain 
{
	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		
		Car car = null;
		car = new Sonata();
		car = new Avante();
		
		// 1. 시동켜기, 2. 출발하기, 3. 운행, 4. 멈추기, 5.시동끄기.
		while(true)
		{
			System.out.println(" 1. 시동켜기, 2. 출발하기, 3. 운행, 4. 멈추기, 5.시동끄기.");
			int menu = Integer.parseInt(scn.nextLine());
			
			if(menu == 1)
			{
				car.turnOn();
			}
			else if(menu==2)
			{
				car.start();
			}
			else if(menu==3)
			{
				car.run();
			}
			else if(menu==4)
			{
				car.stop();
			}
			else if(menu==5)
			{
				car.turnOff();
			}
			else
			{
				break;
			}
		}
		System.out.println("End of Program");
	}
}
