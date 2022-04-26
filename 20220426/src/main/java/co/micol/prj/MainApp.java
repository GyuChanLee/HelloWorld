package co.micol.prj;

import co.micol.prj.listTest.ListTest;
import co.micol.prj.listTest.MapTest;
import co.micol.prj.listTest.SetTest;

public class MainApp
{
	public static void main(String[] args) // 메인 메서드는 늘 자바프로젝트의 시작과 끝을 담당.
	{
		ListTest list = new ListTest();
		list.listTest();
		System.out.println("==================================");
		list.studentList();
		System.out.println("==================================");
		SetTest setTest = new SetTest();
		setTest.setTest();
		System.out.println("==================================");
		MapTest mapTest = new MapTest();
		mapTest.mapTest();
		System.out.println("==================================");
		mapTest.studentMap();
	}
}
