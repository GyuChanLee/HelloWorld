package co.micol.prj.listTest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import co.micol.prj.dto.StudentVO;

public class MapTest 
{
	public void mapTest()
	{
		Map<String, String> map = new HashMap<String, String>();
		map.put("name","이규찬");
		map.put("address","대구중구");
		
		System.out.println(map.get("name"));
		System.out.println(map.get("address"));
	}
	
	public void studentMap()
	{
		Map<StudentVO,Integer> map = new HashMap<StudentVO, Integer>();
		map.put(new StudentVO("이규찬"),100 );
		map.put(new StudentVO("김규찬"),90 );
		map.put(new StudentVO("박규찬"),70 );
		map.put(new StudentVO("오규찬"),80 );
		
		Iterator<StudentVO> it = map.keySet().iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}
