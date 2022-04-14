package co.edu;

public class CalExample 
{

	public static void main(String[] args) 
	{
		Calculator cal = new Calculator();
		cal.printPi();
		cal.getArea(10.0);
		int sum = cal.sum(10, 50);
		System.out.println("두 수의 합 : "+sum);
		double sum2 = cal.sum(10.0, 50.0);
		System.out.println("두 수의 합 : "+sum2);
		double tArea = cal.getTriangleArea(15, 15);
		System.out.println("삼각형 넓이 : "+tArea);
		int[] intArr = {10,20,30,40,50};
		int resultArr = cal.sum(intArr);
		System.out.println("배열의 합: "+resultArr);
		double resultArr2 = cal.average(intArr);
		System.out.println("배열의 평균: "+resultArr2);
		double avg2 = cal.average(10, 20, 25);
		System.out.println("세 개의 수의 평균 : "+avg2);
		double avg3 = cal.average(10, 20); // int... args로 인해 가능.
		System.out.println("세 개의 수의 평균 : "+avg3);
	}
	

}
