package co.edu.poly;

public class CarExample 
{

	public static void main(String[] args) 
	{
		Car car = new Car();
		
		for(int i=0; i<15; i++)
		{
			int problemLocation = car.run();
			
			switch(problemLocation)
			{
				case 1:
					car.frontLeft = new Tire("앞왼쪽",3);
					System.out.println("재생타이어로 타이어 교체");
					break;
				case 2:
					car.frontRight = new Tire("앞오른쪽",2);
					System.out.println("중고타이어로 타이어 교체");
					break;
				case 3:
					car.backLeft = new HankookTire("뒤왼쪽",12);
					System.out.println("한국타이어로 타이어 교체");
					break;
				case 4:
					car.backRight = new KumhoTire("뒤오른쪽",15);
					System.out.println("금호타이어로 타이어 교체");
			}
			
			try 
			{
				Thread.sleep(1000);
			} catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			
			System.out.println();
		}
	}

}
