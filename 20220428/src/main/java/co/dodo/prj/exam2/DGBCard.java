package co.dodo.prj.exam2;

public class DGBCard extends Card
{
	private static String company = "대구은행";
	private String cardStaff;
	
	DGBCard(String cardNo, int vaildDate, int cvc, String cardStaff)
	{
		super(cardNo,vaildDate,cvc);
		this.cardStaff = cardStaff;
	}
	
	@Override
	public void showCardInfo()
	{
		System.out.println("카드정보 (Card NO : "+getCardNo()+", 유효기간 : "+getVaildDate()+", CVC : "+getCvc()+" )");
		System.out.println("담당직원 - "+cardStaff+", "+company);
	}
}
