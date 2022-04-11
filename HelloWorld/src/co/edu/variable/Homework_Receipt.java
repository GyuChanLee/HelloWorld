package co.edu.variable;

import java.util.Scanner;

public class Homework_Receipt
{

	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("현금을 기입하시오 > ");
		int money = scn.nextInt();
		System.out.println("물건가격을 기입하시오 > ");
		int price = scn.nextInt();
		int vat = price / 10 ;
		int changes = money - price ;
		
		
		
		System.out.println("------------ 영 수 증 ------------");
		System.out.println("[현금]   "+money+"원");
		System.out.println("[물건가격] "+price+"원");
		System.out.println("[부가세]  "+vat+"원");
		System.out.println("[잔돈]   "+changes+"원");
		
		scn.close();
	}

}

//영수증.
//물건의 가격과 현금.
//[현금]   10000원
//[물건가격] 7500원
//[부가세]   750원
//[잔돈]   2500원.