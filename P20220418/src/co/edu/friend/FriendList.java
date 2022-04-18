package co.edu.friend;

import java.util.*;

public class FriendList 
{

	public static void main(String[] args) 
	{
		Friend[] friends = new Friend[10];
//		friends[0] = new UnivFriend("이규찬", "010-0111-0001", "영남대", "경영학과");
//		friends[1] = new ComFriend("김규찬", "001-0041-0011", "대구텍", "전산실");
//		friends[2] = new Friend("박규찬", "017-4302-2433");
		
		while(true)
		{
			System.out.println("1.친구등록  2.리스트  3.조회(이름)  4.종료");
			Scanner scn = new Scanner(System.in);
			int menu = Integer.parseInt(scn.nextLine());
			
			if(menu==1)
			{
				System.out.println("등록할 친구의 유형을 입력 (1.친구 2.학교 3.회사) > ");
				int type = Integer.parseInt(scn.nextLine());
				
				for(int i=0; i<friends.length;i++)
				{					
					if(type<=0 || type>3)
					{
						System.out.println("1-3번 중 하나를 고르세요!!");
						System.out.println();
						break;
					}
					else if(friends[i]==null)
					{
						System.out.println("등록할 친구의 이름을 입력 > ");
						String name = scn.nextLine();
						System.out.println("등록할 친구의 연락처를 입력 > ");
						String num = scn.nextLine();
						if(type==1)
						{
							friends[i] = new Friend(name,num);
							System.out.println("친구 등록 완료!");
							System.out.println();
							break;
						}
						else if(type==2)
						{
							System.out.println("등록할 친구의 대학교를 입력 > ");
							String univ = scn.nextLine();
							System.out.println("등록할 친구의 전공을 입력 > ");
							String major = scn.nextLine();
							friends[i] = new UnivFriend(name, num, univ, major);
							
							System.out.println("대학 친구 등록 완료!");
							System.out.println();
							break;
						}
						else if(type==3)
						{
							System.out.println("등록할 친구의 회사를 입력 > ");
							String com = scn.nextLine();
							System.out.println("등록할 친구의 부서를 입력 > ");
							String depart = scn.nextLine();
							friends[i] = new ComFriend(name, num, com, depart);
							
							System.out.println("직장 친구 등록 완료!");
							System.out.println();
							break;
						}
					}
				}
			}
			else if(menu==2)
			{
				for(int i=0; i<friends.length;i++)
				{
					if(friends[i]!=null)
					{
						System.out.println((i+1)+"번째 친구 정보 : "+friends[i].toString());
						System.out.println();
					}
				}
			}
			else if(menu==3)
			{
				System.out.println("조회할 친구 이름을 입력 > ");
				String searchName = scn.nextLine();
				
				for(int i=0; i<friends.length;i++)
				{
					if(friends[i]!=null && friends[i].getName().equals(searchName))
					{
						System.out.println("친구 정보 : "+friends[i].toString());
						System.out.println();
					}
				}
			}
			else if(menu==4)
			{
				System.out.println("프로그램 종료!");
				break;
			}
		}
	}

}
