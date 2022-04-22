package co.micro.prj.app;

import java.util.*;

import co.micro.prj.SelectionSort;

public class MainApp 
{
	public static void main(String[] args) // oop - 최대한 캡슐화, 객체화. > 메인메서드에 기능을 자꾸 넣지 말기.
	{
		SelectionSort selectSort = new SelectionSort();
		int[] data = {5, 1, 4, 3, 2};
		
		selectSort.sort(data);
		
		
		// main 메서드는 깔끔하게 부속 클래스의 메서드와 필요한 변수만 선언.
		
		// process - stack영역, heap영역 > 메모리에게서 할당.
		// stack - class, static members : 계속 존재해야 할 것들.
		// heap - 인스턴스 안의 data(참조변수 or 기본변수) : 동적인 변수들.
		// 끝나면 garbage collector - heap영역만 청소. 자동으로 청소. stack영역은 os가 청소(프로세스 동작 종료할 때.)
		
		// 추상화 : 현실세계의 개념 >> 프로그램 세계의 개념으로 집단으로 묶기. (집합 객체) - abstract, interface : 자기 자신을 인스턴스로 생성 X.
		
		// 다형성 : overriding, overloading
		// override : 상속받은 메서드를 자신에 맞게 내용을 달리 쓰는 것(재정의).
		// overloading : 매개변수만 달리해서 같은 메서드를 쓰는 것.
		
		// 상속 : extends
		
		// 정보 은폐 : private 필드, 메서드로 내부처리 >> 캡슐화 : 한군데 입력하면 나머지가 처리가 가능.
		
		// 최근 : 추상클래스 대신 인터페이스가 웬만하면 낫다.
		// 최근 : 제네릭스 굳이 안씀.
	}
}
