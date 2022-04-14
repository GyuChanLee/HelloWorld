package co.edu;

public class Board 
{
	// 게시글 번호, 제목, 내용, 작성자, 조회회수(조회할때마다 1씩 증가.)
	private int boardNo;
	private String title;
	private String content;
	private String writer;
	private int searchCnt = 0;
	
	public Board(int boardNo, String title, String content, String writer) {
		super(); // 부모클래스 생성자 상속
		this.boardNo = boardNo;
		this.title = title;
		this.content = content;
		this.writer = writer;
	}

	public int getBoardNo() {
		return boardNo;
	}

	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public int getSearchCnt() {
		return searchCnt;
	}

	public void setSearchCnt(int searchCnt) {
		this.searchCnt = searchCnt;
	}
	
	public void getInfo()
	{ // 게시글 번호 제목 내용 작성자 조회수
		System.out.printf("%5d  %-10s %-15s %-5s %3d%n",boardNo,title,content,writer,searchCnt);
	}
	
	public void getDetailInfo()
	{
		String info = "==============================================%n"+
	                  "게시글 번호 : %2d              작성자 : %-5s%n     "+
				      "제목 : %-10s                 조회수 : %3d%n      "+
	                  "내용 : %-30s%n                                  %n";
		System.out.printf(info,boardNo,writer,title,searchCnt,content);
	}
}
