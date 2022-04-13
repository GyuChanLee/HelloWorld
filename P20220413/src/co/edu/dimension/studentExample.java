package co.edu.dimension;

import java.util.Scanner;

public class studentExample 
{

	public static void main(String[] args) 
	{
		// 학생 이름, 점수.
		Student s1 = new Student();
		s1.studName = "이규찬";
		s1.score = 100;
		s1.age = 26;
		
		Student s2 = new Student();
		s2.studName = "김규찬";
		s2.score = 90;
		s2.age = 20;
		
		Student s3 = new Student();
		s3.studName = "박규찬";
		s3.score = 80;
		s3.age = 24;
		
		Student[] students = {s1, s2, s3};
		
//		Scanner scn = new Scanner(System.in);
//		System.out.println("학생 이름을 입력하세요 > ");
//		String searchName = scn.nextLine();
//		
//		for(int i=0; i<students.length; i++)
//		{
//			if(students[i].studName.equals(searchName))
//			{
//				System.out.println(students[i].studName+"의 점수 : "+students[i].score);
//			}
//		}
		
		int searchAge = 23;
		for(int i=0; i<students.length;i++)
		{
			if(students[i].age > searchAge)
			{
				System.out.println(searchAge+"살을 넘은 학생 : "+students[i].studName);
			}
		}
		
		System.out.println("End of Program");
		
	}

}

class Student
{ 
	String studName;
	int score;
	int age;
	
	Student(){}
	
	Student(String studName, int score, int age)
	{
		this.studName = studName;
		this.score = score;
		this.age = age;
	}
}
