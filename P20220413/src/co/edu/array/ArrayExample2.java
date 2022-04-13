package co.edu.array;

public class ArrayExample2 
{

	public static void main(String[] args) 
	{
		int[] intAry = {10, 20, 30, 40, 50};
		
		int max = 0;
		int sum = 0;
		for(int i=0; i<5; i++) // 인덱스를 이용하여 배열 요소들을 하나씩 출력.
		{
			sum += intAry[i];
			System.out.println(intAry[i]);
			if(max < intAry[i])
			{
				max = intAry[i];
			}
		}
		System.out.println("최대 값 : "+max);
		System.out.println("합계 : "+sum);
		
	}

}
