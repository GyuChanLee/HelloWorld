package co.dodo.notice.service;

import java.sql.Date;

import lombok.Data;
// 롬복 설치, 의존성, 임포트.
@Data
public class NoticeVO // VO 객체
{
	private int id;
	private String writer;
	private String title;
	private String subject;
	private Date wdate;
	private int hit;
	
	@Override
	public String toString()
	{
		System.out.print("id : "+id+"  ");
		System.out.print("writer : "+writer+"  ");
		System.out.print("title : "+title+"  ");
		System.out.print("date : "+wdate+"  ");
		System.out.println("hit : "+hit+" ");
		return null;
	}
}
