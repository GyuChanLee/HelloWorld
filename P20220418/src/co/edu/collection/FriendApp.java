package co.edu.collection;

import java.util.ArrayList;
import java.util.Scanner;
import co.edu.friend.Friend;
import co.edu.friend.Gender;

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
		
		while(true) // 추가, 수정, 삭제, 기능 컨트롤 역할
		{
			System.out.println("1.친구추가  2.친구수정  3.친구삭제  4.친구조회  5.성별조회");
			int menu = Integer.parseInt(scn.nextLine());
			
			if(menu== FriendService.ADD)
			{
				System.out.println("추가할 친구의 이름을 입력 > ");
				String name = scn.nextLine();
				System.out.println("추가할 친구의 연락처를 입력 > ");
				String phone = scn.nextLine();
				System.out.println("추가할 친구의 성별을(남 / 여) 입력 > ");
				String gender = scn.nextLine();
				Gender gender1 = Gender.MEN;
				
				if(gender.startsWith("남") || gender.startsWith("M"))
				{
					gender1 = Gender.MEN;
				}
				else if(gender.startsWith("여") || gender.startsWith("W"))
				{
					gender1 = Gender.WOMEN;
				}
				Friend addFriend = new Friend(name, phone, gender1);
				service.addFriend(addFriend);
			}
			else if(menu==FriendService.MOD)
			{
				System.out.println("수정할 친구의 이름과 연락처를 입력 > ");
				String name = scn.next();
				String phone = scn.nextLine();
				Friend modFriend = new Friend(name, phone);
				service.modFriend(modFriend);
			}
			else if(menu==FriendService.SEARCH)
			{
				System.out.println("삭제할 친구 이름을 입력 > ");
				String search = scn.nextLine();
				service.remFriend(search);
			}
			else if(menu==FriendService.ONELIST)
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
			else if(menu == 5)
			{
				System.out.println("알고 싶은 성별을 입력 (남 / 여) > ");
				String findGender = scn.nextLine();
				Gender gender1 = Gender.MEN;
				
				if(findGender.startsWith("남") || findGender.startsWith("M"))
				{
					gender1 = Gender.MEN;
				}
				else if(findGender.startsWith("여") || findGender.startsWith("W"))
				{
					gender1 = Gender.WOMEN;
				}
				ArrayList<Friend> list = service.findGender(gender1);
				for(int i=0; i<list.size(); i++)
				{
					System.out.println(list.get(i)); // toString 오버라이딩으로 자동적으로 toString의 출력값이 나옴 (메모리주소값 X)
				}
				System.out.println();
			}
			else
			{
				System.out.println("End Of Program");
				break;
			}
		}
		
	}
}
