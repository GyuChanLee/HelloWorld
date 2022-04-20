package co.edu.nested;

import java.util.Scanner;

class Friend
{
	private String name;
	private String phone;
	private int age;
	
	public Friend() {}
	
	public Friend(String name, String phone, int age) 
	{
		super();
		this.name = name;
		this.phone = phone;
		this.age = age;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getPhone()
	{
		return phone;
	}
	public void setPhone(String phone)
	{
		this.phone = phone;
	}
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	
	@Override
	public String toString() 
	{
		return "Friend [name=" + name + ", phone=" + phone + ", age=" + age + "]";
	}
	
	
}


// 중첩 클래스, 중첩 인터페이스
public class NestedApp 
{
	static Scanner scn = new Scanner(System.in);
	static Friend[] friends = new Friend[10];
	
	// 중첩 인터페이스 > 클래스 내에 모든 기능을 정의.
	interface FriendService
	{
		int ADD = 1;
		int MOD = 2;
		int LIST = 3;
		
		void add();
		void mod();
		void list();
	}
	
	// 중첩 클래스
	static class FriendApp implements FriendService
	{

		@Override
		public void add() 
		{
			System.out.println("친구이름 입력 > ");
			String name = scn.nextLine();
			System.out.println("친구연락처 입력 > ");
			String phone = scn.nextLine();
			System.out.println("친구나이 입력 > ");
			int age = Integer.parseInt(scn.nextLine());
			Friend fr = new Friend(name,phone,age);
			
			for(int i=0; i<friends.length; i++)
			{
				if(friends[i]==null)
				{
					friends[i] = fr;
					break;
				}
			}
		}

		@Override
		public void mod() 
		{
			System.out.println("수정할 친구이름 입력 > ");
			String name = scn.nextLine();
			for(int i=0; i<friends.length; i++)
			{
				if(friends[i]!=null && friends[i].getName().equals(name))
				{
					System.out.println(friends[i].toString());
					System.out.println("수정할 연락처 입력 >");
					String phone = scn.nextLine();
					System.out.println("수정할 나이 입력 >");
					int age = Integer.parseInt(scn.nextLine());
					
					friends[i].setPhone(phone);
					friends[i].setAge(age);
				}
			}
		}

		@Override
		public void list() 
		{ 
			// 배열에 저장된 값을 출력.
			System.out.println("찾을 친구의 이름을 입력 > ");
			String name = scn.nextLine();
			boolean yes = false; 
			
			for(int i=0; i<friends.length; i++)
			{
				if(friends[i]!=null && friends[i].getName().equals(name))
				{
					System.out.println(friends[i].toString());
					yes= true;
				}
			}
			if(yes==false)
			{
				System.out.println("일치하는 친구가 없습니다!");
			}
		}
		
		public void listAll() 
		{ 
			for(int i=0; i<friends.length; i++)
			{
				if(friends[i]!=null)
				{
					System.out.println((i+1)+"번째 친구 정보: "+friends[i].toString());
				}
			}
		}
		
	}
	
	public static void main(String[] args) 
	{
		FriendApp app = new FriendApp();
		
		while(true)
		{
			System.out.println("1.친구추가  2.친구수정  3.리스트  4.모든리스트  그외 종료");
			int menu = Integer.parseInt(scn.nextLine());
			
			if(menu==FriendService.ADD)
			{
				app.add();
			}
			else if(menu==FriendService.MOD)
			{
				app.mod();
			}
			else if(menu==FriendService.LIST)
			{
				app.list();
			}
			else if(menu==4)
			{
				app.listAll();
			}
			else
			{
				break;
			}
		}
	}
}
