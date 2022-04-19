package co.edu.collection;

import co.edu.friend.Friend;

public interface FriendService
{
	void addFriend(Friend friend);
	void modFriend(Friend friend);
	void remFriend(String name); // 이름 조회 후, 삭제.
	Friend findFriend(String name); // 이름 조회, 한건 목록.
}
