package co.edu.condition;

import java.util.Scanner;

public class IfExample2
{

	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("2와 3의 배수인지 알고 싶은 수를 적으시오 > ");
		int num = scn.nextInt();
		
		// if - 2의 배수, 3의 배수, 2와3의 공통배수인지 체크.
		if((num%2==0)&&(num%3==0))
		{
			System.out.println(num+" 은 2와 3의 공통배수입니다.");
		}
		else if(num % 2 == 0)
		{
			System.out.println(num+" 은 2의 배수입니다.");
		}
		else if(num % 3 == 0)
		{
			System.out.println(num+" 은 3의 배수입니다.");
		}
		else
		{
			System.out.println(num+" 은 2의 배수도 아니고 3의 배수도 아닙니다.");
		}
		
	}

}
