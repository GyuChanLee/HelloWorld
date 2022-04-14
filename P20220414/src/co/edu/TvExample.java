package co.edu;

public class TvExample 
{

	public static void main(String[] args) 
	{
		int num = 10;
		
		Television tv = new Television(); // new키워드로 객체 생성. 인스턴스 하나 만듬.
		tv.company = "삼성";
		tv.color = "검은색";
		tv.price = 30000;
		tv.model = "30Inch";
		tv.turnOn();
		tv.changeChannel(num);
		tv.turnOff();
		System.out.println("tv 정보 : "+tv.company+" "+tv.color+" "+tv.price+" "+tv.model);
		// 각 개체는 서로 독립적!! 
		
		Television tv1 = new Television();
		tv1.company = "삼성";
		tv1.color = "검은색";
		tv1.price = 30000;
		tv1.model = "30Inch";
		
		System.out.println(tv); // 인스턴스의 주소값(16진수).
		System.out.println(tv1);
		System.out.println(tv==tv1); // 필드 값이 같아도 메모리 주소가 다르기 때문에 false (참조타입)
		
		Student stud1 = new Student();
		stud1.name = "이규찬";
		stud1.stdNo = "2-181818";
		stud1.age = 27;
		stud1.height = 175.0d;
		
		Student stud2 = new Student();
		stud2.name = "김규찬";
		stud2.stdNo = "1-181818";
		stud2.age = 37;
		stud2.height = 170.0d;
		
		Student stud3 = new Student("박규찬","3-181818",99,185.0D);
		
		stud1.study();
		stud2.study();
		
		stud1.showInfo();
		stud2.showInfo();
		stud3.showInfo();
	}

}
