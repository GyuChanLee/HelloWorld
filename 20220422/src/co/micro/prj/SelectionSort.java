package co.micro.prj;
// package name = 회사명 역순 ex) com.naver.메인프로젝트.서브프로젝트(파트).관련단어
// BasePackage = com.naver.메인프로젝트 > 최소 dot(.)이 두개 포함.
public class SelectionSort 
{
	// 범위지정자 - default : interface에 사용. >> 추상 클래스, 인터페이스의 차이가 많이 사라짐.
	
	// 선택 sort - 첫번째값을 기준으로 모두 비교해서 자리를 결정. 두번째, 그 이후도 같은 방식으로 비교, 자리 결정.
	// 중첩 for문 - ijklmn 혹 index 단어전체를 사용. > i : 자리결정, j : 비교. i=0; j=i+1;
	// 전통적 selection sort - 빈번한 swap
	// 현대 선택sort - min = j; 사용.
	
	// 버블 정렬 - 인접한 두개의 요소끼리 비교해나감.
	// 퀵 정렬
	
	// 알고리즘 > 순서도 or pseudo code(의사 코드) : 로직을 미리 생각해서 메서드 만들기전 효과적.
	
	private int i;
	private int j;
	private int min;
	
	public void sort(int[] arr) // 외부에 보임.
	{
		addPrint(arr);
		
		for(i=0; i<arr.length-1; i++) // 입력 > 처리 > 출력 방식.
		{
			min = i;
			for(j=i+1; j<arr.length; j++) // 요소 비교
			{
				if(arr[min] > arr[j]) // 부등호 < : 내림차순.
				{
					min = j;
				}
			}
			
			if(min != i) // 자리가 바뀔 것이 생김 > i당 한번만 swap
			{
				int tmp = arr[i];
				arr[i] = arr[min];
				arr[min] = tmp;
			}
		}
		
		resultPrint(arr);
	}
	
	private void addPrint(int[] arr) // 내부 처리 메서드
	{
		System.out.println("==== 초기 데이터 =====");
		for(int i : arr)
		{
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	private void resultPrint(int[] arr) // 내부 처리 메서드
	{
		System.out.println("==== 정렬 데이터 =====");
		for(int i : arr)
		{
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	@Override
	public String toString()
	{
		return super.toString();
	}
}
