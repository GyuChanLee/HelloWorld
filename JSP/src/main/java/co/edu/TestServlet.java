package co.edu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/TestServlet")
public class TestServlet extends HttpServlet {
	@Override
	public void init() throws ServletException {
		
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setCharacterEncoding("utf-8");
		resp.setContentType("text/xml;charset=utf-8"); // 콘텐트의 타입 설정
		
		// json 타입의 텍스트.
		// [{"name":"홍길동",age:20},{"name":"이규찬",age:26}]
		PrintWriter out = resp.getWriter();
//		out.print("[{\"name\":\"홍길동\",age:20},{\"name\":\"이규찬\",age:26}]");
		
		// xml 형식의 텍스트.
		// <data><name>홍길동</name><age>20</age><name>이규찬</name><age>26</age></data>
		out.print("<data><name>홍길동</name><age>20</age><name>이규찬</name><age>26</age></data>");
	}
	
	
	
}
