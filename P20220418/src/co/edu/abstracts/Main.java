package co.edu.abstracts;

public class Main {

	public static void main(String[] args) 
	{
//		Animals animals = new Animals();  // 불가
		Animals animals = new Bird();
		animals.eat();
		animals.run();
		animals.sleep();
		
		animals = new Fish();
		animals.eat();
		animals.run();
		animals.sleep();
		
		// 다형성 > 상속관계로 부모 참조변수로 자식 객체를 참조.
	}

}
