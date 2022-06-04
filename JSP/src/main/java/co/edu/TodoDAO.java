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
	
	// todo 한건 가져와서 list_number 찾아오기.
	public int todoOneNum(Todo todo) {
		connect();
		Todo todo1 = new Todo();
		String sql = "SELECT * FROM TODO WHERE TITLE = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, todo.getTitle());
			rs = psmt.executeQuery();
			if(rs.next()) {
				todo1.setListNumber(rs.getInt("list_number"));
				todo1.setTitle(rs.getString("title"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return todo1.getListNumber();
	}
	
	// todo 삭제
	public void deleteTodo(String title) {
		connect();
		String sql = "DELETE FROM TODO WHERE TITLE = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, title);
			psmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}
}
