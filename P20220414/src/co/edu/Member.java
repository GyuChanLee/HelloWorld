package co.edu;

public class Member 
{
	// 필드 > 회원 아이디 , 이름, 연락처, 나이.
	private String memberId; // 외부에서 직접 접근하여 값을 다루지 못하도록 private 접근 제어자 설정. >> 메서드 (getter/setter)로 간접적으로 다루는 것이 좋음.
	private String memberName;
	private String memberPhone;
	private int memberAge; // 0보다는 커야함.
	
	// 생성자.
	public Member(){}

	Member(String memberId, String memberName, String memberPhone, int memberAge) 
	{
		super();
		this.memberId = memberId;
		this.memberName = memberName;
		this.memberPhone = memberPhone;
		this.memberAge = memberAge;
	}
	
	//메서드.
	void setMemberId(String memberId)
	{
		this.memberId = memberId;
	}
	
	String getMemberId() 
	{
		return memberId;
	}
	
	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getMemberPhone() {
		return memberPhone;
	}

	public void setMemberPhone(String memberPhone) {
		this.memberPhone = memberPhone;
	}

	void setMemberAge(int memberAge) // setter 메서드 : 데이터를 간접적으로 다루기.
	{
		if(memberAge <= 0)
		{
			this.memberAge = 10; // 나이가 음수일시, 10으로 초기화.
		}
		else 
		{
			this.memberAge = memberAge;			
		}
	}
	
	int getMemberAge() // getter 메서드 : 데이터를 반환.
	{
		return memberAge;
	}
	
	void showInfo()
	{
		System.out.printf("%s 회원님%n이름: %s%n연락처: %s%n나이: %d%n",memberId,memberName,memberPhone,memberAge);
	}
}
