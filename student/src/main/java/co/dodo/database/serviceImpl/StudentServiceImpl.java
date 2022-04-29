package co.dodo.database.serviceImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import co.dodo.database.dao.DataSource;
import co.dodo.database.dto.StudentVO;
import co.dodo.database.service.StudentService;

public class StudentServiceImpl implements StudentService 
{
	// crud 인터페이스를 구현.
	// 실제 데이터 다루는 공간.
	private DataSource dataSource = DataSource.getInstance();
	private Connection conn = dataSource.getConnection(); // 커넥션
	private PreparedStatement psmt; // sql 명령 실행
	private ResultSet rs; // select 결과를 담는 set.
	
	
	@Override
	public List<StudentVO> selectListStudent() 
	{
		//전체 학생 목록 가져오기.
		List<StudentVO> students = new ArrayList<StudentVO>();
		StudentVO student;
		String sql = "SELECT * FROM STUDENT"; // ctrl + shift + x : 전체 대문자. sql은 대문자로.
		try // sql 예외처리
		{
			psmt = conn.prepareStatement(sql); // sql 명령문 보내기.
			rs = psmt.executeQuery(); // 명령 실행.
			while(rs.next()) // 데이터를 담아온 rs bof 커서를 진행 > next메서드. 읽을 값이 없는 레코드셋이면 빠져나옴 > false.
			{
				student = new StudentVO(); // 초기화 
				student.setStudent_id(rs.getString("student_id"));
				student.setName(rs.getString("name"));
				student.setBirthday(rs.getDate("birthday"));
				student.setMajor(rs.getString("major"));
				student.setAddress(rs.getString("address"));
				student.setTel(rs.getString("tel"));
				// 행의 정보를 담기.
				students.add(student); // 리스트 추가.
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return students;
	}

	@Override
	public StudentVO selectStudent(StudentVO student)
	{
		StudentVO vo = new StudentVO();
		String sql = "SELECT * FROM STUDENT WHERE STUDENT_ID = ?";
		try
		{
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, student.getStudent_id());
			rs = psmt.executeQuery();
			if(rs.next())
			{
				vo.setStudent_id(rs.getString("student_id"));
				vo.setName(rs.getString("name"));
				vo.setBirthday(rs.getDate("birthday"));
				vo.setMajor(rs.getString("major"));
				vo.setAddress(rs.getString("address"));
				vo.setTel(rs.getString("tel"));
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return vo;
	}

	@Override
	public int insertStudent(StudentVO student)
	{
		// 한명 추가
		int n = 0;
		String sql = "INSERT INTO STUDENT VALUES(?,?,?,?,?,?)";
		try
		{
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, student.getStudent_id());
			psmt.setString(2, student.getName());
			psmt.setDate(3, student.getBirthday());
			psmt.setString(4, student.getMajor());
			psmt.setString(5, student.getAddress());
			psmt.setString(6, student.getTel());
			
			n = psmt.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return n;
	}

	@Override
	public int updateStudent(StudentVO student) 
	{
		// 한명 정보 변경
		int n = 0;
		String sql = "UPDATE STUDENT SET MAJOR = ?, ADDRESS = ?, TEL = ? WHERE STUDENT_ID = ?";
		try
		{
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, student.getMajor());
			psmt.setString(2, student.getAddress());
			psmt.setString(3, student.getTel());
			psmt.setString(4, student.getStudent_id());
			n = psmt.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return n;
	}

	@Override
	public int deleteStudent(StudentVO student) 
	{
		// 한명 삭제
		int n = 0;
		String sql = "DELETE FROM STUDENT WHERE STUDENT_ID = ?";
		try
		{
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, student.getStudent_id());
			n = psmt.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return n;
	}

}
