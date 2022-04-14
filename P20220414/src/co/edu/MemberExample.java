package co.edu;

import java.util.Scanner;

public class MemberExample 
{

	public static void main(String[] args) 
	{
//		Member m1 = new Member("user1","이규찬","010-7544-0357",20);
//		m1.showInfo();
//		m1.showInfo();
		
		// m1.memberAge = 11; > 직접 접근 X
//		m1.setMemberAge(0);
//		System.out.println(m1.getMemberAge());
//		m1.setMemberAge(99);
//		System.out.println(m1.getMemberAge());
//		
//		m1.setMemberId("user01");
//		System.out.println(m1.getMemberId());
		
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
		scn.close();
		
		for(Member member : members) // 향상된 for문 : (클래스 인스턴스 : 배열)
		{
			member.showInfo();
			System.out.println();
		}
	}

}
