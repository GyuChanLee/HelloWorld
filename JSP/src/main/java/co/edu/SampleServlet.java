package co.edu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SampleServlet extends HttpServlet {
	// IOC : 컨트롤을 컨테이너가 처리.

	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init 호출...");
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8"); // 요청 타입
		resp.setContentType("text/html; charset=utf-8"); 
		resp.setCharacterEncoding("utf-8"); // 응답 타입
		
		System.out.println("service 호출");
		
		if(req.getMethod().equals("GET")) {
			System.out.println("GET 요청");
		} else if(req.getMethod().equals("POST")) {
			System.out.println("POST 요청");
		}
		
		String name = req.getParameter("name"); // name=???&age=?? 형식
		String age = req.getParameter("age");
		
		PrintWriter out = resp.getWriter();
		out.print("<h3>요청파라미터 : "+name+"</h3>");
		out.print("<h3>요청파라미터 : "+age+"</h3>");
		
		out.close(); // PrinterWriter 닫아주기.
		
	}
	
//	@Override
//	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		super.doGet(req, resp);
//	}
//	
//	@Override
//	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		super.doPost(req, resp);
//	}
	
	@Override
	public void destroy() {
		System.out.println("destroy 호출");
	}
}
