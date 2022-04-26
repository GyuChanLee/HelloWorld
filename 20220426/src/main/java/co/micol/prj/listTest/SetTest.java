package co.micol.prj.listTest;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest 
{
	public void setTest()
	{
		Set<String> name = new HashSet<String>();
		name.add("이규찬");
		name.add("김규찬");
		name.add("박규찬");
		name.add("최규찬");
		name.remove("최규찬");
		
		Iterator<String> it = name.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}
