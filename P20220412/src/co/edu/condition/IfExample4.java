package co.edu.condition;

public class IfExample4 
{

	public static void main(String[] args)
	{
		// 임의의 값 생성. Math.random()
		double randVal = Math.random(); // 반환값이 0 <= double형 < 1.
		System.out.println(randVal);
		
		double x = (int) (Math.random() * 100) + 1; // 1 <= x <101, 1부터 100까지의 값 랜덤 생성. 
		System.out.println(x);
		
		// 생성된 값이 0- 50 범위
		// 생성된 값이 51- 60 범위
		// 61-70, 71-80, 81-90, 91-100 범위.
		int x1 = (int)(Math.random()*100)+1;
		// 집에가서 해보기
		if(x1 >= 0 && x1 <= 50)
			System.out.println("생성된 값 범위는 0 - 50까지 입니다."+" 생성된 값 : "+x1);
		else if(x1 >= 51 && x1 <=60)
			System.out.println("생성된 값 범위는 51 - 60까지 입니다."+" 생성된 값 : "+x1);
		else if(x1 >= 61 && x1 <=70)
			System.out.println("생성된 값 범위는 61 - 70까지 입니다."+" 생성된 값 : "+x1);
		else if(x1 >= 71 && x1 <=80)
			System.out.println("생성된 값 범위는 71 - 80까지 입니다."+" 생성된 값 : "+x1);
		else if(x1 >= 81 && x1 <=90)
			System.out.println("생성된 값 범위는 81 - 90까지 입니다."+" 생성된 값 : "+x1);
		else if(x1 >= 91 && x1 <=100)
			System.out.println("생성된 값 범위는 91 - 100까지 입니다."+" 생성된 값 : "+x1);
	}

}
