package co.edu;

import java.util.Scanner;

public class BoardExample 
{

	public static void main(String[] args) 
	{
		// BoardList에 정의해놓은 피드와 메서드를 활용해서 기능.
		BoardList boardList = new BoardList();
		Scanner scn = new Scanner(System.in);
		boardList.init(5);
		
		while(true)
		{
			System.out.println("1.추가  2.수정  3.목록  4.삭제  5.한건 조회 6. 작성자 조회  9.종료");  //6. 숙제.
			System.out.println("선택 >>");
			int menu = Integer.parseInt(scn.nextLine());
			if(menu == 1)
			{
				System.out.println("글번호 입력 >>");
				int bNo = scn.nextInt();
				scn.nextLine();
				System.out.println("글제목 입력 >>");
				String bTitle = scn.nextLine();
				System.out.println("글내용 입력 >>");
				String bContent = scn.nextLine();
				System.out.println("작성자 입력 >>");
				String bWriter = scn.nextLine();
				
				Board board = new Board(bNo, bTitle,bContent ,bWriter);
				int chk = boardList.addBoard(board);
				if(chk==0)
				{
					System.out.println("정상 입력되었습니다."); 
				}
				else if(chk==-1)
				{
					System.out.println("저장 공간이 없습니다.");
				}
				else if(chk==1)
				{
					System.out.println("이미 있는 번호 입니다.");
				}
			}
			else if(menu == 2)
			{
				System.out.println("수정할 글 번호 입력 > ");
				int bNo = Integer.parseInt(scn.nextLine());
				System.out.println("변경할 제목 입력 > ");
				String bTitle = scn.nextLine();
				System.out.println("변경할 내용 입력 > ");
				String bContent = scn.nextLine();
				Board cBoard = new Board(bNo,bTitle,bContent,null);
				boardList.modifyBoard(cBoard);
				if(boardList.modifyBoard(cBoard))
				{
					System.out.println("정상적으로 수정되었습니다."); 
				}
				else
				{
					System.out.println("수정에 실패했습니다.");
				}
			}
			else if(menu == 3)
			{
				Board[] boards = boardList.boardList();
				System.out.println("게시글번호   제목           내용           사용자    조회수 ");
				System.out.println("====================================================");
				for(Board board : boards)
				{
					if(board != null)
					{
						board.getInfo();
					}
				}
 			}
			else if(menu == 4)
			{
				System.out.println("삭제할 글 번호 입력 > ");
				int bNo = Integer.parseInt(scn.nextLine());
				boardList.deleteBoard(bNo);
				if(boardList.deleteBoard(bNo))
				{
					System.out.println("정상적으로 삭제되었습니다."); 
				}
				else
				{
					System.out.println("삭제에 실패했습니다.");
				}
			}
			else if(menu == 5)
			{
				System.out.println("조회할 글 번호 입력 > ");
				int bNo = Integer.parseInt(scn.nextLine());
				
				Board getBoard = boardList.searchBoard(bNo);
				if(getBoard == null)
				{
					System.out.println("조회결과가 없습니다.");
				}
				else
				{
					getBoard.getDetailInfo();
				}
			}
			else if(menu == 6) // 회원 작성 글 조회기능> 숙제.
			{
				System.out.println("조회할 작성자의 이름을 적으시오 > ");
				String name = scn.nextLine();
				
				System.out.println("게시글번호   제목           내용           사용자    조회수 ");
				System.out.println("====================================================");
				Board[] getBoard = boardList.searchWriter(name);
				for(int i=0; i<getBoard.length; i++)
				{
				    if(getBoard[i]!= null)
					{
						getBoard[i].getInfo();
					}
				}
			}
			else if(menu == 7)
			{
				
			}
			else if(menu == 8)
			{
				
			}
			else if(menu == 9)
			{
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			else
			{
				System.out.println("정확한 메뉴를 입력하세요");
			}
		}
		System.out.println("End Of Program");
		scn.close();
	}

}
