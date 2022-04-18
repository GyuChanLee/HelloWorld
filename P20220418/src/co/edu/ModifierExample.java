package co.edu;

import co.edu.friend.*;
public class ModifierExample {
	
	class Friend2 extends Friend // 상속관계
	{
		public Friend2()
		{
			super(); // 부모 클래스의 protected 생성자 사용 가능.
		}
	}

	public static void main(String[] args) 
	{
//		Friend f = new Friend(); // default - 다른 패키지 접근 X, protected - 다른 패키지에서 접근 불가. 상속관계 필요
//		f.getName();
	}

}
