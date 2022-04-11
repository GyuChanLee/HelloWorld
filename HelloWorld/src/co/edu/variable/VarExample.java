package co.edu.variable;

public class VarExample // 관습상 클래스 이름은 대문자로 시작
{
	public static void main(String[] args) 
	{
		// 변수의 선언
		int age = 27; // 대입값을 변수에 할당
		double height = 174.8;
		String myName = "이규찬";
		
		age = 23;
		
		System.out.printf("내이름은 %s,나이는 %d, 키는 %f%n",myName,age,height);
		System.out.println("내이름은 "+myName);
		System.out.println("나이는 "+age+"살 입니다.");
		System.out.println("키는 "+height+"입니다.");
		
		// 영어 점수 85점, engScore에 담기.
		int engScore = 85;
		int mathScore = 90;
		
		int result = engScore + mathScore;
		
		engScore = 80;
		mathScore = 70;
		
		result = engScore + mathScore;
		
		System.out.println("영어 점수 :"+engScore+" 수학 점수 :"+mathScore+" 의 합 : "+result);
	}
}