package co.edu.variable;

import java.util.Scanner;

public class CelsiusToFahrenheit 
{

	public static void main(String[] args) 
	{
		// 화씨 온도 입력 > 섭씨 온도 계산 출력. > 소수 첫번째 자리까지만 출력.
		Scanner scn = new Scanner(System.in);
		System.out.println("화씨 온도를 입력하세요 >");
		double f = scn.nextDouble();
		double c;
		
		c = 5/9.0*(f-32);
		
		System.out.printf("화씨온도 : %.1f도 >>> 섭씨온도 : %.1f도입니다.%n",f,c);
		scn.close();
		double x = FahrenheitToCelsius.changeCToF(37.8);
		System.out.println(x);
	}

}

class FahrenheitToCelsius
{
	public static double changeCToF(double c)
	{
		double f = 9/5.0 * (c+32);
		return f;
	}
}