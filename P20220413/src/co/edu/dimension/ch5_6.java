package co.edu.dimension;

import java.util.Scanner;

public class ch5_6 
{

	public static void main(String[] args) 
	{
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scn = new Scanner(System.in);
		
		while(run)
		{
			System.out.println("-----------------------------------------------");			
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("-----------------------------------------------");
			System.out.println("선택 > ");
			
			int selectNo = Integer.parseInt(scn.nextLine()); // nextLine() 은 줄문자와 개행문자를 읽어내기 때문에 루프문에서 데이터 대신 엔터키가 인식되는 문제가 일어나지 않음.
			
			if(selectNo == 1)
			{
				if(studentNum != 0)
				{
					System.out.println("이미 학생수를 지정했습니다. 바꾸시겠습니까? 바꾸려면 Y > ");
					String y = scn.nextLine();
					if(y.equals("Y") || y.equals("y"))
					{
						System.out.println("학생 수를 입력하세요 > ");
						studentNum = Integer.parseInt(scn.nextLine());
						System.out.println("학생수> "+studentNum);
					}
					else
					{
						continue;
					}
				}
				System.out.println("학생 수를 입력하세요 > ");
				studentNum = Integer.parseInt(scn.nextLine()); // 성능적으로 nextInt()보다 낫고, 엔터키 문자가 인식되어 데이터가 잘못 입력되는 것을 방지함.
				System.out.println("학생수> "+studentNum);
			}
			else if(selectNo == 2)
			{
				if(studentNum == 0)
				{
					System.out.println("먼저 학생수를 지정하시오");
					continue;
				}
				
				System.out.println("학생 점수를 입력하세요 > ");
				scores = new int[studentNum];
				for(int i=0; i<scores.length;i++)
				{
					scores[i] = scn.nextInt();
					System.out.println("scores["+i+"]> "+scores[i]);
				}
				scn.nextLine(); // 반복하는 동안 엔터키가 문자열로 인식되는 문제를 해결.
			}
			else if(selectNo == 3)
			{
				if(studentNum == 0)
				{
					System.out.println("먼저 학생수를 지정하시오");
					continue;
				}
				else if(scores == null)
				{
					System.out.println("먼저 점수입력을 하세요");
					continue;
				}
				
				System.out.println("학생 번호       점수");
				for(int i=0; i<scores.length; i++)
				{
					System.out.println((i+1)+"번 학생        "+scores[i]);
				}
			}
			else if(selectNo == 4)
			{
				if(studentNum == 0)
				{
					System.out.println("먼저 학생수를 지정하시오");
					continue;
				}
				else if(scores == null)
				{
					System.out.println("먼저 점수입력을 하세요");
					continue;
				}
				
				int maxVal=0, sum=0;
				
				for(int i=0; i<scores.length; i++)
				{					
					sum += scores[i];
					if(maxVal < scores[i])
					{
						maxVal = scores[i];
					}
				}
				System.out.println("최고 점수 : "+maxVal);
				System.out.printf("평균 점수 : %.2f%n",(double)(sum/scores.length));
			}
			else if(selectNo == 5)
			{
				System.out.println("프로그램 종료!!!");
				run = false;
			}
		}
	}

}
