package co.edu;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TodoDAO extends DAO {
	
	// todo 불러오기
	public List<Todo> todoList() {
		connect();
		List<Todo> list = new ArrayList<Todo>();
		String sql = "SELECT * FROM TODO ORDER BY 1";
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			while(rs.next()) {
				Todo todo = new Todo();
				todo.setListNumber(rs.getInt("list_number"));
				todo.setTitle(rs.getString("title"));
				list.add(todo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		
		return list;
	}
	
	// todo 추가
	public void insertTodo(Todo todo) {
		connect();
		String sql = "insert into todo values(todo_seq.nextval,?)";
		try {
			psmt =conn.prepareStatement(sql);
			psmt.setString(1, todo.getTitle());
			psmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}
	
	// todo 수정
	public void updateTodo(Todo todo) {
		connect();
		String sql = "UPDATE TODO SET TITLE = ? WHERE LIST_NUMBER = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, todo.getTitle());
			psmt.setInt(2, todo.getListNumber());
			psmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}
	
	// todo 삭제
	public void deleteTodo(Todo todo) {
		connect();
		String sql = "DELETE FROM TODO WHERE TITLE = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, todo.getTitle());
			psmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}
}
