package co.edu.collection;

import java.util.ArrayList;

import co.edu.friend.Friend;
import co.edu.friend.Gender;

public interface FriendService
{
	public final static int ADD = 1;
	public final static int MOD = 2;
	public final static int SEARCH = 3;
	public final static int ONELIST = 4;
	
	void addFriend(Friend friend);
	void modFriend(Friend friend);
	void remFriend(String name); // 이름 조회 후, 삭제.
	Friend findFriend(String name); // 이름 조회, 한건 목록.
	public ArrayList<Friend> findGender(Gender gender);
}
