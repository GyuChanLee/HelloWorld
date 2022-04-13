package co.edu.array;

public class ArrayExample3 
{

	public static void main(String[] args) 
	{
		int[] intAry = {78, 83, 88, 92, 63};
		
		// 각 배열의 요소의 합을 구하기.
		int sum =0;
		double avg = 0.0;
		for(int i=0; i<intAry.length;i++)
		{
			sum += intAry[i];
			System.out.println("중간 합계 : "+sum);
		}
		System.out.println("intAry배열의 합 : "+sum);
		avg = sum / 5.0D;
		System.out.println("intAry배열의 합 : "+avg);
		
		System.out.println();
		System.out.println("######################################");
		System.out.println();
		
		// 1,3,5번째 값의 합과 평균구하기.
		int cnt = 0;
		int sum2 =0;
		double avg2 = 0.0;
		for(int i=0; i<intAry.length;i++)
		{
			if(i%2==0)
			{
				sum2 += intAry[i];
				cnt++;
				System.out.println("중간 합계 : "+sum2);
			}
		}
		System.out.println("intAry배열의 합 : "+sum2);
		avg2 = sum2 / (double)cnt;
		System.out.println("intAry배열의 합 : "+avg2);
		
		System.out.println();
		System.out.println("######################################");
		System.out.println();
		
		// 값이 짝수인 것을 구하기.
		double a = 0.0;
		int sum3 =0;
		double avg3 = 0.0;
		for(int i=0; i<intAry.length;i++)  // array.length : 배열의 길이 구하는 메서드.
		{
			if(intAry[i]%2==0)
			{
				sum3 += intAry[i];
				a++;
				System.out.println("중간 합계 : "+sum3);
			}
		}
		System.out.println("intAry배열의 합 : "+sum3);
		avg3 = sum3 / a;
		System.out.println("intAry배열의 합 : "+avg3);
	}

}
