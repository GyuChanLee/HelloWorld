package co.dodo.review;

import java.util.Random;

public class RandomReview 
{

	public static void main(String[] args) 
	{
		// Random() : 다양한 데이터 타입 출력을 지원. >> double형보다 큰 타입을 사용하고 싶을 때 Math.random()대신 사용.
		// seed값에 따라 랜덤 값 출력. > 시간으로 seed값을 주면 랜덤값 중복을 막음.
		
		Random rand = new Random();
		
		long time = System.currentTimeMillis(); // System 클래스의 현재 시간 구하는 메서드.
		long time2 = System.nanoTime();
		
		rand.setSeed(time);
		
		System.out.println(rand.nextInt()); // 범위 정하기 가능.
	}

}
