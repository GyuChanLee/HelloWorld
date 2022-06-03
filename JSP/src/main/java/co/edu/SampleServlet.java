package co.edu;

import java.io.IOException;

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
		System.out.println("service 호출");
		
		if(req.getMethod().equals("GET")) {
			System.out.println("GET 요청");
		} else if(req.getMethod().equals("POST")) {
			System.out.println("POST 요청");
		}
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
