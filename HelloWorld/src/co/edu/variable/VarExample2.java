package co.edu.variable;

public class VarExample2 
{
	public static void main(String[] args) 
	{
		// 국어 85, 영어 70, 수학 69
		int kor = 80;
		int eng = 70;
		int math = 63;
		// 평균 변수 선언, + - / * % ()
		int avg = (kor + eng + math) / 3;
		
		// 값 변경
		kor = 85;
		eng = 75;
		math = 60;
		
		double avg2 = (85 + 75 + 60) / 3.0f;
		
		System.out.println("국어 영어 수학의 평균 : "+avg2+"입니다");
	}
}
