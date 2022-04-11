package co.edu.variable;

public class VarExample6 
{
	public static void main(String[] args) 
	{
		String myName = "이규찬"; // 참조 데이터 타입.
		
		int age = 26; // 기본 데이터 타입.
		double height = 174.8;
		int mathScore, engScore;
		mathScore = 80;
		engScore = 90;
		char firstChar = myName.charAt(0);
		
		
		System.out.println(firstChar);
		System.out.println((int)firstChar);
		
		System.out.println(myName+"의 나이는 "+age+"살, 키는 "+height+"cm, 수학점수와 영어점수의 합은 "+(mathScore+engScore)+"입니다.");
	}
}
