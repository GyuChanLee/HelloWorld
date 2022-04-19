package co.edu.collection;

import java.util.ArrayList;
import java.util.Scanner;

import co.edu.friend.Friend;

public class FriendServiceList implements FriendService // 컬렉션
{
	ArrayList<Friend> friends = new ArrayList<Friend>();

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

}
