package co.dodo.prj.exam3;

public class MainApp 
{

	public static void main(String[] args) 
	{
		int price = 10000;
		
		Payment card = new CardPayment(0.08);
		card.showInfo();
		System.out.println("온라인 결제 금액 : "+ card.online(price));
		System.out.println("오프라인 결제 금액 : "+ card.offline(price));
		System.out.println();
		
		Payment simple = new SimplePayment(0.05);
		simple.showInfo();
		System.out.println("온라인 결제 금액 : "+ simple.online(price));
		System.out.println("오프라인 결제 금액 : "+ simple.offline(price));
	}

}
