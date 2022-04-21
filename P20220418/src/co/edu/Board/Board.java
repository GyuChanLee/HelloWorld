package co.edu.Board;

import java.time.*;

public class Board
{
	public static int boardNum = 1;
	private String title;
	private String content;
	private String writer;
//	private String date;
	private LocalDateTime date2;

	public Board() {}
	
//	public Board(int boardNum, String title, String content, String writer, String date)
//	{
//		super();
//		this.boardNum = boardNum;
//		this.title = title;
//		this.content = content;
//		this.writer = writer;
//		this.date = date;
//	}
	
	public Board(String title, String content, String writer, LocalDateTime date2)
	{
		super();
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.date2 = date2;
	}
	
	public int getBoardNum()
	{
		return boardNum;
	}
	public void setBoardNum(int boardNum)
	{
		this.boardNum = boardNum;
	}
	public String getTitle() 
	{
		return title;
	}
	public void setTitle(String title) 
	{
		this.title = title;
	}
	public String getContent() 
	{
		return content;
	}
	public void setContent(String content)
	{
		this.content = content;
	}
	public String getWriter() 
	{
		return writer;
	}
	public void setWriter(String writer) 
	{
		this.writer = writer;
	}
//	public String getDate() 
//	{
//		return date;
//	}
//	public void setDate(String date) 
//	{
//		this.date = date;
//	}
	public LocalDateTime getDate2() {
		return date2;
	}

	public void setDate2(LocalDateTime date2) {
		this.date2 = date2;
	}
	
	
	

	@Override
	public String toString() 
	{
		return "[게시글번호 = " + boardNum + ", 제목 =" + title + ", 내용 = " + content + ", 작성자 = " + writer
				+ ", 작성일시 = " + date2 + "]";
	}
	
	
}
