package co.dodo.prj.exam4;

public class GenderFind 
{
	public static void genderCount(String[] genders)
	{
		int m = 0;
		int w = 0;
		for(int i=0; i<genders.length; i++)
		{
			if( genders[i].substring(7).equals("1") || genders[i].substring(7).equals("3") )
			{
				m++;
			}
			else if(genders[i].substring(7).equals("2") || genders[i].substring(7).equals("4"))
			{
				w++;
			}
		}
		System.out.println("<<실행결과>>");
		System.out.println("남 "+m+" 여 "+w);
	}
}
