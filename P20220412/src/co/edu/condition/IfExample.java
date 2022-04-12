package co.edu.condition;

public class IfExample 
{
	public static void main(String[] args) 
	{
		int score = 85;
		// 90점보다 크면 A, 80점보다 크면 B, 70크면 C, 나머지 F.
		if(score > 90)
		{
			System.out.println("A학점입니다.");
		}
		else if(score > 80)
		{
			System.out.println("B학점입니다.");
		}
		else if(score > 70)
		{
			System.out.println("C학점입니다.");
		}
		else
		{
			System.out.println("D학점입니다.");
		}

	}
}
