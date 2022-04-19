package co.edu.collection;
// 배열 vs 컬렉션 프레임워크
// 배열활용 프로그램 vs 컬렉션 활용 프로그램
// 공통된 규칙 적용 > 인터페이스 구현.
import java.util.*;
import co.edu.friend.*;

public class ArrayExample 
{
	public static void main(String[] args) 
	{
		// Array > 크기 변경 불가능. vs collection > 크기 변경 가능.
		Friend[] friendArr = new Friend[10];
		friendArr[0] = new Friend("이규찬","010-1111");
		friendArr[1] = new Friend("김규찬","010-1112");
		friendArr[2] = null;
		
		for(int i=0; i<friendArr.length;i++)
		{
			if(friendArr[i]!=null)
				System.out.println(friendArr[i].toString());
		}
		System.out.println("Array");
		System.out.println();
		
		
		// collection : 인터페이스 => List컬렉션 -> ArrayList
		ArrayList<Friend> friendList = new ArrayList<Friend>(); // ArrayList 객체 생성, <> : 제네릭스.
		friendList.add(new Friend("박규찬","010-1113")); // 추가.
		friendList.add(new Friend("최규찬","010-1114"));
		friendList.remove(0); // 삭제(인덱스값). > 삭제후 빈값을 뒤의 값을 밀어넣어 없도록 함.
		
		for(int i=0; i<friendList.size(); i++) // size() 메서드로 크기 활용.
		{
			System.out.println(friendList.get(i)); // get()메서드로 인덱스값에 있는 값을 가져옴.
		}
		System.out.println();
		System.out.println(friendList.isEmpty()); // ArrayList가 빈값인지 확인. boolean 리턴.
		
		Friend f1 = (Friend)friendList.get(0); // get(idx) > return값은 Object -> 캐스팅 필요!!! or 제네릭 사용.
		System.out.println();
		System.out.println(f1);
	}
}
