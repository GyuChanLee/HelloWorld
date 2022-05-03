package co.dodo.notice.serviceImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import co.dodo.notice.dao.DataSource;
import co.dodo.notice.service.NoticeServiece;
import co.dodo.notice.service.NoticeVO;

public class NoticeServiceImpl implements NoticeServiece
{
	private DataSource dao = DataSource.getInstance();
	private Connection conn;
	
	private PreparedStatement psmt;
	private ResultSet rs;
	
	@Override
	public List<NoticeVO> noticeSelectList()  // 전체 조회
	{
		List<NoticeVO> list = new ArrayList<NoticeVO>();
		NoticeVO vo;
		String sql = "SELECT * FROM NOTICE";
		try
		{
			conn = dao.getConnection();
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery(); // select문이거나 >> rs 사용.
			while(rs.next())
			{
				vo = new NoticeVO();
				vo.setId(rs.getInt("id"));
				vo.setWriter(rs.getString("writer"));
				vo.setTitle(rs.getString("title"));
				vo.setWdate(rs.getDate("wdate"));
				vo.setHit(rs.getInt("hit"));
				
				hitUp(vo.getId());
				list.add(vo);
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		finally
		{
			close();
		}
		return list;
	}

	@Override
	public NoticeVO noticeSelect(NoticeVO vo) // 글 한개 조회
	{
		String sql = "SELECT * FROM NOTICE WHERE ID = ?";
		try
		{
			conn = dao.getConnection();
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, vo.getId()); // 숫자는  ?의 위치, 그 위치에 필요한 인수 넣기.
			rs = psmt.executeQuery();
			
			if(rs.next())
			{
				vo = new NoticeVO();
				vo.setId(rs.getInt("id"));
				vo.setWriter(rs.getString("writer"));
				vo.setTitle(rs.getString("title"));
				vo.setSubject(rs.getString("subject"));
				vo.setWdate(rs.getDate("wdate"));
				vo.setHit(rs.getInt("hit"));
				
				hitUp(vo.getId());
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		finally
		{
			close();
		}
		return vo;
	}

	@Override
	public int noticeInsert(NoticeVO vo) 
	{
		int n = 0;
		String sql = "INSERT INTO NOTICE VALUES(b_id.nextval,?,?,?,sysdate,0)";
		try
		{
			conn= dao.getConnection();
			psmt = conn.prepareStatement(sql);
			psmt.setString(1,vo.getWriter());
			psmt.setString(2,vo.getTitle());
			psmt.setString(3,vo.getSubject());
			n = psmt.executeUpdate();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		close();
		return n;
	}

	@Override
	public int noticeUpdate(NoticeVO vo) 
	{
		int n = 0;
		String sql = "UPDATE NOTICE SET TITLE = ?, SUBJECT = ? WHERE ID = ? ";
		try
		{
			conn = dao.getConnection();
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getTitle());
			psmt.setString(2, vo.getSubject());
			psmt.setInt(3, vo.getId());
			n = psmt.executeUpdate();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		close();
		return n;
	}

	@Override
	public int noticeDelete(NoticeVO vo) 
	{
		int n = 0;
		String sql = "DELETE NOTICE WHERE ID = ? ";
		try
		{
			conn = dao.getConnection();
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, vo.getId());
			n = psmt.executeUpdate();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		close();
		return n;
	}
	
	private void close() // 커넥션 닫기 메서드
	{
		try 
		{
			if(rs != null)
			{
				rs.close();
			}
			if(psmt != null)
			{
				psmt.close();
			}
			if(conn != null) conn.close();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
	
	private void hitUp(int id) // 내부 사용 메서드
	{
		String sql = "UPDATE NOTICE SET HIT = HIT + 1 WHERE ID = ?";
		try
		{
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, id);
			psmt.executeUpdate();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
}
