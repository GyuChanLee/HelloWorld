package co.edu;

import java.util.Scanner;

public class MemberEx 
{

	public static void main(String[] args) 
	{
		Member[] members = new Member[3];
		Scanner scn = new Scanner(System.in); //Scanner 클래스는 기본 생성자 X
		
		for(int i=0; i<members.length; i++)
		{
			System.out.println("회원 생성 : 회원 아이디, 이름, 연락처, 나이 순 입력 > ");
			String id = scn.next();
			String name = scn.next();
			String phone = scn.next();
			int age = Integer.parseInt(scn.next());
			Member newMember = new Member(id,name,phone,age);
			members[i] = newMember;
		}
		
		// 1 이름조회, 2.연락처 변경 3. 나이 큰 회원 조회 4.종료
		while(true)
		{
			System.out.println("Menu : 1.이름조회  2.연락처 변경  3.나이 큰 사람 조회  4.종료");
			int menu = scn.nextInt();//Integer.parseInt(scn.nextLine());
			scn.nextLine();
					
			if(menu==1)
			{
				System.out.println("찾고 싶은 이름 입력 > ");
				String searchName = scn.nextLine();
				for(int i=0; i<members.length;i++) // 향상된 for문 이용 가능.
				{
					if(members[i].getMemberName().equals(searchName))
					{
						System.out.printf("%s님의 회원 정보 :%n",searchName);
						members[i].showInfo();
						System.out.println();
					}
				}
			}
			else if(menu==2)
			{
				System.out.println("설정하고 싶은 회원의 아이디를 쓰세요 (연락처 변경) > ");
				String searchId = scn.nextLine();
				for(int i=0; i<members.length;i++)
				{
					if(members[i].getMemberId().equals(searchId))
					{
						System.out.println("변경할 연락처를 적으세요. 현재 연락처: "+members[i].getMemberPhone());
						String chPhone = scn.nextLine();
						members[i].setMemberPhone(chPhone);
						break; // 이미 원하는 id값을 찾았으니 더이상 루프를 돌지않도록 함 > id값은 유일한 한개의 값이라는 가정.
					}
				}
			}
			else if(menu==3)
			{
				System.out.println("기준이 될 나이를 입력하세요 > ");
				int searchAge = Integer.parseInt(scn.nextLine());
				
				for(int i=0; i<members.length;i++)
				{
					if(members[i].getMemberAge() > searchAge)
					{
						members[i].showInfo();
						System.out.println();
					}
				}
				System.out.println();
			}
			else if(menu==4)
			{
				System.out.println("End Of Program");
				break;
			}
			else
			{
				for(Member member : members) // 향상된 for문 : (클래스 인스턴스 : 배열)
				{
					member.showInfo();
					System.out.println();
				}
			}
		} // while end
		scn.close();
		
	}// main end

}
