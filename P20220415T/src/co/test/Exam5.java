package co.test;

import java.util.*;

// 종합.
// 클래스의 인스턴스와 배열의 활용.
// 친구의 소중한 정보를 관리하는 앱을 구현하세요.
// Exam4(친구정보) 클래스의 인스턴스를 저장, 수정, 삭제, 조회 처리.
// 2. 수정 > 이름을 찾아서 연락처를 바꾸기.
// 3. 삭제 > 이름을  찾아서 null 넣기
// System.out.println("1.추가 2.수정(이름, 연락처) > 그냥 중복 안따지고 수정. 3.삭제(이름) 4.조회(이름 > 중복 시 다 가져오기.) 5.종료");


// 친구 인스턴스 하나를 삭제하고 다시 조회하고 새로 같은 이름의 객체 추가할때 오류생김.

public class Exam5 {
	public static void main(String[] args) {
		
		Exam4[] friends = new Exam4[100];

		while (true) {
			System.out.println("1.추가  2.수정  3.삭제  4.조회  5.종료");
			System.out.println("선택 > ");
			Scanner scn = new Scanner(System.in);
			int menu = Integer.parseInt(scn.nextLine());
			
			if(menu == 1) // 추가
			{
				System.out.println("추가할 친구의 이름을 입력 > ");
				String name = scn.nextLine();
				System.out.println("추가할 친구의 생일을 입력 > ");
				String birth = scn.nextLine();
				System.out.println("추가할 친구의 연락처를 입력 > ");
				String phone = scn.nextLine();
				
				Exam4 addFriend = new Exam4(name,birth,phone);
				
				for(int i=0; i<friends.length; i++)
				{
					if(friends[i] == null)
					{
						friends[i] = addFriend;
						break;
					}
				}
			}
			else if(menu == 2) // 수정
			{
				System.out.println("수정할 친구의 이름을 입력 > ");
				String modName = scn.nextLine();
				
				for(int i=0; i<friends.length; i++)
				{
					if(friends[i]!=null && friends[i].getName().equals(modName))
					{
						String tmp = friends[i].getName();
						System.out.println(tmp+"의 변경할 연락처를 입력 > ");
						String modPhone = scn.nextLine();
						friends[i].setPhone(modPhone);
					}
				}
				System.out.println("연락처 수정 완료!!");
			}
			else if(menu == 3) // 삭제
			{
				System.out.println("삭제할 친구의 이름을 입력 > ");
				String delName = scn.nextLine();
				
				for(int i=0; i<friends.length;i++)
				{
					if(friends[i]!=null && friends[i].getName().equals(delName))
					{
						friends[i] = null;
					}
				}
				System.out.println("친구의 정보를 삭제 완료!!");
			}
			else if(menu == 4) // 조회
			{
				System.out.println("조회할 친구의 이름을 입력 > ");
				String searchName = scn.nextLine();
				
				System.out.println("친구 이름         생일       연락처  ");
				System.out.println("========================================");
				for(int i=0; i<friends.length;i++)
				{
					if(friends[i]!=null && friends[i].getName().equals(searchName))
					{
						friends[i].showInfo();
					}
				}
			}
			else if(menu == 5) // End
			{
				System.out.println("프로그램 종료!");
				break;
			}
			else
			{
				System.out.println("1-5번 중에서 고르세요.");
			}
		}
//		System.out.println("end of prog.");
	}
}
