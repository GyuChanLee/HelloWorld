package co.edu.collection.generic;

import java.util.ArrayList;

import co.edu.friend.Friend;

class Orange
{
	
}

public class BoxExample
{
	public static void main(String[] args) 
	{
		Box<String> box = new Box<String>(); // 매개값, 리턴값을 <String>을 타입으로 사용하겠다는 뜻 > 제네릭스.
		box.setField("Orange");
		String result = (String) box.getField();
		
//		Orange orange = (orange) box.getField(); // ClassCastException > 맞지 않는 값을 억지로 변환해서 에러.
		
		Box<Integer> box2 = new Box<Integer>();
		box2.setField(10);
		int result2 = (int) box2.getField();
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("이규찬");
//		list.add(11);  // Error!
		
		ArrayList<Friend> friends = new ArrayList<Friend>();
		friends.add(new Friend("아규찬","111"));
		
		System.out.println("End of Program");
	}
}
