package co.dodo.notice;

import java.util.List;
import java.util.Scanner;

import co.dodo.notice.service.NoticeVO;
import co.dodo.notice.serviceImpl.NoticeServiceImpl;

public class Menu 
{
	private Scanner scn = new Scanner(System.in);
	private NoticeServiceImpl notice = new NoticeServiceImpl();
	private NoticeVO vo;
	
	private void noticeMenus()
	{	
		boolean t = true;
		while(t)
		{
			System.out.println();
			System.out.println("공지사항 관리 시스텥");
			System.out.println("== 1. 게시글 관리  2. 게시글 조회  3. 공지사항 전체 조회  4. 종료 ==");
			System.out.println();
			int sel = Integer.parseInt(scn.nextLine());
			if(sel==1)
			{
				updates();
			}
			else if(sel==2)
			{
				selectOne();
			}
			else if(sel==3)
			{
				List<NoticeVO> list = notice.noticeSelectList();
				for(NoticeVO vo : list)
				{
					vo.toString();
				}
				System.out.println("===============================================================================================");
				System.out.println();
			}
			else
			{
				t =false;
			}
			
		}
	}
	
	private void updates()
	{
		System.out.println("== 1. 글 쓰기  2. 글 수정  3. 글 삭제 == ");
		System.out.println("입력 > ");
		try
		{
			int choice = Integer.parseInt(scn.nextLine());
			if(choice == 1)
			{
				noticeinsert();
			}
			else if(choice==2)
			{
				noticeUpdate();
			}
			else if(choice==3)
			{
				noticeDelete();
			}
			else
			{
				System.out.println("잘못된 입력");
			}
		}
		catch(Exception e)
		{
			System.out.println("숫자를 적으세요");
		}
	}
	
	private void noticeinsert()
	{
		System.out.println("입력할 작성자를 입력");
		String writer = scn.nextLine();
		System.out.println("입력할 글제목을 입력");
		String title = scn.nextLine();
		System.out.println("입력할 글내용 입력");
		String subject = scn.nextLine();
		vo = new NoticeVO();
		vo.setWriter(writer);
		vo.setTitle(title);
		vo.setSubject(subject);
		vo.toString();
		int n = notice.noticeInsert(vo);
		if(n!=0)
		{
			System.out.println();
			System.out.println("정상 입력 완료");
		}
	}
	
	private void noticeUpdate()
	{
		System.out.println("수정할 글 번호 입력 > ");
		int searchNum = Integer.parseInt(scn.nextLine());
		vo = new NoticeVO();
		vo.setId(searchNum);
		System.out.println("수정할 글 제목 입력 > ");
		String title = scn.nextLine();
		System.out.println("수정할 글 내용 입력 > ");
		String subject = scn.nextLine();
		vo.setTitle(title);
		vo.setSubject(subject);
		int n = notice.noticeUpdate(vo);
		if(n!=0)
		{
			System.out.println();
			System.out.println("정상 수정 완료");
		}
	}
	
	private void noticeDelete()
	{
		System.out.println("삭제할 글 번호 입력 > ");
		int searchNum = Integer.parseInt(scn.nextLine());
		vo = new NoticeVO();
		vo.setId(searchNum);
		int n = notice.noticeDelete(vo);
		if(n!=0)
		{
			System.out.println();
			System.out.println("정상 삭제 완료");
		}
	}
	
	private void selectOne()
	{
		System.out.println("조회할 게시글의 id를 입력하시오 > ");
		int search;
		try {
			search = Integer.parseInt(scn.nextLine());
			vo = new NoticeVO();
			vo.setId(search);
			NoticeVO result = notice.noticeSelect(vo);
			result.toString();
			System.out.println(result.getSubject());
		} catch (Exception e) {
			System.out.println("숫자를 적으세요");
		}
		System.out.println("===============================================================================================");
		System.out.println();
	}
	
	public void run()
	{
		while(true)
		{
			System.out.println("== 종합 관리 시스템 ==");
			System.out.println("1. 학생 관리");
			System.out.println("2. 공지사항 관리");
			System.out.println("3. 종료 ");
			System.out.println("입력 > ");
			try 
			{
				int search = Integer.parseInt(scn.nextLine());
				if(search == 1)
				{
					studentMenus();
				}
				else if(search == 2)
				{
					noticeMenus();
				}
				else if(search==3)
				{
					break;
				}
				else
				{
					System.out.println("잘못된 선택");
				}
			}
			catch (NumberFormatException e) 
			{
				System.out.println("숫자를 입력!");
			}
		}
			
	}
	
	private void studentMenus()
	{
		while(true)
		{
			
		}
	}
}
