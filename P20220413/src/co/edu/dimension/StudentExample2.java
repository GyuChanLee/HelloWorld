package co.edu.dimension;

import java.util.Scanner;

public class StudentExample2 
{

	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
//		Student s1 = new Student();
		
		System.out.println("학생이름 점수 나이"); // 홍길동 80 20
//		s1.studName = scn.next();
//		s1.score = Integer.parseInt(scn.next()); // 1 != "1"
//		s1.age = Integer.parseInt(scn.next());
		
		Student[] students = new Student[] {new Student(),new Student(),new Student()}; // 참조타입이므로 초기값 null
		
		for(int i=0; i<students.length;i++)
		{
			students[i].studName =scn.next();
			students[i].score = Integer.parseInt(scn.next());
			students[i].age = Integer.parseInt(scn.next());
		}
		
		// 조회하고 싶은 이름 입력...
		// 해당이름 홍길동은 20살이고 80점 입니다!!!
		System.out.println("찾고 싶은 학생의 이름을 입력 > ");
		Scanner scn1 = new Scanner(System.in);
		String searchName = scn1.nextLine();
		
		for(int i=0; i<students.length; i++)
		{
			if(students[i].studName.equals(searchName))
			{
				System.out.printf("해당이름 %s은/는 %d살이고 점수는 %d점 입니다!!!%n",students[i].studName,students[i].age,students[i].score);
			}
			else
			{
				System.out.println("그런 학생은 없습니다!");
				break;
			}
			
		}
		
	}

}
