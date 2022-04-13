package co.edu.dimension;

public class Array2Example_training1 
{

	public static void main(String[] args) 
	{
		int arr[][] = new int[5][5];
		
		
		int x = 1;
		for(int i=0; i<5;i++)
		{
			for(int j=0; j<5; j++)
			{
				arr[i][j] = x++;
				System.out.printf("[%2d]",arr[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("#####################################");
		for(int i=0; i<5;i++)
		{
			for(int j=0; j<5; j++)
			{
				System.out.printf("[%2d]",arr[j][i]);
			}
			System.out.println();
		}
		System.out.println();
		
		// 배열에서는 인덱스 주소값으로 값을 지정, 호출.
//		for(int i=4; i>=0;i--)
//		{
//			for(int j=0; j<5; j++)
//			{
//				System.out.printf("[%2d]",arr[i][j]);
//			}
//			System.out.println();
//		}
	}

}
