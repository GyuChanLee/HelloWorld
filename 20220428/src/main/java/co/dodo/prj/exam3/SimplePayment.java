package co.dodo.prj.exam3;

public class SimplePayment implements Payment
{
	private double SimplePaymentRatio;
	
	public SimplePayment(double SimplePaymentRatio) 
	{
		this.SimplePaymentRatio = SimplePaymentRatio;
	}
	
	@Override
	public int online(int price) 
	{
		int result = (int)(price - (price*(SimplePaymentRatio+ONLINE_PAYMENT_RATIO)));
		return result;
	}

	@Override
	public int offline(int price) 
	{
		int result = (int)(price - (price*(SimplePaymentRatio+OFFLINE_PAYMENT_RATIO)));
		return result;
	}

	@Override
	public void showInfo() 
	{
		System.out.println("*** 간편 결제 시 할인정보");
		System.out.println("온라인 결제 시 총 할인율 : "+(SimplePaymentRatio+ONLINE_PAYMENT_RATIO));
		System.out.println("오프라인 결제 시 총 할인율 : "+(SimplePaymentRatio+OFFLINE_PAYMENT_RATIO));
	}
}
