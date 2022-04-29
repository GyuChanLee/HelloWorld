package co.dodo.prj.game;

import java.util.*;

public class MagicSquare 
{
	private int size;
	private Scanner scn = new Scanner(System.in);
	
	private void magicSquare()
	{
		System.out.println("홀수 마방진 사이즈 선택 > ");
		size = scn.nextInt();
		
		System.out.println(size+"차 마방진 ");
		int[][] arr = new int[size][size];
		for(int i=0, j=size / 2, num=1; num<size*size; num++)
		{
			arr[i][j] = num;
			if(num%size==0)
			{
				i++;
			}
			else
			{
				i--; 
				j++;
			}
			
			if(i<0)
			{
				i = size - 1;
			}
			if(j>(size-1))
			{
				j=0;
			}
		}
		toPritnt(arr);
		scn.close();
	}
	
	private  void toPritnt(int[][] arr)
	{
		for(int[] num : arr)
		{
			for(int num2 : num)
			{
				System.out.printf(" %2d ",num2);
			}
			System.out.println();
		}
	}
	
	public void run()
	{
		magicSquare();
	}
}
