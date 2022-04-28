package co.dodo.prj.exam2;


public class TossCard extends Card
{
	private static String company = "Toss";
	private String cardStaff;
	
	public TossCard(String cardNo, int vaildDate, int cvc, String cardStaff) 
	{
		super(cardNo, vaildDate, cvc);
		this.cardStaff = cardStaff;
	}
	
	@Override
	public void showCardInfo()
	{
		System.out.println("카드정보 - Card NO, "+getCardNo());
		System.out.println("담당직원 - "+cardStaff+", "+company);
	}
	
	
}
