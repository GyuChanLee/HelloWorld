package co.edu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/formServlet")
public class FormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public FormServlet() {
    	super();
    }

    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGET 메서드가 호출되었습니다.");
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		PrintWriter out = response.getWriter();
		
		Message msg = null;
		String user = request.getParameter("user");
		String pw = request.getParameter("pw");
		String cmd = request.getParameter("cmd");
		
		if(cmd.equals("search")) {
			MessageDAO dao = new MessageDAO();
			msg = dao.getMessage(user, pw);			
		} else if(cmd.equals("insert")) {
			out.print("<p>입력한 user정보 "+user+"</p>");
			out.print("<p>입력한 pw정보 "+pw+"</p>");
		}
		
		out.print("<h3>메세지 정보</h3>"); // html -> DOM이 완벽한 구문으로 해석해줌.
		out.print("<p>메세지 내용 : "+msg.getContent()+"</p>");
		out.print("<p> 작성자 : "+msg.getWriter()+"</p>");
		
	}

}
