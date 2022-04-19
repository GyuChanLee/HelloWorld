package co.edu.collection;

import co.edu.friend.Friend;
import java.util.Scanner;

// 친구목록을 저장하기 위한 App.
// 추가, 수정, 삭제, 조회.
// 1버전> 배열, 2버전> 컬렉션 ==> 인터페이스 구현.
public class FriendApp
{
	public static void main(String[] args) 
	{
		// 추가, 수정, 삭제, 조회 => 컨트롤 역할.
		// FriendService  > 인터페이스, FriendServiceArray, FriendServiceList.
		// service. 추가~ > 각각의 클래스를 사용해도 돌아가도록.
		Scanner scn = new Scanner(System.in);
//		FriendService service = new FriendServiceArray();
		FriendService service = new FriendServiceList();
		
		while(true)
		{
			System.out.println("1.친구추가  2.친구수정  3.친구삭제  4.친구조회");
			int menu = Integer.parseInt(scn.nextLine());
			
			if(menu==1)
			{
				System.out.println("추가할 친구의 이름과 연락처를 입력 > ");
				String name = scn.next();
				String phone = scn.nextLine();
				Friend addFriend = new Friend(name, phone);
				service.addFriend(addFriend);
			}
			else if(menu==2)
			{
				System.out.println("수정할 친구의 이름과 연락처를 입력 > ");
				String name = scn.next();
				String phone = scn.nextLine();
				Friend modFriend = new Friend(name, phone);
				service.modFriend(modFriend);
			}
			else if(menu==3)
			{
				System.out.println("삭제할 친구 이름을 입력 > ");
				String search = scn.nextLine();
				service.remFriend(search);
			}
			else if(menu==4)
			{
				System.out.println("조회할 친구 이름을 입력 > ");
				String search = scn.nextLine();
				Friend findOne = service.findFriend(search);
				if(findOne!=null)
				{
					System.out.println(findOne.toString());
				}
				else
				{
					System.out.println("찾으려는 값이 없습니다");
				}
				
			}
			else
			{
				System.out.println("End Of Program");
				break;
			}
		}
		
	}
}
