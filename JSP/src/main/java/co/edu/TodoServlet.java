package co.edu;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


@WebServlet("/TodoServlet")
public class TodoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public TodoServlet() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
    	TodoDAO dao = new TodoDAO();
    	Gson gson = new GsonBuilder().create();
    	
    	// 전체 불러오기
    	List<Todo> list = new ArrayList<Todo>();
		list = dao.todoList();
		response.getWriter().print(gson.toJson(list));
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/json;charset=utf-8");
		TodoDAO dao = new TodoDAO();
    	Gson gson = new GsonBuilder().create();
    	
    	int listNumber = Integer.parseInt(request.getParameter("listNumber"));
		String title = request.getParameter("title");
		String cmd = request.getParameter("cmd");
		Todo todo = new Todo(listNumber,title);
    	
    	// 추가
    	if(cmd.equals("insert")) {
    		dao.insertTodo(todo);
    	} else if(cmd.equals("update")) { // 수정
    		dao.updateTodo(todo);
    	} else if(cmd.equals("delete")) { // 삭제
    		dao.deleteTodo(todo);
    	}
    	
	}

}
