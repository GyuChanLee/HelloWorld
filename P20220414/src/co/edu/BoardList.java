package co.edu;

public class BoardList
{
	private Board[] boards;
	
	public void init(int size)
	{
		boards = new Board[size];
	}
	 
	// 배열에 한건 입력.
	public int addBoard(Board board) 
	{
		// 더이상 저장할 공간이 없을 때.. false
		int errorCase = -1; // 공간이 없을 시 -1 바로 넘김.
		for(int i=0; i<boards.length; i++)
		{
			if(boards[i] != null && boards[i].getBoardNo() == board.getBoardNo())
			{
				System.out.println("이미 중복된 글번호가 있습니다.");
				errorCase = 1; //동일한 경우가 있을 시 에러.
				break; // 반환값 문제
			}
			if(boards[i]== null)
			{
				boards[i] = board;
				errorCase = 0; // 정상처리
				break;
			}
		}
		return errorCase;
	}
	
	// 배열 수정 : 게시글 번호로 검색 후, 내용과 제목 변경.
	public boolean modifyBoard(Board board)
	{
		boolean check = false;
		for(int i=0; i<boards.length; i++)
		{
			if(board.getBoardNo() == boards[i].getBoardNo())
			{
				boards[i].setContent(board.getContent());
				boards[i].setTitle(board.getTitle());
				check = true;
				break;
			}
		}
		return check;
	}
	
	// 게시글 목록 가져오기
	public Board[] boardList()
	{
		return boards;
	}
	
	// 삭제 기능
	public boolean deleteBoard(int bNo)
	{
		boolean check = false;
		for(int i=0; i<boards.length; i++)
		{
			if(bNo == boards[i].getBoardNo())
			{
				boards[i].setContent(null);
				boards[i].setTitle(null);
				boards[i].setSearchCnt(0);
				boards[i].setWriter(null);
				boards[i].setBoardNo(0);
				check = true;
				break;
			}
		}
		return check;
	}
	
	// 한건 조회
	public Board searchBoard(int bNo)
	{
		for(int i=0; i<boards.length; i++)
		{
			if(bNo == boards[i].getBoardNo())
			{
				int currentCnt = boards[i].getSearchCnt();
				boards[i].setSearchCnt(currentCnt+1); // 조회수 증가
				return boards[i];
			}
		}
		return null; // 찾는 값이 없는 경우.
	}
}
