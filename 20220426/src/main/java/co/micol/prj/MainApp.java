package co.micol.prj;

import co.micol.prj.listTest.ListTest;

public class MainApp
{
	public static void main(String[] args) 
	{
		ListTest list = new ListTest();
		list.listTest();
		System.out.println("==================================");
		list.studentList();
	}
}
