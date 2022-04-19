package co.edu.project;

import java.util.*;

public class Main {

	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
//		DAO dao = new MysqlDAO();
		DAO dao = new OracleDAO();
		// 코드 수정이 적어짐 > 유지보수 쉬워짐.
		
		while(true)
		{
			System.out.println("1.입력 2.수정 3.삭제 4.리스트");
			System.out.println("선택 > ");
			int menu = Integer.parseInt(scn.nextLine());
			
			if(menu==1)
			{
				dao.insert();
			}
			else if(menu==2)
			{
				dao.update();
			}
			else if(menu==3)
			{
				dao.delete();
			}
			else if(menu==4)
			{
				dao.list();
			}
			else
			{
				break;
			}
			
		}
	}

}
