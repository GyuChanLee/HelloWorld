package co.micol.prj.listTest;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import co.micol.prj.dto.StudentVO;

public class ListTest 
{
	public void listTest()
	{
		List<String> list = new ArrayList<String>();
		list.add("이규찬");
		list.add("김규찬");
		list.add("박규찬");
		
		for(String str : list)
		{
			System.out.println(str);
		}
	}
	// arrayList : 순차검색에서 제일 빠름. 중간 추가,삭제는 느림.
	public void studentList()
	{
		List<StudentVO> students = new ArrayList<StudentVO>();
		StudentVO student = new StudentVO();
		student.setStudentId("20220401");
		student.setName("이규찬");
		student.setAge(26);
		student.setGender("M");
		student.setBirthDay(Date.valueOf("1996-01-24"));
		students.add(student);
		
		student = new StudentVO();
		student.setStudentId("20220402");
		student.setName("김규찬");
		student.setAge(20);
		student.setGender("F");
		student.setBirthDay(Date.valueOf("1996-01-24"));
		students.add(student);
		
		for(StudentVO vo : students)
		{
			vo.toString();
		}
	}
}
