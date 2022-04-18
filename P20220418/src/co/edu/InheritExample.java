package co.edu;

public class InheritExample {

	public static void main(String[] args) 
	{
		Child1 ch1 = new Child1();
		ch1.field1 = "";
		ch1.field2 = "";
		ch1.method1();
		ch1.method2();
		
		Child2 ch2 = new Child2();
		ch2.field1 = ""; // 부모 필드
		ch2.field3 = ""; // 자식 필드
		ch2.method1();
		ch2.method3();
		
		// 부모 참조변수에 자식 인스턴스 할당 가능!!!
		Parent p1 = new Parent(); // 부모는 자식을 포함하므로 부모 참조변수로 자식의 객체를 참조 가능.
		p1 = new Child1(); // 자동 형변환.
		p1 = new Child2();
		
//		p1.field3 = "";  >> 부모 클래스의 필드, 메서드만 사용가능.
		
		ch2 = (Child2)p1; // 큰 범위를 작은 범위로 바꿀 때 > Casting (강제 형변환)
		ch2.field1 = "";
		ch2.field3 = "";
		ch2.method1();
		ch2.method3();
		
	}

}
