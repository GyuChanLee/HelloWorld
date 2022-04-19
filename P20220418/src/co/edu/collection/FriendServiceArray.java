package co.edu.collection;

import java.util.*;
import co.edu.friend.Friend;

public class FriendServiceArray implements FriendService // 배열
{
	Friend[] friends = new Friend[10];

	@Override
	public void addFriend(Friend friend) 
	{
		for(int i=0; i< friends.length; i++)
		{
			if(friends[i]==null)
			{
				friends[i] = friend;
				return;
			}
		}
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
		
		for(int i=0; i<friends.length; i++)
		{
			if(friends[i]!=null && friends[i].getName().equals(friend.getName()))
			{
				friends[i] = modFriend;
			}
		}
		
		System.out.println("친구 정보수정 완료!");
		System.out.println();
	}

	@Override
	public void remFriend(String name) 
	{
		for(int i=0; i<friends.length; i++)
		{
			if(friends[i]!=null && friends[i].getName().equals(name))
			{
				friends[i] = null;
			}
		}
		
		System.out.println("친구 삭제 완료");
		System.out.println();
	}

	@Override
	public Friend findFriend(String name) 
	{
		
		for(int i=0; i<friends.length; i++)
		{
			if(friends[i]!=null && friends[i].getName().equals(name))
			{
				return friends[i];
			}
		}
		return null;
	}
	
}
