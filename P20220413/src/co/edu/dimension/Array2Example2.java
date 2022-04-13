package co.edu.dimension;

public class Array2Example2 
{

	public static void main(String[] args) 
	{
		// 학급 1-3반 > 1반:3명, 2반:4명, 3반:2명 > 각각 점수 얻기.
		int[][] scores = {
							{59, 63, 72},   // 1반
							{56, 77,33,24}, // 2반
							{55,76}         // 3반
						 };       
		
		System.out.println(scores[0][0]);
		System.out.println(scores[0][1]);
		System.out.println(scores[0][2]);
		System.out.println();
		System.out.println(scores[0].length);
		System.out.println(scores[1].length);
		System.out.println(scores[2].length);
		System.out.println();
		// 각반의 총점과 평균 구하기.
		
		for(int i=0; i<scores.length;i++)
		{
			int sum = 0;
			double avg = 0.0;
			
			for(int j=0; j<scores[i].length; j++)
			{
				sum += scores[i][j];
				avg = 1.0 * sum / scores[i].length;
			}
			System.out.println((i+1)+"반의 총점 : "+sum+", 평균 : "+avg);
			System.out.println();
		}
	}

}
