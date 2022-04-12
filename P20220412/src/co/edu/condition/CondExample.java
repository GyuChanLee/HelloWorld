package co.edu.condition;

public class CondExample
{

	public static void main(String[] args) 
	{
		// 랜덤 값. 51 ~ 100 까지의 임의 값.
		int randomVal = (int) (Math.random()*50)+51;
		
		System.out.println(randomVal);
				
		// 100 - 90: A, 90-80: B, 80-70: C, 70-60: D, 나머지 F -> case문
		switch(randomVal/10)
		{
		case 10 :
		case 9 : System.out.println("A학점 입니다."); break;
		case 8 : System.out.println("B학점 입니다."); break;
		case 7 : System.out.println("C학점 입니다."); break;
		case 6 : System.out.println("D학점 입니다."); break;
		default : System.out.println("F학점 입니다.");
		}
		
		// if문 학점 판독기 +추가 버전.
		String op = "";
		if(randomVal >= 90 && randomVal < 100)
		{
			if(randomVal >= 95)
			{
				op = "+";
			}
			System.out.println("A"+op+"학점 입니다.");
		}
		else if(randomVal >= 80)
		{
			if(randomVal >= 85)
			{
				op = "+";
			}
			System.out.println("B"+op+"학점 입니다.");
		}
		else if(randomVal >= 70)
		{
			if(randomVal >= 75)
			{
				op ="+";
			}
			System.out.println("C"+op+"학점 입니다.");
		}
		else if(randomVal >= 60)
		{
			if(randomVal >= 65)
			{
				op ="+";
			}
			System.out.println("D"+op+"학점 입니다.");
		}
		else 
		{
			System.out.println("F학점 입니다.");
		}
	}

}
