package co.edu.array;

import java.util.Scanner;

public class ArrayExample6 
{

	public static void main(String[] args) 
	{
		// 학생이름, 점수를 담기. 각각의 배열 선언.
		String[] student = new String[3];
		int[] scores = new int[3];

		for (int i = 0; i < student.length; i++)
		{
			System.out.println((i + 1) + "번째 학생의 이름을 입력하세요 > ");
			Scanner scn2 = new Scanner(System.in);
			student[i] = scn2.nextLine();

			System.out.println(student[i] + " 학생의 점수를 입력하세요 > ");
			scores[i] = scn2.nextInt();
			scn2.nextLine();
		}

		while (true) 
		{
			System.out.println("조회할 학생의 이름을 입력하세요(종료 시 \"종료\"입력) > ");
			Scanner scn1 = new Scanner(System.in);
			String searchName = scn1.nextLine();
			for (int i = 0; i < student.length; i++) 
			{
				if (student[i].equals(searchName)) 
				{
					System.out.println(student[i] + "학생의 점수 : " + scores[i]);
				}
			}
			if (searchName.equals("종료")) 
			{
				System.out.println("종료합니다!!");
				break;
			}
		}
	}

}
