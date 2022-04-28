package co.dodo.prj.exam3;

public interface Payment 
{
	public static final double ONLINE_PAYMENT_RATIO = 0.05; // 온라인 결제 할인율
	public static final double OFFLINE_PAYMENT_RATIO = 0.03; // 오프라인 결제 할인율
	
	public int online(int price); // 온라인 결제 메서드
	public int offline(int price); // 오프라인 결제 메서드
	public void showInfo(); // 결제 정보 출력 메서드
}
