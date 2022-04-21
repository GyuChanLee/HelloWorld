package co.edu.api;

import java.util.HashSet;

class Member
{
	String name;
	int age;
	
	Member(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	@Override
	public int hashCode() // 중복값 체크
	{
		return super.hashCode();
//		return this.age;
	}
	
	@Override
	public boolean equals(Object obj) // 중복값 체크
	{
//		if(obj instanceof Member)
//		{
//			Member member = (Member) obj;
//			return member.name.equals(member.name);
//		}
//		return false;
		return super.equals(obj);
	}
	
	// 객체비교 : hashcode와 equals가 같으면 논리적 동등 이라고 봄.
}

public class ObjectExample 
{

	public static void main(String[] args) 
	{
		// ArrayList - 인덱스 기준으로 요소를 구분 -> 중복된 값 저장.
		// Set 컬렉션(집합) - 요소들의 값으로 구분 -> 중복된 값 X
		
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(100);
		set.add(200);
		set.add(300);
		set.add(200); // 중복값 허용 X. 덮어씌워짐.
		System.out.println(set.size());
		System.out.println();
		
		HashSet<Member> members = new HashSet<>();
		Member me = new Member("이규찬",26);
		members.add(new Member("이규찬",26));
		members.add(new Member("김규찬",22));
		members.add(new Member("박규찬",20));
		members.add(new Member("이규찬",26));
		members.add(me);
		System.out.println("members의 요소 개수 : "+members.size()); // 중복값 제외.
		System.out.println();
		System.out.println("이규찬".hashCode()); // String 클래스에서 내용이 같으면 hashcode값이 같도록 오버라이딩.
		System.out.println("이규찬".hashCode());
		
	}

}
