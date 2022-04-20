package co.edu.collection;

import java.util.ArrayList;
import java.util.Scanner;

import co.edu.friend.Friend;
import co.edu.friend.Gender;

public class FriendServiceList implements FriendService // 컬렉션
{
	ArrayList<Friend> friends = new ArrayList<Friend>(); // <> 제네릭으로 Friend 객체만 매개변수, 리턴값으로 사용.

	@Override
	public void addFriend(Friend friend) 
	{
		friends.add(friend);
	}

	@Override
	public void modFriend(Friend friend) 
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("바꿀 이름을 입력");
		String nameMod = scn.nextLine();
		System.out.println("바꿀 연락처를 입력");
		String phone = scn.nextLine();
		Friend modFriend = new Friend(nameMod, phone);
		
		for(int i=0; i<friends.size(); i++)
		{
			if(friends.get(i).getName().equals(friend.getName()))
			{
				friends.set(i, modFriend);
			}
		}
		System.out.println("친구 정보수정 완료!");
		System.out.println();
	}

	@Override
	public void remFriend(String name) 
	{
		for(int i=0; i<friends.size(); i++)
		{
			if(friends.get(i).getName().equals(name))
			{
				friends.remove(i);
			}
		}
	}

	@Override
	public Friend findFriend(String name) 
	{
		for(int i=0; i<friends.size(); i++)
		{
			if(friends.get(i).getName().equals(name))
			{
				return friends.get(i);
			}
		}
		return null;
	}
	
	@Override
	public ArrayList<Friend> findGender(Gender gender)
	{
		ArrayList<Friend> list = new ArrayList<Friend>();
		
		for(int i=0; i<friends.size();i++)
		{
			if(friends.get(i).getGender() == gender)
			{
				// 열거형 타입 > 클래스 타입과 같은 참조형 데이터 타입.
				// 기본타입 == 비교 연산자.
				// 열거형 == 비교 연산자 사용.
				list.add(friends.get(i));
			}
		}
		return list;
	}

}
