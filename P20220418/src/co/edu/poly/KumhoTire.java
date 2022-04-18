package co.edu.poly;

public class KumhoTire extends Tire 
{
	public KumhoTire(String location, int maxRotation)
	{
		super(location,maxRotation);
	}
	
	@Override
	public boolean roll()
	{
		accmulateRotation++;
		if(accmulateRotation < maxRotation)
		{
			System.out.println(location+" 금호타이어의 수명 : "+(maxRotation-accmulateRotation)+"회");
			return true;
		}
		else
		{
			System.out.println("***"+location+" 금호타이어는 펑크났습니다. ***");
			return false;
		}
	}
}
