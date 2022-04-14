package co.edu;

public class Calculator 
{
	private double pi = 3.14;
	
	
	// 리턴타입이 없는 것.
	void printPi()
	{
		System.out.println("원주율은 "+pi);
	}
	
	void getArea(double radius)
	{
		double area =pi*radius*radius;
		System.out.println("반지름 "+radius+"의 넓이 : "+area);
	}
	
	//리턴타입이 있는 것.
	int sum(int x, int y)
	{
		return x + y;
	}
	// 오버로딩 : 동일한 이름의 메서드를 정의 가능 > 매개변수의 타입 or 개수가 달라야함.
	double sum(double x, double y) // 매개변수의 타입의 값이 다름
	{
		return x+y;
	}
	// 오버로딩의 예 : println() 메서드.
	
	// 밑변과 높이를 입력 > 삼각형의 넓이를 계산하는 메서드
	double getTriangleArea(double w, double h)
	{
		double tArea = w*h/2.0;
		return tArea;
	}
	
	// 매개변수 클래스, 배열,
	int sum(int[] arr)
	{
		int sum = 0;
		for(int i=0; i<arr.length; i++)
		{
			sum += arr[i];
		}
		return sum;
	}
	
	// 평균을 계산.
	double average(int n1, int n2, int n3) 
	{
		return (n1+n2+n3)/3.0;
	}
	
	// 매개변수 개수를 모를 때 > 배열 활용
//	double average(int[] arr)
//	{
//		int sum = 0;
//		for(int i=0; i<arr.length;i++)
//		{
//			sum += arr[i];
//		}
//		double avg=sum/arr.length*1.0;
//		return avg;
//	}
	// int 배열을 매개변수로 받는 것과 같은 효과. > 매개변수의 개수를 모를 때 효과적!! 
	// 매개변수 개수가 배열형식이 아닌 변수 개수 몇 개만 적어도 알아서 목록을 읽어서 실행 가능 > 배열을 넣어도 가능 (배열타입이기 때문.)
	double average(int... args)
	{
		int sum = 0;
		for(int i=0; i<args.length;i++)
		{
			sum += args[i];
		}
		double avg=sum/args.length*1.0;
		return avg;
	}
	
	double average(double... args)
	{
		int sum = 0;
		for(int i=0; i<args.length;i++)
		{
			sum += args[i];
		}
		double avg=sum/args.length*1.0;
		return avg;
	}
}
