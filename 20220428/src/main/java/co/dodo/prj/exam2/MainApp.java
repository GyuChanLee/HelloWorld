package co.dodo.prj.exam2;

public class MainApp 
{

	public static void main(String[] args) 
	{
		Card c1 = new Card("5432-4567-9534-3657",20251203,253);
		c1.showCardInfo();
		System.out.println();
		
		Card c2 = new TossCard("5432-4567-9534-3657",20251203,253,"이규찬");
		c2.showCardInfo();
		System.out.println();
		
		Card c3 = new DGBCard("5432-4567-9534-3657",20251203,253,"김규찬");
		c3.showCardInfo();
		System.out.println();
	}

}
