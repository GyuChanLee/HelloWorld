package co.edu.variable;

public class OperatorExample 
{

	public static void main(String[] args) 
	{
		// 나머지 %
//		int result = 6/4;
//		int remain = 6%4;
//		System.out.println(result+" "+remain);
//		
//		int x = 5;
//		
//		if(x % 2 == 0)
//		{
//			System.out.println("짝수입니다.");
//		}
//		else
//		{
//			System.out.println("홀수입니다.");
//		}
		
		// 75380 원. > 5만원권, 1만원권, 5천원권, 천원권, 백원권, 십원권 각각의 개수 구하기.
//		int oman = 0, man = 0, ochun = 0, chun=0, obeak=0,beak = 0, sip=0;
//		int money = 698980;
//		System.out.println("현재 가진 돈 : "+money);
//		if(money >= 50000)
//		{
//			oman = money / 50000;
//			money %= 50000; 
//		}
//		if(money >= 10000)
//		{
//			man = money / 10000;
//			money %= 10000; 
//		}
//		if(money >= 5000)
//		{
//			ochun = money / 5000;
//			money %= 5000; 
//		}
//		if(money >= 1000)
//		{
//			chun = money / 1000;
//			money %= 1000; 
//		}
//		if(money >= 500)
//		{
//			obeak = money / 500;
//			money %= 500; 
//		}
//		if(money >= 100)
//		{
//			beak = money / 100;
//			money %= 100; 
//		}
//		if(money >= 10)
//		{
//			sip = money / 10;
//			money %= 10; 
//		}
				
		int oman = 0, man = 0, ochun = 0, chun=0, obeak=0,beak = 0, sip=0;
		int money = 698980;
		System.out.println("현재 가진 돈 : "+money);
			oman = money / 50000;
			money %= 50000; 
			
			man = money / 10000;
			money %= 10000; 
			
			ochun = money / 5000;
			money %= 5000; 
			
			chun = money / 1000;
			money %= 1000; 
			
			obeak = money / 500;
			money %= 500; 
			
			beak = money / 100;
			money %= 100; 
			
			sip = money / 10;			
			money %= 10; 
		
		System.out.printf("오만원권 : %d, 만원권 : %d, 오천원권 : %d, 천원권 : %d, 오백원권 : %d, 백원권 : %d, 십원권 : %d%n",oman,man,ochun,chun,obeak,beak,sip);
	}

}