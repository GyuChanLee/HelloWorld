package co.dodo.review;

import java.util.Arrays;

public class StringReview 
{

	public static void main(String[] args) 
	{ 
		// a,b는 같은 주소값 > heap
		String a = "1";
		String b = "1";
		
		// c,d는 다른 주소값 > heap
		String c = new String("1");
		String d = new String("1");
		// +연산, concat()연산 : 1000번 이상 수행 시, 프로세스 성능에 심각한 저하 > 추가되는 문자열 마다 계속되는 메모리 사용 > 메모리 누수
		// String은 불변이므로, 연산마다 새로운 객체 생성.
		String e = a+b;
		System.out.println(e);
		e = c+d;
		System.out.println(e);
		
		// StringBuilder() , StringBuffer() : +연산,concat()의 사용을 줄이고 메모리 누수를 줄이기 위함. 효율적인 프로그래밍 가능.
		// buffer을 이용하여 문자열을 임시 저장, 보관. > 그 후 메서드로 가져와서 붙여넣기.
		
		StringBuilder sb = new StringBuilder();
		sb.append("a");
		sb.append("b");
		sb.append("c");
		
		System.out.println(sb.toString());
		
		String exam = "1,2,3,4,5,6,7";
		
		String[] hi = exam.split(",");
		System.out.println(Arrays.toString(hi));
		
		
	}

}
