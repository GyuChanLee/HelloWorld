package co.edu.poly;

public class Tire 
{
	// 필드.
	public int maxRotation; // 최대 사용 회전수.
	public int accmulateRotation; // 현재까지 사용한 회전수.
	public String location; // 타이어 위치.
	
	public Tire(String location, int maxRotation) 
	{
		this.location = location;
		this.maxRotation =maxRotation;
	}
	
	public boolean roll()
	{
		accmulateRotation++;
		if(accmulateRotation < maxRotation)
		{
			System.out.println(location+" 타이어의 수명 : "+(maxRotation-accmulateRotation)+"회");
			return true;
		}
		else
		{
			System.out.println("***"+location+" 타이어는 펑크났습니다.");
			return false;
		}
	}
}
