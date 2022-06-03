package co.edu;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmpDAO extends DAO {
	
	// schedule list select
	public List<Schedule> scheduleList() {
		List<Schedule> list = new ArrayList<Schedule>();
		connect();
		String sql = "select * from schedules";
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			
			while(rs.next()) {
				Schedule sc = new Schedule();
				sc.setTitle(rs.getString("title"));
				sc.setStartDate(rs.getString("start_date"));
				sc.setEndDate(rs.getString("end_date"));
				
				list.add(sc);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return list;
	}
	
	// schedule insert
	public void insertSchedule(Schedule sc) {
		connect();
		String sql = "insert into schedules(title, start_date, end_date) values(?,?,?)";
		try {
			
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, sc.getTitle());
			psmt.setString(2, sc.getStartDate());
			psmt.setString(3, sc.getEndDate());
			psmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}
	
	
	// schedule delete
	public void deleteSchedule(Schedule sc) {
		connect();
		String sql = "delete from schedules where title = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, sc.getTitle());
			psmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}
	
	// 부서별 인원(차트) return : 부서명=인원
	public Map<String,Integer> getMemberByDept(){
		Map<String, Integer> map = new HashMap<String, Integer>();
		connect();
		String sql = "SELECT D.DEPARTMENT_NAME, COUNT(1) AS CNT "
				+ "FROM EMPLOYEES E, DEPARTMENTS D "
				+ "WHERE E.DEPARTMENT_ID = D.DEPARTMENT_ID "
				+ "GROUP BY DEPARTMENT_NAME";
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			while(rs.next()) {
				map.put(rs.getString("department_name"), rs.getInt("cnt"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return map;
	}
	
	
	// 리스트 호출 메서드
	public List<Employees> empList(){
		connect();
		List<Employees> list = new ArrayList<Employees>();
		try {
			psmt = conn.prepareStatement("select * from emp_temp order by 1");
			rs = psmt.executeQuery();
			while(rs.next()) {
				Employees emp = new Employees();
				emp.setEmployeeId(rs.getInt("employee_id"));
				emp.setFirstName(rs.getString("first_name"));
				emp.setLastName(rs.getString("last_name"));
				emp.setEmail(rs.getString("email"));
				emp.setPhoneNumber(rs.getString("phone_number"));
				emp.setHireDate(rs.getString("hire_date"));
				emp.setJobId(rs.getString("job_id"));
				emp.setSalary(rs.getInt("salary"));
				
				list.add(emp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return list;
	}
	
	// 입력 메서드
	public Employees insertEmp(Employees emp) {
		String sql = "INSERT INTO EMP_TEMP (EMPLOYEE_ID, FIRST_NAME, LAST_NAME, EMAIL, PHONE_NUMBER, HIRE_DATE, JOB_ID, SALARY)"+
					 "VALUES(?,?,?,?,?,?,?,?)";
		String seqSql = "SELECT EMPLOYEES_SEQ.NEXTVAL FROM DUAL";
		
		connect();
		int nextSeq = -1;
		try {
			psmt = conn.prepareStatement(seqSql);
			rs = psmt.executeQuery();
			if(rs.next()) {
				nextSeq = rs.getInt(1);
			}
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, nextSeq);
			psmt.setString(2, emp.getFirstName());
			psmt.setString(3, emp.getLastName());
			psmt.setString(4, emp.getEmail());
			psmt.setString(5, emp.getPhoneNumber());
			psmt.setString(6, emp.getHireDate());
			psmt.setString(7, emp.getJobId());
			psmt.setInt(8, emp.getSalary());
			int r = psmt.executeUpdate();
			System.out.println(r+"건 입력됨.");
			emp.setEmployeeId(nextSeq);
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return emp;
	}
	// 수정 메서드
	public Employees updateEmp(Employees emp) {
		String sql = "UPDATE EMP_TEMP SET FIRST_NAME=?, LAST_NAME=?, EMAIL=?, HIRE_DATE=? WHERE EMPLOYEE_ID=?";
		
		connect();
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, emp.getFirstName());
			psmt.setString(2, emp.getLastName());
			psmt.setString(3, emp.getEmail());
			psmt.setString(4, emp.getHireDate());
			psmt.setInt(5, emp.getEmployeeId());
			int r = psmt.executeUpdate();
			if(r>0){
				System.out.println(r+"건 입력됨.");
				return emp;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return null;
	}
	// 삭제
	public Employees deleteEmp(Employees emp) {
		String sql = "DELETE FROM EMP_TEMP WHERE EMPLOYEE_ID=?";
		
		connect();
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, emp.getEmployeeId());
			
			int r = psmt.executeUpdate();
			if(r>0){
				System.out.println(r+"건 삭제됨.");
				return emp;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return null;
	}
	//한건
	
}
