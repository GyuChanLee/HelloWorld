package co.edu.Board;

import java.util.*;

public class BoardExe {

	public static void main(String[] args) 
	{
		BoardApp app = new BoardApp();
		Scanner scn = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("1.글등록  2.글수정  3.글삭제  4.글상세조회  5.전체리스트  6.종료");
			System.out.println("선택 > ");
			int menu = Integer.parseInt(scn.nextLine());
			
			if(menu==BoardService.ADD)
			{
				Board newOne = app.regist();
				System.out.println("작성 글 정보 > ");
				System.out.println(newOne.toString());
				System.out.println();
				
			}
			else if(menu==BoardService.MOD)
			{
				app.modify();
			}
			else if(menu==BoardService.DEL)
			{
				app.delete();
			}
			else if(menu==BoardService.LISTONE)
			{
				try
				{
					System.out.println(app.listDetail().toString());
				}
				catch(NullPointerException e1)
				{
					System.out.println("조회한 글은 존재하지 않습니다!");
				}
				System.out.println();
			}
			else if(menu==BoardService.LIST)
			{
				ArrayList<Board> x = app.list();
				for(int i=0; i<x.size(); i++)
				{
					System.out.println(x.get(i));;
				}
				System.out.println();
			}
			else if(menu==6)
			{
				System.out.println("게시판을 닫습니다...");
				break;
			}
		}
		System.out.println("End of program");
		scn.close();
	}

}
