package ch4.training;

import java.util.Scanner;

public class Homework_rocksciossorspaper 
{

	public static void main(String[] args) 
	{
		int scissors = 1, rock = 2, paper = 3;
		int rand = (int)(Math.random()*3)+1;
		Scanner scn = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("가위 바위 보 게임 시작합니다. 뭐 낼 건지 생각하세요... ");
			System.out.println("1 : 가위, 2 : 바위, 3 : 보 !!");
			int user = scn.nextInt();
			
			if((user==1 && rand==3))
			{
				System.out.println("당신이 이겼습니다!  상대의 패 : "+rand+"  (1:가위,2:바위,3:보)");
				break;
			}
			else if((user==3 && rand==1))
			{
				System.out.println("당신이 졌습니다!  상대의 패 : "+rand+"  (1:가위,2:바위,3:보)");
				break;
			}
			else if(user>rand)
			{
				System.out.println("당신이 이겼습니다!  상대의 패 : "+rand+"  (1:가위,2:바위,3:보)");
				break;
			}
			else if(user<rand)
			{
				System.out.println("당신이 졌습니다!  상대의 패 : "+rand+"  (1:가위,2:바위,3:보)");
				break;
			}
			else
			{
				System.out.println("비겼습니다. 다시 한번 더 합니다!");
			}
		}
		System.out.println("가위 바위 보 게임 종료!");
		
	}

}
//[이규찬] [오후 5:35] 2. 가위바위보 게임 1:가위 2:바위 3:보
//[이규찬] [오후 5:35] 사용자 입력값 1:가위 2:바위 3:보
//[이규찬] [오후 5:35] 이기는 경우 : 1=2, 2=3, 3=1의 경우
//[이규찬] [오후 5:35] 이외의 경우는 다 짐.
//[이규찬] [오후 5:36] 같으면 비김.
//[이규찬] [오후 5:36] 예시 출력 : 가위(1) -> You Win / You lose