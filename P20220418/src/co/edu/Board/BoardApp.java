package co.edu.Board;

import java.util.*;
import java.time.*;

public class BoardApp implements BoardService
{
	ArrayList<Board> boards = new ArrayList<Board>();
	Scanner scn = new Scanner(System.in);
	
	@Override
	public Board regist() 
	{
		System.out.println("글 번호 입력 >");
		int num = Integer.parseInt(scn.nextLine());
		System.out.println("글 제목 입력 >");
		String title = scn.nextLine();
		System.out.println("글 내용 입력 >");
		String content = scn.nextLine();
		System.out.println("작성자 입력 >");
		String writer = scn.nextLine();
//		System.out.println("작성일시 입력(ex: 2022-04-20) >");
//		String date = scn.nextLine();
		LocalDateTime currentDate = LocalDateTime.now();
		Board newBoard = new Board(num, title, content, writer, currentDate);
		boards.add(newBoard);
		return newBoard;
	}

	@Override
	public void modify() 
	{
		System.out.println("수정할 글 번호 입력 > ");
		int searchNum = Integer.parseInt(scn.nextLine());
		boolean yes = false;
		
		for(int i=0; i<boards.size(); i++)
		{
			if(boards.get(i).getBoardNum()==searchNum)
			{
				System.out.println("바꾸실 글 제목 입력 > ");
				String modTitle = scn.nextLine();
				System.out.println("바꾸실 글 내용 입력 > ");
				String modContent = scn.nextLine();
				
				boards.get(i).setTitle(modTitle);
				boards.get(i).setContent(modContent);
				
				yes=true;
				System.out.println("글 수정 완료!");
				System.out.println();
			}
		}
		
		if(yes==false)
		{
			System.out.println("조회한 글이 존재하지 않습니다.");
		}
	}

	@Override
	public void delete() 
	{
		System.out.println("삭제할 글 번호 입력 > ");
		int searchNum = Integer.parseInt(scn.nextLine());
		boolean yes = false;
		
		for(int i=0; i<boards.size(); i++)
		{
			if(boards.get(i).getBoardNum()==searchNum)
			{
				boards.remove(i);
				
				yes =true;
				System.out.println("삭제 완료! ");
				System.out.println();
			}
		}
		
		if(yes==false)
		{
			System.out.println("조회한 글이 존재하지 않습니다.");
		}
	}

	@Override
	public Board listDetail() 
	{
		System.out.println("조회할 글번호 입력 > ");
		int searchNum = Integer.parseInt(scn.nextLine());
		
		for(int i=0; i<boards.size(); i++)
		{
			if(boards.get(i).getBoardNum()==searchNum)
			{
				return boards.get(i);
			}
		}
		return null;
	}

	@Override
	public ArrayList<Board> list() 
	{
		ArrayList<Board> x = new ArrayList<Board>();
		
		for(int i=0; i<boards.size(); i++)
		{
			x.add(boards.get(i));
		}
		return x;
	}

}
