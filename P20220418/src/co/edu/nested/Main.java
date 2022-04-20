package co.edu.nested;

public class Main {

	public static void main(String[] args) 
	{
		Outer outer = new Outer();
		outer.method1();
		
		Outer.Inner inner = outer.new Inner(); // 외부클래스에서 접근해서 호출.
		inner.method2();
		inner.f2 = "인스턴스 중첩 클래스";
		
		Outer.StaticInner.method4(); // 정적 메소드를 객체없이 클래스명으로 호출.
		Outer.StaticInner s = new Outer.StaticInner();
		s.f4 = "정적 중첩 클래스"; // 정적 클래스 내의 인스턴스 값이므로, 객체 필요.
		Outer.StaticInner.f5 = "정적 클래스의 정적 변수";
		
		System.out.println(inner.f2);
		System.out.println(s.f4);
		System.out.println(Outer.StaticInner.f5);
	}
}