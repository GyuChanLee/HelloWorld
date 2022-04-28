package co.dodo.prj.exam2;

public class Card 
{
	private String cardNo;
	private int vaildDate;
	private int cvc;
	
	Card(String cardNo, int vaildDate, int cvc)
	{
		this.cardNo =cardNo;
		this.vaildDate = vaildDate;
		this.cvc = cvc;
	}
	
	public String getCardNo()
	{
		return cardNo;
	}
	
	public int getVaildDate()
	{
		return vaildDate;
	}
	
	public int getCvc()
	{
		return cvc;
	}
	
	public void showCardInfo()
	{
		System.out.println("카드정보 ( Card NO : "+cardNo+", 유효기간 : "+vaildDate+", CVC : "+cvc+" )");
	}
}
