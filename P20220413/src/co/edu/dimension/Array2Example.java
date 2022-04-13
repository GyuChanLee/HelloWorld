package co.edu.dimension;

import java.util.Arrays;

public class Array2Example
{

	public static void main(String[] args) 
	{
		int[][] intAry = new int[4][3];
		
		intAry[0][0] = 10;
		intAry[1][0] = 20;
		intAry[2][0] = 30;
		intAry[3][2] = 100;

		for(int i=0; i<intAry.length; i++)
		{
			for(int j=0; j<intAry[i].length; j++)
			{
				System.out.printf("[%3d]",intAry[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		System.out.println(Arrays.deepToString(intAry));
	}

}
